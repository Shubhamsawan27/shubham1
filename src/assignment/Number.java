package assignment;
import java.util.Scanner;

public class Number {
	private int numOne;
	private int numTwo;
	private String result;
	
	public void accept() {
		System.out.println("Calculate the total");
		System.out.println("Enter number one");
		numOne = sc.nextInt();
		System.out.println("Enter number Two");
		numOne = sc.nextInt();
		System.out.println("Result will be");
		result = sc.next();
		
	}
	
	public void display() {
		System.out.println("Number one" + numOne);
		System.out.println("Number Two" + numTwo);
		System.out.println("result is" + result);
	}
	Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		System.out.println("The total result in variable");
		Number obj = new Number();
		obj.accept();
		obj.display();
		

	}

}
