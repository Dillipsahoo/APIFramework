package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethod;
import org.testing.utilities.JsonRead;
import org.testing.utilities.PropertiesRead;
import org.testing.utilities.RandomData;
import org.testing.utilities.VariableReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_GetRequest {
	
	@Test
	public void SecondTc() throws Exception 
	{
		Properties prObject = PropertiesRead.readPropertyFile("../APIFrameWork/URI.properties");
		HttpMethod http = new HttpMethod(prObject);
		Response res=http.getRequest("QA_URI_API",TC1_PostRequest.id);
		System.out.println("Status Code is "+res.statusCode());
	    System.out.println("Response Data is "+res.asString());
	}

}
 