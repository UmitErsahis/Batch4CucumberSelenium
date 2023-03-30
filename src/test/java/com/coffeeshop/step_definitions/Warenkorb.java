package com.coffeeshop.step_definitions;

import com.coffeeshop.pages.WarenkorbPage;
import com.coffeeshop.utilities.BrowserUtils;
import com.coffeeshop.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Warenkorb {

    WarenkorbPage warenkorbPage=new WarenkorbPage();

    @Then("logged User Name {string} should be showed under Warenkorb Badge")
    public void loggedUserNameShouldBeShowedUnderWarenkorbBadge(String userName) {
        Driver.get().manage().window().maximize();
        BrowserUtils.waitFor(3);
        String actualUsername=warenkorbPage.wrnkrbUserName_Text.getText();
        System.out.println(actualUsername);
        Assert.assertEquals(userName,actualUsername);

    }

    @When("The user clicks on Shop Button")
    public void theUserClicksOnShopButton() {
        warenkorbPage.shopButton_loc.click();
        BrowserUtils.waitFor(3);
    }

    @Then("Text {string} should be seen on the screen")
    public void textShouldBeSeenOnTheScreen(String willkommenText) {
        String actualText=warenkorbPage.willKommentext_loc.getText();
        Assert.assertEquals(willkommenText,actualText);
        System.out.println(actualText);
        BrowserUtils.waitFor(3);
    }

    @When("The user clicks on one Artikel")
    public void theUserClicksOnOneArtikel() {
        warenkorbPage.Bohne_kaufen_loc.click();
    }

    @And("The user selects that how many he wants from this Artikel")
    public void theUserSelectsThatHowManyHeWantsFromThisArtikel() {

        BrowserUtils.scrollToElement(warenkorbPage.artikelQuantity_loc);
        warenkorbPage.artikelQuantity_loc.click();
        BrowserUtils.waitFor(2);
        warenkorbPage.artikelQuantity_loc.clear();
        BrowserUtils.waitFor(2);
        warenkorbPage.artikelQuantity_loc.sendKeys("3");
        BrowserUtils.waitFor(3);
    }

    @And("The user clicks on the button in den Warenkorb legen")
    public void theUserClicksOnTheButtonInDenWarenkorbLegen() {
        warenkorbPage.indenWrnkrbLegenButton_loc.click();
    }

    /*@Then("the selected Number should appear on Warenkorb")
    public void theSelectedNumberShouldAppearOnWarenkorb() {
        //String actualQuantity= warenkorbPage.warenkorbQuantityVrfy_loc.getAttribute("value");
        String actualQuantity=warenkorbPage.warenkorbQuantityVrfy_mth();
        System.out.println(actualQuantity);
        String expectedQantity="3";
        Assert.assertEquals(expectedQantity,actualQuantity);
    }*/




    @Then("The user should see {string}")
    public void theUserShouldSee(String expectedMessage) {
        BrowserUtils.waitFor(2);
        String actualMessage=warenkorbPage.wrnkrbhinzfgn_loc.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedMessage, actualMessage);


    }

    @And("User can delete Warenkorb")
    public void userCanDeleteWarenkorb() {
        warenkorbPage.delete_button.click();
    }

    @And("The user clicks on Shop Chart Button")
    public void theUserClicksOnShopChartButton() {
        warenkorbPage.chartButton.click();
    }

    @And("The user clicks on the button in den Einkaufen")
    public void theUserClicksOnTheButtonInDenEinkaufen() {
        warenkorbPage.einkaufenButton.click();

    }

    @Then("Text x{string} should be seen on the screen")
    public void textXShouldBeSeenOnTheScreen(String expectedMessage) {
        BrowserUtils.waitFor(2);
        String actualMessage2=warenkorbPage.wrnkrbloschn.getText();
        System.out.println(actualMessage2);
        Assert.assertEquals(expectedMessage, actualMessage2);
    }


}
