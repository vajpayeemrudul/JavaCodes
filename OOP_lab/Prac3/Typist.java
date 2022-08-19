package Prac3;

abstract class Typist extends Staff {

	int speed;
	public Typist(String codeName,int speed)
	{
		super(codeName);
		this.speed=speed;
	}
	public int getspeed()
	{
		return speed;
	}

}
