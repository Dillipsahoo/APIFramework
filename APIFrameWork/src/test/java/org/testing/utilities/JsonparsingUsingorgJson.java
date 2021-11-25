package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonparsingUsingorgJson {
	public static void JsonParse(String responsData,String keyName)
		{
		if(responsData.startsWith("["))
		{
			JSONArray data = new JSONArray(responsData);
			int length =data.length();
			for (int i = 0; i < length; i++) 
				{
					JSONObject obj=data.getJSONObject(i);
					System.out.println("id value is"+obj.get(keyName));
				}
		}
		else
		{
			
		}
	}
}
