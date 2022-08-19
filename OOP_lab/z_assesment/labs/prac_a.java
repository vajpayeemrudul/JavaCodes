package labs;

import java.util.*;
import java.lang.*;

public class prac_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        boolean z=true;
        while(z)
        {
        	System.out.print("Enter weight of person in kg: ");
        	double weight= sc.nextDouble();
        	if(weight<=0)
        	{
        		System.out.println("invalid weight");
        		break;
        	}
        	System.out.print("Enter height of person in meters: ");
        	double height= sc.nextDouble();
        	if(height<=0)
        	{
        		System.out.println("invalid height");
        		break;
        	}
        	double BMI = (weight)/(height*height);
        	System.out.println("BMI: "+(String.format("%.4f", BMI)));
        	if(BMI<18.5)
        		System.out.println(" Person is Under Weight");
        	else if(BMI>=18.5 && BMI<=24.9)
        		System.out.println(" Person has Normal Weight");
        	else if(BMI>=25 && BMI<=29.9)
        		System.out.println(" Person has Over Weight");
        	else
        		System.out.println(" Person is very overweight");
        	break;
        }
        
        sc.close();
	}

}
