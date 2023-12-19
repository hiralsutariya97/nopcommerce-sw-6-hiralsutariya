package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersPageLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutLink;


    public void clickOnComputersMenu() {
        clickOnElement(computersPageLink);
        log.info("Clicking on computer page link : " + computersPageLink.toString());
    }

    public void clickOnLogout() {
        clickOnElement(logoutLink);
        log.info("Clicking on logout link : " + logoutLink.toString());
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public boolean isLoginLinkAvailable() {
        System.out.println("Verifying LoginLink available or not : " + loginLink.toString());
        return verifyThatElementIsDisplayed(loginLink);
    }

    public boolean isLogoutLinkAvailable() {
        System.out.println("Verifying LogoutLink available or not : " + logoutLink.toString());
        return verifyThatElementIsDisplayed(logoutLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }
}
