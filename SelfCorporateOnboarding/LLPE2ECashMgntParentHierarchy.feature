Feature: Onboard a corporate as 'Limited Liability Partnership' through Customer Self Onboarding portal and link with Cash Management with Parent hierarchy

  Scenario Outline: Onboard a corporate as Limited Liability Partnership type and assign Cash Management with Parent Group hierarchy
    Given Self Onboarding portal is accessible
    When a corporate is successfully onboarded as Limited Liability Partnership company type <testcase>
    And approved by verifier and authoriser
    And assigned with Cash Management product with enrichment details <testcase1>
    And linked with Parent Group for Cash Management <testcase1>
    Then corporate with Parent Hierarchy should be successfully onboarded in the system <testcase1>
    Then Verify the completed stage of application for Cash Management <testcase>
    Examples:
      | testcase |    testcase1|
      | TestCase_001| TestCase_023|