package inheritance;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person vij = new Person("Vijay" , 'M',25);
		vij.fun1();
		vij.display();
		System.out.println(vij);
		
		System.err.println("+===============================+");
		Student st1 = new Student("vijay", 'M', 24, 10,'A',88.9, "Computer Science");
		System.out.println(st1);
		
		Employee emp = new Employee("vijay", 'M', 24, 10,'A',88.9, "Computer Science", 101, "Radram", "java programmer", 4000);
		System.out.println(emp);
		
		System.err.println("+===============================+");
		Person shubh = new Person("Shubham" , 'M',25);
		shubh.fun1();
		shubh.display();
		System.out.println(shubh);
		
		System.err.println("+===============================+");
		
		Student st2 = new Student("Shubham", 'M', 24, 10,'A',88.9, "Information Technology");
		System.out.println(st2);
		
		Employee emp1 = new Employee("Shubham", 'M', 24, 10,'A',88.9, "Information Technology", 201, "Layam", "Python programmer", 4001);
		System.out.println(emp1);

	}

}
