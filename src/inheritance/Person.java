package inheritance;

public class Person {
	protected String name;
	protected char gender;
	protected int age;
	
	public Person(String name, char gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	protected void display() {
		System.out.println("display methodd of parent class");
	}
	 protected void fun1() {
		 System.out.println("fun1 of parent class");
		 }
	 
	 @Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}


	
}


