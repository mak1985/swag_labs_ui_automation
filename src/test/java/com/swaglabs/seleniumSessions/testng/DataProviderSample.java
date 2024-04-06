package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSample {

    @Test(dataProvider = "searchDataSet")
    public void testCaseGoogleSearch(String country, String monument) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys(country, monument);
        driver.findElement(By.name("btnK")).click();
    }

    @DataProvider(name = "searchDataSet")
    public Object[][] searchData(){
        Object[][] searchkeyword = new Object[3][2];
        searchkeyword[0][0] = "India";
        searchkeyword[0][1] = "Qutub Minar";

        searchkeyword[1][0] = "Agra";
        searchkeyword[1][1] = "Taj Mahal";

        searchkeyword[2][0] = "Hyderabad";
        searchkeyword[2][1] = "Charminar";

        return searchkeyword;
    }
}
