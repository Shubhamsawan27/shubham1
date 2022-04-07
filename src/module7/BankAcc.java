package module7;

public class BankAcc {
	private int accNo;
	private String accHolderName;
	private double accBal;
	
	
	public BankAcc(int accNo, String accHolderName, double accBal) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.accBal = accBal;
	}


	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getAccHolderName() {
		return accHolderName;
	}


	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}


	public double getAccBal() {
		return accBal;
	}


	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}


	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accHolderName=" + accHolderName + ", accBal=" + accBal + "]";
	}
	
	
	
	



}
