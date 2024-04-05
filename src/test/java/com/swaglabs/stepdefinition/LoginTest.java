package com.swaglabs.stepdefinition;

import com.swaglabs.core.BaseClass;
import com.swaglabs.utils.CommonUtils;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginTest extends CommonUtils {

    private static final Logger logger = LogManager.getLogger(LoginTest.class);
    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
        launchUrl("url");
        logger.info("test passed");
    }
    @And("User opens URL {string}")
    public void user_opens_url(String string) {

    }
    @When("User enters username {string}")
    public void user_enters_username(String string) {
        loginPage.inputUsername("standard_user");
    }
    @And("User enters password {string}")
    public void user_enters_password(String string) {
        loginPage.inputPassword("secret_sauce");
    }
    @And("User clicks on Login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLoginButton();
    }
    @Then("User should navigate to Products page")
    public void user_should_navigate_to_products_page() {

    }
}
