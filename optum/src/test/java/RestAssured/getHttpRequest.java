package RestAssured;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.sun.org.apache.bcel.internal.classfile.Method;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class getHttpRequest {
	
	String getUrl = "https://reqres.in/api/";
	String postUrl = "https://bookstore.toolsqa.com/Account/v1/User";
	RequestSpecification req = (RequestSpecification) RestAssured.given().header("Content-Type","application/json")
			;
	public static Response res;
	
	@Test
	public void getHttpRequest()
	{
		try {
			res =  req
					//.header("Authorization","Bearer"+token)
					.queryParam("page", "2")
					.pathParam("user", "users")
					.when()
					.get(getUrl + "{user}/");
					
			System.out.println(res.getContentType());
			System.out.println(res.getStatusCode());
			System.out.println(res.getCookie(getUrl));
			ResponseBody body = res.body();
			System.out.println(body.asPrettyString());
			
			JsonPath js1 = res.jsonPath();
			int id = js1.getInt("data.id[0]");
			System.out.println("id  "+id);
			
//		((RestAssured) res1).get(getUrl+"users/");
//		System.out.println(res1.asPrettyString());
//		System.out.println(res1.getStatusCode());
//		System.out.println(res1.getStatusLine());
//		System.out.println(res1.contentType());
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void postHttpRequest()
	{
		//req.header("Content-Type","application/json");
	//	req.header("accept","application/json");
		
		HashMap<String,String> data = new HashMap();
		data.put("Abhay","Leader1@!");
		data.put("Rashmi","Leader1@!");
		
		req.body(data);
		res = req.post(postUrl);
		ResponseBody body = res.getBody();
		System.out.println(res.asPrettyString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getContentType());
		System.out.println(body.asPrettyString());	
	}
	
	public void basicAuth()
	{
		req.auth().basic(postUrl, getUrl);
		
	}

}
