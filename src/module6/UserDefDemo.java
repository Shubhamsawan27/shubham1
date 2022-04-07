package module6;
import java.util.Scanner;

class PassException extends Exception{
	public PassException(String str) {  //constructor parameterized
		super(str);  //calling the parent class constructor
	}
}

public class UserDefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password");
		String pass1 = sc.next();
		try {
			if(pass1.length() < 5) {
				throw new PassException("The length can not be less than 5");
			} else if (pass1.matches("[a - zA-Z0-9]*")){
				throw new PassException("Special character not found");
			} else {
				System.out.println("The password is correct");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
