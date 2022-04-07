package inheritance;



class Shape{
	protected void calArea(String s, int a, int b) {
		System.out.println("The calArea of perimetre");
	}
	
	protected void display() {
		System.out.println("This is diaplay method of parent class");
	}
	
	protected void fun1() {
		System.out.println("This is fun1 method of parent class");
	}
}
	class Rectangle extends Shape{
		
		public void calArea(String s, int a, int b) {
			System.out.println("The cal area of parent");
		}
		protected void display() {
			super.fun1();
			System.out.println("Ther is a diaplay of child class ");
		}
		
			}
	
	

public class OverridingDemo {

	public static void main(String[] args) {
		Shape s = new Shape();
		s.calArea("Shape", 10, 20);
		s.display();
		s.fun1();
		
		Rectangle rec = new Rectangle();
		rec.calArea("rect",10,20);
		rec.display();
		
		s=new Rectangle();
		s.calArea("Rectangle",11,22);
		s.display();
	

	}

}
