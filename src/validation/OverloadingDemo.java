package validation;

public class OverloadingDemo {
	public int sum(int a, int b) {
		return(a + b);
	}
	public double sum(double a, double b) {
		return(a + b);
	}
	public float sum(float a, float b) {
		return(a + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo obj = new OverloadingDemo();
		double d=obj.sum(33.44, 87.77);
		System.out.println("the result is" + d);
		
		float f=obj.sum(33.11f, 87.66f);
		System.out.println("the result is" + f);
		
		int i=obj.sum(33, 87);
		System.out.println("the result is" + i);
	}

}
