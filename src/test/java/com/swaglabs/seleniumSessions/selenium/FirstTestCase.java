package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTestCase {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        System.out.println("browser has been launched successfully");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        Thread.sleep(5000);
        //Capture title of webpage and print
        String title = driver.getTitle();
        System.out.println(title);
        //capture url of the webpage
        System.out.println(driver.getCurrentUrl());
        //capture page source
        System.out.println(driver.getPageSource());
        //close the browser
        driver.close();
    }
}
