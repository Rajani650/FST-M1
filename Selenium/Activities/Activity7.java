package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement textBoxElement = driver.findElement(By.id("textInput"));
		System.out.println("Is text field is enabled"+ textBoxElement.isEnabled());
		//System.out.println(textBoxElement.getText());
		WebElement buttonElement = driver.findElement(By.id("textInputButton"));
		buttonElement.click();
		System.out.println("Is text field enabled"+ textBoxElement.isEnabled());
		driver.quit();
		
		
		
	}

}
