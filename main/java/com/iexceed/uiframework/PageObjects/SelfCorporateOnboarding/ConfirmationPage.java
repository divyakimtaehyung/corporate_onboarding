package com.iexceed.uiframework.PageObjects.SelfCorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ConfirmationPage extends TestBase {

    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__companyType_txtcnt")
    WebElement companyType;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__registeredName_txtcnt")
    WebElement businessName;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__registeredNumber_txtcnt")
    WebElement registeredNumber;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__tradingName_txtcnt")
    WebElement tradingName;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__industryType_txtcnt")
    WebElement industryType;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__hmrcnum_txtcnt")
    WebElement hmrcNumber;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__countryname_txtcnt")
    WebElement country_name;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__numberOfYearsInBusiness_txtcnt")
    WebElement numberOfYrs;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__lastFinanicialYearTurnOver_txtcnt")
    WebElement turnOverLastFinancialYr;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__lastFinanicialYearTurnOver_txtcnt")
    WebElement turnOverLastFinancialYrlmt;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__thisYearTurnOver_txtcnt")
    WebElement turnOverCurrentFinancialYr;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__thisYearTurnOver_txtcnt")
    WebElement turnOverCurrentFinancialYrlmt;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__businessOutsideUk_txtcnt") //No
    WebElement businessOutsideUkNo;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__telephoneNumber_txtcnt")
    WebElement telephoneNumber;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__mobileNo_txtcnt")
    WebElement mobileNumber;
    @FindBy(id = "onboar__corporateconfirmation__i__companydetails__email_txtcnt")
    WebElement enteredEmail;

    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__Role_0_txtcnt")
    WebElement role;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__Role_2_txtcnt")
    WebElement role_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__percentageOfShare_2_txtcnt")
    WebElement holdingPercentage;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__title_0_txtcnt")
    WebElement name;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__title_2_txtcnt")
    WebElement name_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__dob_0_txtcnt")
    WebElement dob;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__nationalityDesc_0_txtcnt")
    WebElement nationality;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__nationalityDesc_2_txtcnt")
    WebElement nationality_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__gender_0_txtcnt")
    WebElement gender;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__gender_2_txtcnt")
    WebElement gender_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__maritalStatus_0_txtcnt")
    WebElement maritalStatus;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__maritalStatus_2_txtcnt")
    WebElement maritalStatus_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__placeOfBirth_0_txtcnt")
    WebElement placeOfBirth;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__placeOfBirth_2_txtcnt")
    WebElement placeOfBirth_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__telephoneNumber_0_txtcnt")
    WebElement telephone_Number1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__telephoneNumber_2_txtcnt")
    WebElement telephone_Number_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__mobileNo_0_txtcnt")
    WebElement mobile_Number1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__mobileNo_2_txtcnt")
    WebElement mobile_Number_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__personalemail_0_txtcnt")
    WebElement personalEmail;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__personalemail_2_txtcnt")
    WebElement personal_Email_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__doctype_0_txtcnt")
    WebElement identification;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__ukPassport1_0_txtcnt")
    WebElement passportDetails;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__ukPassport2_0_txtcnt")
    WebElement passport_Details;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__ukDl_0_txtcnt")
    WebElement drivinglicenseNumber;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__ukDlPostcode_0_txtcnt")
    WebElement licensepostCode;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__ukDl_2_txtcnt")
    WebElement drivinglicenseNumber_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__ukDlPostcode_2_txtcnt")
    WebElement licensepostCode_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__employementStatus_0_txtcnt")
    WebElement employmentStatus;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__employementStatus_2_txtcnt")
    WebElement employmentStatus_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__natureOfBusiness_0_txtcnt")
    WebElement lineOfBusiness;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__nameOfEmployer_0_txtcnt")
    WebElement employerName;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__postcodeOfEmployer_0_txtcnt")
    WebElement postCode1Employer;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__ukPassportExpiryDt_0_txtcnt")
    WebElement expiryDate;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__ukPassportExpiryDt_2_txtcnt")
    WebElement expiryDate_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__grossAnnualIncome_0_txtcnt")
    WebElement annualIncome;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__sourceOfIncome_0_txtcnt")
    WebElement sourceOfIncome;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__grossAnnualIncome_2_txtcnt")
    WebElement annual_Income_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__sourceOfIncome_2_txtcnt")
    WebElement sourceOfIncome_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__taxResidentToUs_0_txtcnt")
    WebElement USTaxResident;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__taxResidentToUs_2_txtcnt")
    WebElement USTaxResident_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__tinNumber_0_txtcnt")
    WebElement tinNumber;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__taxResidentToUk_0_txtcnt")
    WebElement UKTaxResident;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__taxResidentToUk_2_txtcnt")
    WebElement UKTaxResident_1;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__niNumber_0_txtcnt")
    WebElement niNumber;
    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__payingTaxToOtherCountry_0_txtcnt")
    WebElement otherCountryResident;

    @FindBy(id = "onboar__corporateconfirmation__i__stakeholderdetails__payingTaxToOtherCountry_2_txtcnt")
    WebElement otherCountryResident_1;
    @FindBy(xpath = "//*[@id='onboar__corporate__alltaxliabilty_0_txtcnt']/span[1]/span[2]/p")
    WebElement country_name1;
    @FindBy(xpath = "//*[@id='onboar__corporate__alltaxliabilty_0_txtcnt']/span[3]/span[2]/p")
    WebElement remarks;
    @FindBy(id = "onboar__corporate__el_btn_7")
    WebElement confirmBtn;

    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;

    public ConfirmationPage() {
        PageFactory.initElements(driver, this);
        waitUtility = new WaitUtility();
        javaScriptControls = new JavaScriptControls(driver);
    }

    public void checkAllEneteredData(String businessName1, String industryType1, String NumberOfYrsInBusiness, String TurnoverLastFinancialYr, String TurnoverCurrentFinancialYr, String TelephoneNumber, String MobileNumber, String PostalCode, String title, String firstName, String middleName, String lastName, String DateOfBirth, String gender1, String maritalStatus1, String nationality1, String placeOfBirth1, String postCode1, String year1, String month1, String telephoneNumber1, String mobileNumber1, String personalEmail1, String licenseNumber1, String licensepostCode1, String employementStatus1, String annualIncome1, String sourceOfIncome1) throws Exception {
        CompanyDetailsPage companyDetailsPage = new CompanyDetailsPage();
        CompanyTypeSelectionPage companyTypeSelectionPage = new CompanyTypeSelectionPage();
        waitUtility.waitForSeconds(10);
        waitUtility.waitTillElementVisible(driver, companyType, 30);
        checkFieldsData(companyType.getText(), companyTypeSelectionPage.companyType);
        checkFieldsData(businessName.getText(), companyDetailsPage.businessNameFinal);
        checkFieldsData(industryType.getText(), industryType1);
        checkFieldsData(numberOfYrs.getText(), NumberOfYrsInBusiness);
        checkFieldsData(removeCommaInAmountField(turnOverLastFinancialYr.getText()), TurnoverLastFinancialYr);
        checkFieldsData(removeCommaInAmountField(turnOverCurrentFinancialYr.getText()), TurnoverCurrentFinancialYr);
        checkFieldsData(businessOutsideUkNo.getText(), "No");
        checkFieldsData(removeCountryCodeInPhoneNumber(telephoneNumber.getText()), TelephoneNumber);
        checkFieldsData(removeCountryCodeInPhoneNumber(mobileNumber.getText()), MobileNumber);
        if (!(name.getText().equalsIgnoreCase(getRequiredNameFormat(title, firstName, middleName, lastName)))) {
            checkFieldsData(name.getText(), getRequiredNameFormat(title, firstName, middleName, lastName));
        }

        // checkFieldsData(dob.getText(),DateOfBirth);
        checkFieldsData(nationality.getText(), nationality1);
        checkFieldsData(gender.getText(), gender1);
        checkFieldsData(maritalStatus.getText(), maritalStatus1);
        checkFieldsData(placeOfBirth.getText(), placeOfBirth1);
        checkFieldsData(removeCountryCodeInPhoneNumber(telephone_Number1.getText()), telephoneNumber1);
        checkFieldsData(removeCountryCodeInPhoneNumber(mobile_Number1.getText()), mobileNumber1);
        checkFieldsData(personalEmail.getText(), personalEmail1);
        checkFieldsData(drivinglicenseNumber.getText(), licenseNumber1);
        checkFieldsData(licensepostCode.getText(), licensepostCode1);
        checkFieldsData(employmentStatus.getText(), employementStatus1);
        checkFieldsData(removeCommaInAmountField(annualIncome.getText()), annualIncome1);
        checkFieldsData(removeCommaInAmountField(sourceOfIncome.getText()), sourceOfIncome1);
        checkFieldsData(USTaxResident.getText(), "No");
        checkFieldsData(UKTaxResident.getText(), "No");
        checkFieldsData(otherCountryResident.getText(), "No");
    }

    public void checkAllEnteredDataLLP(String registeredNumber1,String industryType1, String TurnoverLastFinancialYr, String TurnoverCurrentFinancialYr, String TelephoneNumber, String MobileNumber, String role1, String title, String firstName, String middleName, String lastName, String dateOfBirth1, String gender1, String maritalStatus1, String nationality1, String placeOfBirth1, String telephoneNumber1, String mobileNumber1, String personalEmail1, String licenseNumber1, String licensepostCode1, String employementStatus1, String annualIncome1, String sourceOfIncome1) throws Exception {
        CompanyDetailsPage companyDetailsPage = new CompanyDetailsPage();
        CompanyTypeSelectionPage companyTypeSelectionPage = new CompanyTypeSelectionPage();
        waitUtility.waitTillElementVisible(driver, companyType, 30);
        checkFieldsData(companyType.getText(), companyTypeSelectionPage.companyType);
        checkFieldsData(registeredNumber.getText(), registeredNumber1);
        checkFieldsData(industryType.getText(), industryType1);
        checkFieldsData(removeCommaInAmountField(turnOverLastFinancialYrlmt.getText()), TurnoverLastFinancialYr);
        checkFieldsData(removeCommaInAmountField(turnOverCurrentFinancialYrlmt.getText()), TurnoverCurrentFinancialYr);
        checkFieldsData(businessOutsideUkNo.getText(), "No");
        checkFieldsData(removeCountryCodeInPhoneNumber(telephoneNumber.getText()), TelephoneNumber);
        checkFieldsData(removeCountryCodeInPhoneNumber(mobileNumber.getText()), MobileNumber);
        checkFieldsData(removeCountryCodeInPhoneNumber(role_1.getText()), role1);
       // if (!(name_1.getText().equalsIgnoreCase(getRequiredNameFormat(title, firstName, middleName, lastName)))) {
        //    checkFieldsData(name_1.getText(), getRequiredNameFormat(title, firstName, middleName, lastName));
        //}
        // checkFieldsData(dob.getText(),DateOfBirth);
        checkFieldsData(nationality_1.getText(), nationality1);
        checkFieldsData(gender_1.getText(), gender1);
        checkFieldsData(maritalStatus_1.getText(), maritalStatus1);
        checkFieldsData(placeOfBirth_1.getText(), placeOfBirth1);
        checkFieldsData(removeCountryCodeInPhoneNumber(telephone_Number_1.getText()), telephoneNumber1);
        checkFieldsData(removeCountryCodeInPhoneNumber(mobile_Number_1.getText()), mobileNumber1);
        checkFieldsData(personal_Email_1.getText(), personalEmail1);
        checkFieldsData(drivinglicenseNumber_1.getText(), licenseNumber1);
        checkFieldsData(licensepostCode_1.getText(), licensepostCode1);
        checkFieldsData(employmentStatus_1.getText(), employementStatus1);
        checkFieldsData(removeCommaInAmountField(annual_Income_1.getText()), annualIncome1);
        checkFieldsData(removeCommaInAmountField(sourceOfIncome_1.getText()), sourceOfIncome1);
        checkFieldsData(USTaxResident_1.getText(), "No");
        checkFieldsData(UKTaxResident_1.getText(), "No");
        checkFieldsData(otherCountryResident_1.getText(), "No");
    }

    public void checkEnteredDataLimited(String registeredNumber1,String industryType1, String TurnoverLastFinancialYr, String TurnoverCurrentFinancialYr, String TelephoneNumber, String MobileNumber, String role1, String shareholdingPercentage1, String title, String firstName, String middleName, String lastName, String dateOfBirth1, String gender1, String maritalStatus1, String nationality1, String placeOfBirth1, String telephoneNumber1, String mobileNumber1, String personalEmail1, String licenseNumber1, String licensepostCode1, String employementStatus1, String annualIncome1, String sourceOfIncome1) throws Exception {
        checkFieldsData(holdingPercentage.getText(), shareholdingPercentage1+"%");
        checkAllEnteredDataLLP(registeredNumber1,industryType1,TurnoverLastFinancialYr,TurnoverCurrentFinancialYr,TelephoneNumber,MobileNumber,role1,title,firstName,middleName,lastName,dateOfBirth1,gender1,maritalStatus1,nationality1,placeOfBirth1,telephoneNumber1,mobileNumber1,personalEmail1,licenseNumber1,licensepostCode1,employementStatus1,annualIncome1,sourceOfIncome1);
    }

    public void checkAllEneteredDataPartnership(String tradingName1, String industryType1, String numberOfYrsInBusiness1, String turnoverLastFinancialYr1, String turnoverCurrentFinancialYr1, String hmrcNumber1, String businessOutsideUK1, String countryName1, String telephoneNumber1, String mobileNumber1, String role1, String title1, String firstName1, String middleName1, String lastName1, String dateOfBirth1, String maritalStatus1, String nationality11, String placeOfBirth11, String telephoneNumber2, String mobileNumber2, String personalEmail11, String identification1, String passportDetails1, String expiryDate1, String employementStatus11, String lineOfBusiness1, String employerName1, String postCode1OfEmployer1, String annualIncome11, String sourceOfIncome11, String uKTaxResident1, String nINumber1, String uSTaxResident1, String taxIDNumber1, String otherCountryTaxResident1, String countryNameTax1, String remarks1) {
        CompanyDetailsPage companyDetailsPage = new CompanyDetailsPage();
        CompanyTypeSelectionPage companyTypeSelectionPage = new CompanyTypeSelectionPage();
        waitUtility.waitTillElementVisible(driver, companyType, 30);
        checkFieldsData(companyType.getText(), companyTypeSelectionPage.companyType);
        checkFieldsData(businessName.getText(), companyDetailsPage.businessNameFinal);
        checkFieldsData(tradingName.getText(), tradingName1);
        checkFieldsData(industryType.getText(), industryType1);
        checkFieldsData(numberOfYrs.getText(), numberOfYrsInBusiness1);
        checkFieldsData(removeCommaInAmountField(turnOverLastFinancialYr.getText()), turnoverLastFinancialYr1);
        checkFieldsData(removeCommaInAmountField(turnOverCurrentFinancialYr.getText()), turnoverCurrentFinancialYr1);
        checkFieldsData(hmrcNumber.getText(), hmrcNumber1);
        checkFieldsData(businessOutsideUkNo.getText(), businessOutsideUK1);
        checkFieldsData(country_name.getText(), countryName1);
        checkFieldsData(removeCountryCodeInPhoneNumber(telephoneNumber.getText()), telephoneNumber1);
        checkFieldsData(removeCountryCodeInPhoneNumber(mobileNumber.getText()), mobileNumber1);
        checkFieldsData(role.getText(), role1);


        // checkFieldsData(dob.getText(),DateOfBirth);
        checkFieldsData(nationality.getText(), nationality11);
        checkFieldsData(maritalStatus.getText(), maritalStatus1);
        checkFieldsData(placeOfBirth.getText(), placeOfBirth11);
        checkFieldsData(removeCountryCodeInPhoneNumber(telephone_Number1.getText()), telephoneNumber2);
        checkFieldsData(removeCountryCodeInPhoneNumber(mobile_Number1.getText()), mobileNumber2);
        checkFieldsData(personalEmail.getText(), personalEmail11);
        checkFieldsData(identification.getText(), identification1);
        checkFieldsData(getRequiredPassportNumber(passportDetails.getText(),passport_Details.getText()), passportDetails1);
        checkFieldsData(employmentStatus.getText(), employementStatus11);
        checkFieldsData(lineOfBusiness.getText(), lineOfBusiness1);
        checkFieldsData(employerName.getText(), employerName1);
        checkFieldsData(postCode1Employer.getText(), postCode1OfEmployer1);
        checkFieldsData(removeCommaInAmountField(annualIncome.getText()), annualIncome11);
        checkFieldsData(removeCommaInAmountField(sourceOfIncome.getText()), sourceOfIncome11);
        checkFieldsData(USTaxResident.getText(), uSTaxResident1);
        checkFieldsData(tinNumber.getText(), taxIDNumber1);
        checkFieldsData(UKTaxResident.getText(), uKTaxResident1);
        checkFieldsData(niNumber.getText(), nINumber1);
        checkFieldsData(otherCountryResident.getText(), otherCountryTaxResident1);

        checkFieldsData(remarks.getText(), remarks1);
        if(!(name.getText().equalsIgnoreCase(getRequiredNameFormat(title1,firstName1,middleName1,lastName1)))){
            checkFieldsData(name.getText(),getRequiredNameFormat(title1,firstName1,middleName1,lastName1));
        }
        checkFieldsData(country_name1.getText(), countryNameTax1);
    }

    public void checkFieldsData(String actualData, String expectedData) {
        Assert.assertEquals(actualData, expectedData);
    }

    public void clickOnConfirmBtn() throws Exception {
        waitUtility.waitTillElementVisible(driver, confirmBtn, 30);
        javaScriptControls.executeJavaScript("arguments[0].click();", confirmBtn);
    }

    public String removeCommaInAmountField(String amountField) {
        amountField = amountField.replaceAll("[,.]", "").replaceAll("00$", "");
        return amountField;
    }

    public String removeCountryCodeInPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber.replaceAll("[+]44 ", "");
        return phoneNumber;
    }

    public String getRequiredNameFormat(String title, String firstName, String middleName, String lastName) {
        String name = title + " " + firstName + " " + middleName + " " + lastName;
        return name;
    }

    public String getRequiredPassportNumber(String passport1,String passport2) {
        passport2 = passport2.replaceAll("<<<<<<<<<<<<<<","");
        return passport1+passport2;

    }



}
