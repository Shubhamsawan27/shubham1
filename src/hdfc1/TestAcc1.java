package hdfc1;

import java.util.Scanner;

public class TestAcc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Scanner sc = new Scanner(System.in);
		String choice;
		int ch;

		do {
			System.err.println("HDFC");
			System.out.println("1. Accept the details: ");
			System.out.println("2. Display the details ");
			System.out.println("3. Withdraw amt ");
			System.out.println("4. Deposit amt ");
			System.out.println("5. Transfer ");
			System.out.println("6. check the balance");
			System.out.println("7. change the name");
			System.out.println("8. Exit ");
			System.out.println("Enter your choice (1-6)");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter the accno, accname, accbal");
				int accno = sc.nextInt();
				String name = sc.next();
				double bal = sc.nextDouble();
				account.setAccNo(accno);
				account.setAccName(name);
				account.setAccBal(bal);
				break;

			case 2:
				System.out.println("Display the details");
				account.display();
				break;

			case 3:
				System.out.println("Withdraw the amount");
				System.out.println("Enter the amount details: ");
				double amt = sc.nextDouble();
				System.out.println("Old balance is " + account.getAccBal());
				account.deposit(amt);
				System.out.println("New balance is " + account.getAccBal());
				break;

			case 4:
				System.out.println("Deposit is in process ");
				System.out.println("Enter the amount to deposit ");
				double amt1 = sc.nextDouble();
				System.out.println("old balance is " + account.getAccBal());
				account.deposit(amt1);
				System.out.println("New balance is " + account.getAccBal());
				break;

			case 5:
				System.out.println("Transfer is in process");
				Account account2 = new Account(12, "Shyam", 20000);
				System.out.println("Enter the amount ot transfer");
				double amt2 = sc.nextDouble();
				account.transfer(account2, amt2);
				System.out.println("old balance of acc is " + account.getAccBal());
				System.out.println("new balance of acc is " + account2.getAccBal());
				break;

			case 6:
				System.out.println("The name as changed");
				System.out.println("Change the name ");
				account.setAccName("ram");
				account.setAccBal(20000);
				
				System.out.println(" the accno is " + account.getAccBal());
				System.out.println(" the accname is " + account.getAccName());
				System.out.println(" the balance is " + account.getAccBal());
				break;
				
		
			case 7:
				System.exit(0);
				break;
			}

			System.out.println("Do you want to continue(y/n)?");
			choice = sc.next();

		} while (choice.equals("y") || choice.equals("Y"));

	}

}
