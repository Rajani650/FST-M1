package lms_Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity9 {
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
		driver.findElement(By.xpath("//a[text()='See more...']")).click();
		//driver.findElement(By.xpath("//div[contains(@class, 'ld-item-list-item-preview')][.//a[contains(text(), 'Developing Strategy')]]//div[contains(@class, 'ld-expand-button')]")).click();
         driver.findElement(By.xpath("//a[text()='Login to Enroll']")).click();
         driver.findElement(By.id("user_login")).sendKeys("root");
         driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
         driver.findElement(By.id("wp-submit")).click();
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement expandBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(., 'Developing Strategy')]//div[contains(@class, 'ld-expand-button')]")));
         expandBtn.click();
         }
}
