package assignment;

public class PrimeExample {

	public static void main(String[] args) {
		int i, m =0,flag = 0;
		int n = 4;
		if (n==0 || n==1) {
			System.err.println(n + " is not prime number");
		} else {
			for (i = 2; i< m; i++) {
				System.out.println(n + " is not  prime number");
				flag =1;
				break;
			}
			
		}
		
		if(flag == 0) {
			System.out.println(n + " is prime number");
		}
	}

}
