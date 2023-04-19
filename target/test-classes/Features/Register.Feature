Feature: NopCommerce Register

  Scenario: User Register first time
     Given User Enter on Register Link
    And User Click on Gender
    Then User Enter First Name
    And User Enter Last Name
    Then User Enter DateOfBirth
    And User Enter Email
    Then User Enter CompanyName
    And User Enter Select Newsletter
    Then User Enter Password
    And User Confirm Password
    Then User Click on Register Button
