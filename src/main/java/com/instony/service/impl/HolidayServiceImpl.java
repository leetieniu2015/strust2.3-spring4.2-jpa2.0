package com.instony.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.instony.constant.HolidayStatus;
import com.instony.dao.HolidayDao;
import com.instony.model.pojo.Holiday;
import com.instony.service.HolidayService;

import com.instony.util.DateUtil;

@Service
public class HolidayServiceImpl implements HolidayService
{
	@Autowired
	private HolidayDao holidayDao;

	@Override
	public Holiday getHoliday(String date)
	{
		Holiday holiday = holidayDao.get(Holiday.class, date);
		if(holiday == null)
		{
			holiday = new Holiday();
			holiday.setId(date);
			if(DateUtil.isWeekend(date, DateUtil.SIMPLE_FORMAT))
			{
				holiday.setStatus(HolidayStatus.Weekend);
			}
			holiday.setStatus(HolidayStatus.WorkDay);
		}
		return holiday;
	}
	
	@Override
	@Transactional
	public Holiday saveHoliday(String date)
	{
		Holiday holiday = new Holiday();
		holiday.setId(date);
		holiday.setStatus(HolidayStatus.Weekend);
		holidayDao.save(holiday);
		return holiday;
	}
}
