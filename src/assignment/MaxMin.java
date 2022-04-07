package assignment;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int number;
int min = Integer.MIN_VALUE;
int max = Integer.MAX_VALUE;
		
		Scanner sc = new Scanner(System.in);
		 char choice;
		 
		 do {
			 System.out.println("Enter the number: ");
			 number = sc.nextInt();
			 if (number > min) {
				 min = number;
				
			}
			 if (100 > max) {
				 max = number;
			}
			
			 //charAt - return the char values of the sequence is at index ranges from 0 to length() -1
			 System.out.println("Do you want to min or max number y/n");
			 choice = sc.next().charAt(0);
			 
			
		} while (choice == 'y'|| choice == 'Y');
		 System.out.println("Min number " + min);
		 System.out.println("Max  number " + max);
		 
		 
		

	}

}
