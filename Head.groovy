File Head_stl = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
"Head.stl");	
CSG Head = Vitamins.get(Head_stl)
			.toXMin()
			.toYMin()
			.toZMin()	

return[Head];