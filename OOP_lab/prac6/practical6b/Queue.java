package practical6b;

public class Queue {
	int front,rear;
    int size;
    char arr[];
    
    Queue(int s)
    {
   	 size=s;
   	 front =-1;
   	 rear=-1;
   	 arr= new char[size];
    }
    
    boolean full()
    {
   	 if(rear==size-1)
   	 {
   		 return true;
   	 }
   	 return false;
    }
    
    boolean empty()
    {
   	 if(front ==-1)
   		 return true;
   	 else
   		 return false;
    }
    
    void enqueue(char value)
    {
   	 if(full())
   	 {
   		 System.out.println("Queue is full");
   	 }
   	 else
   	 {
   		 if(front ==-1)
   			 front =0;
   		 rear++;
   		 arr[rear]=value;
   		 System.out.println(value+" Inserted");
   	 }
    }
    
    char dequeue()
    {
   	 char data='\u0000';
   	 if(empty())
   	 {
   		 System.out.println("Queue is Empty");
   	 }
   	 else
   	 {
   		 data=arr[front];
   		 if(front>=rear) {
   			 front = -1;
   		     rear=-1;
   		 }
   		 else
   		 {
   			 front++; 
   		 }
   		 System.out.println("Element Deleted");
   	 }
   	 return data;
    }
    
    char peek()
    {
   	 char data='\u0000';
   	 if(empty())
   	 {
   		 System.out.println("Queue is Empty");
   	 }
   	 else
   		 data=arr[front];
   	 return data;
    }
    
    void display()
    {
   	 if(empty())
   		 System.out.println("Queue is Empty");
   	 else
   	 {
   		 int i;
   		 for(i=front;i<=rear;i++)
   			 System.out.print(arr[i]+" ");
   	 }
    }
}
