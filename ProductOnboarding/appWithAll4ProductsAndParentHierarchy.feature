@Sanity1
Feature: Onboard a product onboarding application with all 4 products and hierarchy as Parent Group

#  @t1
  Scenario Outline: Create an application with all 4 products and enrichment details
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Trade Finance with enrichment details <testcase>
    And selects product as Cash Management with enrichment details <testcase>
    And selects product as Corporate Channels with enrichment details <testcase>
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
    Then party, party provision, party enrichment for Trade Finance, party enrichment for Cash Management and party enrichment for Corporate Channels APIs should be visible

  Scenario Outline: Verify the completed stage of a product onboarding application
    Given a product onboarding which is at Handoff stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And user post the request id for integration api <testcase>
    And selects the application from Completed App menu
    Then party, party provision, party enrichment for Trade Finance, party enrichment for Cash Management and party enrichment for Corporate Channels APIs should be visible
    Examples:
      | testcase |
      |TestCase_001|

  @Test557
  Scenario Outline: Create an application with all 4 products and enrichment details and hierarchy as Parent Group
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Trade Finance with enrichment details <testcase>
    And selects product as Cash Management with enrichment details <testcase>
    And selects product as Corporate Channels with enrichment details <testcase>
    And selects product as Revenue Management <testcase>
    And user chooses party hierarchy as Parent Group <testcase>
    And user fills the party group details for parent  hierarchy
    And user selects priority and enter remarks
    Then user cancels and save filled application
    Examples:
      | testcase |
      | TestCase_184|

    @Test558
  Scenario Outline: Verify data on view of full application for the saved application with all 4 products with enrichment details for Parent Hierarchy
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And user selects View application at input stage
#    And clicks on view full application
    Then all the entered details till contact details as filled in the fields should be displayed on view of full application <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Trade Finance with enrichment details <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Cash Management without enrichment details <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Corporate Channels with enrichment details <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Revenue management with enrichment details <testcase>
    And party hierarchy as Parent Group on view of full application <testcase>
    And filled party group details for parent hierarchy should be displayed on view of full application
    And details on view of full application for priority and entered remarks should be displayed as filled in the fields
    Examples:
      | testcase |
      | TestCase_184|

  @Test559
  Scenario Outline: Verify data on edit of the saved application with product all 4 products with enrichment details for parent hierarchy
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Edit button
    Then all the entered details till contact details should be displayed as filled in the fields <testcase>
    Then all the entered details should be displayed as filled on Edit for product as Trade Finance with enrichment details <testcase>
    Then all the entered details should be displayed as filled on Edit without group reset for product as Cash Management with enrichment details <testcase>
    Then all the entered details should be displayed as filled on Edit without group reset for product as Corporate Channels with enrichment details <testcase>
    Then all the entered details should be displayed as filled on Edit without group reset for product as Revenue Manangement with enrichment details <testcase>
    And party hierarchy as Parent Group on Edit <testcase>
    And user fills the party group details for parent  hierarchy
    And details for priority and entered remarks should be displayed as filled in the fields
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      | TestCase_184|


