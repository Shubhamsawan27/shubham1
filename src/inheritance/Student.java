package inheritance;

public class Student extends Person {

	protected int rollNo;
	protected char grade;
	protected double marks;
	protected String stream;

	

	public Student(String name, char gender, int age, int rollNo, char grade, double marks, String stream) {
		super(name, gender, age); // It is used to call the constructor of parent class Person.
		this.rollNo = rollNo;
		this.grade = grade;
		this.marks = marks;
		this.stream = stream;
	}



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", grade=" + grade + ", marks=" + marks + ", stream=" + stream + ", name="
				+ name + ", gender=" + gender + ", age=" + age + "]";
	}

	


}
