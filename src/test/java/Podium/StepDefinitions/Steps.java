package Podium.StepDefinitions;

import Podium.Pages.LoginSmartPage;
import Podium.Pages.PodiumHomePage;
import Podium.Pages.PricingHomePage;
import Podium.Pages.SmartBearAdress;
import Podium.Utils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class Steps extends BrowserUtils {

    SmartBearAdress smartBearAdress=new SmartBearAdress();

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



    @Given("The user wants to login Smartbear")
    public void the_user_wants_to_login_smartbear() {
        LoginSmartPage loginSmartPage=new LoginSmartPage();
        loginSmartPage.Login();

    }
    @Then("The user wants to go order page")
    public void the_user_wants_to_go_order_page() {
        smartBearAdress.setOrderSection();

    }
    @Then("The user wants to enter product info as {string} and {string}")
    public void the_user_wants_to_enter_product_info_as_and(String product, String quantity) {
        smartBearAdress.setProductInfo(product,quantity);

    }
    @Then("The user wants to enter address info as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_address_info_as_and_and_and_and(String CName, String street, String city, String state, String zip) {
        smartBearAdress.setAddressinfo(CName,street,city,state,zip);
    }
    @Then("The user wants to enter payment information as {string} and {string} and {string}")
    public void the_user_wants_to_enter_payment_information_as_and_and(String CType, String CNumber, String Expire) {
        smartBearAdress.setCardInfo(CType,CNumber,Expire);
    }

}
