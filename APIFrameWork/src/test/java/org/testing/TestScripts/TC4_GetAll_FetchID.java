package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethod;
import org.testing.utilities.JsonparsingUsingorgJson;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_GetAll_FetchID {
	
	@Test
	public void FourthTC() throws IOException {
		Properties prObject = PropertiesRead.readPropertyFile("../APIFrameWork/URI.properties");
		HttpMethod http = new HttpMethod(prObject);
		Response res=http.getAll("QA_URI_API");
		System.out.println("Status Code is "+res.statusCode());
	    System.out.println("Response Data is "+res.asString());
	    JsonparsingUsingorgJson.JsonParse(res.asString(), "id");
		}
}
