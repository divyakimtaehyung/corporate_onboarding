package com.iexceed.uiframework.PageObjects.ProductOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.CommonElements;
import com.iexceed.uiframework.implementations.DropdownControls;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.implementations.TextBoxControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ContactTaxPage extends TestBase {

    //ContactDetails
    @FindBy(id = "newonb__ContactDetails__i__contactDetails__title_span")
    WebElement titleDD;
    @FindBy(id = "newonb__ContactDetails__i__contactDetails__title")
    WebElement titleField;
    @FindBy(xpath = "//div[@id='newonb__ContactDetails__i__contactDetails__title_div']/ul/li")
    List<WebElement> contactTitle;
    @FindBy(id = "newonb__ContactDetails__i__contactDetails__fullName")
    WebElement contactName;
    @FindBy(id = "newonb__ContactDetails__i__contactDetails__mobileCode_span")
    WebElement mobileCodeDD;
    @FindBy(xpath = "//div[@id='newonb__ContactDetails__i__contactDetails__mobileCode_div']/ul/li")
    List<WebElement> mobileContactCode;
    @FindBy(id = "newonb__ContactDetails__i__contactDetails__mobileNumber")
    WebElement primaryContactNumber;
    @FindBy(id = "newonb__ContactDetails__i__contactDetails__officeCode_span")
    WebElement officeCodeDD;
    @FindBy(xpath = "//div[@id='newonb__ContactDetails__i__contactDetails__officeCode_div']/ul/li")
    List<WebElement> officeContactCode;
    @FindBy(id = "newonb__ContactDetails__i__contactDetails__officePhoneNo")
    WebElement secContactNumber;
    @FindBy(id = "newonb__ContactDetails__i__contactDetails__faxNumber")
    WebElement faxNumber;
    @FindBy(id = "newonb__AdditionalInfo__i__additionalInfo__correspondenceLanguage_span")
    WebElement corresLanguageDD;
    @FindBy(id = "newonb__AdditionalInfo__i__additionalInfo__correspondenceLanguage")
    WebElement corresLanguageField;
    @FindBy(xpath = "//div[@id='newonb__AdditionalInfo__i__additionalInfo__correspondenceLanguage_div']/ul/li")
    List<WebElement>  corresLanguage;
    @FindBy(id = "newonb__ContactDetails__i__contactDetails__email")
    WebElement email;
    @FindBy(id = "newonb__AdditionalInfo__i__additionalInfo__companyWebsite")
    WebElement companyWebsite;

    //Tax Details
    @FindBy(id = "newonb__AdditionalInfo__i__additionalInfo__taxCountry_span")
    WebElement taxCountryDD;
    @FindBy(id = "newonb__AdditionalInfo__i__additionalInfo__taxCountry")
    WebElement taxCountryField;
    @FindBy(xpath = "//div[@id='newonb__AdditionalInfo__i__additionalInfo__taxCountry_div']/ul/li")
    List<WebElement>  taxCounty;
    @FindBy(id = "newonb__AdditionalInfo__i__additionalInfo__taxId")
    WebElement taxId;

    //Agreement Details
    @FindBy(id = "newonb__AdditionalInfo__i__additionalInfo__agreementReference")
    WebElement agreementRef;
    @FindBy(id = "newonb__AdditionalInfo__i__additionalInfo__riskCountry_span")
    WebElement riskCountryDD;
    @FindBy(id = "newonb__AdditionalInfo__i__additionalInfo__riskCountry")
    WebElement riskCountryField;
    @FindBy(xpath = "//div[@id='newonb__AdditionalInfo__i__additionalInfo__riskCountry_div']/ul/li")
    List<WebElement> riskCounty;
    @FindBy(id = "newonb__AdditionalInfo__i__additionalInfo__rmName")
    WebElement rmanagerName;
    @FindBy(id = "newonb__AdditionalInfo__i__additionalInfo__activationDate_button")
    WebElement activationDateBtn;
    @FindBy(xpath = "//div[text()='Set']")
    WebElement setBtn;
    @FindBy(id = "newonb__NewOnboarding__el_btn_113")
    WebElement proceedStage4Btn;
    //Product details
    @FindBy(id = "newonb__NewOnboarding__el_hpl_25")
    WebElement tradeMgmt;
    @FindBy(id = "newonb__NewOnboarding__el_hpl_27")
    WebElement revenueMgmt;
    @FindBy(id = "newonb__NewOnboarding__el_hpl_29")
    WebElement corporateMgmt;
    @FindBy(id = "newonb__NewOnboarding__el_hpl_31")
    WebElement cashMgmt;
    @FindBy(id = "newonb__NewOnboarding__el_btn_125")
    WebElement proceedProductBtn;
    @FindBy(xpath = "//button[@class='ok']")
    WebElement resetGroupBtn;
    @FindBy(id = "newonb__NewOnboarding__el_btn_124")
    WebElement cancelStage5Btn;
    @FindBy(id = "newonb__NewOnboarding__el_btn_206")
    WebElement saveStage5Btn;

    //ResetGroupDetails
    @FindBy(xpath = "//p[contains(text(),'This Action will reset Group Details. Do you want ')]")
    WebElement resetGroupDetailsPopup;
    @FindBy(xpath = "//button[contains(text(),'Ok')]")
    WebElement PopupOkButton;
    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    WebElement PopupCancelButton;

    private CommonElements commonElements;
    private TextBoxControls textBoxControls;
    private JavaScriptControls javaScriptControls;
    private DropdownControls dropdownControls;
    private WaitUtility waitUtility;


    public ContactTaxPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        textBoxControls= new TextBoxControls();
        javaScriptControls= new JavaScriptControls(driver);
        dropdownControls = new DropdownControls();
        waitUtility= new WaitUtility();

    }
    //Actions on Element contact details
    public void selectTitleDD(String title) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",titleDD);
        selectionOfDropdown(title,contactTitle);
    }
    public void setContactName(String name) throws Exception {
        textBoxControls.setText(contactName,name);
    }
    public void selectMobileCodeDD(String mobileCode) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",mobileCodeDD);
        String mcode = "+"+mobileCode;
        selectionOfDropdown(mcode,mobileContactCode);
    }
    public void setPrimaryContactNumber(String primaryNum) throws Exception {
        textBoxControls.setText(primaryContactNumber,primaryNum);
    }
    public void selectOfficeCodeDD(String officeCode) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",officeCodeDD);
        String ocode = "+"+officeCode;
        selectionOfDropdown(ocode,officeContactCode);
    }
    public void setSecondaryContactNumber(String secNum) throws Exception {
        textBoxControls.setText(secContactNumber,secNum);
    }
    public void setFaxNumber(String faxNum) throws Exception {
        textBoxControls.setText(faxNumber,faxNum);
    }
    public void selectCorrespondingLanguageDD(String correspLang) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corresLanguageDD);
        selectionOfDropdown(correspLang,corresLanguage);
    }
    public void setCompanyWebsite(String compWebsite) throws Exception {
        textBoxControls.setText(companyWebsite,compWebsite);
    }
    public void setEmail(String emailID) throws Exception {
        textBoxControls.setText(email,emailID);
    }
    //Actions on Element tax details
    public void setTaxId(String taxID) throws Exception {
        textBoxControls.setText(taxId,taxID);
    }
    public void selectTaxCountryDD(String taxCountry) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",taxCountryDD);
        selectionOfDropdown(taxCountry,taxCounty);
    }
    //Actions on Element Agreement Details
    public void setAgreementRef(String agreeRef) throws Exception {
        textBoxControls.setText(agreementRef,agreeRef);
    }
    public void selectRiskCountryDD(String riskCountry) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",riskCountryDD);
        selectionOfDropdown(riskCountry,riskCounty);
    }
    public void setRmanagerName(String rmName) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();", rmanagerName);
        dropdownControls.selectViaVisibleText(rmanagerName,rmName);
    }
    public void clickActivationDateBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",activationDateBtn);
    }
    public void resetGrpOkayBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", resetGroupBtn);
    }
    public void clickSetBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", setBtn);
    }
    public void clickProceedBtn() throws Exception {
        waitUtility.waitForSeconds(3);
        javaScriptControls.executeJavaScript("arguments[0].click();",proceedStage4Btn);
    }
    //Actions on Element product details
    public RevenueMgmtPage getProductAsRevenue() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",revenueMgmt);
        return new RevenueMgmtPage();

    }
    public RevenueMgmtPage getProductAsRevenue1() throws Exception {
       try {
           javaScriptControls.executeJavaScript("arguments[0].click();", revenueMgmt);
           waitUtility.waitForSeconds(15);
           if(resetGroupDetailsPopup.isDisplayed()){
               javaScriptControls.executeJavaScript("arguments[0].click();", PopupOkButton);

           }

       }catch(Exception e){

       }
        return new RevenueMgmtPage();

    }

    public TradeFinancePage getProductAsTrade() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeMgmt);
        return new TradeFinancePage();

    }


//    public TradeFinancePage getProductAsTrade1() throws Exception {
//        javaScriptControls.executeJavaScript("arguments[0].click();",tradeMgmt);
//        return new TradeFinancePage();
//
//    }


    public TradeFinancePage getProductAsTrade1() throws Exception {
        try {
            javaScriptControls.executeJavaScript("arguments[0].click();", tradeMgmt);
            waitUtility.waitForSeconds(15);
            if(resetGroupDetailsPopup.isDisplayed()){
                javaScriptControls.executeJavaScript("arguments[0].click();", PopupOkButton);

            }
        }catch(Exception e){


        }
        return new TradeFinancePage();

    }

    public CorporatePage getProductAsCorporate() throws Exception {

            javaScriptControls.executeJavaScript("arguments[0].click();", corporateMgmt);
            waitUtility.waitForSeconds(8);
            return new CorporatePage();
    }
    public CashMgmtPage getProductAsCash() throws Exception {

            javaScriptControls.executeJavaScript("arguments[0].click();", cashMgmt);
            waitUtility.waitForSeconds(8);
            return new CashMgmtPage();
    }



    public CorporatePage getProductAsCorporate1() throws Exception {
        try {
            javaScriptControls.executeJavaScript("arguments[0].click();", corporateMgmt);
            waitUtility.waitForSeconds(4);
            if(resetGroupDetailsPopup.isDisplayed()){
                javaScriptControls.executeJavaScript("arguments[0].click();", PopupOkButton);

            }

        }catch(Exception e){
        }
        return new CorporatePage();
    }
    public CashMgmtPage getProductAsCash1() throws Exception {
        try {
            javaScriptControls.executeJavaScript("arguments[0].click();", cashMgmt);
            waitUtility.waitForSeconds(15);
            if(resetGroupDetailsPopup.isDisplayed()){
                javaScriptControls.executeJavaScript("arguments[0].click();", PopupOkButton);

            }

        }catch(Exception e){

        }
        return new CashMgmtPage();
    }





    public GroupDetailsPage clickProductProceedBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",proceedProductBtn);
        return new GroupDetailsPage();

    }
    public void verifyContactOtherFieldValues(String title,String name,String primaryNum,String secNum,String faxNum,String correspLang,String compWebsite,String emailID,String taxID,String taxCountry,String agreeRef,String riskCountry,String rmName) throws Exception {
        checkFieldData(commonElements.getAttribute(titleField,"value"),title);
        checkFieldData(commonElements.getAttribute(contactName,"value"),name);
        checkFieldData(commonElements.getAttribute(primaryContactNumber,"value"),primaryNum);
        checkFieldData(commonElements.getAttribute(secContactNumber,"value"),secNum);
        checkFieldData(commonElements.getAttribute(faxNumber,"value"),faxNum);
        //checkFieldData(commonElements.getAttribute(corresLanguageField,"value"),correspLang);
        checkFieldData(commonElements.getAttribute(companyWebsite,"value"),compWebsite);
        checkFieldData(commonElements.getAttribute(email,"value"),emailID);
        checkFieldData(commonElements.getAttribute(taxId,"value"),taxID);
        //checkFieldData(commonElements.getAttribute(taxCountryField,"value"),taxCountry);
        checkFieldData(commonElements.getAttribute(agreementRef,"value"),agreeRef);
        //checkFieldData(commonElements.getAttribute(riskCountryField,"value"),riskCountry);
        checkFieldData(commonElements.getAttribute(rmanagerName,"value"),rmName);
        clickProceedBtn();
    }

    public void verifyContactOtherFieldValuesOnEdit(String title,String name,String mobileCode,String primaryNum,String officeCode,String secNum,String faxNum,String correspLang,String emailID,String compWebsite,String taxID,String taxCountry,String agreeRef,String riskCountry,String rmName,String date) throws Exception {
        checkFieldData(commonElements.getAttribute(titleField,"value"),title);
        checkFieldData(commonElements.getAttribute(contactName,"value"),name);
        checkFieldData(commonElements.getAttribute(primaryContactNumber,"value"),primaryNum);
        checkFieldData(commonElements.getAttribute(secContactNumber,"value"),secNum);
        checkFieldData(commonElements.getAttribute(faxNumber,"value"),faxNum);
        checkFieldData(commonElements.getAttribute(corresLanguageField,"value"),correspLang);
        checkFieldData(commonElements.getAttribute(email,"value"),emailID);
        checkFieldData(commonElements.getAttribute(companyWebsite,"value"),compWebsite);
        checkFieldData(commonElements.getAttribute(taxId,"value"),taxID);
        checkFieldData(commonElements.getAttribute(taxCountryField,"value"),taxCountry);
        checkFieldData(commonElements.getAttribute(agreementRef,"value"),agreeRef);
        checkFieldData(commonElements.getAttribute(riskCountryField,"value"),riskCountry);
        checkFieldData(commonElements.getAttribute(rmanagerName,"value"),rmName);
        clickProceedBtn();
    }
    public void checkFieldData(String actualData,String expectedData){
        Assert.assertEquals(actualData,expectedData);
    }

    public void selectionOfDropdown (String itemType, List < WebElement > type){
        for (WebElement name : type) {
            if (name.getText().equals(itemType)) {
                name.click();
                break;
            }
        }
    }


}
