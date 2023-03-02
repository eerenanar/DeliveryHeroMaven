Feature: Login page functionality


  @NegativeLogin
  Scenario Outline: Check login is succesfully on with invalid credentials
    When user enters "<username>" and "<password>"
    And click on login button
    And skip add phone number button
    Then user is navigated to the home page
    Examples: 
      | username                                       | password | status  |
      | ahmet.soran+hs_sa@deliveryhero.com | manager1 | success |
