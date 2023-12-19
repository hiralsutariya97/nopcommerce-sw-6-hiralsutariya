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
public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorFieldDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement RAMFieldDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement HDD320GBRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement HDD400GBRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement OSVistaHomeRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement OSVistaPremiumRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareMicrosoftOfficeCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement softwareAcrobatReaderCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareTotalCommanderCheckBox;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement cartAddMessage;

    /******************************** All Elements' Action Methods on BuildYourOwnComputer page *************************************/

    public void selectProcessorFieldDropDownOption(String option) {
        selectByVisibleTextFromDropDown(processorFieldDropDown, option);
        log.info("Selecting processor from drop-down : " + processorFieldDropDown.toString());
    }

    public void selectRAMFieldDropDownOption(String option) {
        selectByVisibleTextFromDropDown(RAMFieldDropDown, option);
        log.info("Selecting RAM from drop-down : " + RAMFieldDropDown.toString());
    }

    public void clickOnHDD320GBRadioButton() {
        clickOnElement(HDD320GBRadioButton);
        log.info("Selecting 320GB HDD : " + HDD320GBRadioButton.toString());
    }

    public void clickOnHDD400GBRadioButton() {
        clickOnElement(HDD400GBRadioButton);
        log.info("Selecting 400GB HDD : " + HDD400GBRadioButton.toString());
    }

    public void clickOnOSVistaHomeRadioButton() {
        clickOnElement(OSVistaHomeRadioButton);
        log.info("Selecting Vista Home OS : " + OSVistaHomeRadioButton.toString());
    }

    public void clickOnOSVistaPremiumRadioButton() {
        clickOnElement(OSVistaPremiumRadioButton);
        log.info("Selecting Vista Premier OS : " + OSVistaPremiumRadioButton.toString());
    }

    public void clickOnSoftwareMicrosoftOfficeCheckBox() {
        clickOnElement(softwareMicrosoftOfficeCheckBox);
        log.info("Clicking on Microsoft Office Software : " + softwareMicrosoftOfficeCheckBox.toString());
    }

    public void clickOnSoftwareAcrobatReaderCheckBox() {
        clickOnElement(softwareAcrobatReaderCheckBox);
        log.info("Clicking on Acrobat Reader Software : " + softwareAcrobatReaderCheckBox.toString());
    }

    public void clickOnSoftwareTotalCommanderCheckBox() {
        clickOnElement(softwareTotalCommanderCheckBox);
        log.info("Clicking on Total Commander Software : " + softwareTotalCommanderCheckBox.toString());
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCartButton);
        log.info("Clicking on Add to Cart : " + addToCartButton.toString());
    }

    public String getAddToCartSuccessfulMessage() {
        log.info("Getting Add to cart success message : " + cartAddMessage.toString());
        return getTextFromElement(cartAddMessage);
    }
}
