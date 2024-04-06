package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement sourceElement = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
        WebElement targetElement = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
        Actions act = new Actions(driver);
        act.dragAndDrop(sourceElement, targetElement).perform();
    }
}
