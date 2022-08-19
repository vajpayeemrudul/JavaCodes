package assignment;

public class Child extends Parent {
	
	String pname=super.name;
	Child()
	{
		super();
		System.out.println("Child constructor");
	}
	void display()
	{
		System.out.println("This is child method");
	}
	void check()
	{
		super.display();
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("//// invoking parent constructor///");
		Child ch= new Child();
	    System.out.println("Name taken from parent class: "+ch.pname);
	    System.out.println("//// invoking parent method///");
        ch.check();
	}

}
