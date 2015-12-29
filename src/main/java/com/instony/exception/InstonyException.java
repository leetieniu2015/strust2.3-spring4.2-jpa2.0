package com.instony.exception;

/**
 * 自定义异常
 * @author leejun
 */
public class InstonyException extends RuntimeException
{
	private static final long serialVersionUID = 3172589571156583291L;
	
	public InstonyException()
	{
		super();
	}
	
	public InstonyException(String message)
	{
		super(message);
	}
	
	public InstonyException(Throwable cause)
	{
		super(cause);
	}
	
	public InstonyException(String message, Throwable cause) 
	{
		super(message, cause);
	}
}
