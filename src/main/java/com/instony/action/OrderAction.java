package com.instony.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/order")
@ParentPackage("struts-default")
public class OrderAction extends ActionSupport
{
	private static final long serialVersionUID = 176550764555007604L;

	@Action(value = "add",
		results = { @Result(name = "success", location = "/index.jsp"), @Result(name = "input",
			location = "/add.jsp") })
	public String add()
	{
		System.out.println("add()");
		return SUCCESS;
	}

	@Action(value = "mod", results = { @Result(name = "success", location = "/index.jsp") })
	public String mod()
	{
		System.out.println("mod()");
		return SUCCESS;
	}

	@Action(value = "del", results = { @Result(name = "success", location = "/index.jsp") })
	public String del()
	{
		System.out.println("del()");
		return SUCCESS;
	}
}
