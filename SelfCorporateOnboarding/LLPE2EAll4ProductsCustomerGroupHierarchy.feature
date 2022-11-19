Feature: Onboard a corporate as 'Limited Liability Partnership' through Customer Self Onboarding portal and link all the 4 products with Customer Group hierarchy


#  Scenario Outline: Onboard a corporate as Limited Liability Partnership type and assign all the 4 products with Customer Group hierarchy
#    Given Self Onboarding portal is accessible
#    When a corporate is successfully onboarded as Limited Liability Partnership company type <testcase>
#    And approved by verifier and authoriser
#    And assigned with all the 4 products with enrichment details <testcase1>
#    And linked with Customer Group hierarchy <testcase1>
#    And select Is your Parent a transactional entity question as No and select Do you want to create a Party Group for your Parent Entity as Yes <testcase1>
#    Then corporate should be successfully onboarded in the system <testcase1>
#    Then Verify the completed stage of application as Customer Group hierarchy <testcase>
#    Examples:
#      | testcase |    testcase1|
#      | TestCase_001| TestCase_003|


  Scenario Outline: Onboard a corporate as Limited Liability Partnership type and assign all the 4 products with Customer Group hierarchy
    Given Self Onboarding portal is accessible
    When a corporate is successfully onboarded as Limited Liability Partnership company type <testcase>
    And approved by verifier and authoriser
    And assigned with all the 4 products with enrichment details <testcase>
    And linked with Customer Group hierarchy <testcase1>
    And select Is your Parent a transactional entity question as No and select Do you want to create a Party Group for your Parent Entity as No <testcase1>
    Then corporate should be successfully onboarded in the system <testcase1>
    Then Verify the above completed stage of application as Customer Group hierarchy <testcase>
    Examples:
      | testcase |testcase1|
      | TestCase_001| TestCase_004|

#  Scenario Outline: Onboard a corporate as Limited Liability Partnership type and assign all the 4 products with Customer Group hierarchy
#    Given Self Onboarding portal is accessible
#    When a corporate is successfully onboarded as Limited Liability Partnership company type <testcase>
#    And approved by verifier and authoriser
#    And assigned with all the 4 products with enrichment details <testcase>
#    And linked with Customer Group hierarchy <testcase1>
#    And select Is your Parent a transactional entity question as Yes <testcase1>
#    Then corporate should be successfully onboarded in the system <testcase1>
#    Then Verify the above completed stage of application as Customer Group hierarchy <testcase>
#    Examples:
#      | testcase |testcase1|
#      | TestCase_001| TestCase_002|