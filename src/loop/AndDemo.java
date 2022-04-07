package loop;

public class AndDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a>b && a>c) 
			System.out.println("a is greater");
			else if(b>a && b>c) 
				System.out.println("b is greater");
			else if(c>a && c>a) 
				System.out.println("c is greater");	
		
		if (a!=b) {
			System.out.println(" If a is not equal to b");
		}
	}
}

