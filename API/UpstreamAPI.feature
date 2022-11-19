Feature: Onboard an application through Upstream API
  @api
  Scenario Outline: POST a product onboarding application through Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with all field details
    Then I should receive http success code 201
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_000|

  @smokeapi
  Scenario Outline: Edit and verify the product onboarding application in web posted from Upstream API
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue label
    And clicks on Edit button
    Then all the entered details should be displayed in the fields 'TestCase_000'
    When user selects all the four products without enrichment details <testcase>
    And user chooses party hierarchy as Parent Group <testcase>
    And user fills the party group details for parent  hierarchy
    And user selects priority and enter remarks
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      |TestCase_0052|

  @smokeapi
  Scenario: Approve the product onboarding application in web posted from Upstream API
    Given a product onboarding application which is at Approve stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Assign To Me button and add approve remarks
    Then application should be approved successfully on click of approve button
   And application should be at Handoff stage

  @smokeapi
  Scenario: View the APIs at Handoff stage of a product onboarding application in web posted from Upstream API
    Given a product onboarding which is at Handoff stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on View Handoff Status button
    Then all APIs should be visible