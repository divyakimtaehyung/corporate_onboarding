package com.iexceed.uiframework.PageObjects.ProductOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import groovyjarjarantlr.ASdebug.IASDebugStream;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static com.iexceed.uiframework.PageObjects.ProductOnboarding.PartyDetailsPage.companyNameHeader;

public class DashboardPage extends TestBase {

    @FindBy(xpath = "//*[@id='applst__ApplicationList__statusApplicationList']//a/span")
    List<WebElement> pendingAppMenu;
    @FindBy(xpath = "//*[@id='dshbrd__Dashboard__pendingApplicationList']//a/span")
    List<WebElement> MypendingQueueApps;
    @FindBy(xpath = "//*[@id='dshbrd__Dashboard__wipApplicationList']/ul/li")
    List<WebElement> OtherQueueApps;
    //reference otherApp first row
    @FindBy(id="dshbrd__PaintWIP__o__documents__corpName_0")
    WebElement otherAppFirstRow;

    @FindBy(xpath="//a[contains(text(),'Other Applications')]")
    WebElement otherAppTab;
    @FindBy(id="dshbrd__PaintWIP__o__documents__currentStage_0_txtcnt")
    WebElement pendingAt;
    @FindBy(id = "ptonbd__PostLogin__newApplnbtn_txtcnt")
    WebElement NewAppBtn;
    @FindBy(id = "viewap__ViewCustomerDetails__modalCompName_txtcnt")
    WebElement compName;
    @FindBy(id = "viewap__ViewCustomerDetails__modalpartyId_txtcnt")
    WebElement partyId;
    @FindBy(id = "viewap__ViewCustomerDetails__editBtn")
    WebElement editBtn;
    @FindBy(id ="dshbrd__Dashboard__el_hpl_17_txtcnt")
    WebElement viewFullAppBtn;
    @FindBy(id ="viewap__ViewCustomerDetails__el_hpl_12")
    WebElement viewFullAppBtnForOtherAPP;


    @FindBy(id="viewap__ViewCustomerDetails__assignBtn")
    WebElement viewAssignBtn;
    @FindBy(xpath="/html/body/div[6]/div[2]/div/section/div[1]/div/div[4]/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/ul/li/button[2]")
    WebElement viewRejectBtn;
    @FindBy(id="viewap__ViewCustomerDetails__approveBtn")
    WebElement previewApproveBtn;
    @FindBy(id="viewap__ViewCustomerDetails__rejectBtn")
    WebElement previewRejectBtn;
    @FindBy(id ="viewap__ViewCustomerDetails__approveRemarks")
    WebElement approveRemarks;
    @FindBy(id ="viewap__ViewCustomerDetails__rejectRemarks")
    WebElement rejectRemarks;
    @FindBy(id = "viewap__ViewCustomerDetails__el_btn_41")
    WebElement approveBtn;
    @FindBy(id="viewap__ViewCustomerDetails__rejectMsg_txtcnt")
    WebElement rejectMsg;
    @FindBy(id="viewap__ViewCustomerDetails__approveSucCompName_txtcnt")
    WebElement approveSucCompName;
    @FindBy(id="viewap__ViewCustomerDetails__approveSucPartyId_txtcnt")
    WebElement approveSucPartyId;
    @FindBy(id="viewap__ViewCustomerDetails__rejectSucCompName_txtcnt")
    WebElement rejectSucCompName;
    @FindBy(id="viewap__ViewCustomerDetails__rejectSucPartyId_txtcnt")
    WebElement rejectSucPartyId;
    @FindBy(id="viewap__ViewCustomerDetails__el_btn_42")
    WebElement dashboardBtn;
    @FindBy(id="viewap__ViewCustomerDetails__el_hpl_12_txtcnt")
    WebElement viewApplication;
    @FindBy(id="viewap__ViewCustomerDetails__menuBtn_txtcnt")
    WebElement menuDD;
    @FindBy(id ="viewap__ViewCustomerDetails__unassignHL_txtcnt")
    WebElement unassignBtn;
    @FindBy(id ="viewap__ViewCustomerDetails__reassignHL_txtcnt")
    WebElement reassignBtn;
    @FindBy(xpath="//p[@class='msg']")
    WebElement alertBox;
    @FindBy(id ="viewap__ViewCustomerDetails__deleteHL_txtcnt")
    WebElement deleteBtn;
    @FindBy(id="viewap__ViewCustomerDetails__el_btn_47_txtcnt")
    WebElement confirmYes;
    @FindBy(id="viewap__ViewCustomerDetails__el_btn_55_txtcnt")
    WebElement okayBtn;
    @FindBy(id="viewap__ViewCustomerDetails__userIdCB_0_lbl")
    WebElement userId;
    @FindBy(id = "viewap__ViewCustomerDetails__el_btn_53")
    WebElement reassignView;
    @FindBy(id="viewap__ViewCustomerDetails__hanfoffBtn")
    WebElement viewHandOffBtn;
    @FindBy(id="handof__ViewIntegrationStatus__o__statusDetails__status_0_txtcnt")
    WebElement handoffStatus;
    @FindBy(id="handof__ViewIntegrationStatus__o__integrationStatusDetails__apiNameHeader")
    WebElement apiHeader;
    @FindBy(id ="handof__ViewIntegrationStatus__o__integrationStatusDetails__apiName_0")
    WebElement partyApi0;
    @FindBy(id="handof__ViewIntegrationStatus__o__integrationStatusDetails__status_0_txtcnt")
    WebElement partyApi0Status;
    @FindBy(id="handof__ViewIntegrationStatus__o__statusDetails__requestId_0_txtcnt")
    WebElement requestId;
    @FindBy(id ="handof__ViewIntegrationStatus__o__integrationStatusDetails__apiName_1")
    WebElement partyApi1;
    @FindBy(id="handof__ViewIntegrationStatus__o__integrationStatusDetails__status_1_txtcnt")
    WebElement partyApi1Status;
    @FindBy(id ="handof__ViewIntegrationStatus__o__integrationStatusDetails__apiName_2")
    WebElement partyEnrichTF;
    @FindBy(id="handof__ViewIntegrationStatus__o__integrationStatusDetails__status_2_txtcnt")
    WebElement partyEnrichTFStatus;
    @FindBy(id ="handof__ViewIntegrationStatus__o__integrationStatusDetails__apiName_3")
    WebElement partyGroupApiCM;
    @FindBy(id="handof__ViewIntegrationStatus__o__integrationStatusDetails__status_3_txtcnt")
    WebElement partyGroupApiCMStatus;
    @FindBy(id ="handof__ViewIntegrationStatus__o__integrationStatusDetails__apiName_4")
    WebElement partyGroupApiCC;
    @FindBy(id="handof__ViewIntegrationStatus__o__integrationStatusDetails__status_4_txtcnt")
    WebElement partyGroupApiCCStatus;
    @FindBy(id ="handof__ViewIntegrationStatus__o__integrationStatusDetails__apiName_5")
    WebElement partyGroupEnrichCC;
    @FindBy(id="handof__ViewIntegrationStatus__o__integrationStatusDetails__status_5_txtcnt")
    WebElement partyGroupEnrichCCStatus;
    @FindBy(id="handof__HandOffDetails__closeBtn")
    WebElement handoffCancelBtn;
    @FindBy(id="viewap__ViewCustomerDetails__closeBtn")
    WebElement viewCloseBtn;
    @FindBy(id ="ptonbd__PostLogin__el_hpl_completedlnk")
    WebElement completedApplication;
    @FindBy(id ="ptonbd__PostLogin__el_hpl_dashboardlink")
    WebElement dashboardMenu;
    @FindBy(id ="//*[@id='applst__ApplicationList__statusApplicationList']//a/span")
    List<WebElement> completedAppList;
    @FindBy(id ="newonb__NewOnboarding__el_txt_922_txtcnt")
    WebElement productDetails;
    //View application
    @FindBy(id="viewap__ViewApplication__o__customerInfo__corporateEntityName_txtcnt")
    WebElement corporateName;
    @FindBy(id="viewap__ViewApplication__o__customerInfo__companyShortName_txtcnt")
    WebElement corporateShortName;
    @FindBy(id="viewap__ViewApplication__o__customerInfo__homeCountry_txtcnt")
    WebElement homeCountry;
    @FindBy(id="viewap__ViewApplication__o__customerInfo__primaryBankEntity_txtcnt")
    WebElement bankEntity;
    @FindBy(id="viewap__ViewApplication__o__customerInfo__primaryOperatingCurrency_txtcnt")
    WebElement primaryCurrency;
    @FindBy(id="viewap__ViewApplication__o__customerInfo__customerType_txtcnt")
    WebElement partyField;
    @FindBy(id="viewap__ViewApplication__o__customerInfo__typeOfIndustry_txtcnt")
    WebElement typeOfIndustry;
    @FindBy(id="viewap__ViewApplication__o__customerInfo__sicCode_txtcnt")
    WebElement sicCode;
    @FindBy(id="viewap__ViewApplication__o__customerInfo__licenseType_txtcnt")
    WebElement licenceTypeField;
    @FindBy(id="viewap__ViewApplication__o__customerInfo__licenseNo_txtcnt")
    WebElement licenseNo;
    @FindBy(id="viewap__ViewApplication__o__customerInfo__licenseIssuedCountry_txtcnt")
    WebElement licenceIssuedCountryField;
    @FindBy(id="viewap__ViewApplication__o__addressDetails__addressLine1_txtcnt")
    WebElement addressLine1;
    @FindBy(id="viewap__ViewApplication__o__addressDetails__addressLine2_txtcnt")
    WebElement addressLine2;
    @FindBy(id="viewap__ViewApplication__o__addressDetails__addressLine3_txtcnt")
    WebElement addressLine3;
    @FindBy(id="viewap__ViewApplication__o__addressDetails__postalCode_txtcnt")
    WebElement addPostalCode;
    @FindBy(id="viewap__ViewApplication__o__addressDetails__addressLine4_txtcnt")
    WebElement addressCity;
    @FindBy(id="viewap__ViewApplication__o__addressDetails__state_txtcnt")
    WebElement addressStateField;
    @FindBy(id="viewap__ViewApplication__o__addressDetails__country_txtcnt")
    WebElement addressCountryField;
    @FindBy(id="viewap__ViewApplication__o__swiftInfo__swiftCode_txtcnt")
    WebElement swftCode;
    @FindBy(id="viewap__ViewApplication__o__swiftInfo__swiftAddress1_txtcnt")
    WebElement swftAddLine1;
    @FindBy(id="viewap__ViewApplication__o__swiftInfo__swiftAddress2_txtcnt")
    WebElement swftAddLine2;
    @FindBy(id="viewap__ViewApplication__o__swiftInfo__swiftAddressState_txtcnt")
    WebElement swftStateField;
    @FindBy(id="viewap__ViewApplication__o__swiftInfo__swiftAddressCountry_txtcnt")
    WebElement swftAddressCountryField;
    @FindBy(id="viewap__ViewApplication__o__contactDetails__fullName_txtcnt")
    WebElement contactName;
    @FindBy(id="viewap__ViewApplication__o__contactDetails__mobileNumber_txtcnt")
    WebElement primaryContactNumber;
    @FindBy(id="viewap__ViewApplication__o__contactDetails__officePhoneNo_txtcnt")
    WebElement secContactNumber;
    @FindBy(id="viewap__ViewApplication__o__additionalInfo__correspondenceLanguage_txtcnt")
    WebElement corresLanguageField;
    @FindBy(id="viewap__ViewApplication__o__contactDetails__email_txtcnt")
    WebElement email;
    @FindBy(id="viewap__ViewApplication__o__additionalInfo__companyWebsite_txtcnt")
    WebElement companyWebsite;
    @FindBy(id="viewap__ViewApplication__o__additionalInfo__taxId_txtcnt")
    WebElement taxId;
    @FindBy(id="viewap__ViewApplication__o__additionalInfo__taxCountry_txtcnt")
    WebElement taxCountryField;
    @FindBy(id="viewap__ViewApplication__o__additionalInfo__agreementReference_txtcnt")
    WebElement agreementRef;
    @FindBy(id="viewap__ViewApplication__o__additionalInfo__riskCountry_txtcnt")
    WebElement riskCountryField;
    @FindBy(id="viewap__ViewApplication__o__additionalInfo__rmName_txtcnt")
    WebElement rmanagerName;
    @FindBy(id="viewap__ViewApplication__o__additionalInfo__activationDate_txtcnt")
    WebElement activationDate;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__viewap__CashManagmentProdOnboard_Res__primaryBankEntity_txtcnt")
    WebElement cashBankEntity ;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__viewap__CashManagmentProdOnboard_Res__homeCountry_txtcnt")
    WebElement cashHomeCountry;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__viewap__CashManagmentProdOnboard_Res__allowedBranches_txtcnt")
    WebElement cashAllowedBranchDDField;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__viewap__CashManagmentProdOnboard_Res__defaultBranch_txtcnt")
    WebElement cashDefaultBranch;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__viewap__CashManagmentProdOnboard_Res__remarks_txtcnt")
    WebElement cashRemarks;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__viewap__CashManagmentProdOnboard_Res__brandingService_txtcnt")
    WebElement brandingServiceField;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__viewap__CashManagmentProdOnboard_Res__segment_txtcnt")
    WebElement partySegmentField;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__billingId_txtcnt")
    WebElement cashBillingID;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__billingStartDate_txtcnt")
    WebElement cashBillingDate;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__billingProfile_txtcnt")
    WebElement billingProfileField;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__billingContactPerson_txtcnt")
    WebElement billingContactPerson;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__billingAddressType_txtcnt")
    WebElement cashManagementAddressField;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__billingAddress_txtcnt")
    WebElement cashMgmtAddress;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__billingCountry_txtcnt")
    WebElement cashManagementCountryField;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__billingState_txtcnt")
    WebElement cashManagementStateField;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__billingCity_txtcnt")
    WebElement cashMgmtCity;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__billingEmailId_txtcnt")
    WebElement cashMgmtEmail;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__billingContactNumber1_txtcnt")
    WebElement primaryCashMobileCode;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__billingContactNumber2_txtcnt")
    WebElement secCashContactNumber;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__billingFaxNumber_txtcnt")
    WebElement cashMgmtFax;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__discountPercentage_txtcnt")
    WebElement billingDiscountPercentage;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__promoBillingStartDate_txtcnt")
    WebElement cashpromoStartdate;
    @FindBy(id="viewap__CashManagmentProdOnboard__o__billing__promoBillingEndDate_txtcnt")
    WebElement cashpromoEnddate;
    //corporate
    @FindBy(id="viewap__ViewProductOnboarding__o__viewap__ViewProductOnboarding_Res__primaryBankEntity_txtcnt")
    WebElement corporateBankEntity;
    @FindBy(id="viewap__ViewProductOnboarding__o__viewap__ViewProductOnboarding_Res__homeCountry_txtcnt")
    WebElement corporateHomeCountry;
    @FindBy(id="viewap__ViewProductOnboarding__o__viewap__ViewProductOnboarding_Res__allowedBranches_txtcnt")
    WebElement corporateAllowedBranches;
    @FindBy(id="viewap__ViewProductOnboarding__o__viewap__ViewProductOnboarding_Res__defaultBranch_txtcnt")
    WebElement corporateDefaultBranch;
    @FindBy(id="viewap__ViewProductOnboarding__o__viewap__ViewProductOnboarding_Res__remarks_txtcnt")
    WebElement corporateRemarks;
    @FindBy(id="viewap__ViewProductOnboarding__o__viewap__ViewProductOnboarding_Res__rmEmail_txtcnt")
    WebElement corporateEmail;
    @FindBy(id="viewap__ViewProductOnboarding__o__viewap__ViewProductOnboarding_Res__partyIdDesc_txtcnt")
    WebElement corporatePartyId;
    @FindBy(id="viewap__ViewProductOnboarding__o__viewap__ViewProductOnboarding_Res__backOfficeRef1_txtcnt")
    WebElement backOffice1;
    @FindBy(id="viewap__ViewProductOnboarding__o__viewap__ViewProductOnboarding_Res__backOfficeRef7_txtcnt")
    WebElement backOffice7;
    @FindBy(id="viewap__ViewProductOnboarding__o__userSettings__passwordExpiryDays_txtcnt")
    WebElement corporatePasswordExpiry;
    @FindBy(id="viewap__ViewProductOnboarding__o__userSettings__dualAuthControl_txtcnt")
    WebElement dualAuth;
    @FindBy(id="viewap__ViewProductOnboarding__o__userSettings__selfAuth_txtcnt")
    WebElement selfAuth;
    @FindBy(id="viewap__ViewProductOnboarding__o__userSettings__bulkPaymtAuthLimit_txtcnt")
    WebElement bulkPaymentAuth;
    @FindBy(id="viewap__ViewProductOnboarding__o__userSettings__cutoffDateMvmt_txtcnt")
    WebElement cuttoffbreach;
    @FindBy(id="viewap__ViewProductOnboarding__o__customerRoleDetails__partyRoleIdentifier_0_txtcnt")
    WebElement customerRoleIdentifier;
    @FindBy(id="viewap__ViewProductOnboarding__o__customerRoleDetails__partyRoleName_0_txtcnt")
    WebElement customerRoleName;
    @FindBy(id="viewap__ViewProductOnboarding__o__entityRoleDetails__entityRoleIdentifier_0_txtcnt")
    WebElement entityRoleIdentifier;
    @FindBy(id="viewap__ViewProductOnboarding__o__entityRoleDetails__entityRoleName_0_txtcnt")
    WebElement entityRoleName;
    //fileupload
    @FindBy(id="viewap__ViewProductOnboarding__o__fileUploadSettings__maxAttachSize_txtcnt")
    WebElement corporateMaxAttachSize;
    @FindBy(id="viewap__ViewProductOnboarding__o__fileUploadSettings__fileRetentionPeriod_txtcnt")
    WebElement corporateRetentionPeriod;
    //TradeFinance
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__primaryBankEntity_txtcnt")
    WebElement tradeBankEntity;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__homeCountry_txtcnt")
    WebElement tradeHomeCountry;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__allowedBranches_txtcnt")
    WebElement tradeAllowedBranch;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__defaultBranch_txtcnt")
    WebElement tradeBranch;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__remarks_txtcnt")
    WebElement tradeRemark;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__telex_txtcnt")
    WebElement tradeTelex;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__telexAnswerback_txtcnt")
    WebElement tradeAnswer;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__transferMethod_txtcnt")
    WebElement tradeTransferMethod;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__primaryLocation_txtcnt")
    WebElement tradePrimaryLocation;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__addresseeDefaultBusinessEntity_txtcnt")
    WebElement tradeAddresBusinessEntity;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__addresseeCustomer_txtcnt")
    WebElement tradeAddressCustomer;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__addressId_txtcnt")
    WebElement tradeAddressId;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__noOfOriginals_txtcnt")
    WebElement tradeNoOfOriginals;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__noOfCopies_txtcnt")
    WebElement tradeNoOfCopies;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__noOfDuplicates_txtcnt")
    WebElement tradeNoOfDuplicates;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__mailToBranch_txtcnt")
    WebElement trademailToBranch;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__allowMT103C_txtcnt")
    WebElement tradeAllowMT103C;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__principalFXRateCode_txtcnt")
    WebElement tradePrincipalFXRateCode;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__chargeFXRateCode_txtcnt")
    WebElement tradeChargeFXRateCode;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__cutOffFXRateCode_txtcnt")
    WebElement tradeCutOffFXRateCode;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__cutOffAmount_txtcnt")
    WebElement tradeCutOffAmount;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__cutOffCurrency_txtcnt")
    WebElement tradeCutOffCurrency;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__chargeGroup_txtcnt")
    WebElement tradeChargeGroup;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__team_txtcnt")
    WebElement tradeTeam;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__clearingNumber_txtcnt")
    WebElement tradeClearingNum;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__analysisCode_txtcnt")
    WebElement tradeAnalysisCode;
    @FindBy(id="viewap__ViewTradeFinance__i__viewap__ViewTradeFinance_Req__limitCheckRequired_txtcnt")
    WebElement tradelimitCheckRequired;
    @FindBy(id="viewap__ViewTradeFinance__i__corporateAccessIdentifier__accessId_0_txtcnt")
    WebElement corpId;
    @FindBy(id="viewap__ViewTradeFinance__i__splInstructions__severity_0_txtcnt")
    WebElement tradeSeverity;
    @FindBy(id="viewap__ViewTradeFinance__i__splInstructions__code_0_txtcnt")
    WebElement tradeCode;
    @FindBy(id="viewap__ViewTradeFinance__i__splInstructions__businessArea_0_txtcnt")
    WebElement tradeBusinessArea;
    @FindBy(id="viewap__ViewTradeFinance__i__splInstructions__type_0_txtcnt")
    WebElement tradeType;
    @FindBy(id="viewap__ViewTradeFinance__i__splInstructions__style_0_txtcnt")
    WebElement tradeStyle;
    @FindBy(id="viewap__ViewTradeFinance__i__splInstructions__details_0_txtcnt")
    WebElement tradeDetails;
    @FindBy(id="viewap__ViewTradeFinance__i__splInstructions__actionFlag_0_txtcnt")
    WebElement tradeActionFlag;
    //Revenue management
    @FindBy(id="viewap__RevenueProdOnboard__o__viewap__RevenueProdOnboard_Res__remarks_txtcnt")
    WebElement revenueRemarks;


    //group
    @FindBy(id="viewap__ViewApplication__o__groupDetails__hierarchy_txtcnt")
    WebElement hierarchyGrp;
    @FindBy(id="viewap__ViewApplication__o__groupDetails__parentPartyId_txtcnt")
    WebElement parentPartyId;
    @FindBy(id="viewap__ViewCustomerDetails__remarks_txtcnt")
    WebElement hierarchyRemarks;


    //customergroup
    @FindBy(id="viewap__GroupDetails__o__partyGroups1__groupDesc_txtcnt")
    WebElement partyGroupDesc;
    @FindBy(id="viewap__GroupDetails__o__partyGroups1__groupType_txtcnt")
    WebElement partyGroupType;
    @FindBy(id="viewap__GroupDetails__o__partyGroups1__businessEntityName_txtcnt")
    WebElement partyBusinessEntityName;
    @FindBy(id="viewap__GroupDetails__o__partyGroups1__legalName_txtcnt")
    WebElement partyLegalName;
    @FindBy(id="viewap__GroupDetails__o__partyGroups1__country_txtcnt")
    WebElement partyCountry;
    @FindBy(id="viewap__GroupDetails__o__partyGroups1__state_txtcnt")
    WebElement partyState;
    @FindBy(id="viewap__GroupDetails__o__partyGroups1__taxCountry_txtcnt")
    WebElement partyTaxCountry;
    @FindBy(id="viewap__GroupDetails__o__partyGroups1__rmName_txtcnt")
    WebElement partyRmName;
    //cggrp details
    @FindBy(id="viewap__GroupDetails__o__partyGroups2__groupDesc_txtcnt")
    WebElement cgdSelfGroupIdDesc;
    @FindBy(id="viewap__GroupDetails__o__partyGroups2__legalName_txtcnt")
    WebElement cgdLegalName;
    @FindBy(id="viewap__GroupDetails__o__partyGroups2__country_txtcnt")
    WebElement cgdSelfCountry;
    @FindBy(id="viewap__GroupDetails__o__partyGroups2__state_txtcnt")
    WebElement cgdSelfStateField;
    @FindBy(id="viewap__GroupDetails__o__partyGroups2__taxCountry_txtcnt")
    WebElement cgdSelfTaxCountry;
    @FindBy(id="viewap__GroupDetails__o__partyGroups2__rmName_txtcnt")
    WebElement cgdSelfRmName;

    //companyname
    @FindBy(id="viewap__ViewCustomerDetails__modalCompName")
    WebElement companyName;
    String companyNameLocal;



    private CommonElements commonElements;
    private TextBoxControls textBoxControls;
    private JavaScriptControls javaScriptControls;
    private DropdownControls dropdownControls;
    private CommonDriver commonDriver;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;

    public DashboardPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        textBoxControls= new TextBoxControls();
        javaScriptControls= new JavaScriptControls(driver);
        dropdownControls = new DropdownControls();
        commonDriver = new CommonDriver(driver);
        waitUtility = new WaitUtility();
        windowHandling = new WindowHandling(driver);

    }
    public String getDashboardPageTitle()throws Exception{
        commonDriver.getDriver();
        return commonDriver.getTitle();

    }
    public String getRequestId() throws Exception {
        return commonElements.getText(requestId);
    }
    public String getHandOffStatus() throws Exception {
        return commonElements.getText(handoffStatus);
    }
    public void getPartyApi0() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", partyApi0);
    }
    public String getPartyApi0Status() throws Exception {
        return commonElements.getText(partyApi0Status);
    }
    public void getPartyApi1() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", partyApi1);
    }
    public String getPartyApi1Status() throws Exception {
        return commonElements.getText(partyApi1Status);
    }
    public void getPartyEnrichTFApi() throws Exception {
        waitUtility.waitForSeconds(3);
        javaScriptControls.executeJavaScript("arguments[0].click();", partyEnrichTF);
    }
    public String getPartEnrichTFStatus() throws Exception {
        return commonElements.getText(partyEnrichTFStatus);
    }
    public void getPartyGroupCMApi() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", partyGroupApiCM);
    }
    public String getPartyGroupCMStatus() throws Exception {
        return commonElements.getText(partyGroupApiCMStatus);
    }
    public void getPartyGroupCCApi() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", partyGroupApiCC);
    }
    public String getPartyGroupCCStatus() throws Exception {
        return commonElements.getText(partyGroupApiCCStatus);
    }
    public void getPartyGroupEnrichCCApi() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", partyGroupEnrichCC);
    }
    public String getPartyGroupEnrichCCStatus() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();",partyGroupEnrichCCStatus);
        return commonElements.getText(partyGroupEnrichCCStatus);
    }
    public void waitForPartyApi0(){
        waitUtility.waitTillElementVisible(driver,apiHeader,150);
    }
    public void waitForNewAppBtn(){
        waitUtility.waitTillElementVisible(driver,NewAppBtn,20);
    }
    public void waitForViewAssignBtn(){
        waitUtility.waitTillElementVisible(driver,viewAssignBtn,180);
    }
    public void waitForApproveSucCompName(){
        waitUtility.waitTillElementVisible(driver,approveSucCompName,100);
    }
    public void waitForRejectAlert() throws Exception {
        waitUtility.waitTillElementVisible(driver,rejectMsg,20);
        commonElements.getText(rejectMsg);
    }
    public String getApproveSucCompName() throws Exception {
        return commonElements.getText(approveSucCompName);
    }
    public String getApproveSucPartyId() throws Exception {
        return commonElements.getText(approveSucPartyId);
    }
    public String getRejectSucCompName() throws Exception {
        return commonElements.getText(rejectSucCompName);
    }
    public String getRejectSucPartyId() throws Exception {
        return commonElements.getText(rejectSucPartyId);
    }



    public void getCompanyName(String compNameHeader) throws Exception {
        waitUtility.waitForSeconds(3);
        selectionOfDropdown(compNameHeader,MypendingQueueApps);
    }
    public void getCompanyName1() throws Exception {
        waitUtility.waitForSeconds(3);

//        companyNameLocal="Apex481";
        try {
            selectionOfDropdown(companyNameLocal, OtherQueueApps);
            commonElements.click(otherAppFirstRow);
            waitUtility.waitForSeconds(4);

        }catch(Exception e){
            commonElements.click(otherAppFirstRow);
            waitUtility.waitForSeconds(4);
        }
    }


    public void getEditBtn() throws Exception {
        Thread.sleep(40000);
        waitUtility.waitTillElementVisible(driver,editBtn,150);
        companyNameLocal=commonElements.getText(companyName);
        javaScriptControls.executeJavaScript("arguments[0].click();", editBtn);

    }
    public void getOtherAppTab()throws Exception{
        waitUtility.waitTillElementVisible(driver,otherAppTab,8);
        javaScriptControls.executeJavaScript("arguments[0].click();", otherAppTab);
    }
    public String getPendingAt()throws Exception{
       return commonElements.getText(pendingAt);
    }

    public void setViewAssignBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();",viewAssignBtn);
        javaScriptControls.executeJavaScript("arguments[0].click();", viewAssignBtn);
    }
    public void setPreviewApproveBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", previewApproveBtn);
    }
    public void selectProductDetails() throws Exception {
        waitUtility.waitTillElementVisible(driver,productDetails,30);
        javaScriptControls.executeJavaScript("arguments[0].click();", productDetails);
    }
    public void setPreviewRejectBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", previewRejectBtn);
    }
    public void setViewRejectBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", viewRejectBtn);
    }
    public void setApproveRemarks() throws Exception {
        textBoxControls.setText(approveRemarks,"remarksApproved");
    }
    public void setRejectRemarks() throws Exception {
        textBoxControls.setText(rejectRemarks,"remarksRejected");
    }

    public void setApproveBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", approveBtn);
    }
    public DashboardPage setDashboardBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", dashboardBtn);
        return new DashboardPage();
    }
    public void setViewHandOffBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();",viewHandOffBtn);
        javaScriptControls.executeJavaScript("arguments[0].click();", viewHandOffBtn);
    }

    public void waitForSeconds() throws Exception {
        waitUtility.waitForSeconds(100);
    }
    public void getHandOffCloseBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", handoffCancelBtn);
    }
    public CompletedAppPage getCompleteAppBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", dashboardMenu);
        javaScriptControls.executeJavaScript("arguments[0].click();", completedApplication);
        return new CompletedAppPage();
    }
    public void selectionOfDropdown (String itemType, List < WebElement > type) throws Exception {
        //System.out.println("sizetype=" + type.size());
        for (WebElement name : type) {
            if (name.getText().equals(itemType)) {
               // System.out.println(name.getText());
                name.click();
                break;
            }
        }

    }


    public void clickOfViewApplication() throws Exception {
        waitUtility.waitTillElementVisible(driver,viewApplication,30);
        javaScriptControls.executeJavaScript("arguments[0].click();", viewApplication);
//        javaScriptControls.executeJavaScript("arguments[0].click();", menuDD);


    }

    public String unassignOfApplication() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", unassignBtn);
        waitUtility.waitTillElementVisible(driver,alertBox,20);
        return alertBox.getText();
    }

    public String deleteOfApplication() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", deleteBtn);
        javaScriptControls.executeJavaScript("arguments[0].click();", confirmYes);
        waitUtility.waitTillElementVisible(driver,alertBox,20);
        return alertBox.getText();

    }
    public void reassignOfApplication() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", reassignBtn );
        waitUtility.waitTillElementVisible(driver,userId,20);
        javaScriptControls.executeJavaScript("arguments[0].click();", userId );
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();",reassignView);
        javaScriptControls.executeJavaScript("arguments[0].click();", reassignView );
        waitUtility.waitTillElementVisible(driver,okayBtn,20);
        javaScriptControls.executeJavaScript("arguments[0].click();", okayBtn);


    }

    public void getViewFullAppBtn() throws Exception {
        waitUtility.waitTillElementVisible(driver,viewFullAppBtn,20);
        javaScriptControls.executeJavaScript("arguments[0].click();", viewFullAppBtn);
        waitUtility.waitForSeconds(10);
    }

    public void getViewFullAppBtnForOtherAPP() throws Exception {
        waitUtility.waitTillElementVisible(driver,viewFullAppBtnForOtherAPP,25);
        javaScriptControls.executeJavaScript("arguments[0].click();", viewFullAppBtnForOtherAPP);
        waitUtility.waitForSeconds(10);
    }

    public void verifyBasicFieldValuesOnView(String corpName, String corpShortName, String primaryBank,String country,String currency) throws Exception {
       // waitUtility.waitTillElementVisible(driver,proceedStage1Btn,20);
        waitUtility.waitForSeconds(10);
        checkFieldData(commonElements.getText(corporateName),corpName);
        checkFieldData(commonElements.getText(corporateShortName),corpShortName);
        checkFieldData(commonElements.getText(bankEntity),primaryBank);
        //checkFieldData(commonElements.getText(homeCounty),country);
        checkFieldData(commonElements.getText(primaryCurrency),currency);
    }
    public void verifyPartyFieldValuesOnView(String prtyType, String typeIndustry, String sicCde, String licensesType, String licensesNumber , String licensesIssuedCountry) throws Exception {
        checkFieldData(commonElements.getText(partyField),prtyType);
        checkFieldData(commonElements.getText(typeOfIndustry),typeIndustry);
        // checkFieldData(commonElements.getAttribute(sicCode,"value"),sicCde);
        checkFieldData(commonElements.getText(licenceTypeField),licensesType);
        checkFieldData(commonElements.getText(licenseNo),licensesNumber);
        checkFieldData(commonElements.getText(licenceIssuedCountryField),licensesIssuedCountry);
    }
    public void verifyAddressSwiftDetailsOnView(String addLine1, String addLine2, String addLine3, String postalCode, String addCountry, String addState, String addCity, String swiftCode, String swiftAddLine1, String swiftAddLine2, String swiftCountry, String swiftState) throws Exception {
        checkFieldData(commonElements.getText(addressLine1),addLine1);
        checkFieldData(commonElements.getText(addressLine2),addLine2);
        checkFieldData(commonElements.getText(addressLine3),addLine3);
        checkFieldData(commonElements.getText(addPostalCode),postalCode);
        checkFieldData(commonElements.getText(addressCountryField),addCountry);
        checkFieldData(commonElements.getText(addressStateField),addState);
        checkFieldData(commonElements.getText(addressCity),addCity);
        checkFieldData(commonElements.getText(swftCode),swiftCode);
        checkFieldData(commonElements.getText(swftAddLine1),swiftAddLine1);
        checkFieldData(commonElements.getText(swftAddLine2),swiftAddLine2);
        checkFieldData(commonElements.getText(swftAddressCountryField),swiftCountry);
        checkFieldData(commonElements.getText(swftStateField),swiftState);
    }
    public void verifyContactOtherFieldValuesOnView(String title,String name,String mobileCode,String primaryNum,String officeCode,String secNum,String faxNum,String correspLang,String emailID,String compWebsite,String taxID,String taxCountry,String agreeRef,String riskCountry,String rmName,String date) throws Exception {
       // checkFieldData(commonElements.getAttribute(titleField,"value"),title);
        checkFieldData(commonElements.getText(contactName),name);
        checkFieldData(commonElements.getText(primaryContactNumber),primaryNum);
        checkFieldData(commonElements.getText(secContactNumber),secNum);
        //checkFieldData(commonElements.getText(cashMgmtFax),faxNum);
        checkFieldData(commonElements.getText(corresLanguageField),correspLang);
        checkFieldData(commonElements.getText(email),emailID);
        checkFieldData(commonElements.getText(companyWebsite),compWebsite);
        checkFieldData(commonElements.getText(taxId),taxID);
        checkFieldData(commonElements.getText(taxCountryField),taxCountry);
        checkFieldData(commonElements.getText(agreementRef),agreeRef);
        checkFieldData(commonElements.getText(riskCountryField),riskCountry);
        checkFieldData(commonElements.getText(rmanagerName),rmName);
    }
    public void verifyViewCashProductFieldValues(String branchAllowed, String defaultBranch, String brandingService, String partySegment, String billingId, String billingProfile, String billingStartDate, String billingContactPersons, String addressType, String address, String country, String state, String city, String mobileCode, String primaryCashNumber, String officeCode, String secondaryNumber, String email, String faxNumber, String discountPercentage, String remarks) throws Exception {
        checkFieldData(commonElements.getText(cashAllowedBranchDDField),branchAllowed);
        checkFieldData(commonElements.getText(cashDefaultBranch),defaultBranch);
        //checkFieldData(commonElements.getAttribute(corporateDefaultBankEntity,"value"),bankName);
        checkFieldData(commonElements.getText(brandingServiceField),brandingService);
        checkFieldData(commonElements.getText(partySegmentField),partySegment);
        checkFieldData(commonElements.getText(cashBillingID),billingId);
        checkFieldData(commonElements.getText(billingProfileField),billingProfile);
        checkFieldData(commonElements.getText(billingContactPerson),billingContactPersons);
        //checkFieldData(commonElements.getText(cashManagementAddressField),addressType);
        checkFieldData(commonElements.getText(cashMgmtAddress),address);
        checkFieldData(commonElements.getText(cashManagementStateField),state);
        checkFieldData(commonElements.getText(cashManagementCountryField),country);
        checkFieldData(commonElements.getText(cashMgmtCity),city);
        checkFieldData(commonElements.getText(cashMgmtEmail),email);
        checkFieldData(commonElements.getText(cashMgmtFax),faxNumber);
        checkFieldData(commonElements.getText(billingDiscountPercentage),discountPercentage);
        checkFieldData(commonElements.getText(cashRemarks),remarks);
        checkFieldData(commonElements.getText(primaryCashMobileCode),"+"+mobileCode+"-"+primaryCashNumber);
        checkFieldData(commonElements.getText(secCashContactNumber),"+"+mobileCode+"-"+secondaryNumber);
    }
    public void verifyViewCashFieldValues(String cashBranch, String defaultBranch, String bankName, String remarks) throws Exception {
        checkFieldData(commonElements.getText(cashAllowedBranchDDField),cashBranch);
        checkFieldData(commonElements.getText(cashDefaultBranch),defaultBranch);
//        checkFieldData(commonElements.getAttribute(corporateDefaultBankEntity,"value"),bankName);
//        checkFieldData(commonElements.getText(cashRemarks),remarks);

    }
    public void verifyViewCorporateProductFieldValues(String corporateBranch, String defaultBranch, String relationEmail, String bankName, String partyDesc, String passwordExpiry, String custRole, String entityRole, String maxSize, String retentionPeriod, String remarks) throws Exception {
        checkFieldData(commonElements.getText(corporateAllowedBranches),corporateBranch);
        checkFieldData(commonElements.getText(corporateDefaultBranch),defaultBranch);
        checkFieldData(commonElements.getText(corporateBankEntity),bankName);
        checkFieldData(commonElements.getText(corporateEmail),relationEmail);
        checkFieldData(commonElements.getText(corporateBankEntity),bankName);
        checkFieldData(commonElements.getText(corporatePartyId),partyDesc);
        checkFieldData(commonElements.getText(corporatePasswordExpiry),passwordExpiry);
        checkFieldData(commonElements.getText(corporateMaxAttachSize),maxSize);
        checkFieldData(commonElements.getText(corporateRetentionPeriod),retentionPeriod);
        checkFieldData(commonElements.getText(corporateRemarks),remarks);
    }
    public void verifyViewCorporateFieldValues(String corporateBranch, String defaultBranch, String bankName, String remarks) throws Exception {
        checkFieldData(commonElements.getText(corporateAllowedBranches),corporateBranch);
        checkFieldData(commonElements.getText(corporateDefaultBranch),defaultBranch);
        checkFieldData(commonElements.getText(corporateBankEntity),bankName);
//        checkFieldData(commonElements.getText(corporateRemarks),remarks);

    }
    public void verifyViewTradeFinanceFieldValues(String branchesAllowed, String defaultBranch, String telex, String answerBack, String transferMethod, String primaryLocation, String addBusiness, String addCustomer, String addCustId, String noOfOriginals, String noOfCopies, String noOfDuplicates, String mailToBranch, String severity, String code, String businessArea, String type, String style, String action, String details, String principalFxCode, String chargeFxCode, String cutOffFXRateCode, String cutOffAmount, String cutOffCurrency, String corporateId, String chargeGroup, String team, String clearingNum, String analysisCode, String limitCheck, String tradeRemarks) throws Exception {
        checkFieldData(commonElements.getText(tradeAllowedBranch),branchesAllowed);
        checkFieldData(commonElements.getText(tradeBranch),defaultBranch);
        //checkFieldData(commonElements.getAttribute(corporateDefaultBankEntity,"value"),bankName);
        checkFieldData(commonElements.getText(tradeTelex),telex);
        checkFieldData(commonElements.getText(tradeAnswer),answerBack);
        checkFieldData(commonElements.getText(tradeTransferMethod),transferMethod);
        checkFieldData(commonElements.getText(tradePrimaryLocation),primaryLocation);
        checkFieldData(commonElements.getText(tradeAddresBusinessEntity),addBusiness);
        checkFieldData(commonElements.getText(tradeAddressCustomer),addCustomer);
        checkFieldData(commonElements.getText(tradeAddressId),addCustId);
        checkFieldData(commonElements.getText(tradeNoOfOriginals),noOfOriginals);
        checkFieldData(commonElements.getText(tradeNoOfCopies),noOfCopies);
        checkFieldData(commonElements.getText(tradeNoOfDuplicates),noOfDuplicates);
        checkFieldData(commonElements.getText(trademailToBranch),mailToBranch);

        checkFieldData(commonElements.getText(tradeSeverity),severity);
        checkFieldData(commonElements.getText(tradeCode),code);
        checkFieldData(commonElements.getText(tradeBusinessArea),businessArea);
        checkFieldData(commonElements.getText(tradeType),type);
        checkFieldData(commonElements.getText(tradeStyle),style);
        checkFieldData(commonElements.getText(tradeDetails),details);
        // checkFieldData(commonElements.getText(tradeActionFlagField),action);
        checkFieldData(commonElements.getText(tradePrincipalFXRateCode),principalFxCode);
        checkFieldData(commonElements.getText(tradeChargeFXRateCode),chargeFxCode);

        checkFieldData(commonElements.getText(tradeCutOffFXRateCode),cutOffFXRateCode);
        checkFieldData(commonElements.getText(tradeCutOffAmount),cutOffAmount);
        checkFieldData(commonElements.getText(tradeCutOffCurrency),cutOffCurrency);

        checkFieldData(commonElements.getText(tradeChargeGroup),chargeGroup);
        checkFieldData(commonElements.getText(tradeTeam),team);
        //checkFieldData(commonElements.getAttribute(tradeClearing,"value"),clearingNum);
        checkFieldData(commonElements.getText(tradeAnalysisCode),analysisCode);
        checkFieldData(commonElements.getText(tradelimitCheckRequired),limitCheck);
        checkFieldData(commonElements.getText(tradeRemark),tradeRemarks);

    }




    public void verifyViewTradeFinancewithoutFieldValues(String branchesAllowed, String defaultBranch, String telex, String answerBack, String transferMethod, String primaryLocation, String addBusiness, String addCustomer, String addCustId, String noOfOriginals, String noOfCopies, String noOfDuplicates, String mailToBranch, String severity, String code, String businessArea, String type, String style, String action, String details, String principalFxCode, String chargeFxCode, String cutOffFXRateCode, String cutOffAmount, String cutOffCurrency, String corporateId, String chargeGroup, String team, String clearingNum, String analysisCode, String limitCheck, String tradeRemarks) throws Exception {
        checkFieldData(commonElements.getText(tradeAllowedBranch),branchesAllowed);
        checkFieldData(commonElements.getText(tradeBranch),defaultBranch);
        //checkFieldData(commonElements.getAttribute(corporateDefaultBankEntity,"value"),bankName);
//        checkFieldData(commonElements.getText(tradeRemark),tradeRemarks);

    }





    public void verifyCreateParentGrpFieldOnView(String groupDesc, String country, String state, String taxCountry, String rmName) throws Exception {
        checkFieldData(commonElements.getText(partyGroupDesc),groupDesc);
        checkFieldData(commonElements.getText(partyLegalName),companyNameHeader);
        checkFieldData(commonElements.getText(partyCountry),country);
        checkFieldData(commonElements.getText(partyState),state);
        checkFieldData(commonElements.getText(partyTaxCountry),taxCountry);
        checkFieldData(commonElements.getText(partyRmName),rmName);
    }
    public void verifyRevenueRemarksFieldOnView(String revenueRemark) throws Exception {
        checkFieldData(commonElements.getText(revenueRemarks),revenueRemark);

    }
    public void verifyPgGroupIDFieldOnView(String pgGroupId) throws Exception {
       // checkFieldData(commonElements.getText(pgGroupID),pgGroupId);

    }
    public void checkFieldData(String actualData,String expectedData){

        Assert.assertEquals(actualData,expectedData);
    }

    public void verifyGroupOnView(String hierarchyGroup) throws Exception {
       String group = hierarchyGroup.trim().replaceAll("\\s","");
        checkFieldData(commonElements.getText(hierarchyGrp),group);
    }
    public void verifyParentPartyIdOnView(String parentPartyIds) throws Exception {
        String id = parentPartyIds.split(" ")[0];
        checkFieldData(commonElements.getText(parentPartyId),id);
    }
    public void verifyUltimateParentPartyIdOnView(String ultimateParentPartyIds) throws Exception {
        String id = ultimateParentPartyIds.split(" ")[0];
        checkFieldData(commonElements.getText(parentPartyId),id);
    }
    public void verifyRemarksFieldOnView(String remarks) throws Exception {

        checkFieldData(commonElements.getText(hierarchyRemarks),remarks);
    }
    public void VerifyCreateCustomerGroupPartyGroupFieldsForParentOnView(String parentPartyGroupDesc, String parentPartyGroupType, String parentPartyLegalName, String parentPartyCountry, String parentPartyState, String parentPartyTaxCountry, String parentPartyRMName) throws Exception {
        checkFieldData(commonElements.getText(partyGroupDesc),parentPartyGroupDesc);
        checkFieldData(commonElements.getText(partyGroupType),parentPartyGroupType);
        checkFieldData(commonElements.getText(partyLegalName),parentPartyLegalName);
        checkFieldData(commonElements.getText(partyCountry),parentPartyCountry);
        checkFieldData(commonElements.getText(partyState),parentPartyState);
        checkFieldData(commonElements.getText(partyTaxCountry),parentPartyTaxCountry);
        checkFieldData(commonElements.getText(partyRmName),parentPartyRMName);
    }
    public void verifyCreateCgPartyGroupSelfFieldOnView(String groupDesc, String country, String state, String taxCountry, String rmName) throws Exception {
        checkFieldData(commonElements.getText(cgdSelfGroupIdDesc),groupDesc);
        checkFieldData(commonElements.getText(cgdLegalName),companyNameHeader);
        checkFieldData(commonElements.getText(cgdSelfCountry),country);
        checkFieldData(commonElements.getText(cgdSelfStateField),state);
        checkFieldData(commonElements.getText(cgdSelfTaxCountry),taxCountry);
        checkFieldData(commonElements.getText(cgdSelfRmName),rmName);
    }

    public void verifyViewCorporateFieldValues(String corporateBranch, String corporateDefaultBranch, String bankName) {
    }
}
