package Prac3;

public class Teacher extends Staff {
	String subject;
	int publication;
	public Teacher(String codeName,String subject,int publication)
	{
		super(codeName);
		this.subject=subject;
		this.publication=publication;
	}
	
	public void display()
	{
		System.out.println("CodeName: "+super.getCodeName());
		System.out.println("Subject: "+subject);
		System.out.println("No. of publications: "+publication);
	}
}
