package frontEndTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class FrontEnd extends BaseTest{
	
	WebDriver driver;
	String frontEndURL = "http://127.0.0.1:53272/";
	@Test
	public void frontEnd_Test() {
		
		driver = setUp();
		driver.get(frontEndURL);
		 Assert.assertEquals(checkMessage(), "Hello from the Backend!");
		 System.out.println("Message displayed: " +checkMessage());
		driver.quit();
		
	}

	public String checkMessage() {
		WebElement message =  driver.findElement(By.xpath("//h1"));
		String displayMessage = message.getText();
		return displayMessage;
	}


}
