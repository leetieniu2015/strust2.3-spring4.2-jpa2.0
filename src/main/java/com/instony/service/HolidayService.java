package com.instony.service;

import com.instony.model.pojo.Holiday;

public interface HolidayService
{
	public Holiday getHoliday(String date);
	
	public Holiday saveHoliday(String date);
}
