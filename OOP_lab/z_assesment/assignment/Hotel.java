package assignment;
import java.util.*;
public class Hotel {
	Scanner sc= new Scanner(System.in);
	int room_no;
    int floor_no;
    int availability;
	
	public void create()
	{
		System.out.print("Enter room no: ");
		int r=sc.nextInt();
		System.out.print("Enter floor no: ");
		int f=sc.nextInt();
		System.out.println("Enter room availability: ");
		System.out.print("Enter 0 to make unavailable and 1 to make available: ");
		int a=sc.nextInt();
		room_no=r;
		floor_no=f;
		availability=a;
		System.out.println("   Room added successfully !");
	}
	public void display()
	{
		System.out.println("///// Room details //////");
		System.out.print("Room no. : "+(room_no)+" Floor no. :"+(floor_no));
		availabilityavail();
	}
	public void availabilityavail()
	{
		if(availability==1)
			System.out.println(" Available");
		else
			System.out.println(" Not Available");
	}
}
