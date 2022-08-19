package practical8;

public class Node {
 int SSN;
 String name;
 Node next;
 Node prev;
 
 Node()
 {
	 
 }
 Node(int SSN, String name)
 {
	 this.SSN=SSN;
	 this.name=name;
	 this.next=null;
	 this.prev=null;
 }
}
