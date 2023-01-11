package core.cognixia.jump.flowcontrol;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateRunner {

	public static void main(String[] args) throws ParseException {

//		getDate();
//		dateFormat();
//		stringToDate();
//		getLocalDateTime();
		getZonedDate();

	}

	public static void getDate() {

//		Creating a new date object of today's date.
		Date today = new Date();
//		The date object has a toString method that will print the date in a standard format.
		System.out.println(today);

//		date.setDate(date);

	}

	public static void dateFormat() {

		Date today = new Date();
		SimpleDateFormat sdf1, sdf2;

//		Adding the desired date format into the simpleDateFormat's constructor
		sdf1 = new SimpleDateFormat("MM/dd/yy");
		sdf2 = new SimpleDateFormat("MMMM dd, yyyy");
//		Formatting the date object with the simpleDateFormat to output the desire date format
		String formattedDate1 = sdf1.format(today);
		String formattedDate2 = sdf2.format(today);

		System.out.println(formattedDate1);
		System.out.println(formattedDate2);

	}

	public static void stringToDate() throws ParseException {
//		Here is a date in a string object and in a  day, month, year format 
//		that we would like to work with as a Date object
		String dateStr = "15/10/2020";

//		Passing the string's format into a SimpleDateFormat's constructor will allow us to parse the string
//		Note that SimpleDateFormat's .format() method returns a String, but .parse() returns a Date object.
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
		System.out.println("date = " + date);

	}

	public static void getLocalDateTime() {

//		A LocalDate is an object that offers methods relating to dates when dealing with time zones is not required
//		A LocalDate object can be created with the of syntax.
		LocalDate July3 = LocalDate.of(2015, 07, 03);
		System.out.println(July3);
//		The LocalDate can also be gotten from a string in the Year-Month-Day format
//		LocalDate ld = LocalDate.parse("2015-07-03");

//		The LocalDate class gives access to several useful date methods
		LocalDate July6 = July3.plusDays(3);
		System.out.println(July6);
		System.out.println("July 6th, 2015 was a " + July6.getDayOfWeek());

//		A LocalTime is a time without a date
		LocalTime now = LocalTime.now();
		System.out.println(now);

//		A LocalTime can also parse a string in this exact format to get a time
		LocalTime eightFourtyFive = LocalTime.of(8, 45);
//		LocalTime eightFourtyFive = LocalTime.parse("08:45");
		System.out.println(eightFourtyFive);

//		A LocalDateTime is a combination of Date and Time
//		The overloaded constructor can take date and time parameters, or a LocalDate and a LocalTime
//		LocalDateTime has access to many of the same methods as both LocalDate and LocalTime
		LocalDateTime ldt = LocalDateTime.of(July3, eightFourtyFive);
//		LocalDateTIme ldt = LocalDateTime.of(2015,7,3,8,45);
		System.out.println(ldt);

	}

	public static void getZonedDate() {

		LocalDateTime ldt;
//		A ZonesDateTime is used when keeping track of time zones is important
		ZonedDateTime zdt;
		
//		Each time zone has its own ZoneId
//		System.out.println(ZoneId.getAvailableZoneIds());
		
		ZoneId id = ZoneId.of("Europe/Paris");
		
		ldt = LocalDateTime.of(2015, 7, 3, 8, 45);
		zdt = ZonedDateTime.of(ldt, id);
		System.out.println(zdt);
		
		// Prints: 2015-07-03T08:45+02:00[Europe/Paris]
		// based on UTC time (Coordinated Universal Time), Greenwich time in UK
		
		zdt.getHour(); // returns hour
		zdt.plusDays(5); // plus methods add units of time to date

	}

}