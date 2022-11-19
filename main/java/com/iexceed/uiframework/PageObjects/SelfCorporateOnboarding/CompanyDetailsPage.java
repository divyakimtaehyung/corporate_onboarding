package com.iexceed.uiframework.PageObjects.SelfCorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class CompanyDetailsPage extends TestBase {

    @FindBy(id="onboar__corporate__breadcrumbtext_txtcnt")
    WebElement companyDetails;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__registeredNumber")
    WebElement registeredNumber;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__registeredNumber_button")
    WebElement registeredNumberBtn;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__registeredName")
    WebElement businessName;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__incorporationDate")
    WebElement dateOfIncorporation;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__tradingName")
    WebElement tradingName;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__industryType")
    WebElement industryType;
    @FindBy(xpath="//div[@id='onboar__corporatedbdata__i__companydetails__industryType_div']/ul/li")
    List<WebElement> industryValue;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__numberOfYearsInBusiness")
    WebElement numberOfYrs;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__lastFinanicialYearTurnOver")
    WebElement turnOverLastFinancialYr;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__thisYearTurnOver")
    WebElement turnOverCurrentFinancialYr;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__hmrcnum")
    WebElement hmrcNumber;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__businessOutsideUk_option_N_span_")
    WebElement businessOutsideUkNo;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__businessOutsideUk_option_Y_span_")
    WebElement businessOutsideUkYes;
    @FindBy(xpath="//*[@id='select2-onboar__corporatedbdata__i__companydetails__countryname-container']")
    WebElement countryName;
    @FindBy(xpath="//span[@class='select2-results']/ul/li")
    List<WebElement> countryNameValue;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__telephoneNumber")
    WebElement telephoneNumber;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__mobileNo")
    WebElement mobileNumber;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__postcodeOfRegCompany")
    WebElement postcodeOfRegCompany;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__postcodeOfRegCompany_button")
    WebElement findAddressBtn;
    @FindBy(id="onboar__addressesList__i__addressiffound__addr_0_txtcnt")
    WebElement address;
    @FindBy(id="onboar__corporate__el_btn_1")
    WebElement continueBtn;
    @FindBy(css=".err-msg")
    WebElement errorMessage;
    @FindBy(xpath = "//p[@class='msg']")
    WebElement msg;
    @FindBy(xpath = "//button[text()='OK']")
    WebElement okBtn;
    static String businessNameFinal;

    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;
    private CommonDriver commonDriver;

    public CompanyDetailsPage(){
        PageFactory.initElements(driver,this);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        javaScriptControls = new JavaScriptControls(driver);
        commonDriver = new CommonDriver(driver);
    }

    public String getPageTitle() throws Exception {
        waitUtility.waitTillElementVisible(driver,companyDetails,20);
        return companyDetails.getText();
        //return commonDriver.getTitle();
    }

    public void setRegisteredNumber(String registeredNumber1) throws Exception{
        textBoxControls.setText(registeredNumber,registeredNumber1);
        javaScriptControls.executeJavaScript("arguments[0].click();",registeredNumberBtn);
        waitUtility.waitForSeconds(6);
    }

    public String getRandomBusinessName(String businessName) throws Exception {
        businessNameFinal = businessName + new Random().nextInt(1000);
        setBusinessName(businessNameFinal);
        return businessNameFinal;
    }

    public void setBusinessName(String businessName1) throws Exception{
        textBoxControls.setText(businessName,businessName1);
    }

    public void setTradingName(String tradingName1) throws Exception {
        textBoxControls.setText(tradingName,tradingName1);
    }

    public void setIndustryType(String industryValue1) throws Exception{
        //waitUtility.waitTillElementVisible(driver,languageDD,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",industryType);
        selectionOfDropdown(industryValue1,industryValue);

    }

    public void setNumberOfYrs(String numberOfYrs1) throws Exception{
        textBoxControls.setText(numberOfYrs,numberOfYrs1);
    }

    public void setTurnOverLastFinancialYr(String turnOverLastFinancialYr1) throws Exception{
        textBoxControls.setText(turnOverLastFinancialYr,turnOverLastFinancialYr1);
    }

    public void setTurnOverCurrentFinancialYr(String turnOverCurrentFinancialYr1) throws Exception{
        textBoxControls.setText(turnOverCurrentFinancialYr,turnOverCurrentFinancialYr1);
    }

    public void setHMRCNumber(String HMRCNumber) throws Exception {
        textBoxControls.setText(hmrcNumber,HMRCNumber);
    }

    public void setBusinessOutsideUK(String businessOutsideUK) throws Exception {
        if(businessOutsideUK.equals("No")){
            javaScriptControls.executeJavaScript("arguments[0].click();",businessOutsideUkNo);
        }else{
            javaScriptControls.executeJavaScript("arguments[0].click();",businessOutsideUkYes);
        }
    }

    public void setCountryName(String countryName1) throws Exception {
        //javaScriptControls.executeJavaScript("arguments[0].click();",countryName);
        countryName.click();
        selectionOfDropdown(countryName1,countryNameValue);
    }

    public void clickBusinessOutsideUK() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",businessOutsideUkNo);
    }

    public void setTelephoneNumber(String telephoneNumber1) throws Exception{
        textBoxControls.setText(telephoneNumber,telephoneNumber1);
    }

    public void setMobileNumber(String mobileNumber1) throws Exception{
        textBoxControls.setText(mobileNumber,mobileNumber1);
    }

    public void setPostcodeOfRegCompany(String postcodeOfRegCompany1) throws Exception{
        textBoxControls.setText(postcodeOfRegCompany,postcodeOfRegCompany1);
    }

    public void clickFindAddress() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",findAddressBtn);
    }

    public void clickAddress() throws Exception{
       // waitUtility.waitTillElementVisible(driver,address,20);
        javaScriptControls.executeJavaScript("arguments[0].click();",address);
        waitUtility.waitForSeconds(3);
    }

    public String getErrorMessage() throws Exception {
        if(errorMessage.isDisplayed()){
            return errorMessage.getText();
        }
        else {
            waitUtility.waitTillElementVisible(driver, msg, 100);
            return msg.getText();

        }
    }

    public void clickOnContinue() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",continueBtn);
    }

    public void selectionOfDropdown(String itemType, List<WebElement> type) throws Exception {
        for(WebElement name : type){
            if(name.getText().equals(itemType)){
                name.click();
                break;
            }
        }
    }



}
