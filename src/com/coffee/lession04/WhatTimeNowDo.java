package com.coffee.lession04;


import java.text.SimpleDateFormat;

import com.coffee.web.service02.GenericDo;

public class WhatTimeNowDo extends GenericDo
{

	@Override
	public String execute(String strReq) throws Exception
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timenow = sdf.format(System.currentTimeMillis());
		return timenow;
	}

}
