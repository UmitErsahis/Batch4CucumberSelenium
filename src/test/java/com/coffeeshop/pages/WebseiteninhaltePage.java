package com.coffeeshop.pages;

import com.coffeeshop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebseiteninhaltePage extends BasePage {

    /*@FindBy(xpath = " (//a[@class='topnavigation'])[1]")
    public WebElement homePageLinks_loc;

    @FindBy(xpath = " (//a[@class='topnavigation'])[3]")
    public WebElement shopLinks_loc;

    @FindBy(xpath = " (//a[@class='topnavigation'])[4]")
    public WebElement contactsLinks_loc;*/

    @FindBy(tagName = "h1")
    public WebElement überUnsText_loc;

    @FindBy(xpath = "//a[contains(text(), \"About\")]")
    public WebElement aboutLinks_loc;


    @FindBy(xpath = "//a[contains(text(), \"Contact\")]")
    public WebElement contactLinks_loc;

    @FindBy(xpath = "//a[text()='finetest@coffee.inc']")
    public WebElement contactAufnhmTextloc;





    @FindBy(xpath = "//h1[text()='Feinster Kaffee']")
    public WebElement FensterCoffeeText_loc;

    public void linktextMthd(String text){

    }




    public String linksLocator_mth(String locatorNummer){
      return   Driver.get().findElement(By.xpath("(//a[@class='topnavigation'])["+locatorNummer+"]")).
              getText();



    }


}
