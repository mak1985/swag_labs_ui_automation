package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitDemo {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        //driver.manage().window().maximize();
        driver.get("https://demoqa.com/links");
        System.out.println("Start.........");
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(15))
                .ignoring(NoSuchElementException.class);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement element= fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Home123")));
        element.click();
//        System.out.println("Clicked");
    }
}
