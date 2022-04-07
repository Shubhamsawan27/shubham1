package validation;
import java.util.Scanner;

  public class User {
	private String name;
	private int age;
	private double sal;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter the name, age, sal");
		name = sc.next();
		age = sc.nextInt();
		sal = sc.nextDouble(); 
		
	}
	
	public void checkAge() {
		if(age < 18) 
			System.out.println("Your are eligible for vote");
		else 
			System.out.println("You are not eligible to vote");
	}
	
	public boolean checkSal() {
		if(sal<1000 || sal>100000)
			return false;
		else 
		    return true;
	
	}
	
	public void display() {
		System.out.println("name is" + name);
		System.out.println("age is" + age);
		System.out.println("sal is" + sal);
	}
  
	

	public static void main(String[] args) {
		boolean result;
		
		
		User user = new User();
		User user1 = new User();
		
		System.out.println("the hashcode is " + user1.hashCode());
//		user.accept();
//		user.checkAge();
//		result = user.checkSal();
//		
//		if (result == true) {
//			System.out.println("Salary is valid");
//			user.display();
//			}
//		else 
//			System.out.println("Salary is invalid");
//		}

	}
  }


