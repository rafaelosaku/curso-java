package application;

import java.text.SimpleDateFormat;
import java.time.temporal.JulianFields;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JulianDay {

	public static void main(String[] args) {
		new JulianDay().julian("0116");
	}
	
	public String julian(String date) {
		int m = Integer.parseInt(date.substring(0,2));
		int d = Integer.parseInt(date.substring(2,4));
		String julianDay = null;
		SimpleDateFormat y = new SimpleDateFormat("mmddyy");
		GregorianCalendar gc = new GregorianCalendar();
		int test = Calendar.DECEMBER;
		gc.set(Calendar.DAY_OF_MONTH, d);
		gc.set(Calendar.MONTH, m-1);
		gc.set(Calendar.YEAR, 21);
//		gc.setGregorianChange(gc.getTime());
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));
		julianDay = String.format("%tj", gc);
		julianDay = String.format("%tj", gc);
		System.out.println(julianDay.toString());
		return julianDay;
		
	}

}
