package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTesting {

    @Test
    public void verifyTitle() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
        driver.quit();
    }


    @Test
    public void verifyLogo() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(10000);
    }


}
