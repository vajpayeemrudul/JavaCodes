package practical4;

class Triangle extends Shape{
	float s1,s2,s3;
	Triangle(float s1,float s2,float s3)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	void area()
	{
		float s=(s1+s2+s3)/2;
		float area=(float)Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println("Area of Traingle is: "+(area));
	}
}
