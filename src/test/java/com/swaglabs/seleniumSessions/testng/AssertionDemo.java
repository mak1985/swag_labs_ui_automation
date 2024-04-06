package com.swaglabs.seleniumSessions.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
    @Test
    public void testMethod()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        System.out.println("Verifying title of the page.......");

        SoftAssert softVerify = new SoftAssert();
        String expectedTitle = "Swag Labs1";
        String actualTitle = driver.getTitle();
        //Assert.assertEquals(expectedTitle, actualTitle, "Validation successful");
        softVerify.assertEquals(actualTitle, expectedTitle, "Validation successful");
        System.out.println("Validation successful");
        softVerify.assertAll();
        driver.close();
    }
}
