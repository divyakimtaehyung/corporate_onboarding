@sanity
Feature: Onboard a product onboarding application with 2products and hierarchy as Customer Group
  Scenario Outline: Create an application with 2products as Corporate Channels and Revenue Management with enrichment details for customer group hierarchy

    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Corporate Channels with enrichment details <testcase>
    And selects product as Revenue Management <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects the Ultimate Parent Party ID
    And  user goes proceed
    And user selects priority and enter remarks
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      |TestCase_028|

  Scenario: Approve a product onboarding application
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
    Then party provision and party enrichment for Corporate Channels APIs should be visible

  Scenario Outline: Verify the completed stage of a product onboarding application
    Given a product onboarding which is at Handoff stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And user post the request id for provision and enrichment integration api <testcase>
    And selects the application from Completed App menu
    Then party provision and party enrichment for Corporate Channels APIs should be visible
    Examples:
      | testcase |
      |TestCase_001|

  Scenario Outline: Create an application with 2 products and enrichment details for customer grp 'Is your Parent a transactional entity?' question as Yes
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Revenue Management <testcase>
    And selects product as Corporate Channels with enrichment details <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as Yes
      And selects the Ultimate Parent Party ID
      And  user goes proceed
      And user selects priority and enter remarks
    Then user cancels and save filled application
    Examples:
      | testcase |
      |TestCase_187|


  Scenario Outline: Verify data on view of full application for the saved application with 2 products as Corporate Channels & Revenue Management  with enrichment details for customer grp Hierarchy
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
        And user selects View application at input stage
    Then all the entered details till contact details as filled in the fields should be displayed on view of full application <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Corporate Channels with enrichment details <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Revenue management with enrichment details <testcase>
    And party hierarchy as Customer Group on view of full application <testcase>
    And details on view of full application for priority and entered remarks should be displayed as filled in the fields
    Examples:
      | testcase |
      | TestCase_187|


  Scenario Outline: Verify data on edit of the saved application with 2 products as Corporate Channels & Revenue Management with enrichment details for Customer group hierarchy
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Edit button
    Then all the entered details till contact details should be displayed as filled in the fields <testcase>
    Then all the entered details should be displayed as filled on Edit without group reset for product as Revenue Manangement with enrichment details <testcase>
    Then all the entered details should be displayed as filled on Edit without group reset for product as Corporate Channels with enrichment details <testcase>
    And party hierarchy as Customer Group on Edit <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as Yes
      And selects the Ultimate Parent Party ID
      And  user goes proceed
    And details for priority and entered remarks should be displayed as filled in the fields
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      |TestCase_187|

    Scenario Outline: Create an application with 2products as Corporate Channels and Revenue Management with enrichment details for customer group hierarchy
      Given a product onboarding application which is at Input stage
      And a product onboarding web portal for OPMAKER role
      When staff user logs in with the role
      When user selects the new application
      And  user fills new  application with the basic & party & address & contact details <testcase>
      And selects product as Corporate Channels with enrichment details <testcase>
      And selects product as Revenue Management <testcase>
      And user chooses party hierarchy group as Customer Group <testcase>
      And selects 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as Yes
      And user fills the parent party group details for customer group
      And  user goes proceed
      And user selects priority and enter remarks
      Then application should be created successfully on submit and confirm app
      And application should be at Approve stage
      Examples:
        | testcase |
        | TestCase_003|

  Scenario: Approve a product onboarding application
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
    Then party group, party provision and party enrichment for Corporate Channel APIs should be visible


  Scenario Outline: Verify the completed stage of a product onboarding application
    Given a product onboarding which is at Handoff stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And user post the request id for party group ,party provision and party enrichment integration api <testcase>
    And selects the application from Completed App menu
    Then party group, party provision and party enrichment for Corporate Channel APIs should be visible
    Examples:
      | testcase |
      |TestCase_001|

  Scenario Outline: Create an application with 2products as Corporate Channels and Revenue Management with enrichment details for customer group hierarchy
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Corporate Channels with enrichment details <testcase>
    And selects product as Revenue Management <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as Yes
    And user fills the parent party group details for customer group
    And  user goes proceed
    And user selects priority and enter remarks
    Then user cancels and save filled application

    Examples:
      | testcase |
      | TestCase_185|

  Scenario Outline: Verify data on view of full application for the saved application with 2 products as Corporate Channels & Revenue Management with enrichment details for customer Hierarchy
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And user selects View application at input stage
    Then all the entered details till contact details as filled in the fields should be displayed on view of full application <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Revenue management with enrichment details <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Corporate Channels with enrichment details <testcase>
    And party hierarchy as Customer Group on view of full application <testcase>
    And filled parent party group details for customer group should be displayed on view
    And details on view of full application for priority and entered remarks should be displayed as filled in the fields
    Examples:
      | testcase |
      | TestCase_185|

  Scenario Outline: Verify data on edit of the saved application with 2 products as Corporate Channels & Revenue Management with enrichment details for customer group hierarchy
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Edit button
    Then all the entered details till contact details should be displayed as filled in the fields <testcase>
    Then all the entered details should be displayed as filled on Edit without group reset for product as Revenue Manangement with enrichment details <testcase>
    Then all the entered details should be displayed as filled on Edit without group reset for product as Corporate Channels with enrichment details <testcase>
    And party hierarchy as Customer Group on Edit <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as Yes
    And user fills the parent party group details for customer group
    And details for priority and entered remarks should be displayed as filled in the fields
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      |TestCase_185|

  Scenario Outline: Create an application with  2products and enrichment details
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Corporate Channels with enrichment details <testcase>
    And selects product as Revenue Management <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as No
    And chooses Parent Group
    And  user goes proceed
    And user selects priority and enter remarks
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      |TestCase_004|

  Scenario: Approve a product onboarding application
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
    Then party provision and party enrichment for Corporate Channels APIs should be visible

  Scenario Outline: Verify the completed stage of a product onboarding application
    Given a product onboarding which is at Handoff stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And user post the request id for provision and enrichment integration api <testcase>
    And selects the application from Completed App menu
    Then party provision and party enrichment for Corporate Channels APIs should be visible
    Examples:
      | testcase |
      |TestCase_001|

  Scenario Outline: Create an application with  2products and enrichment details
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Corporate Channels with enrichment details <testcase>
    And selects product as Revenue Management <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as No
    And chooses Parent Group
    And  user goes proceed
    And user selects priority and enter remarks
    Then user cancels and save filled application

    Examples:
      | testcase |
      | TestCase_186|

  Scenario Outline: Verify data on view of full application for the saved application with 2 products as Corporate Channels & Revenue Management with enrichment details for customer grp Hierarchy
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And user selects View application at input stage
    Then all the entered details till contact details as filled in the fields should be displayed on view of full application <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Revenue management with enrichment details <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Corporate Channels with enrichment details <testcase>
    And party hierarchy as Customer Group on view of full application <testcase>
    And details on view of full application for priority and entered remarks should be displayed as filled in the fields
    Examples:
      | testcase |
      | TestCase_186|

  Scenario Outline: Verify data on edit of the saved application with 2 products as Corporate Channels & Revenue Management with enrichment details for Customer group hierarchy
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Edit button
    Then all the entered details till contact details should be displayed as filled in the fields <testcase>
    Then all the entered details should be displayed as filled on Edit without group reset for product as Revenue Manangement with enrichment details <testcase>
    Then all the entered details should be displayed as filled on Edit without group reset for product as Corporate Channels with enrichment details <testcase>
    And party hierarchy as Customer Group on Edit <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as No
    And chooses Parent Group
    And details for priority and entered remarks should be displayed as filled in the fields
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      |TestCase_186|

  Scenario Outline: Create an application with 2 products as Corporate Channels and Revenue Management with enrichment details for customer group hierarchy
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Corporate Channels with enrichment details <testcase>
    And selects product as Revenue Management <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as Yes
    And user fills the parent party group details for customer group
    And  user goes proceed
    And user selects priority and enter remarks
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      | TestCase_003|

  Scenario: Approve a product onboarding application
    Given a product onboarding application which is at Approve stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Assign To Me button and add reject remarks
    Then application should be rejected successfully on click of reject button

