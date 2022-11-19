@api
Feature: Validating the fields in Upstream API
  Scenario Outline: Validate companyShortName in Upstream API and accepts alphanumeric with symbols max 15 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in companyShortName field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_001|
      | TestCase_002 |

  Scenario Outline: Validate corporateEntityName is a mandatory field in Upstream API and accepts alphanumeric with symbols max 35 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in corporateEntityName field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_003 |
      | TestCase_004 |


  Scenario Outline: Validate primaryBankEntity is a mandatory field in Upstream API and accepts max 8 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in primaryBankEntity field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_005 |
      | TestCase_006 |

  Scenario Outline: Validate homeCountry is a mandatory field in Upstream API and country should be 2 digit ISO code
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in homeCountry field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_007 |
      | TestCase_008 |

  Scenario Outline: Validate primaryOperatingCurrency is a mandatory field in Upstream API and currency should be 3 digit ISO code
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in primaryOperatingCurrency field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_009 |
      | TestCase_010 |

  Scenario Outline: Validate legalEntityType is a mandatory field in Upstream API and non existing legalEntityType
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in legalEntityType field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_011 |
      | TestCase_012 |

  Scenario Outline: Validate typeOfIndustry in Upstream API accepts max 50 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in typeOfIndustry field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_013 |

  Scenario Outline: Validate typeOfIndustry is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in typeOfIndustry field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_014 |

  Scenario Outline: Validate sicCode is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in sicCode field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_015 |

  Scenario Outline: Validate licenseType is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in licenseType field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_016 |

  Scenario Outline: Validate licenseNo in Upstream API accepts alphanumeric max 20 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in licenseNo field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_017 |

  Scenario Outline: Validate licenseNo is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in licenseNo field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_018 |

  Scenario Outline: Validate licenseIssuedCountry in Upstream API country should be 2 digit ISO code
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in licenseIssuedCountry field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_019 |

  Scenario Outline: Validate licenseIssuedCountry is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in licenseIssuedCountry field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_020 |

  Scenario Outline: Validate addressLine1 is a mandatory field in Upstream API and accepts alphanumeric with special characters upto 35
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in addressLine1 field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_021 |
      | TestCase_022 |

  Scenario Outline: Validate addressLine2  in Upstream API accepts alphanumeric with special characters upto 35
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in addressLine2 field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_023 |

  Scenario Outline: Validate addressLine2 is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in addressLine2 field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_024 |

  Scenario Outline: Validate addressLine3  in Upstream API accepts alphanumeric with special characters upto 35
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in addressLine3 field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_025 |

  Scenario Outline: Validate addressLine3 is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in addressLine3 field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_026 |

  Scenario Outline:Validate postalCode is a mandatory field in Upstream API and accepts alphanumeric max 10 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in postalCode field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_027 |
      | TestCase_028 |

  Scenario Outline:Validate country is a mandatory field in Upstream API and country should be 2 digit ISO code
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in country field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_029 |
      | TestCase_030 |

  Scenario Outline: Validate state is a mandatory field in Upstream API and accepts max 10 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in state field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_031 |
      | TestCase_032 |

  Scenario Outline: Validate addressLine4  in Upstream API accepts alphanumeric with special characters upto 30
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in addressLine4 field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_033 |

  Scenario Outline: Validate addressLine4 is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in addressLine4 field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_034 |


  Scenario Outline: Validate residentialStatus is a mandatory field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in residentialStatus field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_035 |
      | TestCase_036 |

  Scenario Outline: Validate swiftCode is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in swiftCode field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_037 |

  Scenario Outline: Validate swiftCode  in Upstream API accepts alphanumeric with special characters upto 11
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in swiftCode field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_038 |

  Scenario Outline: Validate swiftAddress1 is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in swiftAddress1 field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_039 |

  Scenario Outline: Validate swiftAddress1 in Upstream API accepts alphanumeric with special characters upto 30
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in swiftAddress1 field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_040 |

  Scenario Outline: Validate swiftAddress2 is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in swiftAddress2 field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_041 |

  Scenario Outline: Validate swiftAddress2 in Upstream API accepts alphanumeric with special characters upto 30
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in swiftAddress2 field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_042 |

  Scenario Outline: Validate swiftAddressCountry is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in swiftAddressCountry field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_043 |

  Scenario Outline: Validate swiftAddressCountry in Upstream API and country should be 2 digit ISO code
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in swiftAddressCountry field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_044 |

  Scenario Outline: Validate swiftAddressState is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in swiftAddressState field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_045 |

  Scenario Outline: Validate title is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in title field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_046 |

  Scenario Outline: Validate fullName is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in fullName field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_047 |

  Scenario Outline: Validate fullName in Upstream API accepts accepts max 35 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in fullName field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_048 |

  Scenario Outline: Validate mobileCode is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in mobileCode field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_049 |

  Scenario Outline: Validate mobileCode in Upstream API accepts max 5 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in mobileCode field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_050 |

  Scenario Outline:Validate mobileNumber is a mandatory field in Upstream API and accepts min 5 and max 20 digits
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in mobileNumber field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_051 |
      | TestCase_052 |

  Scenario Outline: Validate officeCode is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in mobileCode field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_053 |

  Scenario Outline: Validate officeCode in Upstream API accepts max 5 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in mobileCode field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_054 |

  Scenario Outline:Validate officePhoneNo is a mandatory field in Upstream API and accepts min 5 and max 20 digits
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in mobileNumber field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_055 |
      | TestCase_056 |

  Scenario Outline: Validate faxNumber is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in faxNumber field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_057 |

  Scenario Outline: Validate faxNumber in Upstream API accepts min 5 characters and max 20 digits
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in faxNumber field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_058 |
      | TestCase_059 |

  Scenario Outline: Validate correspondenceLanguage is a mandatory field in Upstream API and  should be 2 digit ISO code
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in correspondenceLanguage field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_060 |
      | TestCase_061 |

  Scenario Outline: Validate email is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in email field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_062 |

  Scenario Outline: Validate email in Upstream API and accepts max 80 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in email field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_063 |

  Scenario Outline: Validate companyWebsite is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in companyWebsite field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_064 |

  Scenario Outline: Validate companyWebsite in Upstream API and accepts max 40 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in companyWebsite field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_065 |

  Scenario Outline: Validate taxId is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in taxId field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_066 |

  Scenario Outline: Validate taxId in Upstream API and accepts max 9 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in taxId field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_067 |
      | TestCase_068 |

  Scenario Outline:Validate taxCountry is a mandatory field in Upstream API and country should be 2 digit ISO code
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in country field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_069 |
      | TestCase_070 |

  Scenario Outline: Validate agreementReference is an optional field in Upstream API
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in taxId field
    Then I receive http error code
    And application should be saved successfully
    Examples:
      | testcase |
      | TestCase_071 |

  Scenario Outline: Validate agreementReference in Upstream API and accepts max 34 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in taxId field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_072 |


  Scenario Outline:Validate riskCountry is a optional field in Upstream API and country should be 2 digit ISO code
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in country field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_073 |

  Scenario Outline:Validate rmName is a optional field in Upstream API and accepts max 20 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in rmName field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_074 |

  Scenario Outline:Validate activationDate is a mandatory field in Upstream API and accepts ISO 8601 date format
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in activationDate field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_075 |
      | TestCase_076 |

  Scenario Outline:Validate remarks is a mandatory field in Upstream API and accepts max 150 characters
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in remarks field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_077 |
      | TestCase_078 |

  Scenario Outline:Validate operationalUnit is a mandatory field in Upstream API and invalid operational unit
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in operationalUnit field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_079 |

  Scenario Outline:Validate source is a mandatory field in Upstream API and invalid source unit
    Given a party-onboarding POST API endpoint <testcase>
    When I set the header params
    And sends the Upstream API request body with invalid data in source field
    Then I receive http error code
    And proper error message is displayed
    Examples:
      | testcase |
      | TestCase_080 |
      | TestCase_081 |