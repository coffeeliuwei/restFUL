package com.coffee.lession01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServiceHandler
{
	HttpServletRequest request;
	HttpServletResponse response;
	
	public ServiceHandler(HttpServletRequest request, HttpServletResponse response)
	{
		this.request = request;
		this.response = response;
	}
	
	public void handle() throws ServletException, IOException
	{
		
	}
	
	
}

