
// to read the file in checked exception
package module6;
import java.io.*;

import java.io.FileInputStream;

public class CheckExce {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("C:\\Users\\HP\\Documents\\assingment\\ass1.txt");

		int k;
		while ((k = fs.read())!=-1) {
		System.out.print((char) k);
			
		}
	}

}
