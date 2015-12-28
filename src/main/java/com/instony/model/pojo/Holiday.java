package com.instony.model.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Holiday
{
	@Id
	private String date;
	private Integer status;
	
	public String getDate()
	{
		return date;
	}
	public void setDate(String date)
	{
		this.date = date;
	}
	public Integer getStatus()
	{
		return status;
	}
	public void setStatus(Integer status)
	{
		this.status = status;
	}
	@Override
	public String toString()
	{
		return "Holiday : { date : " + date + ",  status : " + status + "}";
	}
}
