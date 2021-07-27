package Podium.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources",
        glue= "Podium",
        dryRun = false,
        tags ="@Smoke" ,
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
        }




)

public class CukesRunner {


}
