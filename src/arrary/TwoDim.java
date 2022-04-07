package arrary;

import java.util.Scanner;

public class TwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] marks = new int[3][4];
		Scanner sc = new Scanner(System.in);
		
		System.err.println("enter the values");
		for(int i =0; i<3;i++) {
			for(int j =0; j<4;j++) {
				
				marks[i][j]	= sc.nextInt();		
				}
			System.out.println();
		}

		
		System.err.println("Display the value");
		for(int i =0; i<3;i++) {
			for(int j =0; j<4;j++) {
				
				System.out.print(marks[i][j] + " ");	
				}
			System.out.println();
		}

	}

}
