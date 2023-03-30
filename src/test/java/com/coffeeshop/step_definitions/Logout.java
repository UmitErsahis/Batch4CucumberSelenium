package com.coffeeshop.step_definitions;

import com.coffeeshop.pages.LoginPage;
import com.coffeeshop.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Logout {
    com.coffeeshop.pages.Logout logoutPage=new com.coffeeshop.pages.Logout();
    LoginPage loginPage=new LoginPage();





    @When("The user clicks logout button user should logout")
    public void theUserClicksLogoutButtonUserShouldLogout() {
        logoutPage.logout();
        BrowserUtils.waitFor(2);
    }

    @Given("The user logs in using {string} und {string}")
    public void theUserLogsInUsingUnd(String username, String password) {
        BrowserUtils.waitFor(2);
        loginPage.login_mth(username, password);
        BrowserUtils.waitFor(2);
    }
}
