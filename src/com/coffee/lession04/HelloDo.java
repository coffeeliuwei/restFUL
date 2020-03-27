package com.coffee.lession04;


import com.coffee.web.service02.GenericDo;

public class HelloDo extends GenericDo
{

	@Override
	public String execute(String strReq) throws Exception
	{
		return "你好, HelloDo启动!";
	}

}
