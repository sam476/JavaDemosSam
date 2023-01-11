package core.cognixia.jump.flowcontrol;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		
		// create date
		Date date = new Date();
		System.out.println(date);
		
//		date.setDate(date);
		
		
		// String to Date
		String dateStr = "15/10/2020"; // day, month, year
		date = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
		System.out.println("date = " + date);

	}

}
