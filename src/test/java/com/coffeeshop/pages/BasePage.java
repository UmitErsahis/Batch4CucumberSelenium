package com.coffeeshop.pages;

import com.coffeeshop.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    Actions actions=new Actions(Driver.get());
    Faker faker=new Faker();



    /*@FindBy(id = "rcc-confirm-button")
    public WebElement understandBtn;*/
}
