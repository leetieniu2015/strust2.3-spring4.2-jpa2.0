package com.instony.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;  

@ParentPackage("basePackage")  
@Namespace("/login")  
@Results( { @Result(name = "success", location = "/WEB-INF/jsp/index.jsp"),  
			@Result(name = "error", location = "/WEB-INF/jsp/index.jsp") })  
@ExceptionMappings( { @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") }) 
public class IndexAction extends ActionSupport
{
	private static final long serialVersionUID = 8028705585843755714L;

	@Action(value = "index") 
	public String index() throws Exception
	{
		return SUCCESS;
	}
}
