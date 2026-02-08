package examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {
	public static void main(String args[])
	{
		FirefoxDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("The title of the page is "+driver.getTitle());
		WebElement chkBox = driver.findElement(By.id("checkbox"));
        System.out.println("Checkbox is visible? " + chkBox.isDisplayed());
         WebElement togglechkBox = driver.findElement(By.xpath("//Button[text()='Toggle Checkbox']"));
             togglechkBox.click();
             wait.until(ExpectedConditions.invisibilityOf(chkBox));
             System.out.println("Checkbox is selected? " + chkBox.isSelected());
             driver.quit();
             
	}

}
