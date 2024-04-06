package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class NestedIframeDemo {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

        driver.switchTo().frame("frame1"); //parent outer frame
        driver.switchTo().frame("frame3"); //child inner frame

        driver.findElement(By.id("a")).click();

        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Testing");

        driver.switchTo().defaultContent(); //main page

        driver.switchTo().frame("frame2");

        WebElement dropdown = driver.findElement(By.id("animals"));
        Select dd = new Select(dropdown);
        dd.selectByVisibleText("Avatar");
    }
}
