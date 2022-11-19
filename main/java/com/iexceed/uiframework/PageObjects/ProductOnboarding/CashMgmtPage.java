package com.iexceed.uiframework.PageObjects.ProductOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.CommonElements;
import com.iexceed.uiframework.implementations.DropdownControls;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.implementations.TextBoxControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CashMgmtPage extends TestBase {
    //Cash Management
    @FindBy(id = "select2-cmgonb__ProductOnboardingDetails__i__cashManagement__primaryBankEntity-container")
    WebElement primaryBankEntityOnboardingDD;
    @FindBy(xpath = "//ul[@id='select2-cmgonb__ProductOnboardingDetails__i__cashManagement__primaryBankEntity-results']/li")
    List<WebElement> primaryBankEntityOnboarding;
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__cashManagement__homeCountry_span")
    WebElement cashHomeCountryDD;
    @FindBy(xpath = "//div[@id='cmgonb__ProductOnboardingDetails__i__cashManagement__homeCountry_div']/ul/li")
    List<WebElement> cashHomeCountry;
    @FindBy(id = "cmgonb__CashManagementDtls__i__cashManagement__allowedBranches")
    WebElement cashAllowedBranchDD;
    @FindBy(id = "cmgonb__CashManagementDtls__i__cashManagement__allowedBranches")
    WebElement cashAllowedBranchDDField;
    @FindBy(xpath = "//div[@id='cmgonb__CashManagementDtls__i__cashManagement__allowedBranches_div']/ul/li")
    List<WebElement> cashAllowedBranch;
    @FindBy(id = "select2-cmgonb__CashManagementDtls__i__cashManagement__defaultBranch-container")
    WebElement cashDefaultBranch;
    @FindBy(id = "cmgonb__CashManagementDtls__i__cashManagement__status_option_ACTIVE_span_")
    WebElement cashActiveStatus;
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__cashManagement__status_option_INACTIVE_span_")
    WebElement cashInactiveStatus;
    @FindBy(xpath = "//label[@for='cmgonb__CashManagement__CashManagementtoggle_11']")
    WebElement cashEnrichmentYes;
    @FindBy(xpath = "//*[@id='cmgonb__NewOnboarding__CashManagementtoggle']/label[1]")
    WebElement cashEnrichmentNo;
    //GeneralDetails
    @FindBy(id = "cmgonb__CashManagementDtls__i__cashManagement__brandingService")
    WebElement brandingServiceDD;
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__cashManagement__brandingService")
    WebElement brandingServiceField;
    @FindBy(xpath = "//div[@id='cmgonb__CashManagementDtls__i__cashManagement__brandingService_div']/ul/li")
    List<WebElement> brandingService;
    @FindBy(id = "cmgonb__CashManagementDtls__i__cashManagement__segment")
    WebElement partySegmentDD;
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__cashManagement__segment")
    WebElement partySegmentField;
    @FindBy(xpath = "//div[@id=\"cmgonb__CashManagementDtls__i__cashManagement__segment_div\"]/ul/li")
    List<WebElement> partySegment;
    @FindBy(id = "cmgonb__CashManagementDtls__i__cashManagement__allowGranularServices_option_T_span_")
    WebElement granularServiceYes;
    @FindBy(xpath = "cmgonb__ProductOnboardingDetails__i__cashManagement__allowGranularServices_option_F_span_")
    WebElement granularServiceNo;
    @FindBy(id = "cmgonb__CashManagementDtls__i__cashManagement__allowPayoutServices_option_T_span_")
    WebElement payoutServiceYes;
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__cashManagement__allowPayoutServices_option_F_span_")
    WebElement payoutServiceNo;
    @FindBy(id = "cmgonb__CashManagementDtls__i__cashManagement__internalClient_option_T_span_")
    WebElement internalClientYes;
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__cashManagement__internalClient_option_F_span_")
    WebElement internalClientNo;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billingId")
    WebElement cashBillingID;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billingStartDate")
    WebElement cashBillingStartDate;
    @FindBy(xpath = "//*[@class='mbsc-cal-month']")
    WebElement billingMonthBtn;
    @FindBy(xpath = "//*[@class='mbsc-fr-btn-e mbsc-fr-btn-nhl mbsc-cal-sc-m-cell mbsc-cal-sc-cell mbsc-cal-month-s' or @class='mbsc-fr-btn-e mbsc-fr-btn-nhl mbsc-cal-sc-m-cell mbsc-cal-sc-cell mbsc-cal-month-s mbsc-cal-sc-sel']/div/div")
    List<WebElement> billingStartMonth;
    @FindBy(xpath = "//*[@class='mbsc-cal-year']")
    WebElement billingYearBtn;
    @FindBy(xpath = "//*[@class='mbsc-fr-btn-e mbsc-fr-btn-nhl mbsc-cal-sc-m-cell mbsc-cal-sc-cell mbsc-cal-year-s' or @class='mbsc-fr-btn-e mbsc-fr-btn-nhl mbsc-cal-sc-m-cell mbsc-cal-sc-cell mbsc-cal-month-s mbsc-cal-sc-sel']/div/div")
    List<WebElement> billingStartYear;
    String beforexpath = "//*[@class='mbsc-cal-anim-c mbsc-comp']/div/div[2]/div[1]/div[";
    String afterxpath = "]/div[";
    @FindBy(xpath = "//div[text()='Set']")
    WebElement setBtn;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billingProfile")
    WebElement billingProfileDD;
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__billing__billingProfile")
    WebElement billingProfileField;
    @FindBy(xpath = "//div[@id=\"cmgonb__CashManagementDtls__i__billing__billingProfile_div\"]/ul/li")
    List<WebElement> billingProfile;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billByChargeAccount_option_T_span_")
    WebElement billByChargeAccountYes;
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__billing__billByChargeAccount_option_F_span_")
    WebElement billByChargeAccountNo;
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__billing__billByActivityAccount_option_T_span_")
    WebElement billByActivityAccountYes;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billByActivityAccount_option_F_span_")
    WebElement billByActivityAccountNo;
    //CashpromotionBilling
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__allowPromoBilling_option_T_span_")
    WebElement billingAllowPromoBillingYes;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__discountPercentage")
    WebElement billingDiscountPercentage;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__promoBillingStartDate")
    WebElement billingPromoStartDate;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__promoBillingEndDate")
    WebElement billingPromoEndDate;
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__billing__allowPromoBilling_option_F_span_")
    WebElement billingAllowPromoBillingNo;

    //BillingaddrSameasPartyAddr
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__billing__billAddrSameAsPartyAddr_option_T_span_")
    WebElement billAddrSameAsPartyAddrYes;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billAddrSameAsPartyAddr_option_F_span_")
    WebElement billAddrSameAsPartyAddrNo;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billingContactPerson")
    WebElement billingContactPerson;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billingAddressType")
    WebElement cashManagementAddressDD;
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__billing__billingAddressType")
    WebElement cashManagementAddressField;
    @FindBy(xpath = "//div[@id='cmgonb__CashManagementDtls__i__billing__billingAddressType_div']/ul/li")
    List<WebElement> cashManagementAddressType;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billingAddress")
    WebElement cashMgmtAddress;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billingCity")
    WebElement cashMgmtCity;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billingState")
    WebElement cashManagementStateDD;
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__billing__billingState")
    WebElement cashManagementStateField;
    @FindBy(xpath = "//div[@id='cmgonb__CashManagementDtls__i__billing__billingState_div']/ul/li")
    List<WebElement> cashManagementState;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billingCountry")
    WebElement cashManagementCountryDD;
    @FindBy(id = "cmgonb__ProductOnboardingDetails__i__billing__billingCountry")
    WebElement cashManagementCountryField;
    @FindBy(xpath = "//div[@id='cmgonb__CashManagementDtls__i__billing__billingCountry_div']/ul/li")
    List<WebElement> cashManagementCountry;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billingEmailId")
    WebElement cashMgmtEmail;
    @FindBy(id = "cmgonb__CashManagementDtls__i__billing__billingFaxNumber")
    WebElement cashMgmtFax;

    //cashMgmt contactnumber
    @FindBy(id = "cmgonb__CashManagement__billContactCode1")
    WebElement cashMobileCodeDD;
    @FindBy(xpath = "//div[@id='cmgonb__CashManagement__billContactCode1_div']/ul/li")
    List<WebElement> cashMobileCode;
    @FindBy(id = "cmgonb__CashManagement__billContactNum1")
    WebElement primaryCashMobileCode;
    @FindBy(id = "cmgonb__CashManagement__billContactCode2")
    WebElement cashOfficeCodeDD;
    @FindBy(xpath = "//div[@id='cmgonb__CashManagement__billContactCode2_div']/ul/li")
    List<WebElement> cashOfficeCode;
    @FindBy(id = "cmgonb__CashManagement__billContactNum2")
    WebElement secCashContactNumber;
    @FindBy(id = "cmgonb__CashManagementDtls__i__cashManagement__remarks")
    WebElement cashRemarks;
    @FindBy(id = "newonb__NewOnboarding__el_btn_211")
    WebElement cashProceed;
    @FindBy(xpath = "//p[@class='msg']")
    WebElement alertMsg;

    //remarks
    @FindBy(id = "cmgonb__NewOnboarding__ProductOnboardingDetails__i__cashManagement__remarksHidden_li")
    WebElement cashManagementRemarks;

    private CommonElements commonElements;
    private TextBoxControls textBoxControls;
    private JavaScriptControls javaScriptControls;
    private DropdownControls dropdownControls;
    private WaitUtility waitUtility;


    public CashMgmtPage() {
        PageFactory.initElements(driver, this);
        commonElements = new CommonElements();
        textBoxControls = new TextBoxControls();
        javaScriptControls = new JavaScriptControls(driver);
        dropdownControls = new DropdownControls();
        waitUtility = new WaitUtility();

    }
    //Action of cash management elements
    public void setDefaultBankEntityDD(String branchAllowed) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", primaryBankEntityOnboardingDD);
        selectionOfDropdown(branchAllowed, primaryBankEntityOnboarding);
    }

    public void setCashAllowedBranchDD(String branchAllowed) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cashAllowedBranchDD);
        selectionOfDropdown(branchAllowed, cashAllowedBranch);
    }
    public void selectDefaultBranch(String defaultBranch) throws Exception {
        dropdownControls.selectViaVisibleText(cashDefaultBranch, defaultBranch);
    }

    public void cashenterRemarks(String remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,cashManagementRemarks,10);
        textBoxControls.setText(cashManagementRemarks,remarks);

    }
    public void setCashActiveStatus() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cashActiveStatus);

    }
    //Action on Branding
    public void setCashEnrichmentYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cashEnrichmentYes);
    }
    public void selectBrandingServiceDD(String brandService) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", brandingServiceDD);
        waitUtility.waitForSeconds(15);
        selectionOfDropdown(brandService, brandingService);
    }
    public void selectPartySegmentDD(String partySeg) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", partySegmentDD);
        waitUtility.waitForSeconds(5);
        selectionOfDropdown(partySeg, partySegment);
    }
    public void setGranularServiceYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", granularServiceYes);

    }
    public void setPayoutServiceYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", payoutServiceYes);

    }
    public void setInternalClientYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", internalClientYes);

    }
    //Action on Billing
    public void setCashBillingID(String billingId) throws Exception {
        textBoxControls.setText(cashBillingID, billingId);
    }
    public void selectBillingProfileDD(String billingProf) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", billingProfileDD);
        selectionOfDropdown(billingProf, billingProfile);
    }
    public void setCashBillingStartDate() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cashBillingStartDate);
    }
    public void clickSetBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", setBtn);
    }
    public void setBillByChargeAccountYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", billByChargeAccountYes);
    }
    public void setBillByActivityAccountNo() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", billByActivityAccountNo);
    }
    public void setBillAddrSameAsPartyAddrNoRadioBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", billAddrSameAsPartyAddrNo);
    }

    //BillAddrSameAsPartyAddrNo action element
    public void setBillingContactPerson(String billContactPerson) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();", billingContactPerson);
        waitUtility.waitForSeconds(20);
        textBoxControls.setText(billingContactPerson, billContactPerson);
    }
    public void selectCashManagementAddress(String addressType) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cashManagementAddressDD);
        selectionOfDropdown(addressType, cashManagementAddressType);
    }
    public void setCashMgmtAddress(String address) throws Exception {
        textBoxControls.setText(cashMgmtAddress, address);
    }
    public void selectCashManagementCountry(String country) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cashManagementCountryDD);
        selectionOfDropdown(country, cashManagementCountry);
    }
    public void setCashMgmtCity(String city) throws Exception {
        textBoxControls.setText(cashMgmtCity, city);
    }
    public void setCashMgmtEmail(String email) throws Exception {
        textBoxControls.setText(cashMgmtEmail, email);
    }
    public void selectCashManagementState(String state) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cashManagementStateDD);
        selectionOfDropdown(state, cashManagementState);
    }
    public void setCashMgmtFax(String faxNum) throws Exception {
        textBoxControls.setText(cashMgmtFax, faxNum);
    }
    public void selectCashManagementMobileCode(String mobileCode) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cashMobileCodeDD);
        String mcode = "+"+mobileCode;
        selectionOfDropdown(mcode,cashMobileCode);
    }
    public void setCashMgmtPrimaryNumber(String primCashNumber) throws Exception {
        textBoxControls.setText(primaryCashMobileCode, primCashNumber);
    }
    public void selectCashManagementOfficeCode(String officeCode) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cashOfficeCodeDD);
        String ocode = "+"+officeCode;
        selectionOfDropdown(ocode,cashOfficeCode);
    }
    public void setCashMgmtSecondaryNumber(String secNum) throws Exception {
        textBoxControls.setText(secCashContactNumber, secNum);
    }
    //Action on  promotional billing
    public void setBillingDiscountPercentage(String discountPercent) throws Exception {
        textBoxControls.setText(billingDiscountPercentage, discountPercent);

    }
    public void setBillingAllowPromoBillingYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", billingAllowPromoBillingYes);
    }
    public void setBillingPromoStartDate() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", billingPromoStartDate);
    }
    public void setSetBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", setBtn);
    }
    public void setBillingPromoEndDate() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", billingPromoEndDate);
    }
    public void setCashRemarks(String remarks ) throws Exception {
        waitUtility.waitForSeconds(20);
        textBoxControls.setText(cashRemarks, remarks);
    }
    public void getCashProceed() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cashProceed);
    }

    public ContactTaxPage clickCashProceed() throws Exception {
        getCashProceed();
        return new ContactTaxPage();
    }

    public String clickOnCashProceedBtn() throws Exception {
        getCashProceed();
        waitUtility.waitTillElementVisible(driver,alertMsg,10);
        return alertMsg.getText();
    }

    public void selectionOfDropdown (String itemType, List < WebElement > type){
        for (WebElement name : type) {
            if (name.getText().equals(itemType)) {
                name.click();
                break;
            }
        }
    }
    public void selectDateFromCal(String ddmmyyyy) throws Exception {
        String date = ddmmyyyy;
        String dateArr[] = date.split("/");
        String day = dateArr[0];
        String month = dateArr[1];
        String year = dateArr[2];
        javaScriptControls.executeJavaScript("arguments[0].click();", billingMonthBtn);
        selectionOfDropdown(month, billingStartMonth);
        javaScriptControls.executeJavaScript("arguments[0].click();", billingYearBtn);
        selectionOfDropdown(year, billingStartYear);
        final int totalWeekDays = 7;
        boolean flag = false;
        for (int rowNum = 1; rowNum <= 6; rowNum++) {
            for (int colNum = 1; colNum <= totalWeekDays; colNum++) {
                String dayVal = driver.findElement(By.xpath(beforexpath + rowNum + afterxpath + colNum + "]")).getText();
                //System.out.println(dayVal);
                if (dayVal.equals(day)) {
                    driver.findElement(By.xpath(beforexpath + rowNum + afterxpath + colNum + "]")).click();
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

    }

    public void verifyEditCashFieldValues(String cashBranch, String defaultBranch, String bankName, String remarks) throws Exception {
        checkFieldData(commonElements.getAttribute(cashAllowedBranchDDField,"value"),cashBranch);
        checkFieldData(commonElements.getAttribute(cashDefaultBranch,"value"),defaultBranch);
//        checkFieldData(commonElements.getAttribute(corporateDefaultBankEntity,"value"),bankName);
      //  checkFieldData(commonElements.getAttribute(cashRemarks,"value"),remarks);

    }
    public void checkFieldData(String actualData,String expectedData){
try{
           waitUtility.waitTillElementVisible(driver,cashAllowedBranchDDField,17);
           Assert.assertEquals(actualData, expectedData);
}catch(Exception e){}

    }

    public void verifyEditCashProductFieldValues(String branchAllowed, String defaultBranch, String brandingService, String partySegment, String billingId, String billingProfile, String billingStartDate, String billingContactPersons, String addressType, String address, String country, String state, String city, String mobileCode, String primaryCashNumber, String officeCode, String secondaryNumber, String email, String faxNumber, String discountPercentage, String remarks) throws Exception {
        checkFieldData(commonElements.getAttribute(cashAllowedBranchDDField,"value"),branchAllowed);
        checkFieldData(commonElements.getAttribute(cashDefaultBranch,"value"),defaultBranch);
        //checkFieldData(commonElements.getAttribute(corporateDefaultBankEntity,"value"),bankName);
        checkFieldData(commonElements.getAttribute(brandingServiceField,"value"),brandingService);
        checkFieldData(commonElements.getAttribute(partySegmentField,"value"),partySegment);
        checkFieldData(commonElements.getAttribute(cashBillingID,"value"),billingId);
        checkFieldData(commonElements.getAttribute(billingProfileField,"value"),billingProfile);
        checkFieldData(commonElements.getAttribute(billingContactPerson,"value"),billingContactPersons);
        checkFieldData(commonElements.getAttribute(cashManagementAddressField,"value"),addressType);
        checkFieldData(commonElements.getAttribute(cashMgmtAddress,"value"),address);
        checkFieldData(commonElements.getAttribute(cashManagementCountryField,"value"),country);
        //checkFieldData(commonElements.getAttribute(cashManagementStateField,"value"),state);
        checkFieldData(commonElements.getAttribute(cashMgmtCity,"value"),city);
       // checkFieldData(commonElements.getAttribute(primaryCashMobileCode,"value"),primaryCashNumber);
        //checkFieldData(commonElements.getAttribute(secCashContactNumber,"value"),secondaryNumber);
        checkFieldData(commonElements.getAttribute(cashMgmtEmail,"value"),email);
        checkFieldData(commonElements.getAttribute(cashMgmtFax,"value"),faxNumber);
        checkFieldData(commonElements.getAttribute(billingDiscountPercentage,"value"),discountPercentage);
        checkFieldData(commonElements.getAttribute(cashRemarks,"value"),remarks);
    }
}
