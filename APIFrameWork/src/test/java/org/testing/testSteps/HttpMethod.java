package org.testing.testSteps;

import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.utilities.JsonParsing;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HttpMethod {
	Properties pr;
	public HttpMethod(Properties pr)
	{
		this.pr=pr;
	}
	public Response PostRequest(String bodydata,String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(uriKey));
		return res;

		
	}
	public Response getRequest(String uriKey,String idValue)
	{
		
		String base=pr.getProperty(uriKey);
		String uri=base+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		return res;
		
	}
	
	public Response getAll(String uriKey)
	{
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(uriKey));
		return res;
		
	}
	
	public Response putRequest(String uriKey,String id,String bodyData)
	{
		
		String uri=pr.getProperty(uriKey)+"/"+id;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.put(uri);
		return res;
		
	}
	
	public Response DeleteRequest(String uriKey,String id,String bodyData)
	{
		
		String uri=pr.getProperty(uriKey)+"/"+id;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.delete(uri);
		return res;
		
	}
	

}
