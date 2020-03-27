package com.coffee.lession02;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GenericService extends HttpServlet
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// 处理请求数据	
		try{
			handleRequest(request, response);
		}		
		catch(Exception e)
		{
			e.printStackTrace();
			response.sendError(500, e.getMessage());
			return;
		}
	}
	
	private void handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception
	{
		// 从URL中解析API的名字
		// servletPath: "/.../hello.do"
		String servletPath = request.getServletPath();
		int p1 = servletPath.lastIndexOf('/');
		int p2 = servletPath.lastIndexOf('.');
		String apiName = servletPath.substring(p1 + 1, p2);
		System.out.println("服务名:" + apiName);
		
		// 发送应答给客户端
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		//response.setHeader("Connection", "close");
		Writer writer = response.getWriter();
		writer.write( "OK,收到您的请求 :" + apiName );
		writer.close();	
	}

}
