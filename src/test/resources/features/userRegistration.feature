Feature: User registration

  @UserRegistration
  Scenario: Successful user registration
    Given the user is on the website
    When  the user fills in the form with his data
    Then the user displays a welcome message