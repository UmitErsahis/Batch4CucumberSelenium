package com.coffeeshop.step_definitions;

import com.coffeeshop.pages.LoginPage;
import com.coffeeshop.utilities.BrowserUtils;
import com.coffeeshop.utilities.ConfigurationReader;
import com.coffeeshop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.junit.Assert;


public class Register {
    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        String url = ConfigurationReader.get("url1");
        Driver.get().get(url);
        BrowserUtils.waitFor(3);


    }


    @When("The user enters register credentials")
    public void theUserEntersRegisterCredentials() {
        loginPage.register_mth();
        BrowserUtils.waitFor(4);

    }



    /*@Then("The user should be able to register")
    public void theUserShouldBeAbleToRegister() {

        WebElement registerVerifyBtn = loginPage.registerVerifyBtn_;
        BrowserUtils.waitFor(3);
        String expectedText = "Deine Registrierung war erfolgreich!";
        String actualText = registerVerifyBtn.getText();
        Assert.assertEquals(expectedText, actualText);
        BrowserUtils.waitFor(3);
    }*/

    @Given("The user on the register page")
    public void theUserOnTheRegisterPage() {
        loginPage.homePageLoginBtn.click();
        BrowserUtils.waitFor(3);
        loginPage.anmeldenBtn_.click();
        BrowserUtils.waitFor(3);


    }

    @When("when a previously given name is entered")
    public void whenAPreviouslyGivenNameIsEntered() {
        loginPage.registerUserName_.sendKeys("umit");
        BrowserUtils.waitFor(3);
    }

    @Then("this text {string} should be on the screen")
    public void thisTextShouldBeOnTheScreen(String warnungMessage) {
        String actualMessage = loginPage.alrdyGivenName_Text_.getText();
        Assert.assertEquals(warnungMessage, actualMessage);
        System.out.println(actualMessage);
    }

    @When("a new name not DB is entered")
    public void aNewNameNotDBIsEntered() {
        loginPage.korrektheitUberprüf_mth();

    }

    @When("a new name not in DB is entered")
    public void aNewNameNotInDBIsEntered() {
        loginPage.registerUserName_.sendKeys("Fatma");
    }

    @When("less than four letters are entered for the name")
    public void lessThanFourLettersAreEnteredForTheName() {
        loginPage.registerUserName_.sendKeys("umi");
        BrowserUtils.waitFor(3);
    }


    @Then("Login Button should be displayed")
    public void loginButtonShouldBeDisplayed() {
        WebElement loginLink = loginPage.loginLink_;
        //boolean loginDisable = loginLink.isDisplayed();
        Assert.assertTrue(loginLink.isDisplayed());
    }

    @Then("this text sholud be {string}")
    public void thisTextSholudBe(String warningMessage) {
        String actualMessage = loginPage.warnungMessage_Text_.getText();
        Assert.assertEquals(warningMessage, actualMessage);
        System.out.println(actualMessage);

    }

    @When("more than twelve letters are entered for the name")
    public void moreThanTwelveLettersAreEnteredForTheName() {
        BrowserUtils.waitFor(3);
        loginPage.registerUserName_.sendKeys("abcd123456789hhj");
        BrowserUtils.waitFor(3);
        loginPage.registerUserName_.sendKeys("11111111hjkjhh");
        BrowserUtils.waitFor(3);
        loginPage.registerUserName_.sendKeys("abcd123456789hh");
        BrowserUtils.waitFor(3);
        BrowserUtils.waitFor(4);

    }

    @Then("text {string} should be on the screen")
    public void textShouldBeOnTheScreen(String warnungMessage) {
        String actualMessage = loginPage.warnungMessage_Text_.getText();
        System.out.println(actualMessage);
        Assert.assertTrue(actualMessage.contains(warnungMessage));
    }

    @When("The user enter one passwort {string} und {string}")
    public void theUserEnterOnePasswortUnd(String lessPasswort, String morePasswort) {
        BrowserUtils.waitFor(3);
        loginPage.registerpassword_.sendKeys(lessPasswort);
        BrowserUtils.waitFor(3);
        loginPage.registerpassword_.sendKeys(morePasswort);
        BrowserUtils.waitFor(3);

    }

    @Then("this {string} should be on the screen")
    public void thisShouldBeOnTheScreen(String warnungMessage) {
        String actualText=loginPage.passwortWarnung_Text_.getText();
        Assert.assertEquals(warnungMessage, actualText);
    }

    @Then("The user should be able to register und see text {string}")
    public void theUserShouldBeAbleToRegisterUndSeeText(String expectedText) {
        WebElement registerVerifyBtn = loginPage.registerVerifyBtn_;
        BrowserUtils.waitFor(3);
        String actualText = registerVerifyBtn.getText();
        Assert.assertEquals(expectedText, actualText);
        BrowserUtils.waitFor(3);


    }


}




