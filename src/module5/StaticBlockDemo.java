package module5;

public class StaticBlockDemo {
	final static double PI;
	
	static {
		PI = 3.14;
	}
	
	public static void method1() {
		System.out.println("this is method1");
		System.out.println("PI is" + PI);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pl is" +PI);
		method1();

	}

}
