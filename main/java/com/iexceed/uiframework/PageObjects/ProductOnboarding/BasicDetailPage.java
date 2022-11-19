package com.iexceed.uiframework.PageObjects.ProductOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Random;


public class BasicDetailPage extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(BasicDetailPage.class);


    //Basic Details
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__corporateEntityName")
    WebElement corporateName;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__companyShortName")
    WebElement corporateShortName;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__primaryBankEntity")
    WebElement bankEntity;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__homeCountry")
    WebElement homeCounty;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__homeCountry_span")
    WebElement homeCountryDD;
    @FindBy(id = "//div[@id='newonb__PartyDetails__i__partyDetails__homeCountry_div']/ul/li")
    List<WebElement> homeCountry;
    @FindBy(id="newonb__PartyDetails__i__partyDetails__primaryOperatingCurrency")
    WebElement primaryCurrency;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__primaryOperatingCurrency_span")
    WebElement primaryOperatingCurrencyDD;
    @FindBy(xpath = "//div[@id='newonb__PartyDetails__i__partyDetails__primaryOperatingCurrency_div']/ul/li")
    List<WebElement> primaryOperatingCurrency;
    @FindBy(id = "newonb__NewOnboarding__el_btn_108")
    WebElement cancel;
    @FindBy(id = "newonb__NewOnboarding__CreateProfileBtn")
    WebElement createProfile;
    @FindBy(id = "newonb__NewOnboarding__ProceedStage1Btn")
    WebElement proceedStage1Btn;
    @FindBy(xpath="//p[@class='msg']")
    WebElement alertBox;



    private CommonElements commonElements;
    private DropdownControls dropdownControls;
    private MouseControls mouseControls;
    private TextBoxControls textBoxControls;
    private CommonDriver commonDriver;
    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;
    //Basic Details

    public BasicDetailPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver= new CommonDriver(driver);
        waitUtility = new WaitUtility();
        dropdownControls = new DropdownControls();
        mouseControls=new MouseControls(driver);
        textBoxControls= new TextBoxControls();
        javaScriptControls = new JavaScriptControls(driver);

    }
    public void getRandomCorporateEntityName(String corpName) throws Exception {
        String EntityName = corpName + new Random().nextInt(1000);
        getCorporateName(EntityName);
        getCorporateShortName(EntityName);
    }
    //Actions on page
    public void getCorporateShortName(String shortName) throws Exception {
        waitUtility.waitTillElementVisible(driver,corporateShortName,30);
        textBoxControls.setText(corporateShortName, shortName);
    }
    public void getCorporateName(String corpName) throws Exception {
        waitUtility.waitTillElementVisible(driver,corporateName,30);
        textBoxControls.setText(corporateName,corpName);
    }
    public void selectPrimaryBankEntity(String primaryBankEntityOnboarding) throws Exception {
        waitUtility.waitTillElementVisible(driver,createProfile,20);
        dropdownControls.selectViaVisibleText(bankEntity,primaryBankEntityOnboarding);

    }
    public void selectPrimaryOperatingCurrency(String currency) throws Exception {
        waitUtility.waitTillElementVisible(driver,primaryOperatingCurrencyDD,200);
        //commonElements.click(primaryOperatingCurrencyDD);
        //commonElements.click(primaryOperatingCurrencyDD);
       javaScriptControls.executeJavaScript("arguments[0].click();",primaryOperatingCurrencyDD);
        waitUtility.waitTillElementVisible(driver,createProfile,20);
        selectionOfDropdown(currency,primaryOperatingCurrency);
    }
    public PartyDetailsPage createProfile() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",createProfile);
        return new PartyDetailsPage();
    }
    public String verifyCreateProfile() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",createProfile);
        waitUtility.waitTillElementVisible(driver,alertBox,30);
        return alertBox.getText();
    }
    public PartyDetailsPage clickBasicProceed() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",proceedStage1Btn);
        return new PartyDetailsPage();

    }

    public PartyDetailsPage verifyBasicFieldValues(String corpName, String corpShortName, String primaryBank,String country,String currency) throws Exception {
        waitUtility.waitTillElementVisible(driver,proceedStage1Btn,20);
        checkFieldData(commonElements.getAttribute(corporateName,"value"),corpName);
        checkFieldData(commonElements.getAttribute(corporateShortName,"value"),corpShortName);
        checkFieldData(commonElements.getAttribute(bankEntity,"value"),primaryBank);
       // checkFieldData(commonElements.getAttribute(homeCounty,"value"),country);
        checkFieldData(commonElements.getAttribute(primaryCurrency,"value"),currency);
        return clickBasicProceed();

    }
    public PartyDetailsPage verifyEditBasicFieldValues(String corpName, String corpShortName, String primaryBank,String country,String currency) throws Exception {
        waitUtility.waitTillElementVisible(driver,proceedStage1Btn,25);
        waitUtility.waitTillElementVisible(driver,corporateName,60);
        checkFieldData(commonElements.getAttribute(corporateName,"value"),corpName);
        checkFieldData(commonElements.getAttribute(corporateShortName,"value"),corpShortName);
        checkFieldData(commonElements.getAttribute(bankEntity,"value"),primaryBank);
       // checkFieldData(commonElements.getAttribute(homeCounty,"value"),country);
        checkFieldData(commonElements.getAttribute(primaryCurrency,"value"),currency);
        return clickBasicProceed();
    }

    public void verifyMaxlimitOfBasicField(String namelimit,String shortlimit){
        waitUtility.waitTillElementVisible(driver,corporateName,20);
        verifyMaxCharLimit(corporateName.getAttribute("maxlength"),namelimit);
        verifyMaxCharLimit(corporateShortName.getAttribute("maxlength"),shortlimit);

    }

    public void verifyMaxCharLimit(String maxLengthDefined,String expectedMax){
        if (maxLengthDefined == null){
            LOGGER.info("No limit is set");
        }
        else{
            if (maxLengthDefined == expectedMax){
                LOGGER.info("Max character limit is set as expected");
            }
        }

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
