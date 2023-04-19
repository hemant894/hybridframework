Feature: Nopcommerce Login

  @Login
  Scenario: Nopcommerce Login Test
    Given User is on login page and verify the Login page Title
    Then User Enter Username and Password and click on Login
    And User is on Homepage of User