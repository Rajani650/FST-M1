package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println("The title of the page is:"+driver.getTitle());
		Actions builder = new Actions(driver);
		WebElement football = driver.findElement(By.id("ball"));
		WebElement Dropzone1 = driver.findElement(By.id("dropzone1"));
		WebElement Dropzone2 = driver.findElement(By.id("dropzone2"));
		builder.clickAndHold(football).moveToElement(Dropzone1).pause(3000).release().build().perform();
		if(Dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!"))
		{
        	System.out.println("Ball was dropped in Dropzone 1");
		}
		builder.dragAndDrop(football, Dropzone2).pause(2000).build().perform();
		if(Dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!"))
		{
			System.out.println("Ball was dropped in Dropzone 2");
		}
		driver.quit();

		
	}

}
