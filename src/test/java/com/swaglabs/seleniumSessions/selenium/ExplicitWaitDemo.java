package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        //driver.manage().window().maximize();
        driver.get("https://demoqa.com/links");
        System.out.println("Start.........");
        //Explicitly Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Home123")));
        element.click();
        System.out.println("Clicked");
    }
}
