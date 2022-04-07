package stringpack;
import java.util.*;

public class StrBuilderDemo {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("Welcome");
		str1.append(" To java tranning !!!!");
		System.out.println(str1);
		System.out.println("position of" + str1.indexOf("j"));
		str1.insert(0, "radram");
		str1.codePointAt(3); //it will show the ASCII value
		str1.delete(0,3);
		System.out.println(" It will reverse " + str1.reverse());
		System.out.println(" lenhth " + str1.length());

	}

}
