package lms_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
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
	            driver.findElement(By.xpath("//a[contains(text(), 'Login')]")).click();
	            driver.findElement(By.id("user_login")).sendKeys("root");
	            driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	            driver.findElement(By.id("wp-submit")).click();
	            WebElement element = driver.findElement(By.xpath("//a[contains(text(), 'Logout')]"));
	            String ActualText = element.getText();
	            Assert.assertEquals(
		                ActualText,
		                "Logout",
		                "Page title does not match!"
		            );
	            
	            
	}
	@AfterClass
	public void closeBrowser() {
	        driver.quit();
	   }
	



	}


