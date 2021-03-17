import com.neuronrobotics.bowlerstudio.scripting.ScriptingEngine
import com.neuronrobotics.bowlerstudio.vitamins.Vitamins

import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.*

File Right_Hand = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
"DownRes-Right-Hand.stl");								
CSG Right  = Vitamins.get(Right_Hand)						//Get hand STL
			.scale(2)									//Scale to "life-like" size
			.toXMin()
			.toYMin()
			.toZMin()
CSG Cube = new Cube(70,30,100).toCSG()						//Create front mold piece
			.movex(20)
			.movey(5)
			.movez(40)
			
CSG Cube2 = new Cube(70,30,100).toCSG()						//Create back mold piece
			.movex(20)
			.movez(40)
			.toYMin()
			.movey(Cube.getMaxY())

CSG Cylinder = (CSG)(ScriptingEngine.gitScriptRun(
            "https://github.com/vermontolympian/Baby-Yoda.git", // git location of the library
            "handPlug.groovy" ,null))
			.toZMax()
			.movey(20)
			.movex(18)
			.movez(0.1)

CSG Bolt1 = new Cylinder (2.75,2.75,60,(int)8).toCSG()			//Create bolt hole 1
			.rotx(90)
			.movex(-4)
			.movez(5)
			.movey(-10)

CSG Bolt2 = new Cylinder (2.75,2.75,60,(int)8).toCSG()			//Create bolt hole 2
			.rotx(90)
			.movex(40)
			.movez(5)
			.movey(-10)
				
CSG Bolt3 = new Cylinder (2.75,2.75,60,(int)8).toCSG()			//Create bolt hole 3
			.rotx(90)
			.movex(-4)
			.movez(80)
			.movey(-10)

CSG Bolt4 = new Cylinder (2.75,2.75,60,(int)8).toCSG()			//Create bolt hole 4
			.rotx(90)
			.movex(40)
			.movez(80)
			.movey(-10)

CSG Pry1 = new Cube (13,4,20).toCSG()						//Create pry location 1
			.movex(-9)
			.movey(20)
			.movez(40)

CSG Pry2 = new Cube (20,4,20).toCSG()						//Create pry location 2
			.movex(46)
			.movey(20)
			.movez(25)

def stuff = [Cylinder,Right,Bolt1,Bolt2,Bolt3,Bolt4,Pry1,Pry2]	//create group of stuff to be cut out

CSG Palm = Cube.difference(stuff)							//Cut 'stuff' out of palm side of mold
			.rotx(-90)
			.toZMin()
				
CSG Back = Cube2.difference(stuff)							//Cut 'stuff' out of back side of mold
			.rotx(90)
			.movey(40)
			.toZMin()

return [Palm,Back];										//Output mold parts
