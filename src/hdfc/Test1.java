package hdfc;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
		Account acc = new Account();
		acc.display();
		
		System.out.println("===================");
		System.out.println("crearing object with parametre");
		
		Account acc2 = new Account(1,"Vijay",10000);
		acc2.display();
		System.out.println("Enter the amount to withdraw");
		double amt=sc.nextDouble();

		acc2.withdraw(amt);
		acc2.display();
	
		System.out.println("===================");
		System.out.println("calling the deposit method");
		System.out.println("Enter the amount to be deposited");
		double amt2=sc.nextDouble();

		acc2.deposit(amt2);
		acc2.display();
		
		
		
		System.out.println("===================");
		System.out.println("crearing object with parametre");
		Account acc3 = new Account(2,"Shyam",20000);
		double amt3=sc.nextDouble();

		acc2.transfer( acc3, amt2);
		acc3.display();
		
	}

}
