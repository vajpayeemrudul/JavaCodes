package oop_practice;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		TwoWheeler arr[]= new TwoWheeler[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("ENter details");
			int model_num=sc.nextInt();
			String model_name=sc.next();
			int rel_yr=sc.nextInt();
			float price=sc.nextFloat();
			String color=sc.next();
			int mileage=sc.nextInt();
			
			arr[i]=new TwoWheeler(model_num,model_name,rel_yr,price,color,mileage);
		}
		FourWheeler arr2[]= new FourWheeler[n];
		for(int i=0;i<n;i++)
		{
			
		}
		
		sc.close();

	}

}
