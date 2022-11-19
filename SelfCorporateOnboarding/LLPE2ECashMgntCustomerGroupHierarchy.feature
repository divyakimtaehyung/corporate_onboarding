Feature: Onboard a corporate as 'Limited Liability Partnership' through Customer Self Onboarding portal and link Cash Management product with Customer Group hierarchy

  Scenario Outline: Onboard a corporate as Limited Liability Partnership type and assign Cash Management product with Customer Group hierarchy
    Given Self Onboarding portal is accessible
    When a corporate is successfully onboarded as Limited Liability Partnership company type <testcase>
    And approved by verifier and authoriser
    And assigned with Cash Management product with enrichment details <testcase1>
    And linked with the Customer Group hierarchy for Cash Management <testcase1>
    Then corporate with Customer group hierarchy should be successfully onboarded in the system <testcase1>
    Then Verify the completed stage of application for Cash Management <testcase>
    Examples:
      | testcase |    testcase1|
      | TestCase_001| TestCase_024|