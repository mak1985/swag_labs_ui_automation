package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActionsPerform {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement button1 = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        Actions act = new Actions(driver);
        act.doubleClick(button1).perform(); //double click
        Thread.sleep(3000);
        WebElement button2 = driver.findElement(By.id("rightClickBtn"));
        act.contextClick(button2).perform(); //right click
    }
}
