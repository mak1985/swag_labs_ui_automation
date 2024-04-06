package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShot {
    public static void main(String[] args) throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        //File src = screenshot.getScreenshotAs(OutputType.FILE);
        //File destination = new File("screenshots/test_image.png");
        //FileUtils.copyFile(src, destination);
        WebElement text_area = driver.findElement(By.cssSelector("#APjFqb"));
        text_area.sendKeys("Test Automation");
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("screenshots/test_image.png");
        FileUtils.copyFile(src, destination);
        driver.close();
    }
}
