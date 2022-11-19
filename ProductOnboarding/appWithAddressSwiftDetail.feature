@sanity
Feature: Address Detail Feature
  Background:User logs into sample application
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role

Scenario Outline: Verify that 'AddressLine' is mandatory field in 'Address Details' section values should populate in dropdown
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address & contact details with invalid AddressLine data <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And  user goes proceed
  And user selects priority and enter remarks
  Then on submit of application error message should be displayed as 'Please fill all the mandatory fields'
  Examples:
    | testcase |
    | TestCase_044|


Scenario Outline: Verify that 'PostalCode' is mandatory field in 'Address Details' section
    Given user is on the homepage
    When user selects the new application
    And  user fills new  application with basic & party & address & contact details with invalid PostalCode data <testcase>
    And user chooses party hierarchy as Parent Group <testcase>
    And  user goes proceed
    And user selects priority and enter remarks
    Then on submit of application error message should be displayed as 'Please fill all the mandatory fields'
    Examples:
      | testcase |
      | TestCase_045|

Scenario Outline: Verify that 'Country' is mandatory field in 'Address Details' section
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address & contact details with invalid Country data <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And  user goes proceed
  And user selects priority and enter remarks
  Then on submit of application error message should be displayed as 'Please fill all the mandatory fields'
  Examples:
    | testcase |
    | TestCase_046|

Scenario Outline: Verify that 'State' is mandatory field in 'Address Details' section
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address & contact details with invalid State data <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And  user goes proceed
  And user selects priority and enter remarks
  Then on submit of application error message should be displayed as 'Please fill all the mandatory fields'
  Examples:
    | testcase |
    | TestCase_047|

Scenario Outline: Verify that 'Resident' is mandatory field in 'Address Details' section
  Given user is on the homepage
  When user selects the new application
  And  And  user fills new  application without selecting Resident in address details <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And  user goes proceed
  And user selects priority and enter remarks
  Then on submit of application error message should be displayed as 'Please fill all the mandatory fields'
  Examples:
    | testcase |
    | TestCase_048|


Scenario Outline: Verify the Max character limit of in 'Address swift Details' section
    Given user is on the homepage
    When user selects the new application
    And user fills new application with basic and party details <testcase>
    Then max character limit of AddressLine1 is '35', AddressLine2 is '35', AddressLine3 is '35', postal is '10', city is '30',swiftCode is '11', swiftAddressline1 is '35', swiftAddressline2 is '35'
  Examples:
    | testcase |
    | TestCase_049|


