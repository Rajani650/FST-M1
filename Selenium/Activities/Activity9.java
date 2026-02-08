package examples;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		driver.get("https://training-support.net/webelements/keyboard-events");
		System.out.println("Title of the page is :" + driver.getTitle());
        builder.sendKeys("This is coming from Selenium");
        builder.sendKeys(Keys.RETURN).build().perform();
		
	}

}
