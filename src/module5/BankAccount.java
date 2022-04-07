package module5;

public class BankAccount {
	
	private int accNo;
	private double bal;
	private static int idNum=100;
	
	public BankAccount() {
		accNo = idNum;
	}
	
	public void display() {
		System.out.println("acc no is " + accNo);
	}
	
	public static void getId() {
		System.out.println("id is " + idNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj = new BankAccount();
		obj.getId();
		BankAccount obj2=new BankAccount();
		obj2.getId();
		BankAccount.getId();
		getId();
		

	}

}
