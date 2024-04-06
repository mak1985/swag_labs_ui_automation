package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://sellglobal.ebay.in/seller-center/");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);
        WebElement element = driver.findElement(By.linkText("Performance"));
        act.moveToElement(element).perform();
        Thread.sleep(5000);
    }
}
