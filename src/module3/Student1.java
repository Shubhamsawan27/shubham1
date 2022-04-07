package module3;

import java.util.Scanner;

public class Student1 {

	private int rollNo;
	private String name;
	private double score;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("This is a accept method");
		System.out.println("enter the rollno");
		rollNo = sc.nextInt();
		System.out.println("enter the name");
		name = sc.next();
		System.out.println("enter the score");
		score = sc.nextDouble();
	}

	public void display() {
		System.out.println("the roll no is" + rollNo + "and name is " + name);
		System.out.println("score is" + score);
	}

	public void markAttendance() {
		System.out.println("marking the attendance . .");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 student = new Student1();

		student.accept();
		student.display();
		student.markAttendance();

		System.out.println("============================");
		System.out.println("Creating 2nd Object");
		Student1 student2 = new Student1();
		student2.accept();
		student2.display();
		student2.markAttendance();

	}

}
