package com.gfan.report.frame.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {
	
	public static String getStringDate(int lastday){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, lastday);
		return dateFormat.format(c.getTime());
	}
	public static String getStringWeek(int lastweek){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.WEEK_OF_YEAR, lastweek);
		c.add(Calendar.DATE, 2-c.get(Calendar.DAY_OF_WEEK));
		return dateFormat.format(c.getTime());
	}
	public static String getStringMonth(int lastmonth){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, lastmonth);
		return dateFormat.format(c.getTime());
	}
}