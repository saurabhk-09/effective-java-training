package in.conceptarchitect.financeapp;

import in.conceptarchitect.finance.ATM;
import in.conceptarchitect.finance.Bank;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank B=new Bank(22,"pa@ss",2000);

		ATM A=new ATM();
		
		A.withdraw(22,"p@ss",2000);
		A.Deposit(22, 3000);
		
		A.changePassword("p@ss","mohan@");
		
		
	}

}
