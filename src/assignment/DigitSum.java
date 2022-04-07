package assignment;
import java.util.Scanner;

public class DigitSum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of digit of given number

		int m, n, sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit");
		m = sc.nextInt();
		while(m > 0) {
			n =m%10;
			sum = sum + n;
			m = m/10;
		}
		System.out.println("Sum of digit " + sum);

	}

}
