package com.coffeeshop.step_definitions;

import com.coffeeshop.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {



    /*@Before
    public void setup(){
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }*/

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();
    }

    @Before("@db")
    public void setUpDb(){
        System.out.println("\tConnecting DB");

    }
    @After("@db")
    public void closeDb(){
        System.out.println("\tDisconnecting DB");

    }
}
