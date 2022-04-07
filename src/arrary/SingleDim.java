package arrary;
import java.util.Scanner;

public class SingleDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		String name [] = new String[5];
//		name[0] = "ria";
//		name[1] = "tia";
//		name[2] = "sia";
//		name[3] = "pia";
//		name[4] = "oia";
//		name[5] = "gia";
		name[6] = "Tia";
	
		System.out.println("Enter the 5 name from string");
		for (int i = 0; i < name.length; i++) {
			name[i] = sc.next();
			
		}
//		
for(String i: name) {
	System.out.println(i);
}
			
		}
		
	}


