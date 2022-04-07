package hdfc1;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		Account acc = new Account(1,"shubh",21000);
//		acc.display();
		
		System.out.println("enter the accno, name, balance");
		int accno = sc.nextInt();
		String name = sc.next();
		Double bal = sc.nextDouble();
		
		acc.setAccNo(accno);
		acc.setAccName(name);
		acc.setAccBal(bal);
	
		System.err.println("=========================");
		System.out.println("Displaying the detail");
		System.out.println(" the accno is " + acc.getAccBal());
		System.out.println(" the accname is " + acc.getAccName());
		System.out.println(" the balance is " + acc.getAccBal());
		
		System.err.println("=========================");
		System.out.println("Change the name ");
		acc.setAccName("ram");
		acc.setAccBal(20000);
		

		System.err.println("=========================");
		System.out.println("Displaying the detail");
		System.out.println(" the accno is " + acc.getAccBal());
		System.out.println(" the accname is " + acc.getAccName());
		System.out.println(" the balance is " + acc.getAccBal());
		
		System.err.println("=========================");
		System.out.println(acc);
		
		
		
	
		
		

	}

}
