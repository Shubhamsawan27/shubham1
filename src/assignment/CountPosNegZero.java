package assignment;
import java.util.Scanner;

public class CountPosNegZero {
	//Enter the number till user want and at the end it should display the positive negative zero number
	//

	public static void main(String[] args) {
		int number, countPositive  = 0, countNegative = 0, countZero = 0;
		
		Scanner sc = new Scanner(System.in);
		 char choice;
		 
		 do {
			 System.out.println("Enter the number: ");
			 number = sc.nextInt();
			 if (number > 0) {
				 countPositive++;
				
			}
			 if (0 > number) {
				 countNegative++;
			}
			
			 else 
			 {
				 countZero++;
				
			}
			 //charAt - return the char values of the sequence is at index ranges from 0 to length() -1
			 System.out.println("Do you want to count number y/n");
			 choice = sc.next().charAt(0);
			 
			
		} while (choice == 'y'|| choice == 'Y');
		 System.out.println("Positive number " + countPositive);
		 System.out.println("Negative number " + countNegative);
		 System.out.println("Zero number " + countZero );
		 
		

	}

}
