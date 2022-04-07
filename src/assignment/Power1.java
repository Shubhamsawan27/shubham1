package assignment;
import java.util.*;
public class Power1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the num1");
			int num1 = sc.nextInt();
			System.out.println("Enter the num2");
			int num2 = sc.nextInt();
			System.out.println(Math.pow(num1, num2));
		}
		
	}

}
