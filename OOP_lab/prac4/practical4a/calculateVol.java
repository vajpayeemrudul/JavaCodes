package practical4a;

public class calculateVol {

	static void Volume(Cube c1)
	{
		float v=c1.side*c1.side*c1.side;
		System.out.println("Volume of Cube is: "+v);
	}
	
	static void Volume(Sphere s1)
	{
		float v=(float)3.14*(4/3)*(s1.radius*s1.radius*s1.radius);
		System.out.println("Volume of Sphere is: "+v);
	}
	
	static void Volume(Cylinder c1)
	{
		float v=(float)3.14*(c1.radius*c1.radius)*c1.height;
		System.out.println("Volume of Cylinder is: "+v);
	}

}
