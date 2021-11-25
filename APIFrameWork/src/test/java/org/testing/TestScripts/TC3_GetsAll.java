
package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethod;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_GetsAll {
	
	@Test
	public void ThirdTC() throws IOException {
	Properties prObject = PropertiesRead.readPropertyFile("../APIFrameWork/URI.properties");
	HttpMethod http = new HttpMethod(prObject);
	Response res=http.getAll("QA_URI_API");
	System.out.println("Status Code is "+res.statusCode());
    System.out.println("Response Data is "+res.asString());
	}

}
