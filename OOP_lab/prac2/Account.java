package prac2;
import java.util.*;

public class Account {
	
	private String accName;
    private long accNum;
    private String accType;
    private double accBal;
    
    public Account(String name, String type, double balance){
        accName=name;
        accType=type;
        accBal =balance;
        try {
        	if(accBal<1000)
        	{
        		throw new Exception();
        	}
        }
        catch(Exception e){
        	System.out.println("No sufficient fund");
        	return;
        }
        accNum = Numgenerate.generateaccnum();
        System.out.println("Account created !!");
    }
    
    Scanner sc= new Scanner(System.in);
    
    public void deposit(){
    	System.out.print("Enter Amount to deposit: ");
    	double amount=sc.nextDouble();
        accBal=accBal+amount;
        System.out.println("Rs"+(amount)+" deposited");
    }
    
    public void withdraw(){
    	System.out.print("Enter Amount to withdraw: ");
    	double amount=sc.nextDouble();
        double remBal=accBal-amount;
        
        try {
        	if(remBal<1000)
        	{
        		throw new Exception();
        	}
        	System.out.println("Withdrawn succesfully");
        	accBal=remBal;
        }
        catch(Exception e)
        {
        	System.out.println("No sufficient fund");
        }
         System.out.println("Remaining Balance:"+(accBal)); 
    }
    
    public void display(){
    	if(accBal<1000)
    		System.out.println("No account found");
    	else {
    		System.out.println("Account Holder Name: "+accName);
            System.out.println("Account Holder Number: "+accNum);
            System.out.println("Account Holder Balance: "+accBal);
    	}
        
    }

}
