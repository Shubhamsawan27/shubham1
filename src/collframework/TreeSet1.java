package collframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet treeset = new TreeSet();
		treeset.add(100);
		treeset.add(55);
		treeset.add(23);
		treeset.add(45);
		
		System.out.println("The data is shown");
		
		Iterator itr2 = treeset.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}


	}

}
