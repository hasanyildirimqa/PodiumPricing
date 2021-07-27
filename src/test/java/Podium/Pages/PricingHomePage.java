package Podium.Pages;

import Podium.Utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricingHomePage extends BrowserUtils {

    public PricingHomePage(){ PageFactory.initElements(driver,this); }


    @FindBy(xpath = "//p[@class='quote-form__title']")
    private WebElement PricingVerification;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement FirstName;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement Lastname;
    @FindBy(xpath = "//input[@id='company']")
    private WebElement Company;
    @FindBy(xpath = "//input[@id='user-email']")
    private WebElement UserEmail;
    @FindBy(xpath = "//input[@id='phone-number']")
    private WebElement PhoneNumber;
    @FindBy(xpath = "//input[@id='submit-button']")
    private WebElement GetQuoteButton;






    public void setPricingVerification(String PricingHeader){
        Assert.assertEquals("Pricing header has failed",PricingHeader,PricingVerification.getText());
        System.out.println("Pricing header verification has passed");
    }


    public void setPriceQuote(String firstName,String lastName, String companyName, String emailAddress, String mobile  ){
        FirstName.sendKeys(firstName);
        Lastname.sendKeys(lastName);
        Company.sendKeys(companyName);
        UserEmail.sendKeys(emailAddress);
        PhoneNumber.sendKeys(mobile);

    }

    public void setGetQuoteButton(){
        GetQuoteButton.click();
    }
}


