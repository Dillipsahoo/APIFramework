package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.testSteps.HttpMethod;
import org.testing.utilities.JsonRead;
import org.testing.utilities.PropertiesRead;
import org.testing.utilities.RandomData;
import org.testing.utilities.VariableReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest {
	
	static String id;
	@Test
	public void FirstTC() throws Exception 
	{
		Properties prObject = PropertiesRead.readPropertyFile("../APIFrameWork/URI.properties");
		String bodyData=JsonRead.ReadJsonData("../APIFrameWork/src/test/java/org/testing/Resources/RequestPayload.json");
		bodyData=VariableReplacement.variableValue(bodyData, "id", RandomData.randomno().toString());
		HttpMethod http = new HttpMethod(prObject);
		Response res=http.PostRequest(bodyData, "QA_URI_API");
		http.PostRequest(bodyData, "QA_URI_API");
		System.out.println("Status Code is "+res.statusCode());
	    System.out.println("Data is "+res.asString());
	    id=res.jsonPath().get("id");
	    ResponseValidation.StatusCodeValidate(201, res);
	    
	}

}
 