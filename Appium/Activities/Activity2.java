package Activity;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity2 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        URL serverURL = new URI("http://localhost:4723").toURL();
        driver = new AndroidDriver(serverURL, options);
        
        // Initialize the wait object (10 seconds timeout)
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Open the URL
        driver.get("https://training-support.net");
    }

    @Test
    public void chromeTest() {
        // Wait for the home page heading to appear
        String pageHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.xpath("//android.widget.TextView[@text='Training Support']"))).getText();
        System.out.println("Heading: " + pageHeading);
        Assert.assertEquals(pageHeading, "Training Support");

        // Find and click the About Us link
        // Using accessibilityId is good, but let's ensure it is clickable
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("About Us"))).click();

        // WAIT for the new page heading to appear before trying to getText()
        String aboutPageHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.xpath("//android.widget.TextView[@text='About Us']"))).getText();
        
        System.out.println("About Page Heading: " + aboutPageHeading);
        Assert.assertEquals(aboutPageHeading, "About Us");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


