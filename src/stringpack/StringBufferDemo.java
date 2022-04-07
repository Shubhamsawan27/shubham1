package stringpack;
import java.util.*;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Shyam Sunder");
		System.out.println(str1.append("Mane"));
		
		str1.delete(0, 3);
		System.out.println(str1);
		
		System.out.println("str1" + str1.length());

		
	}

}
