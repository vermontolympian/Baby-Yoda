File Left_Hand = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
	"DownRes-LeftInsert-4mm.stl");								
CSG Left  = Vitamins.get(Left_Hand)						//Get hand STL
			.toXMin()
			.toYMin()
			.toZMin()

CSG Cylinder = new Cylinder (15,11,20,(int)30).toCSG()			//Create pouring slot geometry
			.toZMax()
			.movey(15)
			.movex(15)
			.movez(4.2)

CSG Cube = new Cube (20,20,20).toCSG()

return[Left,Cube]
