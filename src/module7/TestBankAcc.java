package module7;

public class TestBankAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc[] arr = new BankAcc[5];
		arr[0] = new BankAcc(1, "Ram", 20000);
		arr[1] = new BankAcc(2, "Sam", 30000);
		arr[2] = new BankAcc(3, "Gam", 40000);
		arr[3] = new BankAcc(4, "Yam", 50000);
		arr[4] = new BankAcc(5, "Dam", 60000);
		
		System.out.println("Displaying the object");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); //calling to array obj
			
		}
		
		arr[1].setAccHolderName("Jayendra");
		System.out.println(arr[1].getAccHolderName());
		

		arr[2].setAccBal(4000000);
		System.out.println(arr[2].getAccBal());
		
		

	}

}
