package fileio;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;



public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\HP\\Documents\\assingment\\ass1.txt");
		BufferedReader bf = new BufferedReader(fr,100);
		String str;
		while ((str=bf.readLine())!= null){
			
	
			System.out.println(str);
		}

	}

}
