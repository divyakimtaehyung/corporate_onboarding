Feature: Onboard a corporate as 'Limited Liability Partnership' through Customer Self Onboarding portal and link all the 4 products with Parent hierarchy

  Scenario Outline: Onboard a corporate as Limited Liability Partnership type and assign all the 4 products with Parent Group hierarchy
    Given Self Onboarding portal is accessible
    When a corporate is successfully onboarded as Limited Liability Partnership company type <testcase>
    And approved by verifier and authoriser
    And assigned with all the 4 products with enrichment details <testcase>
    And linked with Parent Group hierarchy <testcase>
    Then corporate with Parent Hierarchy should be successfully onboarded in the system <testcase>
    Then Verify the completed stage of application as Parent group hierarchy <testcase>
    Examples:
      | testcase |
      | TestCase_001|