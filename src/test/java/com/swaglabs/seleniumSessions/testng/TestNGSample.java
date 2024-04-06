package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGSample {

  @Test() // If false then excluded from execution
    public void verifyTC001() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.8.0");
        String expeceted_title = "Maven Repository: org.testng » testng » 7.8.0";
        String actual_title = driver.getTitle();
        Assert.assertEquals(expeceted_title, actual_title);
        driver.close();
    }

//    @Test(dependsOnMethods = {"verifyTC001", "verifyTC003"})
//    public void verifyTC002() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.8.0");
//        String expeceted_title = "Maven Repository: org.testng » testng » 7.8.0";
//        String actual_title = driver.getTitle();
//        Assert.assertEquals(expeceted_title, actual_title);
//        driver.close();
//    }
}
