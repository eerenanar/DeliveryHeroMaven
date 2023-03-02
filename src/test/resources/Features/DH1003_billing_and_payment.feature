Feature: Billing and Payment Methods

  Background:
    Given user is succesfully logged with Settings

  @Settings1
  Scenario: add new payment methods
    Given user is on settings page for payment
  #  And select correct vendor for payment
    And click on billing and payment page for payment
    And validate accepted payment method for payment
    And validate update payment method button is exist
    And open update payment methods
    And select one payment method
    And click apply selection button
    And validate added new payment method on tags
    Then payment method added succesfully
  @Settings1
	 Scenario: delete selected payment methods
    And open update payment methods for delete
    And uncheck selected payment method
    And click apply selection button for delete
    And validate deleted payment method on tags
