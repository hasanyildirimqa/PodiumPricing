package Podium.Pages;

import Podium.Utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PodiumHomePage extends BrowserUtils {

    public PodiumHomePage() {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//a[@href='/pricing/']")
    private WebElement pricingButton;
    public void setPricingButton(){ pricingButton.click(); }





}