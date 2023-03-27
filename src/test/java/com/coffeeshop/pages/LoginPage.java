package com.coffeeshop.pages;

import com.coffeeshop.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class LoginPage extends BasePage{
    @FindBy(linkText ="Anmelden")
    public WebElement anmeldenBtn_;

    @FindBy(css = "#register-username")
    public WebElement registerUserName_;

    @FindBy(css = "#register-pw")
    public WebElement registerpassword_;

    @FindBy(xpath = "//input[@id='register-pwrep']")
    public WebElement registerpwrep_;

    @FindBy(css = "#register-check")
    public WebElement registercheck_;

    @FindBy(xpath = " //input[@value='Registrieren']")
    public WebElement registerBtn_;

    @FindBy(xpath = " //h2[contains(text(),'Deine Registrierung war erfolgreich!')]")
    public WebElement registerVerifyBtn_;


    @FindBy(css= "#login-username")
    public WebElement usernameInput_;

    @FindBy(css = "#login-password")
    public WebElement passwordInput_;

    @FindBy(css = "#login-submit")
    public WebElement loginSubmit_;

    @FindBy(linkText ="Login")
    public WebElement homePageLoginBtn;

    /*@FindBy(xpath = "//span[@id='usrmsg']")
    public WebElement alrdyGivenName_Text_;*/

    @FindBy(css ="#usrmsg")
    public WebElement alrdyGivenName_Text_;

    @FindBy(xpath = "//div/span[@id='usrmsg']")
    public WebElement warnungMessage_Text_;


    @FindBy(css = "#headlogo")
    public WebElement homeTitle_Text_;

    @FindBy(linkText = "Login")
    public WebElement loginLink_;

    @FindBy(xpath = " //span[@id='pwmsg']")
    public WebElement passwortWarnung_Text_;






    public void login_mth(String username, String password){
        actions.moveToElement(homePageLoginBtn).click().perform();
        BrowserUtils.waitFor(3);
        usernameInput_.sendKeys(username);
        BrowserUtils.waitFor(3);
        passwordInput_.sendKeys(password);
        BrowserUtils.waitFor(3);
        loginSubmit_.click();

    }

    public void register_mth(){

        actions.moveToElement(homePageLoginBtn).click().perform();
        BrowserUtils.waitFor(2);
        anmeldenBtn_.click();
        BrowserUtils.waitFor(2);
        registerUserName_.sendKeys(faker.name().firstName());
        BrowserUtils.waitFor(2);
        registerpassword_.sendKeys("Az123456?");
        BrowserUtils.waitFor(2);
        registerpwrep_.sendKeys("Az123456?");
        BrowserUtils.waitFor(2);
        registercheck_.click();
        BrowserUtils.waitFor(2);
        registerBtn_.click();

    }

    public void korrektheitUberprüf_mth(){
        BrowserUtils.waitFor(2);
        homePageLoginBtn.click();
        BrowserUtils.waitFor(2);
        anmeldenBtn_.click();
        BrowserUtils.waitFor(2);
        registerUserName_.sendKeys(faker.internet().password(4,12));
        BrowserUtils.waitFor(4);
    }


}
