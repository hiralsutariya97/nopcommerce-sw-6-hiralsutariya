package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement loginUnsuccessfulMessage;


    public String getWelcomeText() {
        log.info("Getting welcome message : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void sendDataToEmailField(String emailId) {
        sendTextToElement(emailField, emailId);
        log.info("Sending text to email field : " + emailField.toString());
    }

    public void sendDataToPasswordField(String password) {
        sendTextToElement(passwordField, password);
        log.info("Sending text to password field : " + passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on login button : " + loginButton.toString());
    }

    public String getLoginUnsuccessfulMessage() {
        log.info("Getting login unsuccessful message : " + loginUnsuccessfulMessage.toString());
        return getTextFromElement(loginUnsuccessfulMessage);
    }
}
