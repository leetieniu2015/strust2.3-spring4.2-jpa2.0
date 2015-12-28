package com.instony.action.json;

import com.instony.model.pojo.Holiday;
import com.opensymphony.xwork2.ActionSupport;

public class HolidayAction extends ActionSupport
{
	private static final long serialVersionUID = -7621583291475943428L;
	
	private Holiday holiday;
	
	public String getIsHoliday() throws Exception
	{
		holiday = new Holiday();
		holiday.setDate("2015-12-14 12:59:59");
		holiday.setStatus(0);
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
}
