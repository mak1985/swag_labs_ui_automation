package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.setBrowserVersion("116.0.5845.111");
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        List<WebElement> listOfLinks= driver.findElements(By.tagName("a"));
        int resCode = 400;
        int brokenLinkCount =0;
        System.out.println("Total links on page" + listOfLinks.size());
        for(WebElement element: listOfLinks) {
            String url = element.getAttribute("href");
            try {
                URL urlLink = new URL(url);
                HttpURLConnection huc = (HttpURLConnection) urlLink.openConnection();
                huc.setRequestMethod("HEAD");
                huc.connect();
                resCode = huc.getResponseCode();
                if(resCode <= 400)
                {
                    System.out.println(url+ "broken links");
                    brokenLinkCount++;
                }
            }
            catch (MalformedURLException e)
            {
            }
            catch (Exception e)
            {
            }
        }
        System.out.println("Total broken links:" + brokenLinkCount);
    }
}
