package fileio;

class Address{
	String city,state, country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Name{
	static String fname, mname, lname;

	public Name(String fname, String mname, String lname) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}
	
	
}

class Student{
	int rollno;
	String name;
	Address address;
	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}


void Display() {
	System.out.println(rollno + " " + name);
	System.out.println( " first name is  " + Name.fname + " middle name is  "  + Name.mname + " Last Name" + Name.lname );
	System.out.println("address city " + address.city + "and state is " + address.state );
	
}
	
}

public class AggregationSec {	
	public static void main(String[] args) {
		Address add1 = new Address("Mumbai", "Maha", "India");
		Address add2 = new Address("Jhansi", "Madhyapradesh", "India");
		Address add3 = new Address("Banglore", "karnataka", "India");
		
		System.err.println("+=================================================+");
		
		Name na1 = new Name("Shubham","Sada","Sawant");
		Name na2 = new Name ("Ramesh","Shriram","Gupta");
		Name na3 = new Name ("Shyam","Babu","Rai");
		
		System.err.println("+=================================================+");
		
		Student stud1 = new Student(21,"Shubham",add1);
		Student stud2 = new Student(22,"Ramesh",add2);
		Student stud3 = new Student(21,"Shyam",add3);
				
		
		
	}
}



