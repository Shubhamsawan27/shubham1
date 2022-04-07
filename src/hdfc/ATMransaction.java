package hdfc;
import java.util.Scanner;

public class ATMransaction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 100000, withDraw, deposit;
		while (true) {
			System.err.println("HDFC atm");
			System.out.println("Welcome to HDFC");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4.Exit");
			System.out.println("ATMransaction.main()");
			System.out.println("Enter the number for operation :");
		
			int n = sc.nextInt();
			
			switch(n) {
				
				case 1 : 
					System.out.println("Enter money to withdraw:");
					withDraw = sc.nextInt();
					if (balance >= withDraw) {
						balance = balance - withDraw;
						System.out.println("Please collect your money");
					
					} else {
						System.out.println("Insufficient balance ");
					}
					System.out.println(" ");
					break ;
					
				case 2 :
					System.out.println("Enter money to be deposited :");
					deposit = sc.nextInt();
					 balance = balance + deposit;
					 System.out.println("Your money has been sucessfully deposited");
					 System.out.println(" ");
					break;
				case 3:
					System.out.println("Balance :" + balance);
					System.out.println(" ");
					break;
					
				case 4:
					System.exit(0);
//Terminates the currently running Java Virtual Machine.
//The argument serves as a status code; by convention, a nonzero status 
//code indicates abnormal termination. 
//This method calls the exit method in class Runtime. 
//This method never returns normally. 
//The call System.exit(n) is effectively equivalent to the call: 

			}
				
		}
		

	}

}
