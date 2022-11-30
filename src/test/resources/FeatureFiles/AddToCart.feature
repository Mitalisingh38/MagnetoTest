@TestAddtoCart
Feature: Feature file to add different items in shopping cart of Online Portal.

  @AddtoCart-Positive
  Scenario: Validate the Cart total
    Given I am on the Home Page "https://magento.softwaretestingboard.com/" of Magneto Website
    When I Sign in my account
    When I click on search input and provide the "Gwyn Endurance Tee"
    And scroll down on the web page till the tee is visible
    And select the tee
    And I select size as medium
    And I select colour as green
    And select quantity as "4"
    And click on AddtoCart button
    And click on shopping cart link
    And click on shipping tab
    And verify country is selected as "United Kingdom"
    And Check cart total is "$92.00"
    And Update the Quantity of Gwyn Endurance Tee Medium Green to "3"
    When I click on search input and provide the "Gwyn Endurance Tee"
    And scroll down on the web page till the tee is visible
    And select the tee
    And I select size as small
    And I select colour as Yellow
    And select quantity as "1"
    And click on AddtoCart button
    When I click on search input and provide the "Quest Lumaflex™ Band"
    And select the band
    And select quantity as "1"
    And click on AddtoCart button
    And click on shopping cart link
    And click on shipping tab
    And Check cart total is "$115.00"