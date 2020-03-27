package com.coffee.lession05;

import org.json.JSONObject;

import com.coffee.web.restful.RestfulDo;
import com.google.gson.JsonObject;

public class ExampleDo extends RestfulDo
{

	@Override
	public Object execute(JsonObject jreq) throws Exception
	{
		String data="restful返回字符串测试！";
		
		return data;
	}

}
