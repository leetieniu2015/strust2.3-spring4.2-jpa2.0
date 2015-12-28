package com.instony.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.instony.dao.HolidayDao;
import com.instony.model.pojo.Holiday;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class HolidayDaoTest
{
	@Autowired
	private HolidayDao holidayDao;
	
	@Test
	public void test()
	{
		/*List<Holiday> list = holidayDao.findAll(Holiday.class);
		Holiday holiday = list.get(0);*/
		Holiday holiday = holidayDao.get(Holiday.class, "2016-01-01");
		System.out.println(holiday.toString());
	}
}
