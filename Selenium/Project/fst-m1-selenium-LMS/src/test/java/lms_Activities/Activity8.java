package lms_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
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
		driver.findElement(By.xpath("//a[text()= 'Contact']")).click();
		driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Jay");
		driver.findElement(By.id("wpforms-8-field_1")).sendKeys("jay@gmail.com");
		driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Physics");
		driver.findElement(By.id("wpforms-8-field_2")).sendKeys("Enrolling");
		driver.findElement(By.id("wpforms-submit-8")).click();
		WebElement elementText = driver.findElement(By.xpath("//p[contains(text(),'Thanks for contacting us!')]"));
		String ActualText = elementText.getText();
		System.out.println(ActualText);
		
	}
	@AfterClass
	public void closeBrowser() {
	        driver.quit();
	   }

}
