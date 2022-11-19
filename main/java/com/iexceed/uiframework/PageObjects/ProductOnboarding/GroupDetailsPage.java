package com.iexceed.uiframework.PageObjects.ProductOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static com.iexceed.uiframework.PageObjects.ProductOnboarding.PartyDetailsPage.partyHeader;

public class GroupDetailsPage extends TestBase {

    //Hierarchy
    @FindBy(id = "newonb__NewOnboarding__el_txt_1289_txtcnt")
    WebElement groupDetailTitle;
    @FindBy(id="newonb__NewOnboarding__revisitBtn")
    WebElement revisitBtn;
    @FindBy(id = "newonb__NewOnboarding__hierarchyDD_span")
    WebElement hierarchyDropdownBtn;
    @FindBy(id = "newonb__NewOnboarding__hierarchyDD")
    WebElement hierarchyDropdownField;
    @FindBy(xpath = "//div[@id='newonb__NewOnboarding__hierarchyDD_div']/ul/li")
    List<WebElement> hierarchy;
    @FindBy(id = "newonb__NewOnboarding__pgGroupId")
    WebElement pgGroupID;
    @FindBy(id = "newonb__NewOnboarding__el_btn_160")
    WebElement proceedGrpBtn;
    @FindBy(id = "newonb__NewOnboarding__el_btn_159")
    WebElement cancelGrpBtn;
    @FindBy(id = "newonb__NewOnboarding__el_btn_207")
    WebElement saveGrpBtn;
    @FindBy(id = "newonb__NewOnboarding__pgCreatePartyGroupCond_option_Y_span_")
    WebElement createPartyGrpYourselfYes;
    @FindBy(id = "newonb__NewOnboarding__pgCreatePartyGroupCond_option_N_span_")
    WebElement createPartyGrpYourselfNo;

    //parentgroup
    @FindBy(id = "newonb__GroupDetails__i__parentGroup__groupId")
    WebElement grpID;
    @FindBy(id = "newonb__GroupDetails__i__parentGroup__groupDesc")
    WebElement grpDesc;
    @FindBy(id = "newonb__GroupDetails__i__parentGroup__country")
    WebElement parentGrpCountry;
    @FindBy(id = "newonb__GroupDetails__i__parentGroup__state_span")
    WebElement parentGrpStateDD;
    @FindBy(id = "newonb__GroupDetails__i__parentGroup__state_span")
    WebElement parentGrpStateField;
    @FindBy(xpath = "//div[@id='newonb__GroupDetails__i__parentGroup__state_div']/ul/li")
    List<WebElement> parentGrpState;
    @FindBy(id = "newonb__GroupDetails__i__parentGroup__taxCountry")
    WebElement parentGrpTaxCountry;
    @FindBy(id = "newonb__GroupDetails__i__parentGroup__rmName")
    WebElement parentGrpRmName;
    @FindBy(id = "newonb__GroupDetails__i__parentGroup__status_option_ACTIVE_span_")
    WebElement parentActive;
    @FindBy(id = "newonb__GroupDetails__i__parentGroup__status_option_INACTIVE_span_")
    WebElement parentInactive;
    //Customer grp
    @FindBy(id = "newonb__NewOnboarding__custGrpGroupId")
    WebElement customerGroupGroupId;

    @FindBy(id = "newonb__NewOnboarding__comParentParty")
    WebElement cgParentPartyId;
    @FindBy(id = "select2-newonb__NewOnboarding__comParentParty-container")
    WebElement cgParentPartyId1;
    @FindBy(xpath = "//ul[@id='select2-newonb__NewOnboarding__comParentParty-results']/li")
    List<WebElement> cgParentPartyIdDD;

    @FindBy(id = "newonb__NewOnboarding__comultimateParentParty")
    WebElement cgUltimateParentPartyId;
    @FindBy(id = "select2-newonb__NewOnboarding__comultimateParentParty-container")
    WebElement cgUltimateParentPartyId1;
    @FindBy(xpath = "//ul[@id='select2-newonb__NewOnboarding__comultimateParentParty-results']/li")
    List<WebElement> cgUltimateParentPartyDD;

    @FindBy(id = "newonb__NewOnboarding__cgParentTxnEntityCond_option_Y_span_")
    WebElement cgParentTxnEntityYes;
    //create customer group party for self as Yes
    @FindBy(id = "newonb__NewOnboarding__cgCreatePartyForSelfCond_option_Y_span_")
    WebElement cgCreatePartyForSelfYes;
    @FindBy(id = "newonb__GroupDetails__i__custGrpSelf__groupId")
    WebElement cgSelfGroupId;
    @FindBy(id = "newonb__GroupDetails__i__custGrpSelf__parentGroupId_span")
    WebElement cgSelfParentGroupIdDD;
    @FindBy(xpath = "//div[@id='newonb__GroupDetails__i__custGrpSelf__parentGroupId_div']/ul/li")
    List<WebElement> cgSelfParentGroupId;
    @FindBy(id = "newonb__GroupDetails__i__custGrpSelf__groupDesc")
    WebElement cgSelfGroupIdDesc;
    @FindBy(id = "newonb__GroupDetails__i__custGrpSelf__country")
    WebElement cgSelfCountry;
    @FindBy(id = "newonb__GroupDetails__i__custGrpSelf__state_span")
    WebElement cgSelfStateDD;
    @FindBy(id = "newonb__GroupDetails__i__custGrpSelf__state")
    WebElement cgSelfStateField;
    @FindBy(xpath = "//div[@id='newonb__GroupDetails__i__custGrpSelf__state_div']/ul/li")
    List<WebElement> cgSelfStateGroup;
    @FindBy(id = "newonb__GroupDetails__i__custGrpSelf__taxCountry")
    WebElement cgSelfTaxCountry;
    @FindBy(id = "newonb__GroupDetails__i__custGrpSelf__rmName")
    WebElement cgSelfRmName;
    @FindBy(id = "newonb__GroupDetails__i__custGrpSelf__status_option_ACTIVE_span_")
    WebElement cgSelfStatusActive;
    @FindBy(id = "newonb__GroupDetails__i__custGrpSelf__status_option_INACTIVE_span_")
    WebElement cgSelfStatusInactive;
    //Create customer group party for self as No
    @FindBy(id = "newonb__NewOnboarding__cgCreatePartyForSelfCond_option_N_span_")
    WebElement cgCreatePartyForSelfNo;

    /**
     * create party group for  parent
     **/
    @FindBy(id = "newonb__NewOnboarding__cgParentTxnEntityCond_option_N_span_")
    WebElement cgParentTxnEntityNo;
    @FindBy(id = "newonb__NewOnboarding__cgNonTxnParentCond_option_Y_span_")
    WebElement cgCreatePartyForParentYes;
    @FindBy(id = "newonb__GroupDetails__i__custGrpParent__groupId")
    WebElement cgparentGroupId;
    @FindBy(id = "newonb__GroupDetails__i__custGrpParent__parentGroupId")
    WebElement cgParentparentGroupId;
    @FindBy(id = "newonb__GroupDetails__i__custGrpParent__groupDesc")
    WebElement cgParentGroupIdDesc;
    @FindBy(id = "newonb__GroupDetails__i__custGrpParent__groupType")
    WebElement cgParentGroupType;
    @FindBy(id = "newonb__GroupDetails__i__custGrpParent__legalName")
    WebElement cgParentGroupLegalName;
    @FindBy(id = "newonb__GroupDetails__i__custGrpParent__country")
    WebElement cgParentCountry;
    @FindBy(id = "newonb__GroupDetails__i__custGrpParent__state")
    WebElement cgParentState;
    @FindBy(id = "newonb__GroupDetails__i__custGrpParent__taxCountry")
    WebElement cgParentTaxCountry;
    @FindBy(id = "newonb__GroupDetails__i__custGrpParent__rmName")
    WebElement cgParentRmName;
    @FindBy(id = "newonb__GroupDetails__i__custGrpParent__status_option_ACTIVE_span_")
    WebElement cgParentStatusActive;
    @FindBy(id = "newonb__GroupDetails__i__custGrpParent__status_option_INACTIVE_span_")
    WebElement cgParentStatusInactive;
    @FindBy(id = "newonb__GroupDetails__i__custGrpParent__businessEntityName")
    WebElement cgParentBusinessEntityName;


    //create party group for parent as No
    @FindBy(id = "newonb__NewOnboarding__cgNonTxnParentCond_option_N_span_")
    WebElement cgCreatePartyForParentNo;
    @FindBy(id = "newonb__NewOnboarding__cgNonTxnParentNo")
    WebElement cgChooseParentGrp;
    @FindBy(id = "newonb__NewOnboarding__cgTxnRMParentGroupId")
    WebElement cgChooseTransParentGrp;
    @FindBy(id = "newonb__NewOnboarding__cgRMNonTxnGroup")
    WebElement cgNonTxnGrpId;
    @FindBy(id = "newonb__NewOnboarding__cgTxnRMGroupId")
    WebElement cgTxnRMGroupId;

    //customer
    @FindBy(id = "newonb__NewOnboarding__custIsParentTxnCond_option_Y_span_")
    WebElement custParentTxnYes;
    @FindBy(id = "newonb__NewOnboarding__custParentGroupId_span")
    WebElement custParentGroupIdDD;
    @FindBy(id = "newonb__NewOnboarding__custParentGroupId_span")
    WebElement custParentGroupIdField;
    @FindBy(xpath = "//div[@id='newonb__NewOnboarding__custParentGroupId_div']/ul/li")
    List<WebElement> custParentGroupId;
    @FindBy(id = "newonb__NewOnboarding__custIsParentTxnCond_option_N_span_")
    WebElement custParentTxnNo;
    @FindBy(id = "newonb__NewOnboarding__custCreateParentCond_option_Y_span_")
    WebElement custParentPartyYes;
    @FindBy(id = "newonb__NewOnboarding__custCreateParentCond_option_N_span_")
    WebElement custParentPartyNo;
    @FindBy(id = "newonb__NewOnboarding__custParentNoGroupId")
    WebElement custParentNoGroupId;
    //create customer party for self as Yes
    @FindBy(id = "newonb__GroupDetails__i__customer__groupId")
    WebElement customerGroupId;
    @FindBy(id = "newonb__GroupDetails__i__customer__parentGroupId_span")
    WebElement customerParentGroupIdDD;
    @FindBy(id = "newonb__GroupDetails__i__customer__parentGroupId")
    WebElement customerParentGroupIdField;
    @FindBy(xpath = "//div[@id='newonb__GroupDetails__i__customer__parentGroupId_div']/ul/li")
    List<WebElement> customerParentGroupId;
    @FindBy(id = "newonb__GroupDetails__i__customer__groupDesc")
    WebElement customerGroupIdDesc;
    @FindBy(id = "newonb__GroupDetails__i__customer__legalName")
    WebElement customerLegalName;
    @FindBy(id = "newonb__GroupDetails__i__customer__groupType")
    WebElement customerGroupType;
    @FindBy(id = "newonb__GroupDetails__i__customer__country")
    WebElement customerCountry;
    @FindBy(id = "newonb__GroupDetails__i__customer__state_span")
    WebElement customerStateDD;
    @FindBy(id = "newonb__GroupDetails__i__customer__state")
    WebElement customerStateField;
    @FindBy(xpath = "//div[@id='newonb__GroupDetails__i__customer__state_div']/ul/li")
    List<WebElement> customerState;
    @FindBy(id = "newonb__GroupDetails__i__customer__taxCountry")
    WebElement customerTaxCountry;
    @FindBy(id = "newonb__GroupDetails__i__customer__rmName")
    WebElement customerRmName;
    @FindBy(id = "newonb__GroupDetails__i__customer__status_option_ACTIVE_span_")
    WebElement customerStatusActive;
    @FindBy(id = "newonb__GroupDetails__i__customer__status_option_INACTIVE_span_")
    WebElement customerStatusInactive;

    //Remarks
    @FindBy(id = "newonb__NewOnboarding__priorityCB_option_Low_span_")
    WebElement priorityLow;
    @FindBy(id = "newonb__NewOnboarding__priorityCB_option_Normal_span_")
    WebElement priorityNormal;
    @FindBy(id = "newonb__NewOnboarding__priorityCB_option_High_span_")
    WebElement priorityHigh;
    @FindBy(id = "newonb__NewOnboarding__remarks")
    WebElement hierarchyRemarks;
    @FindBy(id = "newonb__NewOnboarding__el_btn_126")
    WebElement applicationCancel;
    @FindBy(id = "newonb__NewOnboarding__el_btn_157")
    WebElement alertDiscard;
    @FindBy(id = "newonb__NewOnboarding__el_btn_158")
    WebElement alertSave;
    @FindBy(id = "newonb__NewOnboarding__el_btn_127")
    WebElement applicationSubmit;
    @FindBy(xpath = "//p[@class='msg']")
    WebElement alertMsg;
    @FindBy(xpath = "//button[@class='ok']")
    WebElement okayBtn;
    @FindBy(id = "newonb__NewOnboarding__el_btn_201")
    WebElement confirmDetailsBtn;
    @FindBy(id = "newonb__NewOnboarding__CompName")
    WebElement compNameHeader;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__partyId")
    WebElement partyIdHeader;
    @FindBy(id = "newonb__NewOnboarding__el_btn_200")
    WebElement CancelConfirmBtn;
    @FindBy(id = "newonb__NewOnboarding__el_btn_37")
    WebElement dashboardBtn;
    @FindBy(id = "newonb__NewOnboarding__SucPartyId_txtcnt")
    WebElement successPartyId;
    @FindBy(id = "newonb__NewOnboarding__SucCompName_txtcnt")
    WebElement successAppName;
    @FindBy(id = "newonb__NewOnboarding__SuccessMsg")
    WebElement successMsg;

    @FindBy(xpath = "//p[contains(text(),'Please fill all the mandatory fields')]")
    WebElement pendingFieldMsg;
    @FindBy(xpath = "//button[contains(text(),'Ok')]")
    WebElement popupConfirmButton;

    //Revisitbutton
    @FindBy(id = "newonb__NewOnboarding__revisitBtn")
    WebElement revisitButton;


    private CommonElements commonElements;
    private TextBoxControls textBoxControls;
    private JavaScriptControls javaScriptControls;
    private DropdownControls dropdownControls;
    private WaitUtility waitUtility;
    private MouseControls mouseControls;
    private WindowHandling windowHandling;
    public static String companyNameHeader;
    public static String partyHeader;
    public static String customerGroupID;
    public static String customerGroupDesc;
    public static String customerId;
    public static String customerDesc;


    public GroupDetailsPage() {
        PageFactory.initElements(driver, this);
        commonElements = new CommonElements();
        textBoxControls = new TextBoxControls();
        javaScriptControls = new JavaScriptControls(driver);
        dropdownControls = new DropdownControls();
        mouseControls = new MouseControls(driver);
        waitUtility = new WaitUtility();

    }

    public void clickRevisitButton() throws Exception {
        waitUtility.waitForSeconds(3);
        javaScriptControls.executeJavaScript("arguments[0].click();", revisitBtn);

    }

    public void selectHierarchy(String hierarchyGroup) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", hierarchyDropdownBtn);
        selectionOfDropdown(hierarchyGroup, hierarchy);
        waitUtility.waitForSeconds(5);
    }

    public void setPgGroupID(String groupID) throws Exception {
        textBoxControls.setText(pgGroupID, groupID);
    }

    public void setParentGrpID() throws Exception {
        String groupID = RandomStringUtils.randomAlphabetic(6);
        textBoxControls.setText(grpID, groupID);
    }

    public void setParentGrpDesc(String groupDesc) throws Exception {
        textBoxControls.setText(grpDesc, groupDesc);
    }

    public void setParentGrpCountry(String country) throws Exception {
        dropdownControls.selectViaVisibleText(parentGrpCountry, country);
    }

    public void setParentGrpState(String state) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", parentGrpStateDD);
        selectionOfDropdown(state, parentGrpState);
    }

    public void setParentGrpTaxCountry(String taxCountry) throws Exception {
        dropdownControls.selectViaVisibleText(parentGrpTaxCountry, taxCountry);
    }

    public void setParentGrpRmName(String rmName) throws Exception {
        dropdownControls.selectViaVisibleText(parentGrpRmName, rmName);
    }

    public void setParentGrpActive() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", parentActive);

    }

    public void getParentGrpProceedBtn() throws Exception {
        waitUtility.waitForSeconds(3);
        javaScriptControls.executeJavaScript("arguments[0].click();", proceedGrpBtn);

    }

    public void setCgParentPartyId(String parentPartyId) throws Exception {
      // dropdownControls.selectViaVisibleText(cgParentPartyId, "0000002206 – 12#%^$709");
        javaScriptControls.executeJavaScript("arguments[0].click();", cgParentPartyId1);
        selectionOfDropdown("0000002206 - 12#%^$#709", cgParentPartyIdDD);
        waitUtility.waitForSeconds(5);
    }


    public void setcgUltimateParentPartyId(String ultiParentPartyId) throws Exception {

        //dropdownControls.selectViaVisibleText(cgUltimateParentPartyId, ultiParentPartyId);
        javaScriptControls.executeJavaScript("arguments[0].click();", cgUltimateParentPartyId1);
        selectionOfDropdown("0000002206 - 12#%^$#709", cgUltimateParentPartyDD);
        waitUtility.waitForSeconds(5);
    }

    public void setcgParentTxnEntityYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cgParentTxnEntityYes);

    }

    public void setcgParentTxnEntityNo() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cgParentTxnEntityNo);

    }

    public void cgSelfParentGroupIdDD(String parentGroupId) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cgSelfParentGroupIdDD);
        selectionOfDropdown(parentGroupId, cgSelfParentGroupId);
    }

    public void createCgPartyGroupSelf(String groupId, String groupDesc, String country, String state, String taxCountry, String rmName) throws Exception {
        setCgSelfGroupId();
        setCgSelfGroupIdDesc(groupDesc);
        setCgSelfCountry(country);
        setCgSelfStateGroup(state);
        setCgSelfTaxCountry(taxCountry);
        setCgSelfRmName(rmName);
        setCgSelfStatusActive();
        getParentGrpProceedBtn();
    }

    public void setCgSelfGroupId() throws Exception {
        try {
            String groupID = RandomStringUtils.randomAlphabetic(6);
            javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();", cgSelfGroupId);
            textBoxControls.setText(cgSelfGroupId, groupID);
        }catch(Exception e){}
    }

    public void setCgSelfGroupIdDesc(String groupDesc) throws Exception {
        textBoxControls.setText(cgSelfGroupIdDesc, groupDesc);
    }

    public void setCgSelfCountry(String country) throws Exception {
        dropdownControls.selectViaVisibleText(cgSelfCountry, country);
    }

    public void setCgSelfStateGroup(String state) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cgSelfStateDD);
        selectionOfDropdown(state, cgSelfStateGroup);
    }

    public void setCgSelfTaxCountry(String taxCountry) throws Exception {
        dropdownControls.selectViaVisibleText(cgSelfTaxCountry, taxCountry);
    }

    public void setCgSelfRmName(String rmName) throws Exception {
        dropdownControls.selectViaVisibleText(cgSelfRmName, rmName);
    }

    public void setCgSelfStatusActive() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cgSelfStatusActive);
    }

    public void waitGroupTitle() {
        waitUtility.waitTillElementVisible(driver, groupDetailTitle, 10);
    }

    public void setCgCreatePartyForParentYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cgCreatePartyForParentYes);

    }

    public void setCgParentGroupId() throws Exception {
        customerGroupID = RandomStringUtils.randomAlphabetic(6);
        textBoxControls.setText(cgparentGroupId, customerGroupID);

    }

    public void setCgParentGroupIdDesc(String parentPartyGroupDesc) throws Exception {
        customerGroupDesc= parentPartyGroupDesc;
        textBoxControls.setText(cgParentGroupIdDesc, parentPartyGroupDesc);
    }

    public void setCgParentGroupType(String parentPartyGroupType) throws Exception {
        dropdownControls.selectViaVisibleText(cgParentGroupType, parentPartyGroupType);
    }

    public void setCgParentGroupLegalName(String parentPartyLegalName) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();", cgParentGroupLegalName);
        textBoxControls.setText(cgParentGroupLegalName, parentPartyLegalName);
    }

    public void setCgParentGroupCountry(String parentPartyCountry) throws Exception {
        dropdownControls.selectViaVisibleText(cgParentCountry, parentPartyCountry);

    }

    public void setCgParentGroupState(String parentPartyState) throws Exception {
        dropdownControls.selectViaVisibleText(cgParentState, parentPartyState);

    }

    public void setCgParentGroupTaxCountry(String parentPartyTaxCountry) throws Exception {
        dropdownControls.selectViaVisibleText(cgParentTaxCountry, parentPartyTaxCountry);

    }

    public void setCgParentGroupRmName(String parentPartyRmName) throws Exception {
        dropdownControls.selectViaVisibleText(cgParentRmName, parentPartyRmName);

    }

    public void setCgParentGroupStatusActive() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cgParentStatusActive);
        try{

            waitUtility.waitForSeconds(8);
            if(proceedGrpBtn.isDisplayed()) {
                javaScriptControls.executeJavaScript("arguments[0].click();", proceedGrpBtn);
            }

        }catch(Exception e){

        }

    }

    public void setCgParentGroupBusinessEntityName(String parentPartyBusinessEntity) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();", cgParentBusinessEntityName);
        textBoxControls.setText(cgParentBusinessEntityName, parentPartyBusinessEntity);
    }

    public void setcgNonTxnGrpId() throws Exception {
        String groupID = RandomStringUtils.randomAlphabetic(6);
        textBoxControls.setText(cgNonTxnGrpId, groupID);
    }

    public void setcgTxnGrpId() throws Exception {
        String groupID = RandomStringUtils.randomAlphabetic(6);
        textBoxControls.setText(cgTxnRMGroupId, groupID);
    }

    public void setCgCreatePartyForParentNo() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", cgCreatePartyForParentNo);

    }

    public void setCgChooseParentGrp(String chooseParentGroup) throws Exception {

        try {
            dropdownControls.selectViaVisibleText(cgChooseParentGrp, chooseParentGroup);
            waitUtility.waitForSeconds(3);

                    }catch(Exception e){
        }
    }

    public void setTransCustParentGroupId(String chooseParentGrpId) throws Exception {
        dropdownControls.selectViaVisibleText(cgChooseTransParentGrp, chooseParentGrpId);

    }

    public void setCustomerGroupParentGroupId() throws Exception {
        String groupID = RandomStringUtils.randomAlphabetic(6);
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();", customerGroupGroupId);
        textBoxControls.setText(customerGroupGroupId, groupID);
    }

    public void setCustParentTxnYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", custParentTxnYes);

    }

    public void setCustParentTxnNo() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", custParentTxnNo);

    }

    public void setCustParentGroupId(String customerParentGrpId) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", custParentGroupIdDD);
        selectionOfDropdown(customerParentGrpId, custParentGroupId);
    }

    public void setCustParentPartyYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", custParentPartyYes);

    }

    public void setCustParentPartyNo() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", custParentPartyNo);

    }

    public void setCustParentNonGroupId(String customerNonParentGrpId) throws Exception {
        try {
            dropdownControls.selectViaVisibleText(custParentNoGroupId, customerNonParentGrpId);
        }catch(Exception e){

        }
    }

    public void setCustomerGroupId() throws Exception {
        customerId = RandomStringUtils.randomAlphabetic(6);
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();", customerGroupId);
        textBoxControls.setText(customerGroupId, customerId);
    }

    public void setCustomerParentGroupId(String parentGroupId) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", customerParentGroupIdDD);
        selectionOfDropdown(parentGroupId, customerParentGroupId);
    }

    public void setCustomerGroupIdDesc(String groupDesc) throws Exception {
        customerDesc = groupDesc;
        textBoxControls.setText(customerGroupIdDesc, groupDesc);
    }

    public void setCustomerLegalName(String legalName) throws Exception {
        textBoxControls.setText(customerLegalName, legalName);
    }

    public void setCustomerGroupType(String groupType) throws Exception {
        dropdownControls.selectViaVisibleText(customerGroupType, groupType);

    }

    public void setCustomerCountry(String country) throws Exception {
        dropdownControls.selectViaVisibleText(customerCountry, country);
    }

    public void setCustomerState(String state) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", customerStateDD);
        selectionOfDropdown(state, customerState);
    }

    public void setCustomerTaxCountry(String taxCountry) throws Exception {
        dropdownControls.selectViaVisibleText(customerTaxCountry, taxCountry);
    }

    public void setCustomerRmName(String rmName) throws Exception {
        dropdownControls.selectViaVisibleText(customerRmName, rmName);
    }

    public void setCustomerStatusActive() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", customerStatusActive);
    }

    public String getCompanyNameHeader() throws Exception {
        return commonElements.getText(compNameHeader);
    }

    public String getPartyHeader() throws Exception {
        return commonElements.getText(partyIdHeader);
    }

    public void waitforSuccessMsg() {

        waitUtility.waitTillElementVisible(driver, successMsg, 100);
        try{

            waitUtility.waitTillElementVisible(driver, successMsg, 100);
            //waitUtility.waitTillElementVisible(driver, successMsg, 25);

        }catch(Exception e){

        }
    }

    public String getSuccessAppName() throws Exception {
        return commonElements.getText(successAppName);
    }

    public String getSuccessPartyId() throws Exception {
        return commonElements.getText(successPartyId);
    }

    //Actions on page
    public void selectHighPriority() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", priorityHigh);
    }

    public void selectLowPriority() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", priorityLow);
    }

    public void selectNormalPriority() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", priorityNormal);
    }

    public void setHierarchyRemarks(String remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,hierarchyRemarks,30);
        textBoxControls.setText(hierarchyRemarks, remarks);
    }

    public String CreateApplication() throws Exception {
        getSubmitBtn();
        waitUtility.waitTillElementVisible(driver, alertMsg, 10);
        return alertMsg.getText();
    }

    public void getSubmitBtn() throws Exception {
        waitUtility.waitForSeconds(7);
        javaScriptControls.executeJavaScript("arguments[0].click();", applicationSubmit);

    }

    public void getConfirmBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView();", confirmDetailsBtn);
        javaScriptControls.executeJavaScript("arguments[0].click();", confirmDetailsBtn);
    }
    public void getDashboardBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", dashboardBtn);

    }

    public void cancelApplication() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", applicationCancel);
        javaScriptControls.executeJavaScript("arguments[0].click();", alertDiscard);

    }
    public void cancelAndSaveApplication() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", applicationCancel);
        javaScriptControls.executeJavaScript("arguments[0].click();", alertSave);
        waitUtility.waitTillElementVisible(driver,okayBtn,22);
        javaScriptControls.executeJavaScript("arguments[0].click();", okayBtn);

    }

    public void selectionOfDropdown(String itemType, List<WebElement> type) {
        for (WebElement name : type) {
            if (name.getText().equals(itemType)) {
                name.click();
                break;
            }
        }
    }


    public void verifyHierarchyGrpFieldOnEdit(String hierarchyGroup) throws Exception {
            checkFieldData(commonElements.getAttribute(hierarchyDropdownField,"value"),hierarchyGroup);

    }

    public void checkFieldData(String actualData,String expectedData){
        Assert.assertEquals(actualData,expectedData);
    }

    public void verifyRemarksFieldOnEdit(String remarks) throws Exception {
        checkFieldData(commonElements.getAttribute(hierarchyRemarks,"value"),remarks);

    }

    public void verifyParentPartyIdFieldOnEdit(String parentPartyId) throws Exception {
        checkFieldData(commonElements.getAttribute(cgParentPartyId,"value"),parentPartyId);

    }

    public void verifyUltimateParentPartyIdFieldOnEdit(String ultimateParentPartyId) throws Exception {
        checkFieldData(commonElements.getAttribute(cgUltimateParentPartyId,"value"),ultimateParentPartyId);

    }

    public void verifyCreateParentGrpFieldOnEdit(String groupDesc, String country, String state, String taxCountry, String rmName) throws Exception {
        checkFieldData(commonElements.getAttribute(grpDesc,"value"),groupDesc);

        checkFieldData(commonElements.getAttribute(parentGrpCountry,"value"),country);
        checkFieldData(commonElements.getAttribute(parentGrpStateField,"value"),state);
        checkFieldData(commonElements.getAttribute(parentGrpTaxCountry,"value"),taxCountry);
        checkFieldData(commonElements.getAttribute(parentGrpRmName,"value"),rmName);
    }
    public void verifyCustParentGroupIdFieldOnEdit(String customerParentGrpId) throws Exception {
        checkFieldData(commonElements.getAttribute(custParentGroupIdField,"value"),customerParentGrpId);

    }

    public void verifyCustParentNonGroupIdFieldOnEdit(String customerNonParentGroupId) throws Exception {
        checkFieldData(commonElements.getAttribute(custParentNoGroupId,"value"),customerNonParentGroupId);

    }

    public void verifyCreateCustomerPartyGroupForParentFieldOnEdit(String parentGroupId, String groupDesc, String legalName, String groupType, String country, String state, String taxCountry, String rmName) throws Exception {
        checkFieldData(commonElements.getAttribute(customerParentGroupIdField,"value"),parentGroupId);
        checkFieldData(commonElements.getAttribute(customerGroupIdDesc,"value"),groupDesc);
        checkFieldData(commonElements.getAttribute(customerLegalName,"value"),legalName);
        checkFieldData(commonElements.getAttribute(customerGroupType,"value"),groupType);
        checkFieldData(commonElements.getAttribute(customerCountry,"value"),country);
        checkFieldData(commonElements.getAttribute(customerStateField,"value"),state);
        checkFieldData(commonElements.getAttribute(customerTaxCountry,"value"),taxCountry);
        checkFieldData(commonElements.getAttribute(customerRmName,"value"),rmName);
    }

    public void verifyCreateCgPartyGroupSelfFieldOnEdit(String groupDesc, String country, String state, String taxCountry, String rmName) throws Exception {
        checkFieldData(commonElements.getAttribute(cgSelfGroupIdDesc,"value"),groupDesc);
        checkFieldData(commonElements.getAttribute(cgSelfCountry,"value"),country);
        checkFieldData(commonElements.getAttribute(cgSelfStateField,"value"),state);
        checkFieldData(commonElements.getAttribute(cgSelfTaxCountry,"value"),taxCountry);
        checkFieldData(commonElements.getAttribute(cgSelfRmName,"value"),rmName);
    }

    public void verifyCgChooseParentGrpOnEdit(String chooseParentGroup) throws Exception {
        checkFieldData(commonElements.getAttribute(cgChooseParentGrp,"value"),chooseParentGroup);
    }

    public void VerifyCreateCustomerGroupPartyGroupFieldsForParentOnEdit(String parentPartyGroupDesc, String parentPartyGroupType, String parentPartyLegalName, String parentPartyCountry, String parentPartyState, String parentPartyTaxCountry, String parentPartyRMName) throws Exception {
        checkFieldData(commonElements.getAttribute(cgParentGroupIdDesc,"value"),parentPartyGroupDesc);
        checkFieldData(commonElements.getAttribute(cgParentGroupType,"value"),parentPartyGroupType);
        checkFieldData(commonElements.getAttribute(cgParentGroupLegalName,"value"),parentPartyLegalName);
        checkFieldData(commonElements.getAttribute(cgParentCountry,"value"),parentPartyCountry);
        checkFieldData(commonElements.getAttribute(cgParentState,"value"),parentPartyState);
        checkFieldData(commonElements.getAttribute(cgParentTaxCountry,"value"),parentPartyTaxCountry);
        checkFieldData(commonElements.getAttribute(cgParentRmName,"value"),parentPartyRMName);
    }

    public void verifyPgGroupIDField(String pgGroupId) throws Exception {
        checkFieldData(commonElements.getAttribute(pgGroupID,"value"),pgGroupId);

    }

    public void verifyCustomerParentGroupIdOnEdit(String chooseParentGroup) throws Exception {
        checkFieldData(commonElements.getAttribute(cgChooseTransParentGrp,"value"),chooseParentGroup);

    }

    public void setRevisitHierarchy() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", revisitBtn);

    }
}
