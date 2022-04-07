/**
 * 
 */
package overloading;

/**
 * @author HP
 *
 */
public class MainOverloading {
	public  void main () {
		System.out.println("This is main without any perimetre");
	}
	
	public  void main (int a) {
		System.out.println("This is main with int  perimetre");
	}
	
	public  void main (float f) {
		System.out.println("This is main with float perimetre");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainOverloading obj = new MainOverloading();
		obj.main();
		obj.main(2);
		obj.main(12.23f);
	}

}
