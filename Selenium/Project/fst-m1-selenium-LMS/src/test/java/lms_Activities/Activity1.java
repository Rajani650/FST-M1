package lms_Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;


public class Activity1 {
	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
	public void homePageTest()
	{
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle, "Alchemy LMS – An LMS Application");
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
