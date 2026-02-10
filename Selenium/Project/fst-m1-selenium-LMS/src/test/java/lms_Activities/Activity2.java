package lms_Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver = new FirefoxDriver();
	private String headingText;	
   // WebDriverWait wait = new WebDriverWait(driver, 10);

	@BeforeClass
	
	public void openBrowser()
	{
		//driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
    public void verifyHeadingTest()
	{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement headingElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Learn from Industry Experts')]")));

        String headingText = headingElement.getText();

        System.out.println(headingText);
		Assert.assertEquals(headingText,"Learn from Industry Experts");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
