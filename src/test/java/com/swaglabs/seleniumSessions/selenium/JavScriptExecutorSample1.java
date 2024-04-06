package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavScriptExecutorSample1 {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(5000);

        //Created an object for JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Click on any button
//        WebElement element = driver.findElement(By.xpath("//button[@onclick=\"myFunctionAlert()\"]"));
//        js.executeScript("arguments[0].click();", element);

        //zoom web page
        //js.executeScript("document.body.style.zoom='50%'");

        //draw border arround web element
        //js.executeScript("arguments[0].style.border='3px solid red';",driver.findElement(By.cssSelector("#textarea")));

        //scroll vertically scroll-down till the end of webpage
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        //scroll vertically scroll-up
        //js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

        //navigate to different url:
        //js.executeScript("window.location='https://www.tutorialspoint.com/index.htm'");

        //To scroll down the web page by pixel
//        js.executeScript("window.scrollBy(0,500)"); //scroll down
//
//        WebElement element = driver.findElement(By.cssSelector("ui-slider-handle ui-corner-all ui-state-default"));
//        js.executeScript("arguments[0].scrollRight = arguments[0].offsetWidth", element);

        //scroll till visibility of web element
        WebElement element = driver.findElement(By.xpath("//input[@class='text_field']"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();


    }
}
