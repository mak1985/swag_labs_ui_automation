package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClickingOnImage {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.calculator.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@src='//d26tpo4cm8sb6k.cloudfront.net/img/other-calculator.jpg']")).click();
        Thread.sleep(5000);
    }
}
