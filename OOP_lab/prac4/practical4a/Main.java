package practical4a;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sphere s1= new Sphere(4.56f);
       Cube c1= new Cube(5.00f);
       Cylinder cy= new Cylinder(2.45f,6.45f);
       
       calculateVol.Volume(s1);
       calculateVol.Volume(c1);
       calculateVol.Volume(cy);
	}

}
