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

public class CorporatePage extends TestBase {
    //Corporate channel
    @FindBy(id = "newonb__ProductOnboardingDetails__i__corporateChannels__primaryBankEntity")
    WebElement corporateDefaultBankEntity;
    @FindBy(xpath = "//*[@id='select2-newonb__ProductOnboardingDetails__i__corporateChannels__primaryBankEntity-container']")
    WebElement corporateDefaultBankEntityDD;
    @FindBy(xpath = "//ul[@id='select2-newonb__ProductOnboardingDetails__i__corporateChannels__primaryBankEntity-results']/li")
    List <WebElement> corporateDefaultBankEntityList;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__corporateChannels__homeCountry_span")
    WebElement corporateHomeDD;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__corporateChannels__homeCountry_div']/ul/li")
    List <WebElement> corporateHomeCountry;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__corporateChannels__allowedBranches_span")
    WebElement corporateBranchAllowedDD;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__corporateChannels__allowedBranches")
    WebElement corporateBranchAllowedField;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__corporateChannels__allowedBranches_div']/ul/li")
    List <WebElement> corporateBranchesAllowed;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__corporateChannels__defaultBranch")
    WebElement  corporateDefaultBranch;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__userSettings__status_option_ACTIVE_span_")
    WebElement corporateActive;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__userSettings__status_option_INACTIVE_span_")
    WebElement corporateInActive;
    //TradeProductEnrichment
    @FindBy(xpath = "//*[@id='newonb__NewOnboarding__CorporateChannelstoggle']/label[2]")
    WebElement corporateEnrichmentYes;
    @FindBy(xpath = "//*[@id='newonb__NewOnboarding__CorporateChannelstoggle']/label[1]")
    WebElement corporateEnrichmentNo;
  //genraldetails
    @FindBy(id = "newonb__ProductOnboardingDetails__i__corporateChannels__rmEmail")
    WebElement corporateRelationshipEmail;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__corporateChannels__partyIdDesc")
    WebElement partyDescription;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__corporateChannels__bankEntityName_span")
    WebElement corpBankEntityDD;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__corporateChannels__bankEntityName_div']/ul/li")
    List <WebElement> corpBankEntity;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__corporateChannels__defaultPartyId_option_T_span_")
    WebElement defaultPartyYes;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__corporateChannels__defaultPartyId_option_F_span_")
    WebElement defaultPartyNo;
    //Bank office references
    @FindBy(id = "newonb__ProductOnboardingDetails__i__corporateChannels__backOfficeRef1")
    WebElement bankOfficeRef1;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__corporateChannels__backOfficeRef2")
    WebElement bankOfficeRef2;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__corporateChannels__backOfficeRef3")
    WebElement bankOfficeRef3;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__corporateChannels__backOfficeRef4")
    WebElement bankOfficeRef4;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__corporateChannels__backOfficeRef5")
    WebElement bankOfficeRef5;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__corporateChannels__backOfficeRef6")
    WebElement bankOfficeRef6;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__corporateChannels__backOfficeRef7")
    WebElement bankOfficeRef7;
    //user settings
    @FindBy(id = "newonb__ProductOnboardingDetails__i__userSettings__passwordExpiryDays")
    WebElement bankCorporatePasswordExpiry;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__userSettings__dualAuthControl_option_T_span_")
    WebElement  corporateDualAuthorizationYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__userSettings__dualAuthControl_option_F_span_")
    WebElement corporateDualAuthorizationNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__userSettings__selfAuth_option_T_span_")
    WebElement  corporateSelfAuthorizationYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__userSettings__selfAuth_option_F_span_")
    WebElement corporateSelfAuthorizationNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__userSettings__bulkPaymtAuthLimit_option_T_span_")
    WebElement  corporateBulkPaymentLimitYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__userSettings__bulkPaymtAuthLimit_option_F_span_")
    WebElement corporateBulkPaymentLimitNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__userSettings__cutoffDateMvmt_option_T_span_")
    WebElement  corporateTransactionCutOffYes;
    @FindBy(id  = "newonb__ProductOnboardingDetails__i__userSettings__cutoffDateMvmt_option_F_span_'")
    WebElement corporateTransactionCutOffNo;
    //customer role details
    @FindBy(id = "newonb__AllTypes__i__custRoleDtls__identifier")
    WebElement custRoleIdentifier;
    @FindBy(id = "newonb__NewOnboarding__el_btn_189")
    WebElement addCustRoleIdentifer;
    //Entity role Details
    @FindBy(id = "newonb__AllTypes__i__entityRoleDtls__identifier")
    WebElement entityRoleIdentifier;
    @FindBy(id = "newonb__NewOnboarding__el_btn_191")
    WebElement addEntityRoleIdentifer;
    //file upload details
    @FindBy(id ="newonb__ProductOnboardingDetails__i__fileUploadSettings__maxAttachSize")
    WebElement  corporateMaxAttachmentSize;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__fileUploadSettings__fileRetentionPeriod")
    WebElement  corporateFileRetentionPeriod;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__fileUploadSettings__hashValueCheck_option_T_span_")
    WebElement  corporateCheckHashValuesYes;
    @FindBy(xpath = "newonb__ProductOnboardingDetails__i__fileUploadSettings__hashValueCheck_option_F_span_'")
    WebElement corporateCheckHashValuesNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__fileUploadSettings__fileDuplicationCheck_option_T_span_")
    WebElement  corporateFileDuplicationCheckYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__fileUploadSettings__fileDuplicationCheck_option_F_span_")
    WebElement corporateFileDuplicationCheckNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__fileUploadSettings__duplicateCustCheck_option_T_span_")
    WebElement  corporateDuplicateCustomerCheckYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__fileUploadSettings__duplicateCustCheck_option_F_span_")
    WebElement corporateDuplicateCustomerCheckNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__fileUploadSettings__rejectException_option_T_span_")
    WebElement corporateRejectCompleteFileCheckYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__fileUploadSettings__rejectException_option_F_span_")
    WebElement corporateRejectCompleteFileCheckNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__fileUploadSettings__draftFileException_option_T_span_")
    WebElement  corporateDraftFileCheckYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__fileUploadSettings__draftFileException_option_F_span_")
    WebElement corporateDraftFileCheckNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__fileUploadSettings__allowMerDemerDel_option_T_span_")
    WebElement  corporateAllowTranscationsCheckYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__fileUploadSettings__allowMerDemerDel_option_F_span_")
    WebElement corporateAllowTranscationsCheckNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__userSettings__remarks")
    WebElement  corporateRemarks;
    @FindBy(id="newonb__NewOnboarding__el_btn_180")
    WebElement corporateProceed;
    @FindBy(xpath = "//p[@class='msg']")
    WebElement alertMsg;
    //Remarks
    @FindBy(id ="newonb__NewOnboarding__CCRemarks_li")
    WebElement  corporateChenalRemarks;

    private CommonElements commonElements;
    private TextBoxControls textBoxControls;
    private JavaScriptControls javaScriptControls;
    private DropdownControls dropdownControls;
    private WaitUtility waitUtility;


    public CorporatePage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        textBoxControls= new TextBoxControls();
        javaScriptControls = new JavaScriptControls(driver);
        dropdownControls = new DropdownControls();
        waitUtility= new WaitUtility();

    }

    //actions on basic Details corporate
    public void selectDefaultEntity(String branchAllowed) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateDefaultBankEntityDD);
        selectionOfDropdown(branchAllowed,corporateDefaultBankEntityList);
    }

    public void selectCorporateBranch(String branchAllowed) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateBranchAllowedDD);
        selectionOfDropdown(branchAllowed,corporateBranchesAllowed);
    }

public void SetRemarks(String remark) throws Exception {
        waitUtility.waitTillElementVisible(driver,corporateChenalRemarks,10);
        textBoxControls.setText(corporateChenalRemarks,remark);

}

    public void selectCorporateDefaultBranch(String defaultBranch) throws Exception {
        dropdownControls.selectViaVisibleText(corporateDefaultBranch,defaultBranch);
    }

    public void setCorporateActive() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateActive);

    }
    //actions on general Details corporate
    public void setCorporateEnrichmentYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateEnrichmentYes);

    }
    public void setCorporateRelationshipEmail(String relationEmail) throws Exception {
        textBoxControls.setText(corporateRelationshipEmail,relationEmail);

    }
    public void selectCorporateBankEntityDD(String bankName) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corpBankEntityDD);
        selectionOfDropdown(bankName,corpBankEntity);
    }
    public void setPartyDescription(String partyDesc) throws Exception {
        textBoxControls.setText(partyDescription,partyDesc);
    }
    public void setCorporateDefaultPartyYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",defaultPartyYes);
    }
    //action on corporate user settings
    public void setBankCorporatePasswordExpiry(String passwordExpiry) throws Exception {
        textBoxControls.setText(bankCorporatePasswordExpiry,passwordExpiry);
    }
    public void setBankDualAuthorizationYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateDualAuthorizationYes);
    }
    public void setBankSelfAuthorizationYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateSelfAuthorizationYes);
    }
    public void setCorporateBulkPaymentLimitYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateBulkPaymentLimitYes);
    }
    public void setCorporateTransactionCutOffYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateTransactionCutOffYes);
    }
    //Add cust and entity role
    public void setCustRoleIdentifier(String custRole) throws Exception {
        dropdownControls.selectViaVisibleText(custRoleIdentifier,custRole);
    }
    public void AddCustRoleIdentifier() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",addCustRoleIdentifer);
    }
    public void setEntityRoleIdentifier(String EntityRole) throws Exception {
        dropdownControls.selectViaVisibleText(entityRoleIdentifier,EntityRole);
    }
    public void AddEntityRoleIdentifier() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",addEntityRoleIdentifer);
    }
    //Actions on file upload settings
    public void setCorporateMaxAttachmentSize(String maxSize) throws Exception {
        textBoxControls.setText(corporateMaxAttachmentSize,maxSize);

    }
    public void setCorporateFileRetentionPeriod(String retentionPeriod) throws Exception {
        textBoxControls.setText(corporateFileRetentionPeriod,retentionPeriod);
    }
    public void setCorporateCheckHashValuesYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateCheckHashValuesYes);
    }
    public void setCorporateFileDuplicationCheckYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateFileDuplicationCheckYes);
    }
    public void setCorporateDuplicateCustomerCheckYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateDuplicateCustomerCheckYes);
    }
    public void setCorporateRejectCompleteFileCheckYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateRejectCompleteFileCheckYes);
    }
    public void setCorporateDraftFileCheckYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateDraftFileCheckYes);
    }
    public void setCorporateAllowTranscationCheckYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateAllowTranscationsCheckYes);
    }

    public void setCorporateRemarks(String remarks) throws Exception {
        Thread.sleep(10000);
        textBoxControls.setText(corporateRemarks,remarks);

    }
    public void getCorporateProceed() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateProceed);

    }
    public ContactTaxPage clickOnCorporateProceed() throws Exception {
        getCorporateProceed();
        return new ContactTaxPage();
    }
    public String clickOnCorporateProceedBtn() throws Exception {
        getCorporateProceed();
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


    public void verifyEditCorporateFieldValues(String corporateBranch, String defaultBranch, String bankName, String remarks) throws Exception {
        checkFieldData(commonElements.getAttribute(corporateBranchAllowedField,"value"),corporateBranch);
        checkFieldData(commonElements.getAttribute(corporateDefaultBranch,"value"),defaultBranch);
        checkFieldData(commonElements.getAttribute(corporateDefaultBankEntity,"value"),bankName);
//        checkFieldData(commonElements.getAttribute(corporateRemarks,"value"),remarks);

    }
    public void checkFieldData(String actualData,String expectedData){

        Assert.assertEquals(actualData,expectedData);
    }

    public void verifyEditCorporateProductFieldValues(String corporateBranch, String defaultBranch, String relationEmail, String bankName, String partyDesc, String passwordExpiry, String custRole, String entityRole, String maxSize, String retentionPeriod, String remarks) throws Exception {
        checkFieldData(commonElements.getAttribute(corporateBranchAllowedField,"value"),corporateBranch);
        checkFieldData(commonElements.getAttribute(corporateDefaultBranch,"value"),defaultBranch);
        checkFieldData(commonElements.getAttribute(corporateDefaultBankEntity,"value"),bankName);
        checkFieldData(commonElements.getAttribute(corporateRelationshipEmail,"value"),relationEmail);
        checkFieldData(commonElements.getAttribute(corporateDefaultBankEntity,"value"),bankName);
        checkFieldData(commonElements.getAttribute(partyDescription,"value"),partyDesc);
        checkFieldData(commonElements.getAttribute(bankCorporatePasswordExpiry,"value"),passwordExpiry);
        checkFieldData(commonElements.getAttribute(corporateMaxAttachmentSize,"value"),maxSize);
        checkFieldData(commonElements.getAttribute(corporateFileRetentionPeriod,"value"),retentionPeriod);
        checkFieldData(commonElements.getAttribute(corporateRemarks,"value"),remarks);
    }
}
