File Left_Hand = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
"left-hand-fixed-1.stl");					
CSG Left = Vitamins.get(Left_Hand)							//Get hand STL
			.scale(2)									//Scale to "life-like" size
			.rotz(125)
			.rotx(10)
			.toXMin()
			.toYMin()
			.toZMin()
CSG Cube = new Cube(105,30,110).toCSG()						//Create front mold piece
			.movex(20)
			.movez(40)
			
CSG Cube2 = new Cube(105,30,110).toCSG()						//Create back mold piece
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
			.movex(-22)
			.movez(5)
			.movey(-15)

CSG Bolt2 = new Cylinder (2.75,2.75,60,(int)8).toCSG()			//Create bolt hole 2
			.rotx(90)
			.movex(65)
			.movez(5)
			.movey(-15)
				
CSG Bolt3 = new Cylinder (2.75,2.75,60,(int)8).toCSG()			//Create bolt hole 3
			.rotx(90)
			.movex(-22)
			.movez(80)
			.movey(-15)

CSG Bolt4 = new Cylinder (2.75,2.75,60,(int)8).toCSG()			//Create bolt hole 4
			.rotx(90)
			.movex(65)
			.movez(80)
			.movey(-15)

CSG Bolt5 = new Cylinder (2.75,2.75,60,(int)8).toCSG()
			.rotx(90)
			.movex(25)
			.movex(-10)
			.movey(-15)
			.movez(-5)


CSG Bolt6 = new Cylinder (2.75,2.75,60,(int)8).toCSG()
			.rotx(90)
			.movex(25)
			.movex(-10)
			.movey(-15)
			.movez(10)

CSG Pry1 = new Cube (15,4,20).toCSG()						//Create pry location 1
			.movex(-27.5)
			.movey(15)
			.movez(40)

CSG Pry2 = new Cube (15,4,20).toCSG()						//Create pry location 2
			.movex(67.5)
			.movey(15)
			.movez(22)

CSG Pin = new Cylinder (5,10,12).toCSG()
			.toZMin()
			.movex(15)
			.movez(-15)

CSG Pour1 = new Cylinder (12,4,10,(int)8).toCSG()
			.toZMin()
			.movey(15)
			.movex(-10)
			.movez(-15)

CSG Pour2 = new Cylinder (15,4,14,(int)8).toCSG()
			.toZMin()
			.movey(15)
			.movex(50)
			.movez(-15)

CSG Tip1 = new Sphere(4).toCSG()
			.toZMin()
			.movey(15)
			.movex(50)
			.movez(-11)

CSG Tip2 = new Sphere(4).toCSG()
			.toZMin()
			.movey(15)
			.movex(50)
			.movez(50)

CSG Tip3 = new Sphere(4).toCSG()
			.toZMin()
			.movey(15)
			.movex(28)
			.movez(82)

CSG Tip4 = new Sphere(4).toCSG()
			.toZMin()
			.movey(15)
			.movex(8)
			.movez(77)

CSG Tip5 = new Sphere(4).toCSG()
			.toZMin()
			.movey(15)
			.movex(-10)
			.movez(-11)

CSG Tip6 = new Sphere(4).toCSG()
			.toZMin()
			.movey(15)
			.movex(-5)
			.movez(72)

CSG Chanel1 = CSG.hullAll([Tip1,Tip2])
CSG Chanel2 = CSG.hullAll([Tip2,Tip3])
CSG Chanel3 = CSG.hullAll([Tip3,Tip4])
CSG Chanel4 = CSG.hullAll([Tip5,Tip6])
CSG Chanel5 = CSG.hullAll([Tip4,Tip6])

CSG Pin2 = new Cylinder(5,10,10).toCSG()
			.toZMin()
			.movex(15)

CSG Pin3 = new Cylinder(5,10,10).toCSG()
			.toZMin()
			.movex(15)
			.movey(15)

CSG Pin4 = CSG.hullAll([Pin2,Pin3])

CSG Pin5 = CSG.hullAll([Pin2,Pin3])
			.movez(-15)

CSG Tip7 = new Sphere(3).toCSG()
			.toZMin()
			.movey(15)
			.movex(48)
			.movez(25)

CSG Tip8 = new Sphere(1).toCSG()
			.toZMin()
			.movey(15)
			.movex(30)
			.movez(28)

CSG Tip9 = new Sphere(3).toCSG()
			.toZMin()
			.movey(15)
			.movex(40)
			.movez(60)

CSG Tip10 = new Sphere(1).toCSG()
			.toZMin()
			.movey(15)
			.movex(30)
			.movez(50)

CSG Tip11 = new Sphere(3).toCSG()
			.toZMin()
			.movey(15)
			.movex(-5)
			.movez(20)

CSG Tip12 = new Sphere(1).toCSG()
			.toZMin()
			.movey(15)
			.movex(2.5)
			.movez(22)

CSG Tip13 = new Sphere(3).toCSG()
			.toZMin()
			.movey(15)
			.movex(17)
			.movez(77)

CSG Tip14 = new Sphere(1).toCSG()
			.toZMin()
			.movey(15)
			.movex(15)
			.movez(54.75)

CSG Tip15 = new Sphere(3).toCSG()
			.toZMin()
			.movey(15)
			.movex(-6)
			.movez(-4)

CSG Tip16 = new Sphere(1).toCSG()
			.toZMin()
			.movey(15)
			.movex(2.5)
			.movez(2.5)

CSG Tip17 = new Sphere(3).toCSG()
			.toZMin()
			.movey(15)
			.movex(46)
			.movez(-4)

CSG Tip18 = new Sphere(1).toCSG()
			.toZMin()
			.movey(15)
			.movex(28.25)
			.movez(2.5)

CSG Tip19 = new Sphere(3).toCSG()
			.toZMin()
			.movey(15)
			.movex(-6)
			.movez(38)

CSG Tip20 = new Sphere(1).toCSG()
			.toZMin()
			.movey(15)
			.movez(40)

CSG Tip21 = new Sphere(3).toCSG()
			.toZMin()
			.movey(15)
			.movex(-5)
			.movez(50)
			
CSG Tip22 = new Sphere(1).toCSG()
			.toZMin()
			.movey(15)
			.movex(-0.25)
			.movez(52)

CSG Tip23 = new Sphere(3).toCSG()
			.toZMin()
			.movey(15)
			.movex(-4)
			.movez(65)

CSG Tip24 = new Sphere(1).toCSG()
			.toZMin()
			.movey(15)
			.movex(2)
			.movez(67)

CSG Chanel6 = CSG.hullAll([Tip7,Tip8])
CSG Chanel7 = CSG.hullAll([Tip9,Tip10])
CSG Chanel8 = CSG.hullAll([Tip11,Tip12])
CSG Chanel9 = CSG.hullAll([Tip13,Tip14])
CSG Chanel10 = CSG.hullAll([Tip15,Tip16])
CSG Chanel11 = CSG.hullAll([Tip17,Tip18])
CSG Chanel12 = CSG.hullAll([Tip19,Tip20])
CSG Chanel13 = CSG.hullAll([Tip21,Tip22])
CSG Chanel14 = CSG.hullAll([Tip23,Tip24])

def stuff = [Cylinder,Left,Bolt1,Bolt2,Bolt3,Bolt4,Bolt5,
		   Pry1,Pry2,Pin5,Pour1,Pour2,
		   Chanel1,Chanel2,Chanel3,Chanel4,Chanel5,
		   Chanel6,Chanel7,Chanel8,Chanel9,
		   Chanel10,Chanel11,
		   Chanel12,Chanel13,Chanel14]
		   
//CSG Palm = Cube.difference(stuff)							//Cut 'stuff' out of palm side of mold
//			.rotx(-90)
//			.toZMin()
//			.movey(-25)
				
CSG Back = Cube2.difference(stuff)							//Cut 'stuff' out of back side of mold
//			.rotx(90)
//			.movey(50)
			.toZMin()

////////////////////////////////////////////////////////////////////////////////////////////////////

//File Left_Core = ScriptingEngine.fileFromGit("https://github.com/vermontolympian/Baby-Yoda.git",
//"DownRes-LeftInsert-4mm.stl");					
//CSG Core = Vitamins.get(Left_Core)							//Get hand STL	
//			.rotz(125)
//			.rotx(10)
//			.toXMin()
//			.toYMin()
//			.toZMin()
//			.movex(2)
//			.movez(16)
//			.movey(2)


//CSG Wrist = new Cylinder (15,11,20,(int)30).toCSG()
//			.toZMax()
//			.movey(15)
//			.movex(15)
//			.movez(20)

//CSG Insert = Core.union(Wrist,Pin4)

//CSG Hand = Insert.difference(Bolt6)



return [Back];