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

CSG Cylinder = new Cylinder (15,11,20,(int)30).toCSG()			//Create pouring slot geometry
			.toZMax()
			.movey(15)
			.movex(15)
			.movez(4.2)

CSG Cube = new Cube (50,30,70).toCSG()
			.toZMin()
			.movex(18)
			.movey(12.5)

CSG Hand = Left.intersect(Cube)


return[Hand];