package com.instony.dao.impl;

import java.util.List;

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
		List<Holiday> list = holidayDao.findAll(Holiday.class);
		
		System.out.println(list.size());
	}
}
