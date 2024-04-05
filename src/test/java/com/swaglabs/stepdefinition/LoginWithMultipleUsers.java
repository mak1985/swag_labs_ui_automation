package com.swaglabs.stepdefinition;

import com.swaglabs.utils.CommonUtils;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class LoginWithMultipleUsers extends CommonUtils {
    private static final Logger logger = LogManager.getLogger(LoginWithMultipleUsers.class);

    @Given("User is on swag labs web page")
    public void user_is_on_swag_labs_web_page() {
        launchUrl("url");
        logger.info("User is on swag labs web page");
    }
    @When("User enter username as {string}")
    public void user_enter_username_as(String USERNAME_DATA) {
        loginPage.inputUsername(USERNAME_DATA);
        logger.info("User enter username");
    }
    @When("User enter password as {string}")
    public void user_enter_password_as(String PASSWORD_DATA) {
        loginPage.inputPassword(PASSWORD_DATA);
        logger.info("User enter password");
    }
    @When("User click on Login button")
    public void user_click_on_login_button() {
        loginPage.clickLoginButton();
        logger.info("User click on Login button");
    }
    @Then("User should navigate to Products page1")
    public void user_should_navigate_to_products_page1() {
        logger.info("User should navigate to Products page1");
    }
}
