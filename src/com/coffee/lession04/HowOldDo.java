package com.coffee.lession04;


import com.coffee.web.service02.GenericDo;

public class HowOldDo extends GenericDo
{

	@Override
	public String execute(String strReq) throws Exception
	{
		return "ee.. I am not twenty!";
	}

}
