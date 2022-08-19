package Prac3;

public abstract class Staff {

	String codeName;
	Staff(String codeName)
	{
		this.codeName=codeName;
	}
	public String getCodeName()
	{
		return codeName;
	}
	public void setCodeName(String cname)
	{
		codeName=cname;
	}
	public abstract void display();

}
