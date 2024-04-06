package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeDemo {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");

        //driver.switchTo().frame("moneyiframe");
        //driver.switchTo().frame(0);
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"moneyiframe\"]"));
        driver.switchTo().frame(iframe);

        String NSE_INDEX = driver.findElement(By.id("nseindex")).getText();
        System.out.println(NSE_INDEX);


    }
}
