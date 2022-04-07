package assignment;
import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		//Triangle pattern
		
//		int n =5;
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < n; i++) {
//			
//			for (int k = i; k < n;k++) 
//				System.out.print(" ");
//				
//				for (int j = 0; j <=i ; j++) {
//					System.out.print(" * ");
//					
//			}
//				System.out.println();
//			
//		}
		
		System.err.println("===========================");
		
		int m, j, n;
		Scanner sc1 = new Scanner(System.in);
		n = sc1.nextInt();
		
		for (int i = 0; i < n; i++) {
				
				for ( j = 1; j <=(i*2-1) ; j++) {
					System.out.print( j );
					
					
			}
				System.out.println(" ");
			
		}
		

	}

}
