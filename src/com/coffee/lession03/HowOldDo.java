package com.coffee.lession03;


import com.coffee.web.service01.GenericDo;

public class HowOldDo extends GenericDo
{

	@Override
	public String execute(String strReq) throws Exception
	{
		return "ee.. I am not twenty!";
	}

}
