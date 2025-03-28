package RestAssured;

import java.util.HashMap;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class DataDriverforRest {
	
	String endPoint = "https://reqres.in/api/users";
	PojoTest bsl = new PojoTest();
	
	
	@Test()
	public void enterDatabyDataDriven(ITestContext test)
	{
		bsl.setName("Anushka");
		bsl.setJob("SeniorConsultant");
		String name1 = bsl.getName();
		String job1 = bsl.getJob();
		//JSONObject body = new JSONObject();
		//body.put("name",name);
		//body.put("age",age);
		
		HashMap<Object,Object> body = new HashMap<>();
		body.put("name", name1);
		body.put("job", job1);
		
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type","application/json");
		req.body(body);
		Response res = req.when().post(endPoint);
		
		ResponseBody resBody = res.getBody();
		System.out.println(resBody.asPrettyString());
		
		JsonPath js = resBody.jsonPath();
		String name = js.getString("name");
		int id = js.getInt("id");
		System.out.println(id);
		System.out.println(name);
		
		test.setAttribute("id", id);
		
		
		
	}

}
