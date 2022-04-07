package module3;

public class Teststud1 {

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
