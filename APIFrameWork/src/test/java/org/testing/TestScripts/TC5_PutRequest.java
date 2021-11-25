package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.testSteps.HttpMethod;
import org.testing.utilities.JsonRead;
import org.testing.utilities.JsonparsingUsingorgJson;
import org.testing.utilities.PropertiesRead;
import org.testing.utilities.RandomData;
import org.testing.utilities.VariableReplacement;
import org.testng.annotations.Test;
import org.testing.utilities.JsonParsing;

import io.restassured.response.Response;

public class TC5_PutRequest {
	@Test
	public void FifthTC() throws IOException {
		Properties prObject = PropertiesRead.readPropertyFile("../APIFrameWork/URI.properties");
		String bodyData=JsonRead.ReadJsonData("../APIFrameWork/src/test/java/org/testing/Resources/RequestPayloadforput.json");
		HttpMethod http = new HttpMethod(prObject);
		Response res=http.putRequest("QA_URI_API",TC1_PostRequest.id,bodyData);
		System.out.println("Status Code is "+res.statusCode());
	    System.out.println("Response Data is "+res.asString());
	    ResponseValidation.DataValidate("Dillip", res, "Firstname"); 
	    System.out.println("Designation is : "+JsonParsing.jsonParsingusingJsonPath("Designation", res));
		}
}
