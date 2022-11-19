@sanity
Feature: Contact and Tax Feature
  Background:User logs into sample application
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role

Scenario Outline: Verify that 'Title' is optional field  in 'Contact details' and predefined values should populate in dropdown section
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address with title empty in contact details <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And enters parent Group Id
  And user selects priority and enter remarks
  Then application should be created successfully on submit and confirm app
  Examples:
    | testcase |
    | TestCase_050|

Scenario Outline: Verify that 'Name' is optional field  in 'Contact details' and accepts alphanumeric characters in 'Contact details'
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address with Name empty and accepts alphanumeric character in contact details <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And enters parent Group Id
  And user selects priority and enter remarks
  Then application should be created successfully on submit and confirm app
  Examples:
    | testcase |
    | TestCase_051|

Scenario Outline: Verify that 'Primary Contact Number' is mandatory field in 'Contact Details' section
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address & contact details with invalid Primary Contact data <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And enters parent Group Id
  And user selects priority and enter remarks
  Then on submit of application error message should be displayed as 'Please fill all the mandatory fields'
  Examples:
    | testcase |
    | TestCase_052|

Scenario Outline: Verify that 'Secondary Contact Number' is mandatory field in 'Contact Details' section
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address & contact details with invalid Secondary Contact data <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And enters parent Group Id
  And user selects priority and enter remarks
  Then on submit of application error message should be displayed as 'Please fill all the mandatory fields'
  Examples:
    | testcase |
    | TestCase_053|

Scenario Outline: Verify that 'Fax Number' is optional field  in 'Contact details' and accepts alphanumeric characters in 'Contact details'
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address with Fax Number empty and accepts alphanumeric character in contact details <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And enters parent Group Id
  And user selects priority and enter remarks
  Then application should be created successfully on submit and confirm app
  Examples:
    | testcase |
    | TestCase_054|

Scenario Outline: Verify that 'Corresponding Language' is mandatory field in 'Contact Details' section
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address & contact details with invalid Corresponding Language data <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And enters parent Group Id
  And user selects priority and enter remarks
  Then on submit of application error message should be displayed as 'Please fill all the mandatory fields'
  Examples:
    | testcase |
    | TestCase_055|

Scenario Outline: Verify that 'Tax Country' is mandatory field in 'Tax Details' section
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address & contact details with invalid Tax Country data <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And enters parent Group Id
  And user selects priority and enter remarks
  Then on submit of application error message should be displayed as 'Please fill all the mandatory fields'
  Examples:
    | testcase |
    | TestCase_056|

Scenario Outline: Verify that 'Email' is optional field  in 'Contact details' and accepts alphanumeric characters in 'Contact details'
    Given user is on the homepage
    When user selects the new application
    And  user fills new  application with basic & party & address with Email empty and accepts alphanumeric character in contact details <testcase>
    And user chooses party hierarchy as Parent Group <testcase>
    And enters parent Group Id
    And user selects priority and enter remarks
    Then application should be created successfully on submit and confirm app
    Examples:
      | testcase |
      | TestCase_057|

  Scenario Outline: Verify that 'CompanyWebsite' is optional field  in 'Contact details' and accepts alphanumeric characters in 'Contact details'
    Given user is on the homepage
    When user selects the new application
    And  user fills new  application with basic & party & address with CompanyWebsite empty and accepts alphanumeric character in contact details <testcase>
    And user chooses party hierarchy as Parent Group <testcase>
    And enters parent Group Id
    And user selects priority and enter remarks
    Then application should be created successfully on submit and confirm app
    Examples:
      | testcase |
      | TestCase_058|

Scenario Outline: Verify that 'Tax ID' is optional field and accepts alphanumeric characters in 'Tax details' section
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address with Tax ID empty and accepts alphanumeric character in contact details <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And enters parent Group Id
  And user selects priority and enter remarks
  Then application should be created successfully on submit and confirm app
  Examples:
    | testcase |
    | TestCase_059|

Scenario Outline: Verify that 'Agreement reference' is optional field and accepts alphanumeric characters in 'others details' section
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address with Agreement reference empty and accepts alphanumeric character in contact details <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And  user goes proceed
  And user selects priority and enter remarks
  Then application should be created successfully on submit and confirm app
  Examples:
    | testcase |
    | TestCase_060|

Scenario Outline: Verify that 'Risk Country' is optional field in 'others details' section
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address with Risk Country empty in contact details <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And enters parent Group Id
  And user selects priority and enter remarks
  Then application should be created successfully on submit and confirm app
  Examples:
    | testcase |
    | TestCase_061|

Scenario Outline: Verify that 'RM Name' is optional field in 'others details' section
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address with RM Name empty in contact details <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And enters parent Group Id
  And user selects priority and enter remarks
  Then application should be created successfully on submit and confirm app
  Examples:
    | testcase |
    | TestCase_062|

Scenario Outline: Verify that 'Activation date' is mandatory field in 'Other details' section
  Given user is on the homepage
  When user selects the new application
  And  user fills new  application with basic & party & address & contact details with invalid Activation Date data <testcase>
  And user chooses party hierarchy as Parent Group <testcase>
  And enters parent Group Id
  And user selects priority and enter remarks
  Then on submit of application error message should be displayed as 'Please fill all the mandatory fields'
  Examples:
    | testcase |
    | TestCase_063|

