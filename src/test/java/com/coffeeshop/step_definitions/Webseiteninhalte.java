package com.coffeeshop.step_definitions;

import com.coffeeshop.pages.WebseiteninhaltePage;
import com.coffeeshop.utilities.BrowserUtils;
import com.coffeeshop.utilities.ConfigurationReader;
import com.coffeeshop.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Webseiteninhalte {
    WebseiteninhaltePage webseiteninhaltePage=new WebseiteninhaltePage();



    @Then("The user should see {string} und {string} auf dem Page")
    public void theUserShouldSeeUndAufDemPage(String linksReihe, String linksName) {
        String actualLinksText=webseiteninhaltePage.linksLocator_mth(linksReihe);
        Assert.assertEquals(linksName,actualLinksText);


    }

    @And("The user clicks on About Button")
    public void theUserClicksOnAboutButton() {
        BrowserUtils.waitForClickablility(webseiteninhaltePage.aboutLinks_loc,3);
        webseiteninhaltePage.aboutLinks_loc.click();
        BrowserUtils.waitFor(3);
    }

    @Then("The user  sees {string}")
    public void theUserSees(String ExpectedText) {
        webseiteninhaltePage.linktextMthd(ExpectedText);
        String actualText = webseiteninhaltePage.überUnsText_loc.getText();
        Assert.assertEquals(ExpectedText,actualText);
    }

    @When("The user clicks on Home Button")
    public void theUserClicksOnHomeButton() {

    }

    @When("The user clicks on Contact Button")
    public void theUserClicksOnContactButton() {
        webseiteninhaltePage.contactLinks_loc.click();
        BrowserUtils.waitFor(3);
    }

    @Then("The user  should be able to click {string}")
    public void theUserShouldBeAbleToClick(String expectedText) {
        String actualText=webseiteninhaltePage.contactAufnhmTextloc.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @And("The user should be able to reach Website")
    public void theUserShouldBeAbleToReachWebsite() {
        String url = ConfigurationReader.get("url1");
        Driver.get().get(url);
        Driver.get().manage().window().maximize();
        BrowserUtils.waitFor(3);

    }
}
