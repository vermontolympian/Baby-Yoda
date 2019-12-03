File Right_Hand = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
"DownRes-Right-Hand.stl");
CSG Right  = Vitamins.get(Right_Hand)
			.scale(2)
			.toXMin()
			.toYMin()
			.toZMin()
CSG Cube = new Cube(	70,// X dimention
			30,// Y dimention
			100// Z dimention
			).toCSG()// this converts from the geometry to an object we can work with
			.movex(20)
			.movey(5)
			.movez(40)
			
CSG Cube2 = new Cube(	70,// X dimention
			30,// Y dimention
			100// Z dimention
			).toCSG()// this converts from the geometry to an object we can work with
			.movex(20)
			//.movey(25)
			.movez(40)
			.toYMin()
			.movey(Cube.getMaxY())

CSG Cylinder = new Cylinder (15,11,11,(int)30).toCSG()
				.toZMax()
				.movey(20)
				.movex(18)
				.movez(0.1)

CSG Bolt1 = new Cylinder (2.75,2.75,60,(int)8).toCSG()
				.rotx(90)
				.movex(-4)
				.movez(5)
				.movey(-10)

CSG Bolt2 = new Cylinder (2.75,2.75,60,(int)8).toCSG()
				.rotx(90)
				.movex(40)
				.movez(5)
				.movey(-10)
				
CSG Bolt3 = new Cylinder (2.75,2.75,60,(int)8).toCSG()
				.rotx(90)
				.movex(-4)
				.movez(80)
				.movey(-10)


CSG Bolt4 = new Cylinder (2.75,2.75,60,(int)8).toCSG()
				.rotx(90)
				.movex(40)
				.movez(80)
				.movey(-10)

def stuff = [Cylinder,Right,Bolt1,Bolt2,Bolt3,Bolt4]
CSG Palm = Cube.difference(stuff)
CSG Back = Cube2.difference(stuff)
				//.movey(50)

return [Palm,Back];
