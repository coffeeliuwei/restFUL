package com.coffee.lession04;


import com.coffee.web.service02.GenericDo;

public class AreYouGoodDo extends GenericDo
{
	@Override
	public String execute(String strReq) throws Exception
	{
		return "非常好,谢谢";
	}

}
