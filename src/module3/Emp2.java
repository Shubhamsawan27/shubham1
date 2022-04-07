package module3;
import java.util.Scanner;



public class Emp2 {
	
	private int empNo;
	private String empName;
	private double empSal;
	
	public void accept() {
		System.out.println("This is accept method ");
		System.out.println(" Enter the employee number is " );
		empNo = sc.nextInt();
		System.out.println(" Enter the employee name is " );
		empName = sc.next();
		System.out.println("Our emp salary is " );
		empSal = sc.nextDouble();
	}
	
	public void display() {
		System.out.println("Employee no " + empNo  );
		System.out.println("Employee name is " + empName );
		System.out.println("Emp salary " + empSal);
		
	}
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Creating first object");
		Emp2 emp2 =new Emp2();
		emp2.accept();
		emp2.display();

	}

}
