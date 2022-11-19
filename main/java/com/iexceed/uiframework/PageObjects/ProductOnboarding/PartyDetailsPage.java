package com.iexceed.uiframework.PageObjects.ProductOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.CommonElements;
import com.iexceed.uiframework.implementations.DropdownControls;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.implementations.TextBoxControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class PartyDetailsPage extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(PartyDetailsPage.class);
    HomePage homePage;
    //PartyDetails
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__customerType_span")
    WebElement partyDropdown;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__customerType")
    WebElement partyField;
    @FindBy(xpath = "//div[@id='newonb__PartyDetails__i__partyDetails__customerType_div']/ul/li")
    List<WebElement> partyType;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__typeOfIndustry")
    WebElement typeOfIndustry;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__sicCode")
    WebElement sicCode;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__licenseType_span")
    WebElement licenceTypeDD;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__licenseType")
    WebElement licenceTypeField;
    @FindBy(xpath = "//div[@id='newonb__PartyDetails__i__partyDetails__licenseType_div']/ul/li")
    List<WebElement> licenseType;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__licenseNo")
    WebElement licenseNo;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__licenseIssuedCountry_span")
    WebElement licenceIssuedCountryDD;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__licenseIssuedCountry")
    WebElement licenceIssuedCountryField;
    @FindBy(xpath = "//div[@id='newonb__PartyDetails__i__partyDetails__licenseIssuedCountry_div']/ul/li")
    List<WebElement> licenseIssuedCountry;
    @FindBy(id = "newonb__NewOnboarding__CompName_txtcnt")
    WebElement compNameHeader;
    @FindBy(id = "newonb__PartyDetails__i__partyDetails__partyId_txtcnt")
    WebElement partyIdHeader;
    @FindBy(id = "newonb__NewOnboarding__el_btn_110")
    WebElement cancelStage2;
    @FindBy(id = "newonb__NewOnboarding__el_btn_111")
    WebElement proceedStage2Btn;
    @FindBy(id = "newonb__NewOnboarding__el_btn_203")
    WebElement saveStage2;
    @FindBy(id = "newonb__NewOnboarding__el_txt_922_txtcnt")
    WebElement productDetails;



    private CommonElements commonElements;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private DropdownControls dropdownControls;
    private JavaScriptControls javaScriptControls;
    public static String companyNameHeader;
    public static String partyHeader;


    public PartyDetailsPage() {
        PageFactory.initElements(driver, this);
        commonElements = new CommonElements();
        textBoxControls = new TextBoxControls();
        dropdownControls = new DropdownControls();
        javaScriptControls = new JavaScriptControls(driver);
        waitUtility = new WaitUtility();

    }

    public AddressSwiftPage userFillsPartyDetails(String partyType, String typeIndustry, String sicCode, String licensesType, String licensesNumber, String licensesIssuedCountry) throws Exception {
        waitForElementVisible();
        selectPartyTypeDD(partyType);
        companyNameHeader = getCompanyNameHeader();
        partyHeader = getPartyHeader();
        setTypeOfIndustry(typeIndustry);
        selectSicCode(sicCode);
        selectLicenceDD(licensesType);
        setLicenceNumber(licensesNumber);
        selectLicenceCountryDD(licensesIssuedCountry);
        return clickOnProceed();
    }

    //Actions on page
    public void selectPartyTypeDD(String PrtyType) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", partyDropdown);
        selectionOfDropdown(PrtyType, partyType);
    }
    public void setTypeOfIndustry(String typeIndustry) throws Exception {
        textBoxControls.setText(typeOfIndustry, typeIndustry);
    }
    public void selectSicCode(String sicCde) throws Exception {
        dropdownControls.selectViaVisibleText(sicCode, sicCde);
    }
    public void selectLicenceDD(String licensesType) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", licenceTypeDD);
        selectionOfDropdown(licensesType, licenseType);
    }
    public void setLicenceNumber(String licensesNumber) throws Exception {
        textBoxControls.setText(licenseNo, licensesNumber);
    }
    public void selectLicenceCountryDD(String licensesIssuedCountry) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", licenceIssuedCountryDD);
        selectionOfDropdown(licensesIssuedCountry, licenseIssuedCountry);
    }
    public AddressSwiftPage clickOnProceed() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", proceedStage2Btn);
        return new AddressSwiftPage();
    }
    public void waitForElementVisible(){
        waitUtility.waitTillElementVisible(driver,compNameHeader ,150);

    }
    public String getCompanyNameHeader() throws Exception {
        return commonElements.getText(compNameHeader);
    }

    public String getPartyHeader() throws Exception {
        return commonElements.getText(partyIdHeader);
    }
    public AddressSwiftPage verifyPartyFieldValues(String prtyType, String typeIndustry, String sicCde, String licensesType, String licensesNumber , String licensesIssuedCountry) throws Exception {
        checkFieldData(commonElements.getAttribute(partyField,"value"),prtyType);
        checkFieldData(commonElements.getAttribute(typeOfIndustry,"value"),typeIndustry);
        checkFieldData(commonElements.getAttribute(sicCode,"value"),sicCde);
        checkFieldData(commonElements.getAttribute(licenceTypeField,"value"),licensesType);
        checkFieldData(commonElements.getAttribute(licenseNo,"value"),licensesNumber);
       // checkFieldData(commonElements.getAttribute(licenceIssuedCountryField,"value"),licensesIssuedCountry);
        return clickOnProceed();
    }
    public AddressSwiftPage verifyPartyFieldValuesOnEdit(String prtyType, String typeIndustry, String sicCde, String licensesType, String licensesNumber , String licensesIssuedCountry) throws Exception {
        checkFieldData(commonElements.getAttribute(partyField,"value"),prtyType);
        checkFieldData(commonElements.getAttribute(typeOfIndustry,"value"),typeIndustry);
       // checkFieldData(commonElements.getAttribute(sicCode,"value"),sicCde);
        checkFieldData(commonElements.getAttribute(licenceTypeField,"value"),licensesType);
        checkFieldData(commonElements.getAttribute(licenseNo,"value"),licensesNumber);
        checkFieldData(commonElements.getAttribute(licenceIssuedCountryField,"value"),licensesIssuedCountry);
        return clickOnProceed();
    }
    public void checkFieldData(String actualData,String expectedData){
        Assert.assertEquals(actualData,expectedData);
    }
    public ContactTaxPage clickOnProductDetail() throws Exception {
        waitUtility.waitTillElementVisible(driver,productDetails,10);
        javaScriptControls.executeJavaScript("arguments[0].click();", productDetails);
        return new ContactTaxPage();
    }
    public void verifyMaxlimitOfPartyField(String typeLimit,String licenseLimit){
        verifyMaxCharLimit(typeOfIndustry.getAttribute("maxlength"),typeLimit);
        verifyMaxCharLimit(licenseNo.getAttribute("maxlength"),licenseLimit);

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
    public void selectionOfDropdown(String itemType, List<WebElement> type) {
        for (WebElement name : type) {
            if (name.getText().equals(itemType)) {
                name.click();
                break;
            }

        }
    }


}
