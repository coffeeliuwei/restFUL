package com.coffee.lession03;


import com.coffee.web.service01.GenericDo;

public class AreYouGoodDo extends GenericDo
{
	@Override
	public String execute(String strReq) throws Exception
	{
		return "非常好,谢谢";
	}

}
