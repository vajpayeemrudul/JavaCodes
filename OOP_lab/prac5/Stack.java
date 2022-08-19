package prac5;

public class Stack {

	int arr[];
	int MAX;
	int top;

	Stack(int MAX)
	{
		this.MAX=MAX;
		arr=new int[MAX];
		top=-1;
	}
	
	boolean isEmpty()
	{
		if(top<0)
	     	return true;
		else
		    return false;
	}
	
	boolean isFull()
	{
	     if(top==MAX-1)
	         return true;
	     else 
	         return false;
	}
	

	void push(int x)
	{
		if (isFull()) {
			System.out.println("Stack Overflow Cannot push elements");
			
		}
		else {
			arr[++top] = x;
			System.out.println(x + " pushed into stack");
			
		}
	}

	int pop()
	{
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		else {
			int x = arr[top--];
			return x;
		}
	}

	int peek()
	{
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		else {
			int x = arr[top];
			return x;
		}
	}
	
	void print(){
	for(int i = top;i>-1;i--){
	System.out.print(" "+ arr[i]);
	}
}

}
