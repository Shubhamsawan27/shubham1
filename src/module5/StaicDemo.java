package module5;

public class StaicDemo {
public static int num1=1;
public void display() {
	System.out.println("num1 is" + num1);
	num1++;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaicDemo obj = new StaicDemo();
		obj.display();
		
		StaicDemo obj2 = new StaicDemo();
		obj2.display();
		
		StaicDemo obj3 = new StaicDemo();
		obj3.display();

		
	}

}
