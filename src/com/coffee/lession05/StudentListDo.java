package com.coffee.lession05;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.coffee.DB.DB;
import com.coffee.web.restful.RestfulDo;
import com.google.gson.JsonObject;

public class StudentListDo extends RestfulDo
{
	/* 
	 * 
	 * 服务器返回的应答数据
	 * {
	 *    "error": 0,
	 *    "reason": "OK",
	 *    "data": ... execute()的返回值
	 * }
	 */

	@Override
	public Object execute(JsonObject jreq) throws Exception
	{
		return DB.query("select * from student", 0);
	}

}
