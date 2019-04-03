package gwd.backend;

import java.sql.Connection;
import java.util.Calendar;

import gwd.common.USSOCalendarMgr;
import gwd.pojo.USSOCalendar;

public class CheckWorkDay {

	/* This method will check whether today's date is a non working day based on Number of days 
	 * example: The program want to check if today is 5th working day of the month then the no. of days to 
	 * be passed is 5  and it will return true if the condition is met.*/
	public boolean chkWorkDay(String firmCode, String warehouseCode, int numOfDays, Connection conn){

		boolean isNumOfDays = false;
		USSOCalendar ussoCal = new USSOCalendar();

		//Get today's date
		Calendar cal = Calendar.getInstance();
		int calMonth = cal.get(Calendar.MONTH) + 1; /* Add 1 as the month in Java is an index 0-11 */
		int calYear = cal.get(Calendar.YEAR);
		int calDay = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("Year: " + calYear + " Month: " + calMonth + " Day: " + calDay);

		//Get calendar for the whole Year and Month
		ussoCal = new USSOCalendarMgr().getCalendarByNumOfDays(firmCode, warehouseCode, calYear, 
				calMonth, numOfDays, conn);

		if(calYear == ussoCal.getCalYear() && calMonth == ussoCal.getCalMonth() && 
		   calDay == ussoCal.getCalDay()){
				isNumOfDays = true;
		}
		return isNumOfDays;
	}
}
