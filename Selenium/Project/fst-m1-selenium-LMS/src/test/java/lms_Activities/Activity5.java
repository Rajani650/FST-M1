package lms_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	
			
	}
	@Test
	public void VerifyTest()
	{
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		 WebElement elementText = driver.findElement(By.xpath("//h1[contains(text(),'My Account')]"));
		 String actualTitle = elementText.getText();
		 Assert.assertEquals(
	                actualTitle,
	                "My Account",
	                "Page title does not match!"
	            );

	            System.out.println("✅ Assertion Passed: My Account page verified");
	}
	//@AfterClass
	//public void closeBrowser() {
	       // driver.quit();
	   // }
	

}
