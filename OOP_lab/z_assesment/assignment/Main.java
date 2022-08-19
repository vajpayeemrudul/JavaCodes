package assignment;
import java.util.*;
import java.io.*;

public class Main {
	
	static void available(int room_no, Hotel arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].room_no==room_no && arr[i].availability==1)
			{
				System.out.println("room available");
				return;
			}
		}
		System.out.println("room not available");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the total number of rooms: ");
        int m=sc.nextInt();
        Hotel arr[]= new Hotel[m];
        for(int i=0;i<m;i++)
        {
           System.out.println("Enter details of "+(i+1)+"st room");
        	arr[i]= new Hotel();
        	arr[i].create();
        }
        System.out.print("Enter 1 to display all rooms and 2 to check availability of specific room: ");
        int s=sc.nextInt();
        if(s==1)
        {
        	for(int i=0;i<m;i++)
        	{
        		arr[i].display();
        	}
        }
        else {
        	System.out.print("Enter the room number to check availability: ");
            int r=sc.nextInt();
            available(r,arr);
            sc.close();
        }
        
	}

}
