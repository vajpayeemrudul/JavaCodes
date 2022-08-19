package Prac3;
import java.util.*;

public class StaffList {

	public static Staff createStaff(String type)
	{
		Scanner sc= new Scanner(System.in);
		Staff s=null;
		if(type.equals("Teacher"))
		{
		    System.out.print("Enter name: ");
		    String name=sc.nextLine();
		    System.out.print("Enter subject: ");
		    String sub=sc.nextLine();
		    System.out.print("Enter no. of publications: ");
		    int p=sc.nextInt();
		    s= new Teacher(name,sub,p);
		}
		if(type.equals("Officer"))
		{
			System.out.print("Enter name: ");
		    String name=sc.nextLine();
		    System.out.print("Enter grade: ");
		    char c=sc.next().charAt(0);
		    s= new Officer(name,c);
		}
		if(type.equals("Typist"))
		{
			System.out.print("Enter Regular/Casual:");
			String str=sc.next();
			if(str.equals("Regular"))
			{
				System.out.print("Enter name: ");
				String name=sc.next();
				System.out.println("Enter speed: ");
				int speed=sc.nextInt();
				s= new Regular(name,speed);
			}
			else {
				System.out.print("Enter name: ");
			    String name=sc.nextLine();
			    System.out.print("Enter speed: ");
			    int speed=sc.nextInt();
			    System.out.print("Enter dailyWage: ");
			    double wage=sc.nextDouble();
			    s= new Casual(name,speed,wage);
			}
			
		}
		return s;
	}

}
