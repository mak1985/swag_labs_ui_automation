package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("C:\\Users\\Lenovo\\Desktop\\SampleHtmlFile.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //find second cell in web table and print second cell data
        String text = driver.findElement(By.xpath("//td[text()=' Pooja cell data ']")).getText();
        System.out.println(text);
    }
}
