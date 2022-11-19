Feature: Onboard a corporate as 'Limited' through Customer Self Onboarding portal and link Cash Management product with Customer hierarchy

  Scenario Outline: Onboard a corporate as Limited type and assign Cash Management product with Customer hierarchy
    Given Self Onboarding portal is accessible
    When a corporate is successfully onboarded as Limited company type <testcase>
    And approved by verifier and authoriser
    And assigned with Cash Management product with enrichment details <testcase1>
    And linked with the Customer hierarchy for Cash Management <testcase1>
    Then corporate should be successfully onboarded in the system <testcase1>
    Then Verify the completed stage of application for Cash Management <testcase>
    Examples:
      | testcase |    testcase1|
      | TestCase_001| TestCase_025|