package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }

    @Then("I should navigate to login page successfully and verify the message {string}")
    public void iShouldNavigateToLoginPageSuccessfullyAndVerifyTheMessage(String expectedText) {
        Assert.assertEquals(new LoginPage().getWelcomeText(), expectedText, "Login page is not displayed");
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().sendDataToEmailField(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().sendDataToPasswordField(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();

    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String expectedMessage) {
        Assert.assertEquals(new LoginPage().getLoginUnsuccessfulMessage().substring(0, expectedMessage.length()), expectedMessage, "Login Unsuccessful Message Not Displayed");
    }

    @Then("I should login successfully and verify the logout link")
    public void iShouldLoginSuccessfullyAndVerifyTheLogoutLink() {
        Assert.assertTrue(new HomePage().isLoginLinkAvailable(), "Logout link is not available");
    }

    @And("I click on logout link")
    public void iClickOnLogoutLink() {
        new HomePage().clickOnLogout();
    }

    @Then("I should logout successfully and verify the login link")
    public void iShouldLogoutSuccessfullyAndVerifyTheLoginLink() {
        Assert.assertTrue(new HomePage().isLoginLinkAvailable(), "Login link is not available");
    }


}
