package practical4;

class Square extends Shape{
	float side;
	Square(float side)
	{
		this.side=side;
	}
	void area()
	{
		System.out.println("Area of Square is: "+(side*side));
	}
}
