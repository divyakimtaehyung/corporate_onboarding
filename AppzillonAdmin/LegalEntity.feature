@LegalFunctionalTest
Feature: Creating Legal Entities by admin

  Scenario Outline: Validate Legal Entity Id is a mandatory field and case insensitive and unique and accepts alphanumeric with special characters upto 32
    Given a valid admin portal
    When admin enters login credentials
    And selects Bank Parameters > Legal Entity Maintenance menu
    And clicks on +ADD NEW button
    And enters all legal entity details <testcase>
    But invalid data in Legal Entity Id field
    And click on SAVE button
    Then error message should display
    Examples:
      | testcase     |
      | TestCase_001 |
      | TestCase_002 |
      | TestCase_002 |
      | TestCase_003 |


  Scenario Outline: Validate Legal Entity Name is a mandatory field and accepts alphanumeric with special characters upto 100
    Given a valid admin portal
    When admin enters login credentials
    And selects Bank Parameters > Legal Entity Maintenance menu
    And clicks on +ADD NEW button
    And enters all legal entity details <testcase>
    But invalid data in Legal Entity Name field
    And click on SAVE button
    Then error message should display
    Examples:
      | testcase     |
      | TestCase_004 |
      | TestCase_005 |


  Scenario Outline: Validate Operation Unit is a mandatory field
    Given a valid admin portal
    When admin enters login credentials
    And selects Bank Parameters > Legal Entity Maintenance menu
    And clicks on +ADD NEW button
    And enters all legal entity details <testcase>
    But no data in Operation Unit field
    And click on SAVE button
    Then error message should display
    Examples:
      | testcase     |
      | TestCase_009 |

  Scenario Outline: Validate Countries is a mandatory field
    Given a valid admin portal
    When admin enters login credentials
    And selects Bank Parameters > Legal Entity Maintenance menu
    And clicks on +ADD NEW button
    And enters all legal entity details <testcase>
    But no data in Countries field
    And click on SAVE button
    Then error message should display
    When clicks on Link Branches hyperlink
    Then error message should display
    When clicks on + symbol in the country row
    Then error message should display
    But same country can not be selected twice
    And atleast one country should be default
    Examples:
      | testcase     |
      | TestCase_010 |

  Scenario Outline: Validate that it is mandatory to link branch(es) with a country for a legal entity
    Given a valid admin portal
    When admin enters login credentials
    And selects Bank Parameters > Legal Entity Maintenance menu
    And clicks on +ADD NEW button
    And enters all legal entity details <testcase>
    And selects a Country
    Then clicks on Link Branches hyperlink
    And clicks on SAVE button in branch screen
    Then error message should display
    And multiple branches can be added by click on + symbol
    But an error should be displayed when branches are left blank
    Examples:
      | testcase     |
      | TestCase_010 |


  Scenario Outline: Adding a legal entity
    Given a valid admin portal
    When admin enters login credentials
    And selects Bank Parameters > Legal Entity Maintenance menu
    And clicks on +ADD NEW button
    And enters all legal entity details <testcase>
    And enters country and branch details
    And click on SAVE button
    Then legal entity should be created successfully
    And pending for authorization
    And proper Legal Entity Id, Legal Entity Name and Operational Unit should display in Query Result
    Examples:
      | testcase     |
      | TestCase_009 |

  Scenario: Approve a legal entity
    Given a valid admin portal
    When adminauth enters login credentials
    And selects Bank Parameters > Legal Entity Maintenance menu
    And clicks on Legal Entity Id hyperlink which is Authorization Pending
    And clicks on AUTHORIZE button of legal entity
    Then legal entity should be authorized successfully


  Scenario Outline: Searching for legal entity by providing Legal Entity Name
    Given a valid admin portal
    When adminauth enters login credentials
    And selects Bank Parameters > Legal Entity Maintenance menu
    And enters Legal Entity Name in the Query Criteria section <testcase>
    And clicks on SEARCH button
    Then related all legal entity(s) details should populate in the Query Result section
    And search on Legal Entity Name should be case sensitive
    Examples:
      | testcase     |
      | TestCase_014 |

  Scenario Outline: Searching for legal entity by providing Operational Unit
    Given a valid admin portal
    When adminauth enters login credentials
    And selects Bank Parameters > Legal Entity Maintenance menu
    And enters Operational Unit in the Query Criteria section <testcase>
    And clicks on SEARCH button
    Then related all legal entity(s) details should populate in the Query Result section
    Examples:
      | testcase      |
      | TestCase_015 |