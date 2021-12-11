Feature: Request a quote from Podium application

  As a potential customer,
  I want to get a quote from Podium application,
  So that I can receive competitive rate.


  Background:
  Given I navigate to Podium web application

  @Smoke1
  Scenario:  Verify that I am at Pricing page
    Given I navigate to Pricing page
    When I verify that Pricing page has "Request a quote." section

  @Smoke
  Scenario: Request a quote with valid information
    Given I navigate to Pricing page
    When I provide my information in the quote section as
    |firstName   | Alex   |
    |lastName    | Jackson|
    |companyName | Apple  |
    |emailAddress| alexJackson@gmail.com  |
    |mobile      | 5188158558             |


  @Smoke3
  Scenario: Request a quote with invalid information
    Given  I navigate to Pricing page
    When I provide my invalid information in the quote section as
      |firstName   | Alex   |
      |lastName    | Jackson|
      |companyName | Apple  |
      |emailAddress| alexJackson@  |
      |mobile      | 0             |


 @Smoke4
  Scenario Outline: Verify that we can order http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Default.aspx
    Given The user wants to login Smartbear
    Then The user wants to go order page
    Then The user wants to enter product info as "<product>" and "<quantity>"
    Then The user wants to enter address info as "<CName>" and "<street>" and "<city>" and "<state>" and "<zip>"
    Then The user wants to enter payment information as "<CType>" and "<CNumber>" and "<Expire>"

    Examples:
      |product| quantity| CName| street     |city     |state|zip    |CType       |CNumber    |Expire|
      |MyMoney| 10      | erk  |12 Fake st  |Toronto  |CO   |123456 |MasterCard  |123456789  |12/25 |









