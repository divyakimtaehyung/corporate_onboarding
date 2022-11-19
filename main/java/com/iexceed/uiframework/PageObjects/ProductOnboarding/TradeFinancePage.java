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
import java.util.Random;

public class TradeFinancePage extends TestBase {
    @FindBy(xpath = "//span[@id='select2-newonb__ProductOnboardingDetails__i__tradeFinance__primaryBankEntity-container']")
    WebElement TradeDefaultBankEntityDD;
    @FindBy(xpath = "//ul[@id='select2-newonb__ProductOnboardingDetails__i__tradeFinance__primaryBankEntity-results']/li")
    List <WebElement> TradeDefaultBankEntity;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__homeCountry_span")
    WebElement tradeHomeDD;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__tradeFinance__homeCountry_div']/ul/li")
    List <WebElement> tradeHomeCountry;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__allowedBranches_span")
    WebElement tradeBranchAllowedDD;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__allowedBranches")
    WebElement tradeBranchAllowedField;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__tradeFinance__allowedBranches_div']/ul/li")
    List <WebElement> tradeBranchesAllowed;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__defaultBranch")
    WebElement  tradeDefaultBranch;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__status_option_ACTIVE_span_")
    WebElement tradeActive;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__status_option_INACTIVE_span_")
    WebElement tradeInActive;
    //TradeProductEnrichment
    @FindBy(xpath = "//*[@id='newonb__NewOnboarding__TradeFinancetoggle']/label[2]")
    WebElement tradeEnrichmentYes;
    @FindBy(xpath = "//*[@id='newonb__NewOnboarding__TradeFinancetoggle']/label[1]")
    WebElement tradeEnrichmentNo;

    //contact Details
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__telex")
    WebElement tradeTelex;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__telexAnswerback")
    WebElement tradeTelexAnswerback;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__primaryLocation")
    WebElement tradeLocation;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__transferMethod_span")
    WebElement  tradeTransferMethodDD;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__transferMethod")
    WebElement  tradeTransferMethodField;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__tradeFinance__transferMethod_div']/ul/li")
    List <WebElement> tradeTransferMethod;
    //Document Details
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__noOfOriginals")
    WebElement tradeNoOfOriginals;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__noOfCopies")
    WebElement tradeNoOfCopies;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__noOfDuplicates")
    WebElement tradeNoofDuplicates;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__mailToBranch")
    WebElement tradeMailToBranch;
    //Adressee Details
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__addressId")
    WebElement tradeAddressId;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__addresseeCustomer")
    WebElement tradeAddressCustomer;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__addresseeDefaultBusinessEntity_span")
    WebElement tradeAddressDefaultBusinessDD;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__addresseeDefaultBusinessEntity")
    WebElement tradeAddressDefaultBusinessField;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__tradeFinance__addresseeDefaultBusinessEntity_div']/ul/li")
    List <WebElement> tradeAddressDefaultBusiness;
    //TradeSwiftDetails
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__allowMT103C_option_T_span_")
    WebElement  tradeSwiftAllowMT103CYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__allowMT103C_option_F_span_")
    WebElement tradeSwiftAllowMT103CNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__swiftAcknowledgementRequired_option_T_span_")
    WebElement  tradeSwiftAcknowledgementRequiredYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__swiftAcknowledgementRequired_option_F_span_")
    WebElement tradeSwiftAcknowledgementRequiredNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__transliterateSwift_option_T_span_")
    WebElement  tradeTransliterateSwiftYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__transliterateSwift_option_F_span_")
    WebElement tradeTransliterateSwiftNo;
    //Special Instructions

    @FindBy(id ="newonb__TradeFinanceSpecialnstrucModel__i__splInstructions__severity_span")
    WebElement  tradeFinanceSeverityDD;
    @FindBy(id ="newonb__TradeFinanceSpecialnstruction__i__splInstructions__severity_0_txtcnt")
    WebElement  tradeFinanceSeverityField;
    @FindBy(xpath = "//div[@id='newonb__TradeFinanceSpecialnstrucModel__i__splInstructions__severity_div']/ul/li")
    List<WebElement> tradeFinanceSeverity;
    @FindBy(id ="newonb__TradeFinanceSpecialnstrucModel__i__splInstructions__code")
    WebElement  tradeSpclInstructionsCode;
    @FindBy(id ="newonb__TradeFinanceSpecialnstruction__i__splInstructions__code_0_txtcnt")
    WebElement  tradeSpclInstructionsCodeField;
    @FindBy(id ="newonb__TradeFinanceSpecialnstrucModel__i__splInstructions__businessArea_span")
    WebElement  tradeFinanceBusinessDD;
    @FindBy(id ="newonb__TradeFinanceSpecialnstruction__i__splInstructions__businessArea_0_txtcnt")
    WebElement  tradeFinanceBusinessField;
    @FindBy(xpath = "//div[@id='newonb__TradeFinanceSpecialnstrucModel__i__splInstructions__businessArea_div']/ul/li")
    List<WebElement> tradeFinanceBusiness;
    @FindBy(id ="newonb__TradeFinanceSpecialnstrucModel__i__splInstructions__type_span")
    WebElement  tradeFinanceTypeDD;
    @FindBy(id ="newonb__TradeFinanceSpecialnstruction__i__splInstructions__type_0_txtcnt")
    WebElement  tradeFinanceTypeField;
    @FindBy(xpath = "//div[@id='newonb__TradeFinanceSpecialnstrucModel__i__splInstructions__type_div']/ul/li")
    List<WebElement> tradeFinanceType;
    @FindBy(id ="newonb__TradeFinanceSpecialnstrucModel__i__splInstructions__style")
    WebElement  tradeFinanceStyle;
    @FindBy(id ="newonb__TradeFinanceSpecialnstruction__i__splInstructions__style_0_txtcnt")
    WebElement  tradeFinanceStyleField;
    @FindBy(id ="newonb__TradeFinanceSpecialnstrucModel__i__splInstructions__details")
    WebElement  tradeFinanceDetails;
    @FindBy(id ="newonb__TradeFinanceSpecialnstruction__i__splInstructions__details_0_txtcnt")
    WebElement  tradeFinanceDetailsField;
    @FindBy(id ="newonb__TradeFinanceSpecialnstrucModel__i__splInstructions__actionFlag_span")
    WebElement  tradeActionFlagDD;

    @FindBy(id ="newonb__TradeFinanceSpecialnstruction__i__splInstructions__actionFlag_0_txtcnt")
    WebElement  tradeActionFlagField;
    @FindBy(xpath = "//div[@id='newonb__TradeFinanceSpecialnstrucModel__i__splInstructions__actionFlag_div']/ul/li")
    List<WebElement> tradeActionFlag;
    @FindBy(id ="newonb__TradeFinanceSpecialnstrucModel__i__splInstructions__emphasis_option_T_span_")
    WebElement  tradeEmphasisYes;
    @FindBy(id ="newonb__TradeFinanceSpecialnstrucModel__i__splInstructions__emphasis_option_F_span_")
    WebElement  tradeEmphasisNo;
    @FindBy(id ="newonb__NewOnboarding__el_btn_146")
    WebElement  tradeSpclInstructionsAdd;
    //Rate Code
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__principalFXRateCode_span")
    WebElement  tradePrincipalFXRateCodeDD;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__principalFXRateCode")
    WebElement  tradePrincipalFXRateCodeField;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__tradeFinance__principalFXRateCode_div']/ul/li")
    List <WebElement> tradePrincipalFXRateCode;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__chargeFXRateCode_span")
    WebElement  tradeChargeFXRateCodeDD;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__chargeFXRateCode")
    WebElement  tradeChargeFXRateCodeField;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__tradeFinance__chargeFXRateCode_div']/ul/li")
    List <WebElement> tradeChargeFXRateCode;

    //Cutt Off Details
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__cutOffFXRateCode_span")
    WebElement  tradeCutOffFXRateCodeDD;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__cutOffFXRateCode")
    WebElement  tradeCutOffFXRateCodeField;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__tradeFinance__cutOffFXRateCode_div']/ul/li")
    List <WebElement> tradeCutOffFXRateCode;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__cutOffAmount")
    WebElement  tradeCutOffAmount;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__cutOffCurrency_span")
    WebElement  tradeCutOffCurrencyDD;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__cutOffCurrency")
    WebElement  tradeCutOffCurrencyField;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__tradeFinance__cutOffCurrency_div']/ul/li")
    List <WebElement> tradeCutOffCurrency;
    //CorporateApplications
    @FindBy(id="newonb__NewOnboarding__accessId")
    WebElement corporateAccessId;
    @FindBy(id="newonb__TradeFinanceCorporateApplication__i__corporateAccessIdentifier__accessId_0_txtcnt")
    WebElement corporateAccesIdField;
    @FindBy(id="newonb__NewOnboarding__el_btn_148")
    WebElement corporateAccessBtn;

    //OtherDetails
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__chargeGroup_span")
    WebElement  tradeChargeGrpDD;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__chargeGroup")
    WebElement  tradeChargeGrpField;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__tradeFinance__chargeGroup_div']/ul/li")
    List <WebElement> tradeChargeGrp;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__team_span")
    WebElement  tradeTeamDD;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__team")
    WebElement  tradeTeamField;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__tradeFinance__team_div']/ul/li")
    List <WebElement> tradeteam;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__clearingNumber")
    WebElement  tradeClearing;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__analysisCode_span")
    WebElement tradeAnalysisCodeDD;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__analysisCode")
    WebElement tradeAnalysisCodeField;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__tradeFinance__analysisCode_div']/ul/li")
    List <WebElement> tradeAnalysisCode;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__allowTaxExemptions_option_T_span_")
    WebElement  tradeAllowTaxExemptionsYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__allowTaxExemptions_option_F_span_")
    WebElement tradeAllowTaxExemptionsNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__suspended_option_T_span_")
    WebElement  tradeSuspendedYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__tradeFinance__suspended_option_F_span_")
    WebElement tradeSuspendedNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__allowInterestConsolidation_option_T_span_")
    WebElement  tradeAllowInterestConsolidationYes;
    @FindBy(xpath = "newonb__ProductOnboardingDetails__i__tradeFinance__allowInterestConsolidation_option_F_span_")
    List <WebElement> tradeAllowInterestConsolidationNo;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__limitCheckRequired_span")
    WebElement  tradeLimitCheckRequiredDD;
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__limitCheckRequired")
    WebElement  tradeLimitCheckRequiredField;
    @FindBy(xpath = "//div[@id='newonb__ProductOnboardingDetails__i__tradeFinance__limitCheckRequired_div']/ul/li")
    List <WebElement> tradeLimitCheckRequired;
    //Remarks
    @FindBy(id ="newonb__ProductOnboardingDetails__i__tradeFinance__remarks")
    WebElement  tradeFinanceRemarks;
    @FindBy(id = "newonb__NewOnboarding__el_btn_155")
    WebElement tradeProceed;
    @FindBy(id = "newonb__NewOnboarding__el_btn_154")
    WebElement tradeCancel;
    @FindBy(xpath = "//p[@class='msg']")
    WebElement alertMsg;


    private CommonElements commonElements;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private DropdownControls dropdownControls;
    private JavaScriptControls javaScriptControls;


    public TradeFinancePage() {
        PageFactory.initElements(driver, this);
        commonElements = new CommonElements();
        textBoxControls = new TextBoxControls();
        dropdownControls = new DropdownControls();
        javaScriptControls = new JavaScriptControls(driver);
        waitUtility = new WaitUtility();

    }

    public void setTradeChargeGroupDD(String chargeGroup) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeChargeGrpDD);
        selectionOfDropdown(chargeGroup,tradeChargeGrp);
    }
    public void setTradeTeamDD(String team) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeTeamDD);
        selectionOfDropdown(team,tradeteam);
    }
    public void setTradeClearing(String clearingNum) throws Exception {
        int clearingNumber = new Random().nextInt(999999);
        textBoxControls.setText(tradeClearing, String.valueOf(clearingNumber));
    }
    public void setTradeAnalysisCodeDD(String analysisCode) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeAnalysisCodeDD);
        selectionOfDropdown(analysisCode,tradeAnalysisCode);
    }
    public void setTradeAllowTaxExemptionsYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeAllowTaxExemptionsYes);
    }
    public void setTradeAllowInterestConsolidationYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeAllowInterestConsolidationYes);

    }
    public void setTradeSuspendedYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeSuspendedYes);

    }
    public void setTradeLimitCheckRequired(String limitCheck) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeLimitCheckRequiredDD);
        selectionOfDropdown(limitCheck,tradeLimitCheckRequired);
    }
    public void setTradeFinanceRemarks(String tradeRemarks) throws Exception {
        textBoxControls.setText(tradeFinanceRemarks,tradeRemarks);

    }
    //action on trade branch
    public void setDefaultBranchPrimaryEntity(String branchAllowed) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",TradeDefaultBankEntityDD);
        selectionOfDropdown(branchAllowed,TradeDefaultBankEntity);
    }

    public void setTradeBranchAllowedDD(String branchAllowed) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeBranchAllowedDD);
        selectionOfDropdown(branchAllowed,tradeBranchesAllowed);
    }
    public void setTradeDefaultBranch(String defaultBranch) throws Exception {
        dropdownControls.selectViaVisibleText(tradeDefaultBranch,defaultBranch);
    }
    public void setTradeStatusActive() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeActive);
    }
    // Trade contact Details actions
    public void setTradeEnrichmentYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeEnrichmentYes);

    }
    public void setTradeTelex(String telex) throws Exception {
        textBoxControls.setText(tradeTelex,telex);
    }
    public void setTradeTelexAnswerback(String answerBack) throws Exception {
        textBoxControls.setText(tradeTelexAnswerback,answerBack);
    }
    public void setTradeTransferMethodDD(String transferMethod) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();",tradeTelexAnswerback);
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeTransferMethodDD);
        waitUtility.waitForSeconds(10);
        selectionOfDropdown(transferMethod,tradeTransferMethod);

    }
    public void setTradeLocation(String primaryLocation) throws Exception {
        textBoxControls.setText(tradeLocation,primaryLocation);
    }
    //actions on addressee details
    public void setTradeAddressDefaultBusinessDD(String addBusiness) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeAddressDefaultBusinessDD);
        selectionOfDropdown(addBusiness,tradeAddressDefaultBusiness);
    }
    public void setTradeAddressCustomer(String addCustomer) throws Exception {
        textBoxControls.setText(tradeAddressCustomer,addCustomer);
    }
    public void setTradeAddressId(String addCustId) throws Exception {
        textBoxControls.setText(tradeAddressId, addCustId);
    }
    //action on document detail
    public void setTradeNoOfOriginals(String noOfOriginals) throws Exception {
        textBoxControls.setText(tradeNoOfOriginals,noOfOriginals);
    }
    public void setTradeNoOfCopies(String noOfCopies) throws Exception {
        textBoxControls.setText(tradeNoOfCopies,noOfCopies);
    }
    public void setTradeNoOfDuplicates(String noOfDuplicates) throws Exception {
        textBoxControls.setText(tradeNoofDuplicates,noOfDuplicates);
    }
    public void setTradeMailToBranch(String mailToBranch) throws Exception {
        dropdownControls.selectViaVisibleText(tradeMailToBranch,mailToBranch);
    }
    //Action on TradeSwift
    public void setTradeSwiftAllowMT103CYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeSwiftAllowMT103CYes);
    }
    public void setTradeSwiftAcknowledgementRequiredYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeSwiftAcknowledgementRequiredYes);
    }
    public void setTradeTransliterateSwiftYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeTransliterateSwiftYes);
    }
    public void setTradeSwiftAllowMT103CNo() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeSwiftAllowMT103CNo);
    }
    public void setTradeSwiftAcknowledgementRequiredNo() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeSwiftAcknowledgementRequiredNo);
    }
    public void setTradeTransliterateSwiftNo() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeTransliterateSwiftNo);
    }
    //trade finance severity actions
    public void setTradeFinanceSeverityDD(String severity) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();",tradeFinanceStyle);
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeFinanceSeverityDD);
        selectionOfDropdown(severity,tradeFinanceSeverity);
    }
    public void selectTradeSpclInstructionsCode(String code) throws Exception {
        dropdownControls.selectViaVisibleText(tradeSpclInstructionsCode,code);
    }
    public void setTradeFinanceBusinessDD(String businessArea) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeFinanceBusinessDD);
        selectionOfDropdown(businessArea,tradeFinanceBusiness);
    }
    public void setTradeFinanceTypeDD(String type) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeFinanceTypeDD);
        selectionOfDropdown(type,tradeFinanceType);
    }
    public void setTradeFinanceStyle(String style) throws Exception {
        textBoxControls.setText(tradeFinanceStyle,style);
    }
    public void setTradeFinanceDetails(String details) throws Exception {
        textBoxControls.setText(tradeFinanceDetails,details);
    }
    public void setTradeActionFlagDD(String action) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeActionFlagDD);
        selectionOfDropdown(action,tradeActionFlag);
    }
    public void setTradeEmphasisNo() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeEmphasisNo);
    }
    public void setTradeSpclInstructionsAdd() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeSpclInstructionsAdd);
    }
    public String clickOnAddSpclInstructions() throws Exception {
        setTradeSpclInstructionsAdd();
        waitUtility.waitTillElementVisible(driver,alertMsg,10);
        return alertMsg.getText();
    }
    //action on Trade Rate Code
    public void setTradePrincipalFXRateCodeDD(String principalFxCode) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradePrincipalFXRateCodeDD);
        selectionOfDropdown(principalFxCode,tradePrincipalFXRateCode);
    }
    public void setTradeChargeFXRateCode(String chargeFxCode) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeChargeFXRateCodeDD);
        selectionOfDropdown(chargeFxCode,tradeChargeFXRateCode);
    }
    //Trade cutt off code actions
    public void setTradeCutOffFXRateCode(String cutOffFXRateCode) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeCutOffFXRateCodeDD);
        selectionOfDropdown(cutOffFXRateCode,tradeCutOffFXRateCode);

    }
    public void setTradeCutOffAmount(String cutOffAmount) throws Exception {
        textBoxControls.setText(tradeCutOffAmount,cutOffAmount);
    }
    public void setTradeCutOffCurrency(String cutOffCurrency) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeCutOffCurrencyDD);
        selectionOfDropdown(cutOffCurrency,tradeCutOffCurrency);

    }
    public void setTradeCorporateId(String corporateId) throws Exception {
        textBoxControls.setText(corporateAccessId,corporateId);
    }
    public void setTradeCorporateAccessBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",corporateAccessBtn);
    }
    public void getTradeProceed() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",tradeProceed);

    }
    public ContactTaxPage clickOnProceedTrade() throws Exception {
        getTradeProceed();
        return new ContactTaxPage();
    }
    public String clickOnTradeProceedBtn() throws Exception {
        getTradeProceed();
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


    public void verifyEditTradeFieldValues(String branchesAllowed, String defaultBranch, String bankName, String remarks) throws Exception {
        checkFieldData(commonElements.getAttribute(tradeBranchAllowedField,"value"),branchesAllowed);
        checkFieldData(commonElements.getAttribute(tradeDefaultBranch,"value"),defaultBranch);

//        checkFieldData(commonElements.getAttribute(tradeDefaultBankEntity,"value"),bankName);

        //checkFieldData(commonElements.getAttribute(corporateDefaultBankEntity,"value"),bankName);

//        checkFieldData(commonElements.getAttribute(tradeFinanceRemarks,"value"),remarks);

    }
    public void checkFieldData(String actualData,String expectedData){

        Assert.assertEquals(actualData,expectedData);
    }


    public void verifyEditTradeFinanceFieldValues(String branchesAllowed, String defaultBranch, String telex, String answerBack, String transferMethod, String primaryLocation, String addBusiness, String addCustomer, String addCustId, String noOfOriginals, String noOfCopies, String noOfDuplicates, String mailToBranch, String severity, String code, String businessArea, String type, String style, String action, String details, String principalFxCode, String chargeFxCode, String cutOffFXRateCode, String cutOffAmount, String cutOffCurrency, String corporateId, String chargeGroup, String team, String clearingNum, String analysisCode, String limitCheck, String tradeRemarks) throws Exception {
        checkFieldData(commonElements.getAttribute(tradeBranchAllowedField,"value"),branchesAllowed);
        checkFieldData(commonElements.getAttribute(tradeDefaultBranch,"value"),defaultBranch);
        //checkFieldData(commonElements.getAttribute(corporateDefaultBankEntity,"value"),bankName);
        checkFieldData(commonElements.getAttribute(tradeTelex,"value"),telex);
        checkFieldData(commonElements.getAttribute(tradeTelexAnswerback,"value"),answerBack);
        checkFieldData(commonElements.getAttribute(tradeTransferMethodField,"value"),transferMethod);
        checkFieldData(commonElements.getAttribute(tradeLocation,"value"),primaryLocation);
        checkFieldData(commonElements.getAttribute(tradeAddressDefaultBusinessField,"value"),addBusiness);
        checkFieldData(commonElements.getAttribute(tradeAddressCustomer,"value"),addCustomer);
        checkFieldData(commonElements.getAttribute(tradeAddressId,"value"),addCustId);
        checkFieldData(commonElements.getAttribute(tradeNoOfOriginals,"value"),noOfOriginals);
        checkFieldData(commonElements.getAttribute(tradeNoOfCopies,"value"),noOfCopies);
        checkFieldData(commonElements.getAttribute(tradeNoofDuplicates,"value"),noOfDuplicates);
        checkFieldData(commonElements.getAttribute(tradeMailToBranch,"value"),mailToBranch);

        checkFieldData(commonElements.getText(tradeFinanceSeverityField),severity);
        checkFieldData(commonElements.getText(tradeSpclInstructionsCodeField),code);
        checkFieldData(commonElements.getText(tradeFinanceBusinessField),businessArea);
        checkFieldData(commonElements.getText(tradeFinanceTypeField),type);
        checkFieldData(commonElements.getText(tradeFinanceStyleField),style);
        checkFieldData(commonElements.getText(tradeFinanceDetailsField),details);
        // checkFieldData(commonElements.getText(tradeActionFlagField),action);
        checkFieldData(commonElements.getAttribute(tradePrincipalFXRateCodeField,"value"),principalFxCode);
        checkFieldData(commonElements.getAttribute(tradeChargeFXRateCodeField,"value"),chargeFxCode);

        checkFieldData(commonElements.getAttribute(tradeCutOffFXRateCodeField,"value"),cutOffFXRateCode);
        checkFieldData(commonElements.getAttribute(tradeCutOffAmount,"value"),cutOffAmount);
        checkFieldData(commonElements.getAttribute(tradeCutOffCurrencyField,"value"),cutOffCurrency);

        checkFieldData(commonElements.getAttribute(tradeChargeGrpField,"value"),chargeGroup);
        checkFieldData(commonElements.getAttribute(tradeTeamField,"value"),team);
        //checkFieldData(commonElements.getAttribute(tradeClearing,"value"),clearingNum);
        checkFieldData(commonElements.getAttribute(tradeAnalysisCodeField,"value"),analysisCode);
        checkFieldData(commonElements.getAttribute(tradeLimitCheckRequiredField,"value"),limitCheck);
        checkFieldData(commonElements.getAttribute(tradeFinanceRemarks,"value"),tradeRemarks);

    }
}
