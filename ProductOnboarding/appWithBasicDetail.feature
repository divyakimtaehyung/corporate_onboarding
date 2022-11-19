@sanity
Feature: Basic Detail Feature
  Background:User logs into sample application
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role

Scenario Outline: Verify that 'Primary bank Entity' is mandatory field in 'Basic Details' section
  Given user is on the homepage
  When user selects the new application
  Then Primary bank Entity should be mandatory field and system should not allow to create a profile when not selected <testcase>
  Examples:
    | testcase |
    |TestCase_036|

Scenario Outline: Verify that 'Primary Operating Currency' is mandatory field in 'Basic Details' section
  Given user is on the homepage
  When user selects the new application
  Then Primary Operating Currency should be mandatory field and system should not allow to create a profile when not selected <testcase>
    Examples:
      | testcase |
      |TestCase_037|

Scenario Outline: Verify that 'Corporate Entity Name' is mandatory field in 'Basic Details' section
  Given user is on the homepage
  When user selects the new application
  Then Corporate Entity Name should be mandatory field and system should not allow to create a profile when not filled <testcase>
    Examples:
      | testcase |
      |TestCase_038|

Scenario Outline: Verify that 'Corporate short Name' is mandatory field in 'Basic Details' section
  Given user is on the homepage
  When user selects the new application
  Then Corporate Short Name should be mandatory field and system should not allow to create a profile when not filled <testcase>
    Examples:
      | testcase |
      |TestCase_039|

Scenario Outline: Verify that 'Corporate Name' is unique in 'Basic Details' section
  Given user is on the homepage
  When user selects the new application
  Then Corporate Name provided should be unique <testcase>
    Examples:
      | testcase |
      |TestCase_040|

Scenario Outline: Verify that 'Corporate short Name' is unique in 'Basic Details' section
  Given user is on the homepage
  When user selects the new application
  Then Corporate short Name provided should be unique <testcase>
    Examples:
      | testcase |
      |TestCase_041|

Scenario: Verify the Max character limit of 'Corporate Name' is 35 and 'Corporate Short Name'  is 15 in 'Basic Details' section
  Given user is on the homepage
  When user selects the new application
  Then max character limit of corporateName is '35' and Corporate Short Name is '15'