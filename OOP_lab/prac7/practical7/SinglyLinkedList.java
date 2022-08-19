package practical7;

public class SinglyLinkedList {
    Node head;
    Node tail;

    SinglyLinkedList()
    {
    	head=tail=null;
    }
    void createSLL(int roll, float per)
    {
    	//creating new node
    	Node newNode = new Node(roll,per);
    	if(head==null)
    	{
    		head= newNode;
    		tail=newNode;
    	}
    	else
    	{
    		tail.next=newNode;
    		tail=newNode;	
    	}
    }
    void display()
    {
    	Node curr=head;
    	if(head==null)
    	{
    		System.out.println("No students");
    		return;
    	}
    	while(curr!=null)
    	{
    		System.out.print(curr.rollno+" "+curr.percentage+" "+"->");
    		curr=curr.next;
    	}
    	System.out.println();
    }
    int size()
    {
    	int count=0;
    	Node curr=head;
    	while(curr!=null)
    	{
    		
    		curr=curr.next;
    		count++;
    	}
    	return count;
    }
    
    void insertAfterPosition(int roll,float per,int position)
    {
    	int size=size();
    	if(position<1 || position>size)
    	{
    		System.out.println("Invalid position. You can get the size of list and then put position accordingly.");
    	}
    	else
    	{
    		Node newNode = new Node(roll,per);
        	int count=1;
        	Node curr=head;
        	while(count!=position)
        	{
        		count++;
        		curr=curr.next;
        	}
        	newNode.next=curr.next;
        	curr.next=newNode;
        	if(position==size)
        	{
        		tail=newNode;
        	}
    	}
    	
    }
    
    void deleteAfterPosition(int position)
    {
    	int size=size();
    	if(position<1 || position>size)
    	{
    		System.out.println("Invalid position. You can get the size of list and then put position accordingly.");
    	}
    	else
    	{
    		if(size==1)
    		{
    			head=null;tail=null;
    		}
    		else if(position==1)
    		{
    			head=head.next;
    		}
    		else
    		{
    			int count=1;
    			Node curr=head;
    			while(count<position-1)
    			{
    				curr=curr.next;
    				count++;
    			}
    			Node temp=curr.next.next;
    			curr.next=temp;
    			if(position==size)
    			{
    				tail=curr;
    			}
    		}
    	}
    }
    
    void reverse()
    {
    	Node temp=null;
    	Node curr=head;
    	Node prev=null;
    	while(curr!=null)
    	{
    		temp=curr.next;
    		curr.next=prev;
    		prev=curr;
    		curr=temp;
    	}
    }
    
}
