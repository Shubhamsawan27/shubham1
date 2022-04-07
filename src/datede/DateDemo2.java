package datede;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
public class DateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		System.out.println("hr" + ldt.getHour());
		System.out.println("min" + ldt.getMinute());
		System.out.println("sc" + ldt.getSecond());
		System.out.println("mn" + ldt.getMonth());
		System.out.println("yr" + ldt.getYear());
		
		LocalDate ldt2 =LocalDate.of(2021, Month.MARCH, 22);
		
		
		

	}

}
