package hdfc;

public class Test2 {

	public static void main(String[] args) {
	Emp emp = new Emp();
	emp.accept();
	emp.display();
	
	System.out.println("=================");
	System.out.println("creating an obj with parametre");
	Emp emp2 = new Emp(2,"Shubh",2000);
	emp2.display();
	
	System.err.println("=================");
	System.out.println("creating an obj with parametre");
	Emp emp3 = new Emp(3,"shyam",22000);
	emp3.display();
	
	

	}

}
