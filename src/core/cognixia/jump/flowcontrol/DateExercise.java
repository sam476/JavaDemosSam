package core.cognixia.jump.flowcontrol;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Set;

public class DateExercise {
	public static void main(String[] args) {
		
		try {
			convertDate();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		try {
			convertTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void convertDate() throws ParseException {
		String dateStr1 = "04/23/2004";
		String dateStr2 = "November 05 2014";
		String dateStr3 = "1993/30/09";
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy"); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("MMMMM dd yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/dd/MM");
		
		Date date1 = sdf1.parse(dateStr1);
		System.out.println(date1);
		
		Date date2 = sdf2.parse(dateStr2);
		System.out.println(date2);
		
		Date date3 = sdf3.parse(dateStr3);
		System.out.println(date3);
	}
	
	public static void convertTime() throws ParseException {
		
		String dateStr1 = "04/23/2004 7:30pm";
		String dateStr3 = "2013/30/09 21:50 ";
		String dateStr2 = "November 05 1991 9:23am";
		
		ZoneId zid1 = ZoneId.of("Europe/Paris");
		ZoneId zid2 = ZoneId.of("Indian/Mahe");
		ZoneId zid3 = ZoneId.of("US/Hawaii");
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy hh:mma"); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("MMMMM dd yyyy hh:mma");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/dd/MM HH:mm");
		
		Date date1 = sdf1.parse(dateStr1);
		Date date2 = sdf2.parse(dateStr2);
		Date date3 = sdf3.parse(dateStr3);
		
		ZonedDateTime zdt1 = ZonedDateTime.ofInstant(date1.toInstant(), zid1);
		ZonedDateTime zdt2 = ZonedDateTime.ofInstant(date2.toInstant(), zid2);
		ZonedDateTime zdt3 = ZonedDateTime.ofInstant(date3.toInstant(), zid3);
		
		System.out.println(zdt1);
		System.out.println(zdt2);
		System.out.println(zdt3);
	}

}