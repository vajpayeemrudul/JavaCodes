package Prac3;

public class Casual extends Typist{

	double dailyWage;
	public Casual(String codeName,int speed, double dailyWage)
	{
		super(codeName,speed);
		this.dailyWage=dailyWage;
	}
	public void display()
	{
		System.out.println("Codename: "+super.getCodeName());
		System.out.println("Speed: "+super.getspeed());
		System.out.println("Dailywage: "+dailyWage);
	}

}
