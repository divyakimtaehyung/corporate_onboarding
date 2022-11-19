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

  Scenario Outline: Edit and verify the product onboarding application in web posted from Upstream API
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue label
    And clicks on Edit button
    Then all the entered details should be displayed in the fields 'TestCase_000'
    When user selects all the four products without enrichment details <testcase>
   And user chooses party hierarchy group as Customer Group <testcase>
   And selects the Parent Party ID
   And selects the Ultimate Parent Party ID
   And selects 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as Yes
   And user fills the parent party group details for customer group
   And user selects priority and enter remarks
   Then application should be created successfully on submit and confirm app
   And application should be at Approve stage
   Examples:
     | testcase |
     |TestCase_003|

  Scenario: Approve the product onboarding application in web posted from Upstream API
    Given a product onboarding application which is at Approve stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Assign To Me button and add approve remarks
    Then application should be approved successfully on click of approve button
    And application should be at Handoff stage


  Scenario: View the APIs at Handoff stage of a product onboarding application in web posted from Upstream API
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


  Scenario Outline: POST a product onboarding application through Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with all field details
    Then I should receive http success code 201
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_000|

  Scenario Outline: Edit and verify the product onboarding application in web posted from Upstream API
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue label
    And clicks on Edit button
    Then all the entered details should be displayed in the fields 'TestCase_000'
    When user selects all the four products without enrichment details <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as No
    And chooses Parent Group
    And user fills the party group details
    And user selects priority and enter remarks
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      |TestCase_004|

  Scenario: Approve the product onboarding application in web posted from Upstream API
    Given a product onboarding application which is at Approve stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Assign To Me button and add approve remarks
    Then application should be approved successfully on click of approve button
    And application should be at Handoff stage

  Scenario: View the APIs at Handoff stage of a product onboarding application in web posted from Upstream API
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

  Scenario Outline: POST a product onboarding application through Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with all field details
    Then I should receive http success code 201
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_000|

  Scenario Outline: Edit and verify the product onboarding application in web posted from Upstream API
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue label
    And clicks on Edit button
    Then all the entered details should be displayed in the fields 'TestCase_000'
    When user selects all the four products without enrichment details <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as Yes
    And user fills the party group details with parent Group Id
    And user selects priority and enter remarks
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      |TestCase_002|

  Scenario: Approve the product onboarding application in web posted from Upstream API
    Given a product onboarding application which is at Approve stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Assign To Me button and add approve remarks
    Then application should be approved successfully on click of approve button
    And application should be at Handoff stage

  Scenario: View the APIs at Handoff stage of a product onboarding application in web posted from Upstream API
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

  Scenario Outline: POST a product onboarding application through Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with all field details
    Then I should receive http success code 201
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_000|

  Scenario Outline: Edit and verify the product onboarding application in web posted from Upstream API
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue label
    And clicks on Edit button
    Then all the entered details should be displayed in the fields 'TestCase_000'
    When user selects all the four products without enrichment details <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as Yes
    And user fills the party group details with parent Group Id
    And user selects priority and enter remarks
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      |TestCase_002|

   Scenario: Approve a product onboarding application
    Given a product onboarding application which is at Approve stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Assign To Me button and add reject remarks
    Then application should be rejected successfully on click of reject button
