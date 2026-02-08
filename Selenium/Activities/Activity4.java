package examples;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity4 {
	public static void main(String args[])
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
        System.out.println("Page title is"+ driver.getTitle());
        String ThirdHeaderText = driver.findElement(By.xpath("//h3[contains(text(),'#3')]")).getText();
        System.out.println(ThirdHeaderText);
        Color FifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(),'#5')]")).getCssValue("color"));
        System.out.println("FifthHeaderColor");
        System.out.println("Colour as RGB:" + FifthHeaderColor.asRgb());
        System.out.println("color as hexcode: " + FifthHeaderColor.asHex());
        
        String purpleButtonClass=driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
        System.out.println(purpleButtonClass);
        String SlateButtonText = driver.findElement(By.xpath("//button[text()='Slate']")).getText();
        System.out.println(SlateButtonText);
        driver.quit();
	}

}
