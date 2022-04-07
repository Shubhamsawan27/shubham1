package stringpack;

import java.util.Arrays;

public class PracStrings {

	public static void main(String[] args) {
		//reference tab to change name in bracket by creating new string
		// without affecting first array
		
		String[] Shubh = {"joe","ram","sham","gam"};
		String[] Shubham = new String[4];
		
		for (int i = 0; i < Shubham.length; i++) {
			Shubham[i] = Shubh[i];
		}
		Shubham[1] = "shabby";
		
		System.out.println(Arrays.toString(Shubh));
		System.out.println(Arrays.toString(Shubham));
		

	}

}
