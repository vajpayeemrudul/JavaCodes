package prac2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<---- Welcome to Banking System ---->");
		Account a=new Account("Mrudul","savings",9000);
		a.display();
		a.deposit();
		a.withdraw();
      
	}

}
