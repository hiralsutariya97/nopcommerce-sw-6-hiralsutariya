package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Objects;

public class ComputersSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on computer menu")
    public void iClickOnComputerMenu() {
        new HomePage().clickOnComputersMenu();
    }

    @Then("I should navigate to computer page successfully and verify the text {string}")
    public void iShouldNavigateToComputerPageSuccessfullyAndVerifyTheText(String expectedMessage) {
        Assert.assertEquals(new ComputerPage().getWelcomeText(), expectedMessage);
    }

    @And("I click on desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopsLink();
    }

    @Then("I should navigate to desktops page successfully and verify the text {string}")
    public void iShouldNavigateToDesktopsPageSuccessfullyAndVerifyTheText(String expectedMessage) {
        Assert.assertEquals(new DesktopsPage().getWelcomeText(), expectedMessage);
    }

    @And("I click on build your own computer")
    public void iClickOnBuildYourOwnComputer() {
        new DesktopsPage().clickOnBuildYourOwnComputerLink();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessorFieldDropDownOption(processor);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRAMFieldDropDownOption(ram);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hdd) {
        if (Objects.equals(hdd, "320 GB")) {
            new BuildYourOwnComputerPage().clickOnHDD320GBRadioButton();
        } else {
            new BuildYourOwnComputerPage().clickOnHDD400GBRadioButton();
        }
    }

    @And("I select OS {string}")
    public void iSelectOS(String os) {
        if (Objects.equals(os, "Vista Home [+$50.00]")) {
            new BuildYourOwnComputerPage().clickOnOSVistaHomeRadioButton();
        } else {
            new BuildYourOwnComputerPage().clickOnOSVistaPremiumRadioButton();
        }
    }

    @And("I select software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().clickOnSoftwareMicrosoftOfficeCheckBox();
        if (Objects.equals(software, "Microsoft Office [+$50.00]")) {
            new BuildYourOwnComputerPage().clickOnSoftwareMicrosoftOfficeCheckBox();
        } else if (Objects.equals(software, "Acrobat Reader [+$10.00]")) {
            new BuildYourOwnComputerPage().clickOnSoftwareAcrobatReaderCheckBox();
        } else {
            new BuildYourOwnComputerPage().clickOnSoftwareTotalCommanderCheckBox();
        }
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("I should get product added successfully message {string}")
    public void iShouldGetProductAddedSuccessfullyMessage(String expectedMessage) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getAddToCartSuccessfulMessage(), expectedMessage);
    }


}
