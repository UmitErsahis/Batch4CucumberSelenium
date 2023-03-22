package com.coffeeshop.step_definitions;

import com.coffeeshop.pages.LoginPage;
import com.coffeeshop.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Logout {
    com.coffeeshop.pages.Logout logoutPage=new com.coffeeshop.pages.Logout();
    LoginPage loginPage=new LoginPage();

    @Given("The user is already logged in")
    public void theUserIsAlreadyLoggedIn() {
        loginPage.login_mth();
        BrowserUtils.waitFor(5);


    }

    @When("The user clicks logout button user should logout")
    public void theUserClicksLogoutButtonUserShouldLogout() {
        logoutPage.logout();
        BrowserUtils.waitFor(5);
    }
}
