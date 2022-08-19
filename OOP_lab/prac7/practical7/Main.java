package practical7;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		SinglyLinkedList sll=new SinglyLinkedList();
		int n;
		do{
		    System.out.println("\n PLEASE SELECT FROM THE OPTIONS \n 1. Create list of students \n 2. Insert student node \n 3. Delete student node \n 4. Display student linkedlist \n 5. Get size of student list \n 6. Exit \n");
		    n = sc.nextInt();
		    switch(n){
		        case 1:
		        	System.out.print("Enter size of LinkedList: ");
		  	         int N=sc.nextInt();
		  	         System.out.println();
		  	         //read the value of N from user.
		        	for(int i=0;i<N;i++)
		            {
		          	  System.out.println("Enter roll no and percentage of student: ");
		          	  sll.createSLL(sc.nextInt(),sc.nextFloat());
		          	  System.out.println();
		            }
		            break;
		        case 2:
		     
		            System.out.println("Enter roll no. percentage and index seperated by spaces to enter: ");
		            sll.insertAfterPosition(sc.nextInt(),sc.nextFloat(), sc.nextInt());
		            break;
		        case 3:
		        	System.out.println("Enter position to delete: ");
		            sll.deleteAfterPosition(sc.nextInt());
		            break;
		        case 4:
		        	sll.display();
		            break;
		        case 5:
		        	System.out.println("Size of student list is: "+sll.size());
		            break;
		        default:
		        	break;
		    }
		}while (n<6);
		
	}

}
