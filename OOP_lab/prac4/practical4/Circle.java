package practical4;

class Circle extends Shape{
	float radius;
	Circle(float radius)
	{
		this.radius=radius;
	}
	void area()
	{
		System.out.println("Area of circle is: "+(3.14*radius*radius));
	}
}
