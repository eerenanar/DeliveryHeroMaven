Feature: Open Settings and Validate Payment

  Background:
    Given user is succesfully logged with Settings

  @Settings
  Scenario: open billing and payment tab
    Given user is on settings page
    And select correct vendor
    And click on billing and payment page
    And validate accepted payment method
    And validate update payment method button is visible
    And validate yemeksepeti wallet is exist
    Then user has a access right to page
    
   
