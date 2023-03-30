package com.coffeeshop.step_definitions;

import com.coffeeshop.pages.LoginPage;
import com.coffeeshop.utilities.BrowserUtils;
import com.coffeeshop.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login {

    LoginPage loginPage = new LoginPage();





    /*@When("The user logs in using {string} und {string}")
    public void theUserLogsInUsingUnd(String username, String password) {
        loginPage.login_mth(username, password);

    }*/

    @When("The user enters login credentials")
    public void theUserEntersLoginCredentials() {
        loginPage.login_mth(ConfigurationReader.get("username"),ConfigurationReader.get("password"));
    }

    @When("The user logs in using {string} und {string} and should login")
    public void theUserLogsInUsingUndAndShouldLogin(String username, String password) {
        loginPage.login_mth(username, password);

    }

    @When("The user logs in using {string} und {string} and should not login")
    public void theUserLogsInUsingUndAndShouldNotLogin(String username, String password) {
        loginPage.login_mth(username, password);

    }

    @Then("this text {string}  on the screen")
    public void thisTextOnTheScreen(String expectedText) {
        String actualText=loginPage.loginErrorMsg_loc.getText();
        System.out.println(actualText);
        Assert.assertEquals(expectedText,actualText);
    }

    @Given("The user is on the Home Page")
    public void theUserIsOnTheHomePage() {
    }

    @And("The user clicks on Login Button")
    public void theUserClicksOnLoginButton() {
        loginPage.homePageLoginBtn.click();
        BrowserUtils.waitFor(3);
    }

    @Then("message should be {string}")
    public void messageShouldBe(String expectedText) {
        String actualText=loginPage.bntznameundpaswortFalsch_loc.getText();
        System.out.println(actualText);
        Assert.assertEquals(expectedText,actualText);

    }




    @Then("The username und passwort Feld should be enabled")
    public void theUsernameUndPasswortFeldShouldBeEnabled() {
        Assert.assertTrue(loginPage.usernamePlatzhalter.isEnabled());
        Assert.assertTrue(loginPage.passwordPlatzhalter.isEnabled());

    }
}
