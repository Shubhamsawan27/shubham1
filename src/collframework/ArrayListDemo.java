package collframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList myList = new ArrayList();
		Emp emp1 = new Emp(1,"Narendra", 400000);//0
		Emp emp2 = new Emp(2,"Damodar", 500000);  //1
		Emp emp3 = new Emp(3,"Modi", 600000);//2
		Emp emp4 = new Emp(4,"Amit", 700000);//3
		Emp emp5 = new Emp(5,"Saha", 800000);//4

		//to the object
		myList.add(emp1);
		myList.add(emp2);
		myList.add(emp3);
		myList.add(emp4);
		myList.add(emp5);
		
		//to display the object
		System.out.println(myList.get(2));
		System.out.println(myList.get(3));
		System.out.println(myList.get(1));
		System.out.println(myList.get(4));
		System.out.println(myList.get(0));
	
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		Iterator obj = myList.iterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
			
			
		}
	}

}
