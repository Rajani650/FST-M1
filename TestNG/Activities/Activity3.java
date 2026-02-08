package examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver=new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	@BeforeClass
	public void beforeClass()
	{
		driver.get("https://training-support.net/webelements/login-form");
	}
	@Test
	public void loginMethod()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//Button[text()='Submit']")).submit();
         
		 String loginMessage = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(
			            By.xpath("//h2[contains(text(),'Welcome Back')]")
			        )
			    ).getText();

        System.out.println(loginMessage);
    	
        Assert.assertEquals("Welcome Back, Admin!", loginMessage);	
  	}
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}

}
