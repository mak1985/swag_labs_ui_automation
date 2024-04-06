package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class CountRadioButtons {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.calculator.net/");
        driver.manage().window().maximize();
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='scirdsetting']"));
        System.out.println("Total no.of radio buttons on web page :  " + radioBtns.size());
    }
}
