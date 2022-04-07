package loop;
import java.util.Scanner;

public class Student {
	private int rollNo;
	private String name;
	private double score;
	private boolean passStatus;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("enter rollno, name, score, passstatus");
		rollNo = sc.nextInt();
		name = sc.next();
		score = sc.nextDouble();
		passStatus = sc.nextBoolean();
	}
	
	public void display() {
		System.out.println("enter no" + rollNo);
		System.out.println("name is" + name);
		System.out.println("Score is " + score);
		System.out.println("pass status is" + passStatus);
		
		
	}

	public static void main(String[] args) {
		
		Student student = new Student();
		//student.accept();
		student.display();
		
		
		
	}

}
