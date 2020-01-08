package com.deloitte.fourthmvn.firstspringapp.beans;
public class Wisher
{
		String message;
	public Wisher(){} {System.out.println("Bean is Created");}
	
	public void setMessage(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	} 
	
}
