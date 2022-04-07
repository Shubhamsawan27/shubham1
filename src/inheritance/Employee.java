package inheritance;

public class Employee extends Student {

	private int empno;
	private String comp;
	private String desg;
	private double sal;
	
	

	public Employee(String name, char gender, int age, int rollNo, char grade, double marks, String stream, int empno,
			String comp, String desg, double sal) {
		super(name, gender, age, rollNo, grade, marks, stream);
		this.empno = empno;
		this.comp = comp;
		this.desg = desg;
		this.sal = sal;
	}



	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", comp=" + comp + ", desg=" + desg + ", sal=" + sal + ", rollNo=" + rollNo
				+ ", grade=" + grade + ", marks=" + marks + ", stream=" + stream + ", name=" + name + ", gender="
				+ gender + ", age=" + age + "]";
	}
	
	
	
	
	
	

}
