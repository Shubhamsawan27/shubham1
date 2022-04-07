package module4;
import java.util.Scanner;

public class DecimalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub12
		int num1;
		String num2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		num2 = sc.next();
		System.out.println("Enter a Decimal number: ");
		num1 = sc.nextInt();
		System.out.println("Binary to Decimal:"  + Integer.parseInt(num2,2));
		System.out.println("Decimal to Binary: " + Integer.toBinaryString(num1));

	}

}
