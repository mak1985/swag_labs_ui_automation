package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MultipleWindowsHandling {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        //open new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.whatsapp.com/");
        System.out.println(driver.getTitle());
        //get window handles of open windows
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> handles = new ArrayList<>();
        handles.addAll(windowHandles);
        driver.switchTo().window(handles.get(1));
    }
}
