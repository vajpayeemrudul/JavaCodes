package practical6;

public class CircularQueue {
     int front,rear;
     int size;
     char arr[];
     
     CircularQueue(int s)
     {
    	 size=s;
    	 front =-1;
    	 rear=-1;
    	 arr= new char[size];
     }
     
      boolean full()
     {
    	 if((front ==0 && rear==size-1) || front == rear+1)
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
    		 rear=(rear+1)%size;
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
    		 if(front==rear) {
    			 front = -1;
    		     rear=-1;
    		 }
    		 else
    		 {
    			 front =(front+1)%size; 
    		 }
    		 
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
    		 for(i=front;i!=rear;i=(i+1)%size)
    			 System.out.print(arr[i]+" ");
    		 System.out.println(arr[i]);
    	 }
     }
}
