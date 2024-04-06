package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TC01 {
    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        FirefoxProfile profile = new FirefoxProfile();
        options.setProfile(profile);
        WebDriver driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.quit();
    }
}
