package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenNewTabOrWindow {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Open New Tab
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://www.calculator.net/");
        Thread.sleep(2000);
        //Open New Window
        //driver.switchTo().newWindow(WindowType.WINDOW);
    }
}
