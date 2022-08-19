package labs;

import java.util.*;

class account {
    private String accName;
    private long accNum;
    private String accType;
    private double accBal;
    
    Scanner sc= new Scanner(System.in);
    
    public void openAccount()
    {
    	System.out.print("Enter Name: ");
    	accName=sc.nextLine();
    	System.out.print("Enter account type: ");
    	accType=sc.nextLine();
    	accNum=Numgenerate.generateaccnum();
    	System.out.print("Enter amount in bank: ");
    	accBal=sc.nextDouble();
    }
    
    public void display(){
        System.out.println("Account Holder Name: "+accName);
        System.out.println("Account Holder Number: "+accNum);
        System.out.println("Account Holder Balance: "+accBal);
        System.out.println("Account Type: "+accType);
    }
    
    public void deposit()
    {
    	double amount;
    	System.out.print("Enter amount to deposit: ");
    	amount=sc.nextDouble();
    	accBal+=amount;
    }
    
    public void withdraw()
    {
    	System.out.print("Enter amount to withdraw: ");
    	double amount=sc.nextDouble();
    	if(amount>accBal || accBal-amount<1000)
    	{
    		System.out.println("Not possible to withdraw this amount");
    	}
    	else
    	{
    		accBal-=amount;
    		System.out.println("Withdrawl Successful. Balance Remaining :"+(accBal));
    	}
    }
    
    public boolean searchAccount(int anum)
    {
    	if(anum==accNum)
    	{
    		display();
    		return true;
    	}
    	return false;
    }
}

public class practical {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of customers you want: ");
        int n=sc.nextInt();
        account arr[]= new account[n];
        
        for(int i=0;i<n;i++)
        {
        	System.out.println("Enter "+(i+1)+"st member:");
        	arr[i]= new account();
        	arr[i].openAccount();
        }
        int ch;
        do {
        System.out.println("\n ***Banking System Application***");
        System.out.println("1. Display all account details \n 2. Search byAccount number\n 3. Deposit the amount \n 4. Withdraw the amount \n5.Exit");
        System.out.println("Enter your choice: ");
        
        
        ch = sc.nextInt();
        switch (ch) {
        case 1:
           for(int i = 0; i<arr.length; i++) {
               arr[i].display();
            }
            break;
        case 2:
             System.out.print("Enter account no. you want to search: ");
             int ac_no = sc.nextInt();
              boolean found = false;
               for (int i = 0; i<arr.length; i++) {
                    found = arr[i].searchAccount(ac_no);
                  if (found) {
                      break;
                   }
               }
               if (!found) {
                  System.out.println("Search failed! Account doesnt exist..!");
               }
           break;
        case 3:
        System.out.print("Enter Account no. : ");
        ac_no = sc.nextInt();
        found = false;

        for (int i = 0; i<arr.length; i++) {
            found = arr[i].searchAccount(ac_no);
            if (found) {
               arr[i].deposit();
              break;
            }
          }
           if (!found) {
             System.out.println("Search failed! Account doesnt exist..!");
            }
           break;
        case 4:
            System.out.print("Enter Account No : ");
            ac_no = sc.nextInt();
            found = false;
            for (int i = 0; i<arr.length; i++) {
              found = arr[i].searchAccount(ac_no);
              if (found) {
                arr[i].withdraw();
                break;
                }
              }
              if (!found) {
               System.out.println("Search failed! Account doesnt exist..!");
              }

          break;
        case 5:
        System.out.println("See you soon...");
        break;

        }
        }
        while (ch != 5);
        
        
    }
}
