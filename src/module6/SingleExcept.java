package module6;

public class SingleExcept {
	
	public static double divide(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b = 5;
		
		try {
			double d=divide(a,b);
			System.out.println("result"  + d);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Err you can divide number by 0 !!");
//			System.out.println(e.getMessage());
//			System.out.println(e.printStack);
//			e.fillInStackTrace();
//			e.getCause();
			e.hashCode();
		}
		
		finally {
			System.out.println("This is my finally block");
		}
	}
	
	

}
