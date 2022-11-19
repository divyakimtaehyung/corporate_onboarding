package com.iexceed.uiframework.PageObjects.ProductOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.CommonElements;
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

public class AddressSwiftPage extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(AddressSwiftPage.class);
    //Address Details
    @FindBy(id = "newonb__AddressDetails__i__addressDetails__addressLine1")
    WebElement addressLine1;
    @FindBy(id = "newonb__AddressDetails__i__addressDetails__addressLine2")
    WebElement addressLine2;
    @FindBy(id = "newonb__AddressDetails__i__addressDetails__addressLine3")
    WebElement addressLine3;
    @FindBy(id = "newonb__AddressDetails__i__addressDetails__postalCode")
    WebElement addPostalCode;
    @FindBy(id = "newonb__AddressDetails__i__addressDetails__country_span")
    WebElement addressCountryDD;
    @FindBy(id = "newonb__AddressDetails__i__addressDetails__country")
    WebElement addressCountryField;
    @FindBy(xpath = "//div[@id='newonb__AddressDetails__i__addressDetails__country_div']/ul/li")
    List<WebElement> addressCountry;
    @FindBy(id = "newonb__AddressDetails__i__addressDetails__state_span")
    WebElement addressStateDD;
    @FindBy(id = "newonb__AddressDetails__i__addressDetails__state")
    WebElement addressStateField;
    @FindBy(xpath = "//div[@id='newonb__AddressDetails__i__addressDetails__state_div']/ul/li")
    List<WebElement> addressState;
    @FindBy(id = "newonb__AddressDetails__i__addressDetails__addressLine4")
    WebElement addressCity;
    @FindBy(id = "newonb__AddressDetails__i__addressDetails__residentialStatus_option_RESIDENT_span_")
    WebElement residentRadioBtn;
    @FindBy(id = "newonb__AddressDetails__i__addressDetails__residentialStatus_option_NON-RESIDENT_span_")
    WebElement nonResidentRadioBtn;

    //SwiftDetails
    @FindBy(id = "newonb__SwiftDetails__i__swiftInfo__swiftCode")
    WebElement swftCode;
    @FindBy(id = "newonb__SwiftDetails__i__swiftInfo__swiftAddress1")
    WebElement swftAddLine1;
    @FindBy(id = "newonb__SwiftDetails__i__swiftInfo__swiftAddress2")
    WebElement swftAddLine2;
    @FindBy(id = "newonb__SwiftDetails__i__swiftInfo__swiftAddressCountry_span")
    WebElement swftAddressCountryDD;
    @FindBy(xpath = "//div[@id='newonb__SwiftDetails__i__swiftInfo__swiftAddressCountry_div']/ul/li")
    List<WebElement> swftAddressCountry;
    @FindBy(id = "newonb__SwiftDetails__i__swiftInfo__swiftAddressCountry")
    WebElement swftAddressCountryField;
    @FindBy(id = "newonb__SwiftDetails__i__swiftInfo__swiftAddressState_span")
    WebElement swftStateDD;
    @FindBy(xpath = "//div[@id='newonb__SwiftDetails__i__swiftInfo__swiftAddressState_div']/ul/li")
    List<WebElement> swftState;
    @FindBy(id = "newonb__SwiftDetails__i__swiftInfo__swiftAddressState")
    WebElement swftStateField;
    @FindBy(id = "newonb__NewOnboarding__el_btn_112")
    WebElement cancelStage3;
    @FindBy(id = "newonb__NewOnboarding__el_btn_113")
    WebElement proceedStage3Btn;
    @FindBy(id = "newonb__NewOnboarding__el_btn_204")
    WebElement saveStage3;


    private CommonElements commonElements;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;



    public AddressSwiftPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        textBoxControls= new TextBoxControls();
        javaScriptControls = new JavaScriptControls(driver);
        waitUtility= new WaitUtility();

    }

    //Actions on page
    public void setAddressLine1(String addLine1) throws Exception {
        textBoxControls.setText(addressLine1,addLine1);

    }
    public void setAddressLine2(String addLine2) throws Exception {
        textBoxControls.setText(addressLine2,addLine2);
    }
    public void setAddressLine3(String addLine3) throws Exception {
        textBoxControls.setText(addressLine3,addLine3);
    }
    public void setAddPostalCode(String postalCode) throws Exception {
        textBoxControls.setText(addPostalCode,postalCode);
    }
    public void selectAddCountryDD(String addCountry) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",addressCountryDD);
        selectionOfDropdown(addCountry,addressCountry);
    }
    public void selectAddStateDD(String addState) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",addressStateDD);
        selectionOfDropdown(addState,addressState);
    }
    public void selectResidentRadioBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",residentRadioBtn);

    }
    public void selectNonResidentRadioBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",nonResidentRadioBtn);

    }
    public void setAddressCity(String addCity) throws Exception {
        textBoxControls.setText(addressCity,addCity);
    }
    public void setSwftCode(String swiftCode) throws Exception {
        textBoxControls.setText(swftCode,swiftCode);
    }
    public void setSwftAddLine1(String swiftAddLine1) throws Exception {
        textBoxControls.setText(swftAddLine1,swiftAddLine1);
    }
    public void setSwftAddLine2(String swiftAddLine2) throws Exception {
        textBoxControls.setText(swftAddLine2,swiftAddLine2);
    }
    public void selectSwftCountryDD(String swiftCountry) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",swftAddressCountryDD);
        selectionOfDropdown(swiftCountry,swftAddressCountry);
    }
    public void selectSwftStateDD(String swiftState) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",swftStateDD);
        selectionOfDropdown(swiftState,swftState);
    }
    public ContactTaxPage clickOnProceed() throws Exception {
        waitUtility.waitForSeconds(3);
        javaScriptControls.executeJavaScript("arguments[0].click();",proceedStage3Btn);
        return new ContactTaxPage();
    }
    public ContactTaxPage verifyAddressSwiftFieldValues(String addLine1, String addLine2, String addLine3, String postalCode, String addCountry, String addState, String addCity, String swiftCode, String swiftAddLine1, String swiftAddLine2, String swiftCountry, String swiftState) throws Exception {
        checkFieldData(commonElements.getAttribute(addressLine1,"value"),addLine1);
        checkFieldData(commonElements.getAttribute(addressLine2,"value"),addLine2);
        checkFieldData(commonElements.getAttribute(addressLine3,"value"),addLine3);
        checkFieldData(commonElements.getAttribute(addPostalCode,"value"),postalCode);
        //checkFieldData(commonElements.getAttribute(addressCountryField,"value"),addCountry);
        checkFieldData(commonElements.getAttribute(addressStateField,"value"),addState);
        checkFieldData(commonElements.getAttribute(addressCity,"value"),addCity);
        checkFieldData(commonElements.getAttribute(swftCode,"value"),swiftCode);
        checkFieldData(commonElements.getAttribute(swftAddLine1,"value"),swiftAddLine1);
        checkFieldData(commonElements.getAttribute(swftAddLine2,"value"),swiftAddLine2);
        //checkFieldData(commonElements.getAttribute(swftAddressCountryField,"value"),swiftCountry);
        checkFieldData(commonElements.getAttribute(swftStateField,"value"),swiftState);
        return clickOnProceed();

    }
    public ContactTaxPage verifyAddressSwiftDetailsOnEdit(String addLine1, String addLine2, String addLine3, String postalCode, String addCountry, String addState, String addCity, String swiftCode, String swiftAddLine1, String swiftAddLine2, String swiftCountry, String swiftState) throws Exception {
        checkFieldData(commonElements.getAttribute(addressLine1,"value"),addLine1);
        checkFieldData(commonElements.getAttribute(addressLine2,"value"),addLine2);
        checkFieldData(commonElements.getAttribute(addressLine3,"value"),addLine3);
        checkFieldData(commonElements.getAttribute(addPostalCode,"value"),postalCode);
        checkFieldData(commonElements.getAttribute(addressCountryField,"value"),addCountry);
        checkFieldData(commonElements.getAttribute(addressStateField,"value"),addState);
        checkFieldData(commonElements.getAttribute(addressCity,"value"),addCity);
        checkFieldData(commonElements.getAttribute(swftCode,"value"),swiftCode);
        checkFieldData(commonElements.getAttribute(swftAddLine1,"value"),swiftAddLine1);
        checkFieldData(commonElements.getAttribute(swftAddLine2,"value"),swiftAddLine2);
        checkFieldData(commonElements.getAttribute(swftAddressCountryField,"value"),swiftCountry);
        checkFieldData(commonElements.getAttribute(swftStateField,"value"),swiftState);
        return clickOnProceed();

    }
    public void checkFieldData(String actualData,String expectedData){
        Assert.assertEquals(actualData,expectedData);
    }

    public void verifyMaxlimitOfAddressSwiftField(String addLine1, String addLine2, String addLine3, String postalcodeLimit, String cityLimit, String swiftCodeLimit, String swiftAdd1Limit, String swiftAdd2Limit){
        verifyMaxCharLimit(addressLine1.getAttribute("maxlength"),addLine1);
        verifyMaxCharLimit(addressLine2.getAttribute("maxlength"),addLine2);
        verifyMaxCharLimit(addressLine3.getAttribute("maxlength"),addLine3);
        verifyMaxCharLimit(addPostalCode.getAttribute("maxlength"),postalcodeLimit);
        verifyMaxCharLimit(addressCity.getAttribute("maxlength"),cityLimit);
        verifyMaxCharLimit(swftCode.getAttribute("maxlength"),swiftCodeLimit);
        verifyMaxCharLimit(swftAddLine1.getAttribute("maxlength"),swiftAdd1Limit);
        verifyMaxCharLimit(swftAddLine2.getAttribute("maxlength"),swiftAdd2Limit);

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
    public void selectionOfDropdown (String itemType, List < WebElement > type){
        for (WebElement name : type) {
            if (name.getText().equals(itemType)) {
                name.click();
                break;
            }
        }
    }



}
