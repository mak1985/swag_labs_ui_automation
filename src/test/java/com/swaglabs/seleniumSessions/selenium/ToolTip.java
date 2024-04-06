package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToolTip {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://practice.expandtesting.com/tooltips");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String ACTUAL_TOOLTIP = driver.findElement(By.xpath("//button[@id=\"btn1\"]")).getText();
        System.out.println(ACTUAL_TOOLTIP);
        String EXPECTED_TOOLTIP = "Tooltip on top";
        if (ACTUAL_TOOLTIP.equals(EXPECTED_TOOLTIP)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
