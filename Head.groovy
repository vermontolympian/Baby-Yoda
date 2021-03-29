import com.neuronrobotics.bowlerstudio.scripting.ScriptingEngine
import com.neuronrobotics.bowlerstudio.vitamins.Vitamins

import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cube

File Head_stl = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
"Down-Res-Head-10k.stl");	
CSG Head = Vitamins.get(Head_stl)
			.rotx(9)
			.toXMin()
			.toYMin()
			.toZMin()
			.movez(-1)


File Eyes_stl = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
"Eyes.stl");	
CSG Eyes = Vitamins.get(Eyes_stl)
			.rotx(9)
			.movez(8.5)
			.movey(-11)
			

File Ears_stl = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
"Ears.stl");	
CSG Ears = Vitamins.get(Ears_stl)
			.rotx(9)
			.movez(8.5)
			.movey(-7.5)


CSG Side1 = new Cube(200,210,160).toCSG()
			.toXMin()
			.toYMin()
			.toZMin()
			.movex(-20)
			.movey(-10)
			
//CSG Side2 = new Cube(200,100,160).toCSG()
//			.toXMin()
//			.toYMin()
//			.toZMin()
//			.movex(-20)
//			.movey(100)


def stuff = [Head,Ears,Eyes];

CSG Front = Side1.difference(Head);
CSG Mold1 = Front.difference(Eyes);
CSG Mold = Mold1.difference(Ears);

//CSG Back = Side2.difference(Head);

return[Mold];