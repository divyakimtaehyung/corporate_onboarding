package com.iexceed.uiframework.PageObjects.SelfCorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.CommonDriver;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.implementations.TextBoxControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PersonalDetailsPage extends TestBase {

    @FindBy(id="onboar__corporate__breadcrumbtext_txtcnt")
    WebElement personalDetails;
    @FindBy(id="onboar__corporate__selectedRole_option_One_span_")
    WebElement shareholder;
    @FindBy(id="onboar__corporate__selectedRole_option_Two_span_")
    WebElement director;
    @FindBy(id="onboar__corporate__selectedRole1_option_Two_span_")
    WebElement partner;
    @FindBy(id="onboar__corporate__selectedRole_option_Three_span_")
    WebElement signatory;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__percentageOfShare")
    WebElement shareholdingPercentage;
    @FindBy(id="onboar__corporate__selectedRole_option_One_span_")
    WebElement role;
    @FindBy(id="onboar__corporate__selectedRole1_option_One_span_")
    WebElement rolePartnership;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__title")
    WebElement title;
    @FindBy(xpath="//div[@id='onboar__corppersonaldetails__i__personaldetails__title_div']/ul/li")
    List<WebElement> titleValue;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__firstName")
    WebElement firstName;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__middleName")
    WebElement middleName;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__lastName")
    WebElement lastName;
    String genderBefore ="onboar__corppersonaldetails__i__personaldetails__gender_option_";
    String genderAfter = "_span_";
    String beforeMaritalStatus = "onboar__corppersonaldetails__i__personaldetails__maritalStatus_option_";
    String afterMaritalStatus = "_span_";

    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__dob_button")
    WebElement dob;
    @FindBy(xpath="//*[@id='ui-datepicker-div']/div/div/select[1]")
    WebElement month;
    @FindBy(xpath="//option[@value='0']")
    WebElement monthValue;
    @FindBy(xpath="//*[@id='ui-datepicker-div']/div/div/select[2]")
    WebElement year;
    @FindBy(xpath="//option[@value='2000']")
    WebElement yearValue;
    @FindBy(className="ui-state-default")  //getText
    List<WebElement> date;

    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__nationalityDesc")
    WebElement nationality;
    @FindBy(xpath="//div[@id='onboar__corppersonaldetails__i__personaldetails__nationalityDesc_div']/ul/li")
    List<WebElement> nationalityValue;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__placeOfBirth")
    WebElement placeOfBirth;
    @FindBy(xpath="//div[@id='onboar__corppersonaldetails__i__personaldetails__placeOfBirth_div']/ul/li")
    List<WebElement> placeOfBirthValue;

    @FindBy(id="onboar__corppersonaldetails__i__addressdetails__postcode_0")
    WebElement postCode;
    @FindBy(id="onboar__corppersonaldetails__i__addressdetails__postcode_0_button")
    WebElement findAddressBtn;
    @FindBy(id="onboar__addressesList__i__addressiffound__addr_0_txtcnt")
    WebElement address;
    @FindBy(id="onboar__personaldetails__yearsdd_0")
    WebElement movingYear;
    @FindBy(xpath="//div[@id='onboar__personaldetails__yearsdd_0_div']/ul/li")
    List<WebElement> yearValues;
    @FindBy(id="onboar__personaldetails__monthsdd_0")
    WebElement movingMonth;
    @FindBy(xpath="//div[@id='onboar__personaldetails__monthsdd_0_div']/ul/li")
    List<WebElement> monthValues;

    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__telephoneNumber")
    WebElement telephoneNumber;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__mobileNo")
    WebElement mobileNumber;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__personalemail")
    WebElement personalEmail;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__ukDl")
    WebElement drivingLicenseNumber;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__doctype_option_PSPRT_span_")
    WebElement ukPassport;
    @FindBy(id="onboar__personaldetails__pass1")
    WebElement passportNumber;

    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__ukDlExpiryDt_button")
    WebElement dob1;
    @FindBy(xpath="//*[@id='onboar__corppersonaldetails__i__personaldetails__ukPassportExpiryDt']")
    WebElement expiryDate_1;
    WebElement month1;
    @FindBy(xpath="//option[@value='0']")
    WebElement monthValue1;//option[text()="Feb"]
    @FindBy(className="ui-datepicker-year")
    WebElement year1;
    @FindBy(xpath="//option[@value='2000']")
    WebElement yearValue1;
    @FindBy(id="//a[text()='1']")
    WebElement date1;

    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__ukDlPostcode")
    WebElement licensePostCode;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__employementStatus")
    WebElement employmentStatus;
    @FindBy(xpath="//div[@id='onboar__corppersonaldetails__i__personaldetails__employementStatus_div']/ul/li")
    List<WebElement> employmentStatusValue;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__natureOfBusiness")
    WebElement lineOfBusiness;
    @FindBy(xpath="//div[@id='onboar__corppersonaldetails__i__personaldetails__natureOfBusiness_div']/ul/li")
    List<WebElement> lineOfBusinessValue;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__nameOfBusiness")
    WebElement nameOfBusiness;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__nameOfEmployer")
    WebElement employerName;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__postcodeOfEmployer")
    WebElement postcodeOfEmployer;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__grossAnnualIncome")
    WebElement annualIncome;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__sourceOfIncome")
    WebElement sourceOfIncome;
    @FindBy(xpath="//div[@id='onboar__corppersonaldetails__i__personaldetails__sourceOfIncome_div']/ul/li")
    List<WebElement> sourceOfIncomeValue;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__serviceYear")
    WebElement movingYear1;
    @FindBy(xpath="//div[@id='onboar__corppersonaldetails__i__personaldetails__serviceYear_div']/ul/li")
    List<WebElement> yearValues1;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__serviceMonth")
    WebElement movingMonth1;
    @FindBy(xpath="//div[@id='onboar__corppersonaldetails__i__personaldetails__serviceMonth_div']/ul/li")
    List<WebElement> monthValues1;

    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__taxResidentToUk_option_N_span_")
    WebElement residentUK;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__taxResidentToUk_option_Y_span_")
    WebElement residentUKYes;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__niNumber")
    WebElement niNumber;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__taxResidentToUs_option_N_span_")
    WebElement residentUS;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__taxResidentToUs_option_Y_span_")
    WebElement residentUSYes;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__tinNumber")
    WebElement taxIDNumber;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__payingTaxToOtherCountry_option_N_span_")
    WebElement otherCountryResident;
    @FindBy(id="onboar__corppersonaldetails__i__personaldetails__payingTaxToOtherCountry_option_Y_span_")
    WebElement otherCountryResidentYes;
    @FindBy(id="onboar__corppersonaldetails__i__taxliability__nameOfCountry_0")
    WebElement countryName;
    @FindBy(xpath="//div[@id='onboar__corppersonaldetails__i__taxliability__nameOfCountry_0_div']/ul/li")
    List<WebElement> countryNameValue;
    @FindBy(id="onboar__corppersonaldetails__i__taxliability__isTaxRefNo_0_option_Y_span_0")
    WebElement doHaveTaxRefNumberYes;
    @FindBy(xpath="//*[@id='onboar__corppersonaldetails__i__taxliability__isTaxRefNo_0_option_N_span_0']")
    WebElement taxRefNumber;
    @FindBy(id="onboar__corppersonaldetails__i__taxliability__reasonForNoTaxRefNo_0")
    WebElement remarks;
    //@FindBy(id="onboar__personaldetails__el_btn_2")
    @FindBy(xpath="//*[@id='onboar__personaldetails__el_btn_2']")
    WebElement continueBtn;
    @FindBy(css=".err-msg")
    WebElement errorMessage;

    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;
    private CommonDriver commonDriver;

    public PersonalDetailsPage(){
        PageFactory.initElements(driver,this);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        javaScriptControls = new JavaScriptControls(driver);
        commonDriver = new CommonDriver(driver);
    }

    public String getPageTitle() throws Exception {
        waitUtility.waitTillElementVisible(driver,firstName,30);
        return personalDetails.getText();
        //return commonDriver.getTitle();
    }

    public void setRole(String role1) throws Exception {
        waitUtility.waitTillElementVisible(driver,lastName,50);
        javaScriptControls.executeJavaScript("arguments[0].click();", rolePartnership);
    }

    public void setTitle(String titleValue1) throws Exception{
        waitUtility.waitTillElementVisible(driver,title,30);
        javaScriptControls.executeJavaScript("arguments[0].click();",title);
        selectionOfDropdown(titleValue1,titleValue);
    }

    public void setShareHoldingPercentage(String shareholdingPercentage1) throws Exception {
        waitUtility.waitTillElementVisible(driver,shareholdingPercentage,30);
        textBoxControls.clearText(shareholdingPercentage);
        textBoxControls.setText(shareholdingPercentage,shareholdingPercentage1);
    }

    public void setFirstName(String firstName1) throws Exception{
        waitUtility.waitTillElementVisible(driver,firstName,30);
        textBoxControls.setText(firstName,firstName1);
    }

    public void setMiddleName(String middleName1) throws Exception{
        textBoxControls.setText(middleName,middleName1);
    }

    public void setLastName(String lastName1) throws Exception{
        textBoxControls.setText(lastName,lastName1);
    }

    public void setGender(String gender) throws Exception{
        if(gender.equals("Male")) {
            javaScriptControls.executeJavaScript("arguments[0].click();", driver.findElement(By.id(genderBefore+"M"+genderAfter)));
        }
        else if(gender.equals("Female")){
            javaScriptControls.executeJavaScript("arguments[0].click();", driver.findElement(By.id(genderBefore+"F"+genderAfter)));
        }
        else{
            javaScriptControls.executeJavaScript("arguments[0].click();", driver.findElement(By.id(genderBefore+"O"+genderAfter)));
        }
    }

    public void setMaritalStatus(String maritalStatus) throws Exception{
        if(maritalStatus.equals("Unmarried")) {
            javaScriptControls.executeJavaScript("arguments[0].click();", driver.findElement(By.id(beforeMaritalStatus+"UNMAR"+afterMaritalStatus)));
        }
        else if(maritalStatus.equals("Married")){
            javaScriptControls.executeJavaScript("arguments[0].click();", driver.findElement(By.id(beforeMaritalStatus+"MARR"+afterMaritalStatus)));
        }
        else if(maritalStatus.equals("Divorced")){
            javaScriptControls.executeJavaScript("arguments[0].click();", driver.findElement(By.id(beforeMaritalStatus+"DIVOR"+afterMaritalStatus)));
        }
        else{
            javaScriptControls.executeJavaScript("arguments[0].click();", driver.findElement(By.id(beforeMaritalStatus+"WIDOW"+afterMaritalStatus)));
        }
    }


    public void setDateOfBirth(String dateOfBirth) throws Exception {
        if(!dateOfBirth.isEmpty()) {
             javaScriptControls.executeJavaScript("arguments[0].click();",dob);
             selectDateFromCalendar(dateOfBirth);
         }
    }

    public void setNationality(String nationalityValue1) throws Exception{
        //waitUtility.waitTillElementVisible(driver,languageDD,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",nationality);
        selectionOfDropdown(nationalityValue1,nationalityValue);
    }

    public void setPlaceOfBirth(String placeOfBirthValue1) throws Exception{
        //waitUtility.waitTillElementVisible(driver,languageDD,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",placeOfBirth);
        selectionOfDropdown(placeOfBirthValue1,placeOfBirthValue);
             }

    public void setexpiryDate(String expiryDate) throws Exception {
        if(!expiryDate.isEmpty()) {
            javaScriptControls.executeJavaScript("arguments[0].click();",dob1);
            selectDateFromCalendar(expiryDate);
        }
    }

    public void setexpiryDatePassport(String expiryDate1) throws Exception {
        if(!expiryDate1.isEmpty()) {
            javaScriptControls.executeJavaScript("arguments[0].click();",expiryDate_1);
            waitUtility.waitForSeconds(3);
            selectDateFromCalendar(expiryDate1);
        }
    }

    public void setPostCode(String postCode1) throws Exception{
        textBoxControls.setText(postCode,postCode1);
    }

    public void clickFindAddress() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",findAddressBtn);
    }

    public void clickAddress() throws Exception{
        waitUtility.waitTillElementVisible(driver,address,20);
        javaScriptControls.executeJavaScript("arguments[0].click();",address);
    }

    public void setMovingYear(String yearValue1) throws Exception{
        //waitUtility.waitTillElementVisible(driver,languageDD,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",movingYear);
        selectionOfDropdown(yearValue1,yearValues);
    }

    public void setMovingMonth(String monthValue1) throws Exception{
        //waitUtility.waitTillElementVisible(driver,languageDD,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",movingMonth);
        selectionOfDropdown(monthValue1,monthValues);
    }

    public void setTelephoneNumber(String telephoneNumber1) throws Exception{
        textBoxControls.setText(telephoneNumber,telephoneNumber1);
    }

    public void setMobileNumber(String mobileNumber1) throws Exception{
        textBoxControls.setText(mobileNumber,mobileNumber1);
    }

    public void setPersonalEmail(String personalEmail1) throws Exception{
        textBoxControls.setText(personalEmail,personalEmail1);
    }

    public void setDrivingLicenseNumber(String drivingLicenseNumber1) throws Exception{
        textBoxControls.setText(drivingLicenseNumber,drivingLicenseNumber1);
    }

    public void setLicensePostCode(String licensePostCode1) throws Exception{
        textBoxControls.setText(licensePostCode,licensePostCode1);
    }

    public void setEmploymentStatus(String employmentStatusValue1) throws Exception{
        //waitUtility.waitTillElementVisible(driver,languageDD,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",employmentStatus);
         selectionOfDropdown(employmentStatusValue1,employmentStatusValue);
         waitUtility.waitForSeconds(5);
    }

    public void setAnnualIncome(String annualIncome1) throws Exception{
        textBoxControls.setText(annualIncome,annualIncome1);
    }

    public void setSourceOfIncome(String sourceOfIncomeValue1) throws Exception{
        //waitUtility.waitTillElementVisible(driver,languageDD,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",sourceOfIncome);
        String sourceOfIncome[] = sourceOfIncomeValue1.split(",");
        for(int i=0;i<sourceOfIncome.length;i++){
            selectionOfDropdown(sourceOfIncome[i],sourceOfIncomeValue);
        }
       // selectionOfDropdown(sourceOfIncomeValue1,sourceOfIncomeValue);
    }

    public void setResidentUK() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",residentUK);
    }

    public void setResidentUS() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",residentUS);
    }

    public void setOtherCountryResident() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",otherCountryResident);
    }

    public void setIdentification(String identification) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",ukPassport);
    }

    public void setPassportDetails(String passportDetails1) throws Exception {
        textBoxControls.setText(passportNumber,passportDetails1);
//        textBoxControls.setText(personal_Details2,passportDetails2);
//        textBoxControls.setText(personal_Details3,passportDetails3);
//        textBoxControls.setText(personal_Details4,passportDetails4);
//        textBoxControls.setText(personal_Details5,passportDetails5);
//        textBoxControls.setText(personal_Details6,passportDetails6);
//        textBoxControls.setText(personal_Details7,passportDetails7);
//        textBoxControls.setText(personal_Details8,passportDetails8);
    }

    public void setLineOfBusiness(String lineOfBusiness1) throws Exception {
       // javaScriptControls.executeJavaScript("arguments[0].click();",lineOfBusiness);
        //lineOfBusiness.click();
        lineOfBusiness.sendKeys(Keys.ENTER);
        selectionOfDropdown(lineOfBusiness1,lineOfBusinessValue);
    }

    public void setEmployerName(String employerName1) throws Exception {
        textBoxControls.setText(employerName,employerName1);
    }

    public void setPostcodeOfEmployer(String postcodeOfEmployer1) throws Exception {
        textBoxControls.setText(postcodeOfEmployer,postcodeOfEmployer1);
    }

    public void setCountryName(String countryNameTax1) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",countryName);
       // countryName.click();
        selectionOfDropdown(countryNameTax1,countryNameValue);
    }

    public void setTaxRefNumber(String taxRefNumber1) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",taxRefNumber);
       // taxRefNumber.click();
    }

    public void setTaxIdentification(String taxIDNumber1) throws Exception {
        textBoxControls.setText(taxIDNumber,taxIDNumber1);
    }

    public void setNINumber(String nINumber1) throws Exception {
        textBoxControls.setText(niNumber,nINumber1);
    }

    public void setWorkingYears(String workingYears1) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",movingYear1);
        selectionOfDropdown(workingYears1,yearValues1);
    }

    public void setWorkingMonths(String workingMonths1) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",movingMonth1);
        selectionOfDropdown(workingMonths1,monthValues1);
    }

    public void setOtherCountryResident(String otherCountryTaxResident1) throws Exception {
        if(otherCountryTaxResident1.equals("Yes")){
            javaScriptControls.executeJavaScript("arguments[0].click();",otherCountryResidentYes);
        }
    }
    public void setResidentUS(String uSTaxResident1) throws Exception {
        if(uSTaxResident1.equals("Yes")){
            javaScriptControls.executeJavaScript("arguments[0].click();",residentUSYes);
        }
    }
    public void setResidentUK(String uKTaxResident1) throws Exception {
        if(uKTaxResident1.equals("Yes")){
            javaScriptControls.executeJavaScript("arguments[0].click();",residentUKYes);
        }
    }

    public void setRemarks(String remarks1) throws Exception {
        textBoxControls.setText(remarks,remarks1);
    }

    public void setContinueBtn() throws Exception{
        waitUtility.waitForSeconds(15);
        System.out.println("continue ***********************************************************");
       javaScriptControls.executeJavaScript("arguments[0].click();",continueBtn);
//continueBtn.sendKeys(Keys.ENTER);
       // waitUtility.waitForSeconds(10);
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void updateUser() throws Exception {
        waitUtility.waitTillElementVisible(driver,personalDetails,30);
        javaScriptControls.executeJavaScript("arguments[0].click();",partner);
        waitUtility.waitForSeconds(5);
        setContinueBtn();
    }

    public void selectDateFromCalendar(String dateRequired){
        String dateArr[] = dateRequired.split(" ");
        String day_dd = dateArr[0];
        String month_mm = dateArr[1];
        String year_yyyy = dateArr[2];
        Select dropdown1 = new Select(year);
        dropdown1.selectByValue(year_yyyy);
        Select dropdown = new Select(month);
        dropdown.selectByVisibleText(month_mm);
        for(WebElement date1:date){
            if(date1.getText().equals(day_dd)){
                date1.click();
            }
        }
    }

    public void selectionOfDropdown(String itemType, List<WebElement> type) throws Exception {
        for(WebElement name : type){
            if(name.getText().equals(itemType)){
                name.click();
                //javaScriptControls.executeJavaScript("arguments[0].click();",name);
                break;
            }
        }
    }



}
