package lms_Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
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
		driver.findElement(By.xpath("//a[text()='All Courses']")).click();
		List<WebElement> courseButtons = driver.findElements(By.xpath("//a[contains(text(), 'See more...')]"));
		System.out.println("Number of courses on the page: " + courseButtons.size());
	}
	@AfterClass
	public void closeBrowser() {
	        driver.quit();
	   }
}


