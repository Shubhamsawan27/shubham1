package module2;

public class employee {
	
	int empno;
	String empName;
	double empSal;
	
	public void accept() {
		System.out.println("THIS IS ACCEPT METHOD");
	
	}
	public void display() {
		System.out.println("This is our display");
		System.out.println("This employee number" + empno);
		System.out.println("This is employee n ame" + empName);
		System.out.println("Our emp salary is " + empSal);
	}
	
	

	public static void main(String[] args) {
		
		Student anand = new Student();
	     anand.name = "ANAND";
	     anand.salary = 88;
	     
	     //caling the method
	     
	     anand.accept();
	     anand.display();
	     anand.markAttendance();
	     anand.checkResult();
	     anand.appearExam();
	     
	     //=======================================
	employee Emp = new employee();
		Emp.empno = 13;
		Emp.empName = "SHam";
		Emp.empSal = 2000;
		Emp.display();
		Emp.accept();
		
//		
//		Emp obj=new Emp();
//		obj.empno = 12;
//    	obj.empName = "Shubham";
//		obj.empSal = 50000;
//		obj.empno();
//		obj.empName();
//		obj.empSal();
//		
		
		
		

	}

}
