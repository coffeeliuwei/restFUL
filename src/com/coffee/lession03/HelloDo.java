package com.coffee.lession03;


import com.coffee.web.service01.GenericDo;

public class HelloDo extends GenericDo
{

	@Override
	public String execute(String strReq) throws Exception
	{
		return "你好, HelloDo启动!";
	}

}
