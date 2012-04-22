package com.statistics;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "bean")
@RequestScoped
public class StatisticsServlet
{
	private String string = "Hello";
	
	public String getString()
	{
		return string;
	}
	
	public void setString(final String string)
	{
		this.string = string;
	}
	
	public void changeString()
	{
		string = "Bye";
	}
}
