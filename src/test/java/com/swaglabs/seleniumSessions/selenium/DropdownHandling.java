package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHandling {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
        Select dropdown = new Select(element);
        //dropdown.selectByVisibleText("India");
        //dropdown.selectByValue("IOT");
        //dropdown.selectByIndex(100);
//        if(dropdown.isMultiple() == true)
//        {
//            System.out.println("Dropdown is multiple");
//        }
//        else {
//            System.out.println("Drop down is not multiple");
//        }
        List<WebElement> allDropdownsOptions = dropdown.getOptions();
        for(WebElement ele: allDropdownsOptions)
        {
            System.out.println(ele.getText());
        }
        System.out.println("Total options" + allDropdownsOptions.size());
        //Thread.sleep(5000);
        driver.close();
    }
}
