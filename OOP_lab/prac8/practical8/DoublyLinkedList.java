package practical8;

public class DoublyLinkedList {

	Node head;
    Node tail;

    DoublyLinkedList()
    {
    	head=tail=null;
    }
    void createDLL(int SSN, String name)
    {
    	//creating new node
    	Node newNode = new Node(SSN,name);
    	if(head==null)
    	{
    		head= newNode;
    		tail=newNode;
    	}
    	else
    	{
    		tail.next=newNode;
    		newNode.prev=tail;
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
    		System.out.print(curr.SSN+" "+curr.name+" "+"->");
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
    
    void insertAtEnd(int SSN,String name)
    {
    	Node newNode=new Node(SSN,name);
    	tail.next=newNode;
    	newNode.prev=tail;
    	tail=newNode;
    }
    
    void deleteLast()
    {
    	if(head==null)
    	{
    		System.out.println("Linked List is empty");
    	}
    	else
    	{
    		tail=tail.prev;
    		if(tail==null)
    			head=null;
    		else
    			tail.next=null;
    	}
    }
    
    void insertInBeginning(int SSN, String name)
    {
    	Node newNode=new Node(SSN, name);
    	newNode.next=head;
    	head.prev=newNode;
    	head=newNode;
    }
   
    void deleteFirst()
    {
    	if(head==null)
    	{
    		System.out.println("LnkedList is Empty");
    	}
    	else
    	{
    		head=head.next;
    		if(head==null)
    			tail=null;
    		else
    			head.prev=null;
    	}
    }
}
