package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class Jsontoxml {
	public String conversionxJsontoxml(String json)
	{
		JSONObject js=XML.toJSONObject(json);
		String xml_data=XML.toString(js);
		return xml_data;
		
	}

}
