package Prac3;

public class Officer extends Staff {

	char grade;
	public Officer(String codeName,char grade)
	{
		super(codeName);
		this.grade=grade;
	}
	public void display()
	{
		System.out.println("CodeName: "+super.getCodeName());
		System.out.println("Grade: "+grade);
	}

}
