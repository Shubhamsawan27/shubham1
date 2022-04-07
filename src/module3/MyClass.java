package module3;

import module2.Student;

public class MyClass {
	public int rollno;
	public String name;
	public double salary;
	int a = 123;
	int b = 123;
	int c = a + b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Student student = new Student();
		student.name = "ANNAND";
	     student.salary = 88;
	     student.rollno = 23;
	     
	     student.accept();
	     student.display();
	     student.markAttendance();
	     student.checkResult();
	     student.appearExam();
		

	}

}
