Feature: Opening Times Methods

  Background:
    Given user is succesfully logged with Opening

  @OpeningTimes
  Scenario: validate all fields
    Given user is on opening times page
    And select correct vendor for opening times
    And validate regular schedule 
    And validate regular schedule edit button
    And validate schedule drawer
    And edit drawer
    Then opening time loaded successfully
