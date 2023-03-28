package com.coffeeshop.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "pretty",
                "rerun:target/rerun.txt"},
        monochrome=true,
        features = "src/test/resources/features",
        glue = "com/coffeeshop/step_definitions",
        dryRun =false,
        tags = "@reg"
)
public class
CukesRunner {

}
