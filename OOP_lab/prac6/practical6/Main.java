package practical6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		// TODO Auto-generated method stub
       
		 Scanner sc = new Scanner(System.in);
			System.out.print("Enter Size of queue: ");
			int size=sc.nextInt();
			CircularQueue queue1 = new CircularQueue(size);
			int n;
			do{
			    System.out.println("\n PLEASE SELECT FROM THE OPTIONS \n 1. Perform Enqueue \n 2. Perform dequeue \n 3. Perform PEEK \n 4. Print present characters \n 5. Exit \n");
			    n = sc.nextInt();
			    switch(n){
			        case 1:
			            System.out.println("Enter character to PUSH:");
			            char j = sc.next().charAt(0);
			            queue1.enqueue(j);
			            break;
			        case 2:
			        	char c=queue1.dequeue();
			        	if(c=='\u0000')
			        		System.out.println("Queue is empty");
			        	else
			                System.out.println(c + " removed from queue");
			            break;
			        case 3:
			        	if(queue1.peek()=='\u0000')
			        		System.out.println("Queue is empty");
			        	else
			                System.out.println("Peek element is :" + queue1.peek());
			            break;
			        case 4:
			            System.out.print("Elements present in circular queue:");
			            queue1.display();
			            break;
			        case 5:
			            break;
			        default:
			        	break;
			    }
			}while (n<5);
	}

}
