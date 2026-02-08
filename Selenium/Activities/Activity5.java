package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement checkBox=driver.findElement(By.id("checkbox"));
	    driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();;
		//checkBox.click();
		System.out.println("checkbox is displayed:" +checkBox.isDisplayed());
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        // Check if it is displayed on the page
        System.out.println("Checkbox is displayed: " + checkBox.isDisplayed());

        // Close the browser
        driver.quit();
		
	}

}
