@sanity
Feature: Onboard a product onboarding application with all 4 products withoutEnrichment and hierarchy as Parent Group


  Scenario Outline: Create an application with all 4 products and without enrichment details
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Trade Finance without enrichment details <testcase>
    And selects product as Cash Management without enrichment details <testcase>
    And selects product as Corporate Channels without enrichment details <testcase>
    And selects product as Revenue Management <testcase>
    And user chooses party hierarchy as Parent Group <testcase>
    And user fills the party group details for parent  hierarchy
    And user selects priority and enter remarks
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      | TestCase_001|


  Scenario: Approve the product onboarding application in web posted from Upstream API
    Given a product onboarding application which is at Approve stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Assign To Me button and add approve remarks
    Then application should be approved successfully on click of approve button
    And application should be at Handoff stage


  Scenario: View the no of APIs at Handoff stage of a product onboarding application
    Given a product onboarding which is at Handoff stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on View Handoff Status button
    Then party, party provision APIs should be visible


  Scenario Outline: Verify the completed stage of a product onboarding application
    Given a product onboarding which is at Handoff stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And user post the 2request id for integration api <testcase>
    And selects the application from Completed App menu
    Then party, party provision APIs should be visible
    Examples:
      | testcase |
      |TestCase_001|



  Scenario Outline: Create an application with all 4 products and without enrichment details
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Trade Finance without enrichment details <testcase>
    And selects product as Cash Management without enrichment details <testcase>
    And selects product as Corporate Channels without enrichment details <testcase>
    And selects product as Revenue Management <testcase>
    And user chooses party hierarchy as Parent Group <testcase>
    And user fills the party group details for parent  hierarchy
    And user selects priority and enter remarks
    Then user cancels and save filled application
    Examples:
      | testcase |
      | TestCase_184|



  Scenario Outline: Create an application with all 4 products and without enrichment details
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Trade Finance without enrichment details <testcase>
    And selects product as Cash Management without enrichment details <testcase>
    And selects product as Corporate Channels without enrichment details <testcase>
    And selects product as Revenue Management <testcase>
    And user chooses party hierarchy as Parent Group <testcase>
    And user fills the party group details for parent  hierarchy
    And user selects priority and enter remarks
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      | TestCase_001|


  Scenario: Approve a product onboarding application
    Given a product onboarding application which is at Approve stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Assign To Me button and add reject remarks
    Then application should be rejected successfully on click of reject button



