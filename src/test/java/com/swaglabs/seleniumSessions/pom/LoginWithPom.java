package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithPom {

    WebDriver driver;

    LoginWithPom(WebDriver local) {
        driver = local;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    public void enterUserName(String uname) {
        username.sendKeys(uname);
    }

    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }
}
