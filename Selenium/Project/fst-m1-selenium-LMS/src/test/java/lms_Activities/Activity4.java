package lms_Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity4 {
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	
		
	}
	@Test
	public void FindHeading()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement HeadingElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//h1[contains(text(), 'Learn from Industry Experts')]")));
		String actualHeading = HeadingElement.getText();
        String expectedHeading = "Learn from Industry Experts";
		System.out.println("Page heading found: "+actualHeading);
		
        System.out.println("Page heading found: " + actualHeading);
        Assert.assertEquals(actualHeading, expectedHeading, "Heading text does not match!");
    }

@AfterClass
public void tearDown() {
    // Step e: Close the browser if it matches (TestNG handles the 'if' logic via assertions)
        driver.quit();
    }
}

	
	


