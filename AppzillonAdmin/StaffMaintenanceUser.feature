# Commented scenarios validating mandatory fields as their is no proper error message displayed to
  # to validate fields

@StaffFunctionalTest
Feature: Creating staff users by admin

#  Scenario Outline: Validate User Name is a mandatory field and accepts alphanumeric with special characters upto 100
#    Given a valid admin portal
#    When admin enters login credentials '<any>' and '<any>'
#    And selects Bank Parameters > Staff Maintenance menu
#    And clicks on ADD NEW button <testcase>
#    And enters all the staff user details with invalid data in User Name field
#    And clicks on SAVE button
#    Then proper error message should display
#    Examples:
#      | testcase |
#      | TestCase_002|
#      | TestCase_003|

# Below commented testcases are to check mandatory field data, since proper error message is not displaying
  # in UI and this is coded to validate against error message. To generate report below scenarios are commented
#
#  Scenario Outline: Validate User Id is a mandatory field and unique and accepts alphanumeric with special characters upto 100
#    Given a valid admin portal
#    When admin enters login credentials '<any>' and '<any>'
#    And selects Bank Parameters > Staff Maintenance menu
#    And clicks on ADD NEW button <testcase>
#    And enters all the staff user details with invalid data in User Id field
#    And clicks on SAVE button
#    Then proper error message should display
#    Examples:
#      | testcase |
#      | TestCase_004|
#      | TestCase_006|
#      | TestCase_005|
#
#
#  Scenario Outline: Validate Employee ID is a mandatory field and accepts alphanumeric with special characters upto 255
#    Given a valid admin portal
#    When admin enters login credentials '<any>' and '<any>'
#    And selects Bank Parameters > Staff Maintenance menu
#    And clicks on ADD NEW button <testcase>
#    And enters all the staff user details with invalid data in Employee ID field
#    And clicks on SAVE button
#    Then proper error message should display
#    Examples:
#      | testcase |
#      | TestCase_007|
#      | TestCase_008|

#  Scenario Outline: Validate Date Of Birth is a mandatory field and should be minimum 18 years
#    Given a valid admin portal
#    When admin enters login credentials '<any>' and '<any>'
#    And selects Bank Parameters > Staff Maintenance menu
#    And clicks on ADD NEW button <testcase>
#    And enters all the staff user details with invalid data in Date Of Birth field
#    And clicks on SAVE button
#    Then proper error message should display
#    Examples:
#      | testcase |
#      | TestCase_009|
#      | TestCase_010|

  
  Scenario Outline: Validate User Name is a mandatory field and accepts alphanumeric with special characters upto 100
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on ADD NEW button <testcase>
    And enters all the staff user details with invalid data in User Name field
    And clicks on SAVE button
    Then proper error message should display
    Examples:
      | testcase |
#      | TestCase_002|
      | TestCase_003|


  Scenario Outline: Validate User Id is a mandatory field and unique
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on ADD NEW button <testcase>
    And enters all the staff user details with invalid data in User Id field
    And clicks on SAVE button
    Then proper error message should display
    Examples:
      | testcase |
#      | TestCase_004|
      | TestCase_005|

  Scenario Outline: Validate Employee ID is a mandatory field and accepts alphanumeric with special characters upto 255
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on ADD NEW button <testcase>
    And enters all the staff user details with invalid data in Employee ID field
    And clicks on SAVE button
    Then proper error message should display
    Examples:
      | testcase |
#      | TestCase_007|
      | TestCase_008|

  Scenario Outline: Validate Date Of Birth is a mandatory field and should be minimum 18 years
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on ADD NEW button <testcase>
    And enters all the staff user details with invalid data in Date Of Birth field
    And clicks on SAVE button
    Then proper error message should display
    Examples:
      | testcase |
#      | TestCase_009|
#      | TestCase_010|                   //Expected "Age must be atleast 18 yrs" but found "User created successfully"



  Scenario Outline: Validate Mobile Number is a mandatory field and accepts 20 digits
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on ADD NEW button <testcase>
    And enters all the staff user details with invalid data in Mobile Number field
    And clicks on SAVE button
    Then proper error message should display
    Examples:
      | testcase |
#      | TestCase_011|
      | TestCase_012|

  Scenario Outline: Validate Primary Email is a mandatory field and accepts alphanumeric with special characters upto 255 and should be in valid format
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on ADD NEW button <testcase>
    And enters all the staff user details with invalid data in Primary Email field
    And clicks on SAVE button
    Then proper error message should display
    Examples:
      | testcase |
#      | TestCase_027|
      | TestCase_028|
      #| TestCase_029|

#  Scenario Outline: Validate Secondary Email is an optional field and accepts alphanumeric with special characters upto 255 and should be in valid format
#    Given a valid admin portal
#    When admin enters login credentials '<any>' and '<any>'
#    And selects Bank Parameters > Staff Maintenance menu
#    And clicks on ADD NEW button <testcase>
#    And enters all the staff user details with invalid data in Secondary Email field
#    And clicks on SAVE button
#    Then proper error message should display
#    Examples:
#      | testcase |
#      | TestCase_030|
#      | TestCase_031|
#      | TestCase_032|

#  Scenario Outline: Validate Operational Unit is a mandatory field and is a multi-select dropdown
#    Given a valid admin portal
#    When admin enters login credentials '<any>' and '<any>'
#    And selects Bank Parameters > Staff Maintenance menu
#    And clicks on ADD NEW button <testcase>
#    And enters all the staff user details with no data in Operational Unit field
#    And clicks on SAVE button
#    Then proper error message should display
#    Examples:
#      | testcase |
#      | TestCase_024|
#      | TestCase_025|
#
#
#  Scenario Outline: Validate Primary Operational Unit is a mandatory dropdown field and selected Operational Unit only should populate
#    Given a valid admin portal
#    When admin enters login credentials '<any>' and '<any>'
#    And selects Bank Parameters > Staff Maintenance menu
#    And clicks on ADD NEW button <testcase>
#    And enters all the staff user details with no data in Primary Operational Unit field
#    And clicks on SAVE button
#    Then proper error message should display
#    Examples:
#      | testcase |
#      | TestCase_026|
#
#  Scenario Outline: Validate Address Line 1 is a mandatory field and accepts alphanumeric with special characters upto 50
#    Given a valid admin portal
#    When admin enters login credentials '<any>' and '<any>'
#    And selects Bank Parameters > Staff Maintenance menu
#    And clicks on ADD NEW button <testcase>
#    And enters all the staff user details with invalid data in Address Line 1 field
#    And clicks on SAVE button
#    Then proper error message should display
#    Examples:
#      | testcase |
#      | TestCase_013|
#      | TestCase_014|
#
#  Scenario Outline: Validate Address Line 2 is a mandatory field and accepts alphanumeric with special characters upto 50
#    Given a valid admin portal
#    When admin enters login credentials '<any>' and '<any>'
#    And selects Bank Parameters > Staff Maintenance menu
#    And clicks on ADD NEW button <testcase>
#    And enters all the staff user details with invalid data in Address Line 2 field
#    And clicks on SAVE button
#    Then proper error message should display
#    Examples:
#      | testcase |
#      | TestCase_015|
#      | TestCase_016|
#
#  Scenario Outline: Validate Address Line 3 is a mandatory field and accepts alphanumeric with special characters upto 50
#    Given a valid admin portal
#    When admin enters login credentials '<any>' and '<any>'
#    And selects Bank Parameters > Staff Maintenance menu
#    And clicks on ADD NEW button <testcase>
#    And enters all the staff user details with invalid data in Address Line 3 field
#    And clicks on SAVE button
#    Then proper error message should display
#    Examples:
#      | testcase |
#      | TestCase_017|
#      | TestCase_018|
#
  Scenario Outline: Validate Address Line 4 is an optional field and accepts alphanumeric with special characters upto 50
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on ADD NEW button <testcase>
    And enters all the staff user details with invalid data in Address Line 4 field
    And clicks on SAVE button
    Then proper error message should display
    Examples:
      | testcase |
      | TestCase_019|
      | TestCase_020|

#  Scenario Outline: Validate Department is a mandatory dropdown field
#    Given a valid admin portal
#    When admin enters login credentials '<any>' and '<any>'
#    And selects Bank Parameters > Staff Maintenance menu
#    And clicks on ADD NEW button <testcase>
#    And enters all the staff user details with no data in Department field
#    And clicks on SAVE button
#    Then proper error message should display
#    Examples:
#      | testcase |
#      | TestCase_021 |
#
#
#  Scenario Outline: Validate User Status is a mandatory dropdown field
#    Given a valid admin portal
#    When admin enters login credentials '<any>' and '<any>'
#    And selects Bank Parameters > Staff Maintenance menu
#    And clicks on ADD NEW button <testcase>
#    And enters all the staff user details with no data in User Status field
#    And clicks on SAVE button
#    Then proper error message should display
#    Examples:
#      | testcase |
#      | TestCase_022|
#
#
#  Scenario Outline: Validate Language is a mandatory field
#    Given a valid admin portal
#    When admin enters login credentials '<any>' and '<any>'
#    And selects Bank Parameters > Staff Maintenance menu
#    And clicks on ADD NEW button <testcase>
#    And enters all the staff user details with no data in Language field
#    And clicks on SAVE button
#    Then proper error message should display
#    Examples:
#      | testcase |
#      | TestCase_023|


  Scenario Outline: Adding a staff maintenance user providing all the mandatory and non-mandatory field details
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on ADD NEW button <testcase>
    And enters all the staff user details and selects Roles as '<OPMAKER>'
    And clicks on SAVE button
    Then staff user should be created successfully
    And pending for the authorization
    And proper User Id, User Name, Primary Operational Unit, Department and Mobile Number should display in Query Result
    Examples:
      | testcase |
      | TestCase_033|


  Scenario: Same admin user should not be able to add and approve a staff user
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on User Id hyperlink which is Authorization Pending
    And clicks on AUTHORIZE button
    Then staff user should not be authorized


  Scenario Outline: Password Reset of a staff maintenance user who is Authorization Pending and user should not be able to login with new password
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on User Id hyperlink which is Authorization Pending
    And clicks on PASSWORD RESET button <testcase>
    Then a new password should be sent to the Primary Email of the staff user
    And staff user should not be able to login with the new password <testcase>
    Examples:
      | testcase    |
      | TestCase_037|


  Scenario Outline: Approve a staff maintenance user
    Given a valid admin portal
    When admin enters login credentials for Checker '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on User Id hyperlink which is Authorization Pending
    And clicks on AUTHORIZE button
    Then staff user should be authorized successfully <testcase>
    Examples:
      | testcase    |
      | TestCase_036|

  Scenario Outline: Password Reset of added staff maintenance user
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on User Id hyperlink which is Authorized
    And clicks on PASSWORD RESET button <testcase>
    Then a new password should be sent to the Primary Email of the staff user
    And staff user should be able to login with the new password <testcase>
    And change the password
    And login with the new password and verify login
    Examples:
      | testcase    |
      | TestCase_036|


  Scenario Outline: Adding a staff maintenance user providing only mandatory field details
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on ADD NEW button <testcase>
    And enters only the mandatory field details and selects Roles as '<OPCHECKER>'
    And clicks on SAVE button
    Then staff user should be created successfully
    And pending for the authorization
    And admin is able to approve the initiated staff user and change password <testcase>
    Examples:
      | testcase |
      | TestCase_034|


  Scenario: Search a staff maintenance user
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And enters User ID in the Query Criteria section and clicks on SEARCH button
    Then staff user details should populate in the Query Result section
    And search on User ID should be case insensitive


  Scenario Outline: View a staff maintenance user
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And enters User ID in the Query Criteria section and clicks on SEARCH button <testcase>
    Then staff user details should populate in the Query Result section
    And clicks on User Id hyperlink
    Then staff user details should be populated
    Examples:
      | testcase |
      | TestCase_034|


  Scenario Outline: Password Reset of a staff maintenance user
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on User Id hyperlink which is Authorized
    And clicks on PASSWORD RESET button <testcase>
    Then a new password should be sent to the Primary Email of the staff user
    And staff user should be able to login with the new password <testcase>
    And change the password
    And login with the new password and verify login
    Examples:
      | testcase    |
      | TestCase_036|


  Scenario Outline: Edit a staff maintenance user
    Given a valid admin portal
    When admin enters login credentials '<any>' and '<any>'
    And selects Bank Parameters > Staff Maintenance menu
    And clicks on User Id hyperlink
    And clicks on UNLOCK button
    Then User Name should be non editable
    And User Id should be non editable
    And admin should be able to modify any of the staff user details <testcase>
    And staff user details should be modified successfully
    And pending for the authorization
    Examples:
      | testcase |
      | TestCase_035|
