package com.instony.model;

public class Holiday
{
	private String date;
	private Integer status;// 0工作日,1休息日,2节假日

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
}
