package inheritance;
interface Graphic{
	double PI = 3.14;
	double calArea();
	double calPeri();
}

class Circle implements Graphic{
		double radius;
	
		public  Circle(double radius) {
			// TODO Auto-generated constructor stub
		
			this.radius = radius;
		}
		
		public double calArea () {
			return (PI * radius * radius);
		}
		
		public double calPeri() {
			return(2 * PI * radius);
		}
		
}

class Rectangle1 implements Graphic{
	double height;
	double width;

	  public Rectangle1(double height, double width) {
		  		super();
			
				this.height = height;
				this.width = width;
	}
	
	public double calArea () {
		return (height * width);
	}
	
	public double calPeri() {
		return(2 * height + width);
	}
	
}

	
public class IntefaceClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cricle = new Circle(21.2);
		System.out.println("area is " + cricle.calArea());
		System.out.println("perimetre is " + cricle.calPeri());
		
		System.err.println("+=========================+");
		Rectangle1 rec1 = new Rectangle1(12.2, 10.0);
		System.out.println("height is " + rec1.calArea());
		System.out.println("width is " + rec1.calPeri());

	}

}
