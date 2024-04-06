package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class HyperlinksTest {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.calculator.net/");
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        System.out.println("Total number of hyperlinks: " + linkElements.size());
        for(WebElement i: linkElements) {
            System.out.println(i.getText());
        }
    }
}
