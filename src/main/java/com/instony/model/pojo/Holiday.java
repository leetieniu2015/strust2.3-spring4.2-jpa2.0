package com.instony.model.pojo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.instony.constant.HolidayStatus;

@Entity//(name="holiday")
@Table(name="holiday")
public class Holiday
{
	@Id
	//@Temporal(TemporalType.DATE)
	private String date;
	@Enumerated(EnumType.ORDINAL)
	private HolidayStatus status; // 0工作日,1休息日,2节假日
	
	public String getId()
	{
		return date;
	}
	public String getDate()
	{
		return date;
	}
	public void setDate(String date)
	{
		this.date = date;
	}
	public HolidayStatus getStatus()
	{
		return status;
	}
	public void setStatus(HolidayStatus status)
	{
		this.status = status;
	}
	@Override
	public String toString()
	{
		return "Holiday : { date : " + date + ",  status : " + status + "}";
	}
}
