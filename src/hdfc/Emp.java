package hdfc;
import java.util.Scanner;

public class Emp {

	private int empId;
	private String ename;
	private double sal;
	
	public Emp() {
		System.out.println(" This is the default constructor ");
		empId =0;
		ename=" ";
		sal=0.0;
	}
		
		public Emp(int empNo,  String ename, double sal) {
			System.out.println("This is the parametarizaed constructor");
			this.empId = empId;
			this.ename = ename;
			this.sal = sal;
		}
		
		public void accept() {
			System.out.println("enter the empId, ename, sal");
			empId = sc.nextInt();
			ename = sc.next();
			sal = sc.nextDouble();
		}
		
		
		public void display() {
			System.out.println("The employee Id is " + empId);
			System.out.println("The employee name is " + ename);
			System.out.println("The salary is " + sal);

			
		}
		Scanner sc = new Scanner(System.in);

}
