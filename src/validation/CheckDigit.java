package validation;
import java.util.Scanner;


class CheckDigit {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		if(num>0 && num<=9)
			System.out.println("Single right number:");
		else if(num >9 && num <= 99){
			System.out.println("two digit member");
		}
	}
		
 }