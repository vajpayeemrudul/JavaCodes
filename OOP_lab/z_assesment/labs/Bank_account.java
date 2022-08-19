package labs;

public class Bank_account {
	private String accName;
	private long accNum;
	private String accType;
	private double accBalance;
	
	public Bank_account(String accName,String accType)
	{
		this.accName=accName;
		this.accType=accType;
		accBalance=1000;
	}
	public void deposit(double amount)
	{
		accBalance+=amount;
	}
	public void display()
	{
	   System.out.println("Account number: "+accNum);
	   System.out.println("Account holder Name: "+accName);
	   System.out.println("Account Balance: "+accBalance);
	}
	public void withdraw(double amount)
	{
		//user defined exception
		double remBal=accBalance-amount;
		if(remBal<1000)
		{
			//throw exception
			System.out.println("Insufficient balance");
		}else {
			accBalance=accBalance-amount;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank_account acc1= new Bank_account("Mrudul","saving");
	}

}
