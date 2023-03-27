package com.coffeeshop.pages;

import com.coffeeshop.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    public static WebElement logoutBtn_;

    public void logout(){
        //actions.moveToElement(logoutBtn_).click().perform();
        //BrowserUtils.waitFor(2);
       BrowserUtils.waitForClickablility(logoutBtn_,2);
        logoutBtn_.click();
    }

    @FindBy(xpath = "//tbody/tr[1]")
    public WebElement logoutVerifytext_;


    public void logutVerify(String userName){
        String actualname=logoutVerifytext_.getText();
        Assert.assertNotEquals(userName,actualname);

    }


    }



