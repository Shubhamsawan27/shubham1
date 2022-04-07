package datede;

import java.util.Date;
import java.text.SimpleDateFormat;


public class DateDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		System.out.println("Date is " + d1);
		System.out.println("Date is " + d1.toString());
		
		System.out.println("========= To format ============");
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(d1));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd:mm:yy  HH:mm:ss");
		System.out.println(sdf1.format(d1));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("E, MMM dd yyyy");
		System.out.println(sdf2.format(d1));
		
		
		
		

	}

}
