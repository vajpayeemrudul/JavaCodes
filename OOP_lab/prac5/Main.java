package prac5;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of stack: ");
		int size=sc.nextInt();
		Stack s = new Stack(size);
		int n;
		do{
		    System.out.println("\n PLEASE SELECT FROM THE OPTIONS \n 1. Perform PUSH \n 2. Perform POP \n 3. Perform PEEK \n 4. Print present elements \n 5. Exit \n");
		    n = sc.nextInt();
		    switch(n){
		        case 1:
		            System.out.println("Enter number to PUSH:");
		            int j = sc.nextInt();
		            s.push(j);
		            break;
		        case 2:
		        	int m=s.pop();
		        	if(m==-1)
		        		System.out.println();
		        	else
		                System.out.println(m + " Popped from stack");
		            break;
		        case 3:
		        	int p=s.peek();
		        	if(p==-1)
		        		System.out.println();
		        	else
		                System.out.println("Top element is :" + p);
		            break;
		        case 4:
		            System.out.print("Elements present in stack :");
		            s.print();
		            break;
		        case 5:
		            break;
		    }
		}while (n!=5);
	}

}
