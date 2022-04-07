package practisemodule;

class Address{
	String city;
	String state;
	int pincode;
	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	
}

class Emp{
	int empid;
	String ename;
	Address address;
	public Emp(int empid, String name, Address address) {
		super();
		this.empid = empid;
		this.ename = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println("empid is " + empid);
		System.out.println("ename " + ename);
		System.out.println("address city " + address.city + "and state is " + address.state 
		+ "picode is " + address.pincode);
		
	}
}



public class aggregationdemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address add1 = new Address("Thane" , "Maharashtra", 400067);
		Address add2 = new Address("Sion" , "Maharashtra", 400027);
		
		Emp emp1 = new Emp(100,"Anand", add1);
		Emp emp2 = new Emp(200,"Mnand", add2);


		emp1.display();
		emp2.display();
	}

}
