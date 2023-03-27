package com.coffeeshop.step_definitions;

import com.coffeeshop.pages.LoginPage;
import com.coffeeshop.utilities.BrowserUtils;
import com.coffeeshop.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    LoginPage loginPage = new LoginPage();





    @When("The user logs in using {string} und {string}")
    public void theUserLogsInUsingUnd(String username, String password) {
        loginPage.login_mth(username, password);

    }

    @When("The user enters login credentials")
    public void theUserEntersLoginCredentials() {
        loginPage.login_mth(ConfigurationReader.get("username"),ConfigurationReader.get("password"));
    }
}
