package Prac3;

public class Regular extends Typist {

	public Regular(String codeName,int speed)
	{
		super(codeName,speed);
	}
	public void display()
	{
		System.out.println("CodeName: "+super.getCodeName());
		System.out.println("Speed: "+super.getspeed());
	}

}
