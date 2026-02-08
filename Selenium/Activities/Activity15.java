package examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Activity15 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println("The title is: "+driver.getTitle());
		WebElement fullName = driver.findElement(By.xpath("//input[starts-with(@id,'full-name')]"));
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		WebElement eventData = driver.findElement(By.xpath("//input[contains(@name,'event-date')]"));
		WebElement additionalDetails = driver.findElement(By.xpath("//textarea[contains(@id,'additional-details')]"));
		fullName.sendKeys("Rajani");
		email.sendKeys("rajaninair0520@gmail.com");
		eventData.sendKeys("2025-06-26");
		additionalDetails.sendKeys("it will be correct");
		//driver.findElement(By.xpath("//button[contains(text()='Submit')]")).click();
          driver.findElement(By.xpath("//button[text()='Submit']")).click();
	
        String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();
        System.out.println("successMessage"+ message);
        driver.quit();
	}

}
