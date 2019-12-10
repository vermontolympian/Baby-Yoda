File Left_Hand = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
"DownRes-Left-Hand.stl");					
CSG Left = Vitamins.get(Left_Hand)							//Get hand STL
			.scale(2)									//Scale to "life-like" size
			.rotz(125)
			.rotx(10)
			.toXMin()
			.toYMin()
			.toZMin()
CSG Cube = new Cube(70,30,100).toCSG()						//Create front mold piece
			.movex(20)
			.movez(40)
			
CSG Cube2 = new Cube(70,30,100).toCSG()						//Create back mold piece
			.movex(20)
			.movez(40)
			.toYMin()
			.movey(Cube.getMaxY())

CSG Cylinder = new Cylinder (15,11,20,(int)30).toCSG()			//Create pouring slot geometry
			.toZMax()
			.movey(15)
			.movex(15)
			.movez(4.2)

CSG Bolt1 = new Cylinder (2.75,2.75,60,(int)8).toCSG()			//Create bolt hole 1
			.rotx(90)
			.movex(-4)
			.movez(5)
			.movey(-15)

CSG Bolt2 = new Cylinder (2.75,2.75,60,(int)8).toCSG()			//Create bolt hole 2
			.rotx(90)
			.movex(40)
			.movez(5)
			.movey(-15)
				
CSG Bolt3 = new Cylinder (2.75,2.75,60,(int)8).toCSG()			//Create bolt hole 3
			.rotx(90)
			.movex(-4)
			.movez(80)
			.movey(-15)

CSG Bolt4 = new Cylinder (2.75,2.75,60,(int)8).toCSG()			//Create bolt hole 4
			.rotx(90)
			.movex(40)
			.movez(80)
			.movey(-15)

CSG Pry1 = new Cube (13,4,20).toCSG()						//Create pry location 1
			.movex(-9)
			.movey(15)
			.movez(40)

CSG Pry2 = new Cube (20,4,20).toCSG()						//Create pry location 2
			.movex(46)
			.movey(15)
			.movez(22)

def stuff = [Cylinder,Left,Bolt1,Bolt2,Bolt3,Bolt4,Pry1,Pry2]	//create group of stuff to be cut out

CSG Palm = Cube.difference(stuff)							//Cut 'stuff' out of palm side of mold
			.rotx(-90)
			.toZMin()
				
CSG Back = Cube2.difference(stuff)							//Cut 'stuff' out of back side of mold
			.rotx(90)
			.movey(40)
			.toZMin()

return [Palm,Back];										//Output mLeftrts
