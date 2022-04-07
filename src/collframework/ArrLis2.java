package collframework;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrLis2 {

	private static final Object Modi = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList myList2 = new ArrayList();
		
		Emp emp1 = new Emp(1,"Narendra", 400000);//0
		Emp emp2 = new Emp(2,"Damodar", 500000);  //1
		Emp emp3 = new Emp(3,"Modi", 600000);//2
		

		myList2.add(emp1);
		myList2.add(emp2);
		myList2.add(emp3);
		
		myList2.add(100);
		myList2.add(55.55);
		myList2.add("Neerja");
		myList2.add(true);

		Iterator obj = myList2.iterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}
		System.out.println(myList2.contains("Modi"));
		myList2.remove(2);
		myList2.remove(Modi);
	
		Iterator itr3 = myList2.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
			
			myList2.clear();
			boolean res = myList2.isEmpty();
			System.out.println(itr3.next());
		}
		
	}
	

}


