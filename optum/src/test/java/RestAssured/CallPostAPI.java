package RestAssured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class CallPostAPI {
	
	String endPoint = "https://reqres.in/api/";
	
	
	RequestSpecification req = RestAssured.given();
	Response res;
	
	
	
	@Test(dataProvider = "testData" , dataProviderClass = StaticProviders.class)
	public void postRequest(String name, String job)
	{
		try {
		PostAPIwithPOJOClass data = new PostAPIwithPOJOClass(name,job);
		req.header("Content-Type","application/json");
		req.body(data);
		res = (Response) req.pathParam("user", "users")
				.when()
				.post(endPoint + "{user}/");
		ResponseBody body = res.getBody();
		System.out.println(body.asPrettyString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		
		JsonPath js = res.jsonPath();
		String name1 = js.get("name");
		System.out.println(name1);
		
		
		
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void bookStoreAPI()
	{
		PostAPIwithBooks data = new PostAPIwithBooks("American");
		String url = "https://bookstore.toolsqa.com/BookStore/v1/";
		req.header("Content-Type","application/json");
		req.header("accept", "application/json");
		req.body(data);
		Response res = (Response) req.pathParam("book", "Books")
				.when()
				.post(url+ "{book}");
		ResponseBody bs = res.getBody();
		System.out.println(bs.asPrettyString());
		JsonPath js = res.jsonPath();
		String isbn = js.get("isbn");
		
						
						
	}

}
