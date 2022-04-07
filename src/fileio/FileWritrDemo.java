
package fileio;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class FileWritrDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\HP\\Documents\\assingment\\ass1.txt");
		FileOutputStream out1 = new FileOutputStream("C:\\Users\\HP\\Documents\\assingment\\ass2.pdf");
		int i;
		while((i=fr.read()) !=-1) {
			out1.write(i);
		}
	
	}

}
