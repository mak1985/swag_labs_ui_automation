package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class DatePicker {
    public static void main(String[] args) {

        String expectedDay = "2";
        String expectedMonth = "June";
        String expectedYear = "2023";


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");

        //switch to frame
        driver.switchTo().frame(0);

        //find date picker weblement to perform click action
        WebElement DATE_PICKER = driver.findElement(By.id("datepicker"));
        DATE_PICKER.click();

        while (true)
        {
            String CALENDER_MONTH = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String CALENDER_YEAR = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (CALENDER_MONTH.equals(expectedMonth) && CALENDER_YEAR.equals(expectedYear))
            {
                List <WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td"));

                for (WebElement e: daysList)
                {
                    String CalendarDay = e.getText();

                    if (CalendarDay.equals(expectedDay))
                    {
                        e.click();
                        break;
                    }
                }
                break;
            }
            else

                //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next btn
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //back btn
        }
    }
}
