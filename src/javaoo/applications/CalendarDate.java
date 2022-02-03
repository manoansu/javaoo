package javaoo.applications;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarDate {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		int hour = cal.get(Calendar.HOUR);
				
		d = cal.getTime();
		System.out.println(sdf.format(d));
		

		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		System.out.println("Hour: " + hour);
	}
}