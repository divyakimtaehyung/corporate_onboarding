package com.iexceed.uiframework.PageObjects.AppzillonAdmin.LegalEntity;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.CommonElements;
import com.iexceed.uiframework.implementations.DropdownControls;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.implementations.TextBoxControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class LegalEntityPage extends TestBase {
    private static Logger log = LogManager.getLogger(LegalEntityPage.class);

    @FindBy(id = "Admin__LegalEntityMaintenanceDetail__Save")
    WebElement saveBtn;

    @FindBy(id = "Admin__LegalEntityMaintenanceDetail__legalEntityId")
    WebElement EntityId;
    @FindBy(id = "Admin__LegalEntityMaintenanceDetail__legalEntityName")
    WebElement EntityName;
    @FindBy(id = "Admin__LegalEntityMaintenanceDetail__operationalUnit")
    WebElement OperationalUnit;
    @FindBy(xpath = "//*[@id='Admin__LegalEntityMaintenanceDetail__operationalUnit_div']/ul/li")
    List<WebElement> OpUnit;
    @FindBy(xpath = "//p[contains(@class, 'msg')]")
    WebElement message;
    @FindBy(xpath = "//button[contains(@class, 'ok')]")
    WebElement messageOk;
    @FindBy(id = "Admin__LegalEntityCountries__i__apztbBankLegalEntityCountries__country_0")
    WebElement country;
    @FindBy(id = "Admin__LegalEntityMaintenanceDetail__BranchesLink_0_txtcnt")
    WebElement linkBranches;
    @FindBy(xpath = "//*[@id='Admin__LegalEntityCountries__i__apztbBankLegalEntityCountries__country_0_div']/ul/li")
    List<WebElement> countryList;

    @FindBy(id = "Admin__LegalEntityBranches__i__apztbBankLegalEntityCountryBranches__branch_0")
    WebElement firstBranch;
    @FindBy(id = "Admin__LegalEntityBranches__i__apztbBankLegalEntityCountryBranches__branch_1")
    WebElement SecondBranch;
    @FindBy(id = "Admin__LegalEntityMaintenanceDetail__branchAdd")
    WebElement SaveBranches;
    @FindBy(id = "Admin__LegalEntityMaintenanceDetail__addBranchRow_0")
    WebElement plusBtnBranches1;
    @FindBy(id = "Admin__LegalEntityMaintenanceDetail__addBranchRow_1")
    WebElement plusBtnBranches2;
    @FindBy(id = "Admin__LegalEntityMaintenanceDetail__addBranchRow_2")
    WebElement plusBtnBranches3;
    @FindBy(id = "Admin__LegalEntityMaintenanceDetail__addRow_0")
    WebElement PlusButton1;
    @FindBy(id = "Admin__LegalEntityCountries__i__apztbBankLegalEntityCountries__country_1")
    WebElement secondCountry;
    @FindBy(xpath = "//*[@id='Admin__LegalEntityCountries__i__apztbBankLegalEntityCountries__country_1_div']/ul/li")
    List<WebElement> secondCountryList;
    @FindBy(xpath = "//input[contains(@checkedval,'y')]")
    List<WebElement> defaultCountryCheckBox;

    @FindBy(css=".etw-100.ett-inpt.pri.lft.err")
    WebElement errMsg;

    //table elements
    @FindBy(id = "Admin__LegalMaintenanceCustom__o__legalEntities__AUTH_STATUS_0_txtcnt")
    WebElement authStatus;
    @FindBy(id = "Admin__LegalMaintenanceCustom__o__legalEntities__LEGAL_ENTITY_ID_0_txtcnt")
    WebElement checkLegalEntityID;
    @FindBy(id = "Admin__LegalMaintenanceCustom__o__legalEntities__LEGAL_ENTITY_NAME_0_txtcnt")
    WebElement checkLegalEntityName;
    @FindBy(id = "Admin__LegalMaintenanceCustom__o__legalEntities__OPERATIONAL_UNIT_0_txtcnt")
    WebElement checkLegalEntityOpUnit;
    @FindBy(xpath = "//table/tbody/tr")
    List<WebElement> authStatusList;
    @FindBy(id = "Admin__LegalEntityMaintenanceDetail__Authorize")
    WebElement authorizeBtn;



    private TextBoxControls textBoxControls;
    private CommonElements commonElements;
    private DropdownControls dropdownControls;
    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;

    public LegalEntityPage(){
        PageFactory.initElements(driver,this);
        textBoxControls = new TextBoxControls();
        commonElements = new CommonElements();
        dropdownControls = new DropdownControls();
        waitUtility = new WaitUtility();
        javaScriptControls = new JavaScriptControls(driver);
    }
    public void inputEntityID(String ID) throws Exception {
        textBoxControls.setText(EntityId,ID);;
        EntityId.sendKeys(Keys.TAB);
        changeToPopupAndPrintMessage();
    }
    public void inputEntityName(String Name) throws Exception {
        textBoxControls.clearText(EntityName);
        textBoxControls.setText(EntityName,Name);
    }
    public void clickOperationalUnit(String Unit) throws Exception {
        commonElements.click(OperationalUnit);
        if(!Unit.isEmpty()){
            dropDownFinder(OpUnit,Unit);
        }else {
            log.info("Operation Unit is not given");
        }

    }
    public void selectCountry(String cntry) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", country);

        //commonElements.click(country);
        dropDownFinder(countryList,cntry);

    }
    public void clickLinkBranches() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", linkBranches);
        // commonElements.click(linkBranches);
    }

    public void addFirstBranch(String Branch) throws Exception {
        textBoxControls.setText(firstBranch,Branch);

    }
    public void clickSaveBranches() throws Exception {
        commonElements.click(SaveBranches);
    }
    public void clickSaveButton() throws Exception {
        commonElements.click(saveBtn);
    }

    public void clickPlusButton() throws Exception {
        commonElements.click(PlusButton1);
    }
    public void errorDisplayisDisplayed() throws Exception {
        changeToPopupAndPrintMessage();
    }
    public void AddSecondCountry(String cntry) throws Exception {
        commonElements.click(secondCountry);
        dropDownFinder(secondCountryList,cntry);
        changeToPopupAndPrintMessage();

    }
    public void checkIsDefaultCountrySelected() {
        if(defaultCountryCheckBox.size() >=1){
            log.info("Only one Default Country");
        }

    }
    public void plusBtnBranchesClick() throws Exception {
        commonElements.click(plusBtnBranches1);
    }

    public void addSecondBranches(String secondBranch) throws Exception {
        waitTillSecondBranchVisible();
        textBoxControls.setText(SecondBranch,secondBranch);
    }
    public void plusBtnBranchesClick2() throws Exception {
        commonElements.click(plusBtnBranches2);
    }

    public void plusBtnBranchesClick3() throws Exception {
        try {
            commonElements.click(plusBtnBranches3);
        }catch (Exception ex){

        }

    }
    public void checkErrorMsg() {
        if (errMsg.isDisplayed()){
            log.info("Please enter the Branch Details");
        }
        }
    public void checkforAuthorization() {
        if (authStatus.getText().equalsIgnoreCase("Authorization Pending")){
            log.info("Legal Entity Status "+authStatus.getText());
        }else {
            log.info("Legal Entity in Authorization ");
        }
    }

    public void clickLegalEntityList() throws Exception {
        Iterator<WebElement> wb = authStatusList.iterator();

        while(wb.hasNext()) {
            WebElement el = wb.next();
            if (el.findElement(By.xpath("//td[4]/p/span")).getText().equalsIgnoreCase("Authorization Pending")) {
                commonElements.click(el.findElement(By.xpath("//td[1]/a")));
                break;
            }
        }
    }

    public void clickAuthorization() throws Exception {
        commonElements.click(authorizeBtn);
    }



    //Wait Methods


    public void waitTillEntityIDVisible(){
        waitUtility.waitTillElementVisible(driver,EntityId,40);
    }
    public void waitTillEntityNameVisible(){
        waitUtility.waitTillElementVisible(driver,EntityName,20);
    }
    public void waitTillDropDownVisible(){
        waitUtility.waitTillElementVisible(driver,OperationalUnit,20);
    }
    public void waitTillCountryVisible() {
        waitUtility.waitTillElementBecomeClickable(driver,country,30);
    }
    public void waitTillNewBranchWindowVisible() {
        waitUtility.waitTillElementVisible(driver, firstBranch,20);
    }
    public void waitTillPlusButtonClickable() {
        waitUtility.waitTillElementVisible(driver,PlusButton1,20);
    }
    public void waitTillSecondBranchVisible() {
        waitUtility.waitTillElementVisible(driver,SecondBranch,20);
    }
    public void waitTillSaveClickable() {
        waitUtility.waitTillElementVisible(driver,saveBtn,20);
    }
    public void waitTillAuthStatusVisible() {
        waitUtility.waitTillElementVisible(driver,authStatus,20);
    }
    public void waitTillAlertMessageVisible() {
        waitUtility.waitTillElementVisible(driver,message,100);
    }
    public void waitTillAlertAcceptClickable() {
        waitUtility.waitTillElementBecomeClickable(driver,messageOk,20);
    }
    public void waitTillAuthorizationBtnVisible() {
        waitUtility.waitTillElementBecomeClickable(driver,authorizeBtn,20);
    }

    //Utilities

    /*Check Duplicate selection in Drop Down , ex Adding multiple countries , one
     country is selected next time same country cannot be select */
     public void dropDownChecker(String country) throws Exception {
        boolean flag = false;
         commonElements.click(secondCountry);
         waitUtility.waitForSeconds(5);
            for(WebElement el : secondCountryList){
                if (el.getText().equalsIgnoreCase(country)){
                    flag = true;
                    break;
                }
            }
                if (flag){
                    log.info("Duplicate found");
                }else {
                    log.info("Selection is Not Dupliacte");
            }
        }
    public void dropDownFinder(List<WebElement> list , String Text){
        for(WebElement el : list){
            if (el.getText().equalsIgnoreCase(Text)){
                el.click();
                break;
            }
        }
    }
    public void changeToPopupAndPrintMessage() throws Exception {
            try {
                waitTillAlertMessageVisible();
                log.info("Message "+message.getText());
                waitTillAlertAcceptClickable();
                javaScriptControls.executeJavaScript("arguments[0].click();",messageOk);

            }catch (Exception ex){
            }
     }
        


    public void checkQueryResults(String legalEntityId, String legalEntityName, String operationalUnit) {
        boolean result = false;
        if (checkLegalEntityID.getText().equals(legalEntityId)&&
                checkLegalEntityName.getText().equals(legalEntityName)&&
                checkLegalEntityOpUnit.getText().equals(operationalUnit)){
            result = true;
        }
        if(result){
            log.info("Query Results and TestCases are Same");
        }else {
            log.info("Query Results and TestCases are Not same");
        }
    }




}
