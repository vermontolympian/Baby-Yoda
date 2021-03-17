import eu.mihosoft.vrl.v3d.CSG

import com.neuronrobotics.bowlerstudio.scripting.ScriptingEngine
import com.neuronrobotics.bowlerstudio.vitamins.Vitamins

import eu.mihosoft.vrl.v3d.*

File Left_Hand = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
"DownRes-LeftInsert-4mm.stl");					
CSG Left = Vitamins.get(Left_Hand)							//Get hand STL	
			.rotz(125)
			.rotx(10)
			.toXMin()
			.toYMin()
			.toZMin()
			.movex(2)
			.movez(-4)

CSG Cylinder = (CSG)(ScriptingEngine.gitScriptRun(
            "https://github.com/vermontolympian/Baby-Yoda.git", // git location of the library
            "handPlug.groovy" ,null))
			.toZMax()
			.movey(15)
			.movex(15)
			.movez(4.2)

CSG Cube = new Cube (50,30,70).toCSG()
			.toZMin()
			.movex(18)
			.movey(12.5)

CSG Wrist = new Cylinder (8,8,15,(int)20).toCSG()
			.toZMax()
			.movey(15)
			.movex(15)

CSG Hand = Left.intersect(Cube)


return[Hand,Cylinder];