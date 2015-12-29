package com.instony.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.instony.exception.InstonyException;

public class DateUtil
{
	public static final SimpleDateFormat SIMPLEFORMAT = new SimpleDateFormat("yyyyMMdd");
	
	public static final SimpleDateFormat SIMPLE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	
	public static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
	
	public static final SimpleDateFormat NORMALFORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
	
	public static boolean isWeekend(String date, SimpleDateFormat format) 
	{
		Calendar calender = Calendar.getInstance();
		try
		{
			calender.setTime(format.parse(date));
			if(calender.get(Calendar.DAY_OF_WEEK) == 0 || calender.get(Calendar.DAY_OF_WEEK) == 6)
			{
				return false;
			}
		}
		catch (ParseException ex)
		{
			throw new InstonyException(ex);
		}
		return true;
	}
}
