package practical8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		DoublyLinkedList dll= new DoublyLinkedList();
		
		int n;
		do{
		    System.out.println("\n PLEASE SELECT FROM THE OPTIONS \n 1. Create list of Employees \n 2. Insert employee node at end \n 3. Delete last employee node \n 4. Insert employee node at start \n 5. Delete first employee node \n 6. Display employee linkedlist \n 7. Get size of employee list \n 8. Exit \n");
		    n = sc.nextInt();
		    switch(n){
		        case 1:
		        	System.out.print("Enter size of LinkedList: ");
		  	         int N=sc.nextInt();
		  	         System.out.println();
		  	         //read the value of N from user.
		        	for(int i=0;i<N;i++)
		            {
		          	  System.out.println("Enter serial no and name of employee: ");
		          	  dll.createDLL(sc.nextInt(),sc.next());
		          	  System.out.println();
		            }
		            break;
		        case 2:
		     
		            System.out.println("Enter serial no. and name : ");
		            dll.insertAtEnd(sc.nextInt(), sc.next());
		            break;
		        case 3:
		            dll.deleteLast();
		            break;
		        case 4:
		        	System.out.println("Enter serial no. and name : ");
		            dll.insertInBeginning(sc.nextInt(), sc.next());
		            break;
		        case 5:
		        	dll.deleteFirst();
		            break;
		        case 6:
		        	dll.display();
		        	break;
		        case 7:
		        	System.out.println(dll.size());
		        default:
		        	break;
		    }
		}while (n<8);
	}
}
