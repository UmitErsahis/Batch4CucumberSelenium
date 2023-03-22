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

    @FindBy(xpath = "//span[@id='usrmsg']")
    public WebElement alrdyGivenName_Text_;



    public void login_mth(){
        actions.moveToElement(homePageLoginBtn).click().perform();
        BrowserUtils.waitFor(10);
        usernameInput_.sendKeys("umit");
        BrowserUtils.waitFor(10);
        passwordInput_.sendKeys("Az12345%");
        BrowserUtils.waitFor(10);
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
















    @FindBy(id = "loginpage-input-email")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[.='Invalid Credentials!']")
    public WebElement warningMessage;

    @FindBy(id = "dashboard-h1")
    public WebElement dashboardText;

    @FindBy(xpath = "//*[text()='Please include a valid email!']")
    public WebElement warningMessageInclude;


    @FindBy(xpath = "//*[contains(text(),'valid')]")
    public WebElement warningMessageValid;


    @FindBy(css = ".menu-list")
    public List<WebElement> menuList;

    @FindAll({
            //or
            @FindBy(id = "loginpage-input-email"),
            @FindBy(name="email")
    })
    public WebElement userInputSecondWay;


    @FindBys({
            //and
            @FindBy(tagName = "p"),
            @FindBy(id = "dashboard-user-icon")
    })
    public WebElement dashboardMessage;



    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        understandBtn.click();
        loginBtn.click();
    }





    /*public void loginAsTeacher(){
        String username= ConfigurationReader.get("usernameTeacher");
        String password= ConfigurationReader.get("passwordTeacher");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        understandBtn.click();
        loginBtn.click();


        }
    public void loginAsStudent(){
        usernameInput.sendKeys(ConfigurationReader.get("usernameStudent"));
        passwordInput.sendKeys(ConfigurationReader.get("passwordStudent"));
        understandBtn.click();
        loginBtn.click();

    }
    public void loginAsDeveloper(){
        usernameInput.sendKeys(ConfigurationReader.get("usernameDeveloper"));
        passwordInput.sendKeys(ConfigurationReader.get("passwordDeveloper"));
        understandBtn.click();
        loginBtn.click();


    }

    public String  getDisapperingWarningMessage(String message){
        String actualMessage =null;

        if(message.contains("@")){
            actualMessage=usernameInput.getAttribute("validationMessage");
        }else if(message.contains("valid")) {
            actualMessage=warningMessageValid.getText();
        }
        return actualMessage;




    }*/


}
