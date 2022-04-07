package module6;

public class ArrayException {

	public static void main(String[] args) {
		// index is 5 we mention it 20 so it is ArrayIndexOutOfBoundsException. 
		try {
			int [] arr = {12,26,35,44,53,12};
			System.out.println(arr[20]);
			
			String str1 = "Shubham";
			System.out.println(str1.substring(22));
			System.out.println(str1);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("The index given is not correct");
			System.out.println(e.getMessage());
		}

	}

}
