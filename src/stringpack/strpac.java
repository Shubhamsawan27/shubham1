package stringpack;

public class strpac {

	public static void main(String[] args) {
		
		String str1= "Shubham";
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.substring(2,5));
		System.out.println("Concat" + str1.concat(str1));
		
		String str2 = "RadRam";
		System.out.println(str2);
		System.out.println(str2.trim());
		
		System.out.println("replace with" + str1.replace('A', 'B'));
		int x=33;
		String i = String.valueOf(x);
		System.out.println(i);
		
		String str3 = "Radhe";
		if (str1.equalsIgnoreCase(str1)) 
			System.out.println("Both are same");
			else 
				System.out.println("both are not same");
		
		
		for (int j = 0; j < str1.length(); j++) {
			System.out.println(str1.charAt(j));
		}
		
		

	}

}
