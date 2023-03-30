package com.coffeeshop.pages;

import com.coffeeshop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WarenkorbPage extends BasePage {

    @FindBy (xpath = "//tbody/tr[1]/td[1]")
    public WebElement wrnkrbUserName_Text;

    @FindBy(linkText = "Shop")
    public WebElement shopButton_loc;

    @FindBy (xpath = "//h2[contains(text(),'Willkommen in unserem Shop')]")
    public WebElement willKommentext_loc;

    @FindBy(linkText = "Bohne")
    public WebElement Bohne_kaufen_loc;

    @FindBy (xpath = "//input[@id='dc-quantity']")
    public WebElement artikelQuantity_loc;

    @FindBy (xpath = "//button[@id='dc-cartbtn']")
    public WebElement indenWrnkrbLegenButton_loc;

    /*@FindBy (xpath = "//tbody/tr[2]/td[2]/input[1]")     //tbody/tr[2]/td[2]/input[1]
    public WebElement warenkorbQuantityVrfy_loc;*/

    /*public String
    warenkorbQuantityVrfy_mth(String produktStuck){

        return  Driver.get().findElement(By.xpath(
                "//div[.='Es wurde "+produktStuck+" Artikel dem Warenkorb hinzugefügt.']")).getText();

    }*/

    @FindBy (css = "#msg-cart")
    public WebElement wrnkrbhinzfgn_loc;

    @FindBy (xpath = "//*[@id=\"setcart\"]/button[1]")
    public WebElement delete_button;
    @FindBy (xpath = "//*[@id=\"shopcart\"]/div[2]/h2")
    public WebElement wrnkrbloschn;




    @FindBy (xpath = "//*[@id=\"shoppingcart\"]")
    public WebElement chartButton;

    @FindBy (xpath = "//*[@id=\"shoplist\"]/tbody/tr[2]/td[4]/a")
    public WebElement einkaufenButton;












}
