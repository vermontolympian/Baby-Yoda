File Right_Hand = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
"DownRes-Right-Hand.stl");								
CSG Right  = Vitamins.get(Right_Hand)						//Get hand STL
			.scale(2)									//Scale to "life-like" size
			.toXMin()
			.toYMin()
			.toZMin()

CSG clearenceFit = Right.toolOffset(-4.0)

return[clearenceFit];