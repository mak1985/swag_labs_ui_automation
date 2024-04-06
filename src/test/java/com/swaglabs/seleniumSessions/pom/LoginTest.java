package com.swaglabs.seleniumSessions.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.enterUserName("standard_user");
//        loginPage.enterPassword("secret_sauce");
//        loginPage.clickLoginBtn();

        LoginWithPom pom = new LoginWithPom(driver);
        pom.enterUserName("standard_user");
        pom.enterPassword("secret_sauce");
        pom.clickLoginBtn();

    }
}
