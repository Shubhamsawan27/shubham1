package collframework;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, String> hashmap = new HashMap();
		hashmap.put('S', "Shubham");
		hashmap.put('R', "Ramesh");
		hashmap.put('G', "Genene");
		hashmap.put('P', "Paddy");
		hashmap.put('V', "Vaibhav");
		
		System.out.println(hashmap);
		Object[] keys = hashmap.keySet().toArray();
		for (int i = 0; i < keys.length; i++) {
			System.out.println(keys[i]) ;
			
		}
		
		boolean res= hashmap.containsKey('S');
		System.out.println("res is " + res);
		
		System.out.println(hashmap.get('V'));
		System.out.println(hashmap.get('R'));
		
		hashmap.put(null, "Romesh");
		hashmap.put('S', "Somesh");
		
		System.out.println(hashmap.get('S'));

	}

}
