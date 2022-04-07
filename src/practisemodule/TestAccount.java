//create a abstract class BankAccount. with following member varibles
//	protected int id;
// 	protected float balance;
//provide the constructor. declare one abstract method calculateInterest() which returns float. 
//declare a class CurrentAccount with parent class BankAccount. provide a constructor 
//with 2 parameters  id, and balance. call the base constructor. override calculateInterest() which returns float. 
//
//declare a class LoanAccount  with parent class BankAccount. provide a constructor 
//with 2 parameters  id, and balance. call the base constructor. override calculateInterest() which returns float. 
//
//
//declare a class SavingsAccount with parent class BankAccount. provide a constructor 
//with 2 parameters  id, and balance. call the base constructor. override calculateInterest() which returns float. 







package practisemodule;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrentAccount ca = new CurrentAccount(1, 1000);
		System.out.println("Interest for current account " + ca.calculateInterest());
		
		SavingAccount sa = new SavingAccount(2, 20000);
		System.out.println("Interest for saving account " + sa.calculateInterest());
		
		LoanAccount la = new LoanAccount(3, 50000);
		System.out.println("Interest for loan account " + la.calculateInterest());

	}

}
