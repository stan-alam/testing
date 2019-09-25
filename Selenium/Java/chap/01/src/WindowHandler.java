package com.stanx.stancom;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
// I did not write this, just using for reference. 
public class WindowHandler {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws IOException {

        System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver"); //you can handle this in run settings

        driver = new ChromeDriver(); // also handle this in the presetup
        driver.get(app_url);

    }

    @Test
    public void handleWindow() {

        String firstWindow = driver.getWindowHandle();
        System.out.println("First Window Handle is: " + firstWindow);

        WebElement link = driver.findElement(By.linkText("Gerbil")); // create a library file to to abstract html elements, then send "text"
        link.click();

        String secondWindow = driver.getWindowHandle();
        System.out.println("Second Window Handle is: " + secondWindow);
        System.out.println("Number of Window Handles so for: "
                + driver.getWindowHandles().size());

        driver.switchTo().window(firstWindow);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
