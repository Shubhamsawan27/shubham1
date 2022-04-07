package module3;

import module2.Student;

public class TestStud {


		public int rollno;
		public String name;
		public double score;
		
		public void accept() {
			System.out.println("this is accept method");
		}
		
	 public void display()
	 {
		System.out.println("This is display method");
		System.out.println("roll no is " + rollno );
		System.out.println("name is " + name);
		System.out.println("score is" + score);
		
	 }
	 public void markAttendance() {
		 System.out.println("This is marking statement");
	 }
	 
	 public void checkResult()
	 {
		 System.out.println("cheking the result");
	 }
	 
	 public void appearExam()
	 {
		 System.out.println("apperaring for exam");
	 }
	
	 
	 public static void main1(String[] args) {
			// TODO Auto-generated method stub
		 System.out.println("Creating the first object");
	     Student anand = new Student();
	     anand.name = "VAIBHAV";
	     
	     
	     //calling the method1
	     
	     anand.accept();
	     anand.display();
	     anand.markAttendance();
	     anand.checkResult();
	     anand.appearExam();
	     
	     System.out.println("Creating the Second object ");
	     Student val = new Student();
	     val.rollno = 2;
	     val.name = "vaibhav";
	     
	    
	     val.accept();
	     val.display();
	     val.markAttendance();
	     val.checkResult();
	     val.appearExam();
	    
	}
	
}
