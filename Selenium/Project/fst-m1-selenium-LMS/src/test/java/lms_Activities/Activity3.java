package lms_Activities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        // Step a & b: Open browser and navigate to the URL
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyHeadingTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Step c: Locate the heading element
        // We use a flexible XPath to find the specific text "Learn from Industry Experts"
        WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//h1[contains(text(), 'Learn from Industry Experts')]")
        ));

        // Step d: Get the text and verify it matches exactly
        String actualHeading = heading.getText();
        String expectedHeading = "Learn from Industry Experts";
        
        System.out.println("Page heading found: " + actualHeading);
        Assert.assertEquals(actualHeading, expectedHeading, "Heading text does not match!");
    }

    @AfterClass
    public void tearDown() {
        // Step e: Close the browser if it matches (TestNG handles the 'if' logic via assertions)
        if (driver != null) {
            driver.quit();
        }
    }
}
		
		
		


