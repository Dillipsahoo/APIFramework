package org.testing.utilities;

import io.restassured.response.Response;

public class JsonParsing {
	

		public static String jsonParsingusingJsonPath(String jsonPath,Response res) 
		{
			
			return res.jsonPath().get(jsonPath).toString();
			 
		}


}
