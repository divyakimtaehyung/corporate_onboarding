@sanity
Feature: Onboard a product onboarding application with 2 products FCC&FCM Without Enrichment and hierarchy as Customer Group

  Scenario Outline: Create an application with 2 products FCC&FCM and Without enrichment details
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Cash Management without enrichment details <testcase>
    And selects product as Corporate Channels without enrichment details <testcase>
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


  Scenario: View the no of APIs at Handoff stage of a product onboarding application
    Given a product onboarding which is at Handoff stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on View Handoff Status button
    Then party APIs should be visible


  Scenario Outline: Verify the completed stage of a product onboarding application
    Given a product onboarding which is at Handoff stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And user post the 1request id for integration api <testcase>
    And selects the application from Completed App menu
    Then party APIs should be visible
    Examples:
      | testcase |
      |TestCase_001|


  Scenario Outline: Create an application with 2 products FCC&FCM and Without enrichment details
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Cash Management without enrichment details <testcase>
    And selects product as Corporate Channels without enrichment details <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as No
    And chooses Parent Group fill details
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

  Scenario: View the no of APIs at Handoff stage of a product onboarding application
    Given a product onboarding which is at Handoff stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on View Handoff Status button
    Then party APIs should be visible


  Scenario Outline: Verify the completed stage of a product onboarding application
    Given a product onboarding which is at Handoff stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And user post the 1request id for integration api <testcase>
    And selects the application from Completed App menu
    Then party APIs should be visible
    Examples:
      | testcase |
      |TestCase_001|


  Scenario Outline: Create an application with 2 products FCC&FCM and Without enrichment details
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Cash Management without enrichment details <testcase>
    And selects product as Corporate Channels without enrichment details <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as Yes
    And chooses Parent Group fill details
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

  Scenario: View the no of APIs at Handoff stage of a product onboarding application
    Given a product onboarding which is at Handoff stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on View Handoff Status button
    Then party APIs should be visible


  Scenario Outline: Verify the completed stage of a product onboarding application
    Given a product onboarding which is at Handoff stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And user post the 1request id for integration api <testcase>
    And selects the application from Completed App menu
    Then party APIs should be visible
    Examples:
      | testcase |
      |TestCase_001|

  Scenario Outline: Create an application with 2 products FCC&FCM and Without enrichment details hierarchy group as Customer Group 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as Yes
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Cash Management without enrichment details <testcase>
    And selects product as Corporate Channels without enrichment details <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as Yes
    And user fills the parent party group details for customer group
    And user selects priority and enter remarks
    Then user cancels and save filled application
    Examples:
      | testcase |
      |TestCase_185|


  Scenario Outline: Verify data on edit of the saved application with 2 products FCC&FCM with enrichment details for customer group hierarchy 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as Yes
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Edit button
    Then all the entered details till contact details should be displayed as filled in the fields <testcase>
    Then all the entered details should be displayed as Filled on Edit for Product as Cash Management without enrichment details <testcase>
    Then all the entered details should be displayed as Filled on Edit for Product as Corporate Channels without enrichment details <testcase>
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

  Scenario Outline: Verify data on view of full application for the saved application with all 4 products with enrichment details for Parent Hierarchy 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as Yes
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from Other Application Queue tab
    And clicks on view full Other application
    Then all the entered details till contact details as filled in the fields should be displayed on view of full application <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Cash Management without enrichment details <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Corporate Channels without enrichment details <testcase>
    And party hierarchy as Customer Group on view of full application <testcase>
#    And Parent Party ID on view of application
#    And filled parent party group details for customer group should be displayed on view
    And details on view of full application for priority and entered remarks should be displayed as filled in the fields
    Examples:
      | testcase |
      |TestCase_185|



  Scenario Outline: Create an application with 2 products FCC&FCM and Without enrichment details with customer grp hierarchy Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as No
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Cash Management without enrichment details <testcase>
    And selects product as Corporate Channels without enrichment details <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as No
    And chooses Parent Group fill details
    And user selects priority and enter remarks
    Then user cancels and save filled application
    Examples:
      | testcase |
      |TestCase_186|

  Scenario Outline: Verify data on edit of the saved application with product all 4 products with enrichment details for Customer group hierarchy Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as No
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Edit button
    Then all the entered details till contact details should be displayed as filled in the fields <testcase>
    Then all the entered details should be displayed as Filled on Edit for Product as Cash Management without enrichment details <testcase>
    Then all the entered details should be displayed as Filled on Edit for Product as Corporate Channels without enrichment details <testcase>
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

  Scenario Outline: Verify data on view of full application for the saved application with all 4 products with enrichment details for Parent Hierarchy 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as Yes
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from Other Application Queue tab
    And clicks on view full Other application
    Then all the entered details till contact details as filled in the fields should be displayed on view of full application <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Cash Management without enrichment details <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Corporate Channels without enrichment details <testcase>
    And party hierarchy as Customer Group on view of full application <testcase>
#    And Parent Party ID on view of application
#    And filled parent party group details for customer group should be displayed on view
    And details on view of full application for priority and entered remarks should be displayed as filled in the fields
    Examples:
      | testcase     |
      | TestCase_186 |


  Scenario Outline: Create an application with 2 products FCC&FCM and Without enrichment details for customer grp 'Is your Parent a transactional entity?' question as Yes
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Cash Management without enrichment details <testcase>
    And selects product as Corporate Channels without enrichment details <testcase>
    And user chooses party hierarchy group as Customer Group <testcase>
    And selects the Parent Party ID
    And selects the Ultimate Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as Yes
    And chooses Parent Group fill details
    And user selects priority and enter remarks
    Then user cancels and save filled application
    Examples:
      | testcase |
      |TestCase_187|

  Scenario Outline: Verify data on edit of the saved application with product all 4 products with enrichment details for Customer group hierarchy 'Is your Parent a transactional entity?' question as Yes
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Edit button
    Then all the entered details till contact details should be displayed as filled in the fields <testcase>
    Then all the entered details should be displayed as Filled on Edit for Product as Cash Management without enrichment details <testcase>
    Then all the entered details should be displayed as Filled on Edit for Product as Corporate Channels without enrichment details <testcase>
    And party hierarchy as Customer Group on Edit <testcase>
    And selects the Parent Party ID
    And selects 'Is your Parent a transactional entity?' question as Yes
    And chooses Parent Group fill details
    And details for priority and entered remarks should be displayed as filled in the fields
    Then application should be created successfully on submit and confirm app
    And application should be at Approve stage
    Examples:
      | testcase |
      |TestCase_187|

  Scenario Outline: Verify data on view of full application for the saved application with all 4 products with enrichment details for Parent Hierarchy 'Is your Parent a transactional entity?' question as No and selects 'Do you want to create a Party Group for your Parent Entity?' as Yes
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    And selects the application from Other Application Queue tab
    And clicks on view full Other application
    Then all the entered details till contact details as filled in the fields should be displayed on view of full application <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Cash Management without enrichment details <testcase>
    And all the entered details should be displayed as filled on view of full application for product as Corporate Channels without enrichment details <testcase>
    And party hierarchy as Customer Group on view of full application <testcase>
#    And Parent Party ID on view of application
#    And filled parent party group details for customer group should be displayed on view
    And details on view of full application for priority and entered remarks should be displayed as filled in the fields
    Examples:
      | testcase     |
      | TestCase_187 |

  Scenario Outline: Create an application with  2 products FCC&FCM and Without enrichment details
    Given a product onboarding application which is at Input stage
    And a product onboarding web portal for OPMAKER role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new  application with the basic & party & address & contact details <testcase>
    And selects product as Cash Management without enrichment details <testcase>
    And selects product as Corporate Channels without enrichment details <testcase>
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


  Scenario: Reject a product onboarding application
    Given a product onboarding application which is at Approve stage
    And a product onboarding web portal for OPCHECKER role
    When staff user logs in with the role
    And selects the application from My Pending Queue tab
    And clicks on Assign To Me button and add reject remarks
    Then application should be rejected successfully on click of reject button

