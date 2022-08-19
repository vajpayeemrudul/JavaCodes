package Prac3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of staff members you want:");
        int n=sc.nextInt();
        Staff list[]= new Staff[n];
        for(int i=0;i<n;i++)
        {
        	System.out.println("Enter the type of staff: Teacher,Officer,Typist");
        	String s=sc.next();
        	list[i]=StaffList.createStaff(s);
        }
        for(Staff s: list)
        {
        	s.display();
        }
	}

}
