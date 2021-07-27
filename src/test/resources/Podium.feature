Feature: Request a quote from Podium application

  As a potential customer,
  I want to get a quote from Podium application,
  So that I can receive competitive rate.


  Background:
  Given I navigate to Podium web application

  @Smoke
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


  @Smoke
  Scenario: Request a quote with invalid information
    Given  I navigate to Pricing page
    When I provide my invalid information in the quote section as
      |firstName   | Alex   |
      |lastName    | Jackson|
      |companyName | Apple  |
      |emailAddress| alexJackson@  |
      |mobile      | 0             |










