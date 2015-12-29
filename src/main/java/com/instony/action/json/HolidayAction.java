package com.instony.action.json;

import org.springframework.beans.factory.annotation.Autowired;

import com.instony.model.pojo.Holiday;
import com.instony.service.HolidayService;
import com.opensymphony.xwork2.ActionSupport;

public class HolidayAction extends ActionSupport
{
	private static final long serialVersionUID = -7621583291475943428L;
	
	private Holiday holiday;
	
	private String date;
	
	@Autowired
	private HolidayService holidayService;
	
	public String getIsHoliday() throws Exception
	{
		holiday = holidayService.getHoliday(date);
		return SUCCESS;
	}
	
	public String saveHoliday() throws Exception
	{
		holiday = holidayService.saveHoliday(date);
		return SUCCESS;
	}

	public Holiday getHoliday() 
	{  
        return holiday;  
    } 
	
	public void setHoliday(Holiday holiday)
	{
		this.holiday = holiday;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}
}
