package Podium.StepDefinitions;

import Podium.Pages.PodiumHomePage;
import Podium.Pages.PricingHomePage;
import Podium.Utils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Map;

public class Steps extends BrowserUtils {

    @Given("I navigate to Podium web application")
    public void i_navigate_to_podium_web_application() {
        System.out.println("Chrome browser has launched");
    }

    @Given("I navigate to Pricing page")
    public void i_navigate_to_pricing_page() {
        PodiumHomePage podiumHomePage=new PodiumHomePage();
        podiumHomePage.setPricingButton();

    }
    @When("I verify that Pricing page has {string} section")
    public void i_verify_that_pricing_page_has_section(String PricingHeader) {
        PricingHomePage pricingHomePage=new PricingHomePage();
        pricingHomePage.setPricingVerification(PricingHeader);

    }

    @When("I provide my information in the quote section as")
    public void i_provide_my_information_in_the_quote_section_as(Map<String,String> dataTable) {
        PricingHomePage pricingHomePage=new PricingHomePage();
        pricingHomePage.setPriceQuote(
                dataTable.get("firstName"),
                dataTable.get("lastName"),
                dataTable.get("companyName"),
                dataTable.get("emailAddress"),
                dataTable.get("mobile"));
     //  pricingHomePage.setGetQuoteButton(); //since we do not need to submit any form, I did not implement this method

    }
    @When("I provide my invalid information in the quote section as")
    public void i_provide_my_invalid_information_in_the_quote_section_as(Map<String,String> dataTable2) {
        PricingHomePage pricingHomePage=new PricingHomePage();
        pricingHomePage.setPriceQuote(
                dataTable2.get("firstName"),
                dataTable2.get("lastName"),
                dataTable2.get("companyName"),
                dataTable2.get("emailAddress"),
                dataTable2.get("mobile"));
        //  pricingHomePage.setGetQuoteButton(); //since we do not need to submit any form, I did not implement this method


    }


}
