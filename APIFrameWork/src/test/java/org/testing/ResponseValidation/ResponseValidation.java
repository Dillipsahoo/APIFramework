package org.testing.ResponseValidation;

import org.testing.utilities.JsonParsing;

import io.restassured.response.Response;

public class ResponseValidation {
	public static void StatusCodeValidate(int expectedStatuscode,Response res)
	{
		if(expectedStatuscode == res.getStatusCode())
		{
			System.out.println("Status code is matching:   "+res.statusCode());
		}
		else 
		{
			System.out.println("Status code is not matching   :");
		}
	}
		
	public static void DataValidate(String expectedData,Response res,String jsonPath)
	{
		String actualData=JsonParsing.jsonParsingusingJsonPath(jsonPath, res);
		if(actualData.equals(expectedData))
		{
			System.out.println("actualData and expectedData is matching");
		}
		else 
		{
			System.out.println("actualData and expectedData is not matching");
		}
	}
		
	

}
