package generic;

class TestGenerics {
	public <E> void printArray(E[] arr) {
		for (E i : arr) {
			System.out.println(i);

		}
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("passing integer array...");
		Integer[] intarr = { 12, 34, 45, 76 };
		TestGenerics obj = new TestGenerics();
		obj.printArray(intarr);

		// float
		System.err.println("+======================+");
		Float[] arr = { 55.7f, 67.7f, 55.7f, 23.5f };
		obj.printArray(arr);

		// Double
		System.err.println("+======================+");
		Double[] arr1 = { 56.7, 76.7, 54.7, 33.5 };
		obj.printArray(arr1);
		
		//float
				System.err.println("+======================+");
				String[] str1 = {"Shubham","Ramesh","Shyam","Biksha"};
				obj.printArray(str1);

	}

}
