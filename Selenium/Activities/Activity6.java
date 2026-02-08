package examples;

import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+ title);
		WebElement checkBoxElement = driver.findElement(By.id("checkbox"));
		checkBoxElement.click();
		System.out.println("Is check box is selected:"+checkBoxElement.isEnabled());
		driver.quit();
		
		
	}
	

}
