File Head_stl = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
"Head.stl");	
CSG Head = Vitamins.get(Head_stl)
			.toXMin()
			.toYMin()
			.toZMin()
			.rotx(9)
			.movez(-2)

//File Eyes_stl = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
//"Eyes.stl");	
//CSG Eyes = Vitamins.get(Eyes_stl)
			.rotx(9)
			

//File Ears_stl = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
//"Ears.stl");	
//CSG Ears = Vitamins.get(Ears_stl)
//			.rotx(9)


CSG Side1 = new Cube(200,200,160).toCSG()
			.toXMin()
			.toYMin()
			.toZMin()
			.movex(-20)
			
//CSG Side2 = new Cube(200,100,160).toCSG()
//			.toXMin()
//			.toYMin()
//			.toZMin()
//			.movex(-20)
//			.movey(100)


def stuff = [Head,Ears,Eyes];

CSG Front = Side1.difference(Head);
//CSG Back = Side2.difference(Head);

return[Front];