package hdfc1;



public class Account {

	private int accNo;
	private String accName;
	private double accBal;
	
	public Account() {
		System.out.println(" This is the default constructor ");
		accNo =0;
		accName=" ";
		accBal=0.0;
	}
	
	public Account(int accNo,  String accName, double accBal) {
		System.out.println("This is the parametarizaed constructor");
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	public void withdraw(double amt) {

		accBal = accBal + amt;
			
		}
	public void display() {
		System.out.println("The account no is " + accNo);
		System.out.println("The account name is " + accName);
		System.out.println("The account balance is " +accBal);
	}

public void deposit(double amt) {

	accBal = accBal + amt;
		
	}

public void transfer( Account account2, double amt ) {
	System.out.println ("enter the amount to transfer") ;
	withdraw(amt);
	account2.deposit(amt);
	}

@Override
public String toString() {
	return "Account [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + ", getAccNo()=" + getAccNo()
			+ ", getAccName()=" + getAccName() + ", getAccBal()=" + getAccBal() + "]";
}





}
