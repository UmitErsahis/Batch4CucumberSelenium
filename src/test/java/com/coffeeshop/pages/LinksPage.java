package com.coffeeshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinksPage extends BasePage {

    @FindBy(xpath = " (//a[@class='topnavigation'])[1]")
    public WebElement homePageLinks_loc;


}
