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


public class Register {
    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        String url = ConfigurationReader.get("url1");
        Driver.get().get(url);
        BrowserUtils.waitFor(4);

    }


    @When("The user enters register credentials")
    public void theUserEntersRegisterCredentials() {
        loginPage.register_mth();
        BrowserUtils.waitFor(4);

    }

    @When("The user enters login credentials the user able to login")
    public void theUserEntersLoginCredentialsTheUserAbleToLogin() {
        BrowserUtils.waitFor(4);
        loginPage.login_mth();
        BrowserUtils.waitFor(5);
    }

    @Then("The user should be able to register")
    public void theUserShouldBeAbleToRegister() {

        WebElement registerVerifyBtn = loginPage.registerVerifyBtn_;
        BrowserUtils.waitFor(3);
        String expectedText = "Deine Registrierung war erfolgreich!";
        String actualText = registerVerifyBtn.getText();
        Assert.assertEquals(expectedText, actualText);
        BrowserUtils.waitFor(5);
    }

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
}




