package Podium.StepDefinitions;

import Podium.Utils.BrowserUtils;
import Podium.Utils.ConfigurationReader;
import Podium.Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;


    public class Hooks extends BrowserUtils {
        @Before
        public void setup(){
            Driver.getDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(ConfigurationReader.getProperties("url2"));
            driver.manage().window().maximize();
        }
        @After
        public void lastStep(Scenario scenario) {

            if(scenario.isFailed()){
                byte[] data=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(data,"image/png",scenario.getName());
            }


        }

    }
