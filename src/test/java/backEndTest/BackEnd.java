package backEndTest;

import static org.testng.Assert.assertEquals;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

@Test
public class BackEnd {

	String URI = "http://127.0.0.1:56045/";
	public void verifyBackEnd() {
		Response response = RestAssured
							.given().get(URI)
							.then()
							.statusCode(200)
							.extract().response();
		String htmlBody = response.getBody().asString();
		Document document = Jsoup.parse(htmlBody);
		String actualMessage = document.select("h1").text();
		assertEquals(actualMessage, "Hello from the Backend!");
		
		System.out.println("Message displayed: "+actualMessage);
							
	}
	
}
