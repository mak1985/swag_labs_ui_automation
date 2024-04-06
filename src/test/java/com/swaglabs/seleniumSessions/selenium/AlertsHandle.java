package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertsHandle {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(5000);
//        driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
//        Thread.sleep(5000);
//        //Switch to alert window and accept the alert
//        driver.switchTo().alert().accept(); //OK button is clicked
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
//        Thread.sleep(5000);
//        driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().sendKeys("This is our dummy url for testing");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
    }
}
