package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException, AWTException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
//        driver.findElement(By.id("file-upload")).sendKeys("D:\\upload_example\\Makhan-Dhar-Resume.docx");
//        driver.findElement(By.cssSelector("#file-submit")).click();
//        Thread.sleep(5000);
        /*
        Using Robot Class where type=file attribute not present on web element
         */
        WebElement UPLOAD_BTN = driver.findElement(By.xpath("//input[@id='file-upload']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(UPLOAD_BTN).click().perform();
        Robot rb = new Robot();
        rb.delay(2000);
        //copy file to clip board
        StringSelection ss = new StringSelection("D:\\upload_example\\Makhan-Dhar-Resume.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        //perform ctrl+v
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.cssSelector("#file-submit")).click();
        Thread.sleep(5000);
    }
}
