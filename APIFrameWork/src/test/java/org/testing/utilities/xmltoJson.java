package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class xmltoJson {
	public String conversionxmltoJson(String xml)
	{
		JSONObject js=XML.toJSONObject(xml);
		
		return js.toString();
		
	}

}
