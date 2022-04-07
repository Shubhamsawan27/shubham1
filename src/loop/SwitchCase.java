package loop;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a week:");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("It is a sunday");
			break;
		case 2:
			System.out.println("It is a Monday");
			break;
		case 3:
			System.out.println("It is a Tuesday");
			break;
		case 4:
			System.out.println("It is a Wednesday");
			break;
		case 5:
			System.out.println("It is a Thursday");
			break;
		case 6:
			System.out.println("It is a saturday");
			break;
		default:
			System.out.println("Invalid week");
			
		}

	}

}
