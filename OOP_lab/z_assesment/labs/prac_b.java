package labs;

import java.util.*;
import java.lang.*;

class Cube{
	static int side;
	static int object;
	
//	public Cube(int x)
//	{
//		side=x;
//	}
	static void incr()
	{
		object++;
	}
}

public class prac_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		Cube c1= new Cube();
		Cube.incr();
		Cube.incr();
		Cube.incr();
		System.out.println(Cube.object+" "+Cube.side);
	     sc.close();

	}
}
