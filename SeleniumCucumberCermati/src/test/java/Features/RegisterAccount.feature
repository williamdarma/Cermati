Feature: Register

  @Register
  Scenario: As user, I should be able to register
    When User navigate to Cermati Register page
    And User input "0812345678" at phone number field at Register page
    And User input "testing@gmail.com" at email field at Register page
    And User input "testing" first name at Register page
    And User input "automation" last name at Register page
    And User click register at Register page
    Then Verify User redirect to input OTP page
