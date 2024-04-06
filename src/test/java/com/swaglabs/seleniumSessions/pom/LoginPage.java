package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    //Constructor
    LoginPage(WebDriver driver1) {
        driver = driver1;
    }

    //Web Elements
    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    public void enterUserName(String uname) {
        driver.findElement(username).sendKeys(uname);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

}
