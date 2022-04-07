// When a user has not call it will be generalization
package module6;

public class MultipleException {
	public static double divide(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "100";
String b = "5";
		
		try {
			int a1 = Integer.parseInt(a);
			int b1 = Integer.parseInt(b);
			double d=divide(a1,b1);
			System.out.println("result"  + d);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Err you can divide number by 0 !!");
//			System.out.println(e.getMessage());
//			System.out.println(e.printStack);
//			e.fillInStackTrace();
//			e.getCause();
			e.hashCode();
		} catch (NumberFormatException e1) {
			// TODO: handle exception
			System.out.println("Err : The provided values need to the integer ");
			System.out.println(e1.getMessage());
		} catch (Exception e2) {
			System.out.println("Err ther is not error");
			System.out.println(e2.getMessage());
		}
		
		finally {
			System.out.println("This is my finally block");
		}
	}


}
