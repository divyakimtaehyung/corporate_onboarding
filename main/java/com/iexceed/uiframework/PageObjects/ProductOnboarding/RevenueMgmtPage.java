package com.iexceed.uiframework.PageObjects.ProductOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.CommonElements;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.implementations.TextBoxControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RevenueMgmtPage extends TestBase {
    //Revenue Management
    @FindBy(id ="newonb__ProductOnboardingDetails__i__revenueManagement__status_option_ACTIVE_span_")
    WebElement  revenueStatusYes;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__revenueManagement__status_option_ACTIVE_span_")
    WebElement revenueStatusNo;
    @FindBy(id = "newonb__ProductOnboardingDetails__i__revenueManagement__remarks")
    WebElement revenueRemarks;
    @FindBy(id = "newonb__NewOnboarding__el_btn_186")
    WebElement revenueProceedBtn;
    @FindBy(xpath = "//p[@class='msg']")
    WebElement alertMsg;
    @FindBy(id = "newonb__NewOnboarding__el_btn_185")
    WebElement revenueCancelBtn;
    //Parent group details
    @FindBy(id = "newonb__NewOnboarding__pgGroupId")
    WebElement pgGroupId;



    private TextBoxControls textBoxControls;
    private JavaScriptControls javaScriptControls;
    private WaitUtility waitUtility;
    private CommonElements commonElements;


    public RevenueMgmtPage(){
        PageFactory.initElements(driver,this);
        textBoxControls= new TextBoxControls();
        javaScriptControls = new JavaScriptControls(driver);
        commonElements = new CommonElements();
        waitUtility= new WaitUtility();

    }
    public ContactTaxPage setRevenueStatusYes(String remarks) throws Exception {
        selectRevenueStatusYes();
        setRevenueRemarks(remarks);
        Thread.sleep(10000);
        return clickOnRevenueProceed();

    }
    //Actions on page
    public void selectRevenueStatusYes() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", revenueStatusYes);
    }
    public void selectRevenueStatusNo() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", revenueStatusNo);
    }
    public void setRevenueRemarks(String remarks) throws Exception {
        textBoxControls.setText(revenueRemarks,remarks);
    }
    public void getRevenueProceedBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", revenueProceedBtn);
    }

    public ContactTaxPage clickOnRevenueProceed() throws Exception {
        getRevenueProceedBtn();
        return new ContactTaxPage();
    }

    public String clickOnRevenueProceedBtn() throws Exception {
        getRevenueProceedBtn();
        waitUtility.waitTillElementVisible(driver,alertMsg,10);
        return alertMsg.getText();
    }

    public void verifyRevenueRemarksFieldOnEdit(String revenueRemark) throws Exception {
        checkFieldData(commonElements.getAttribute(revenueRemarks,"value"),revenueRemark);

    }
    public void checkFieldData(String actualData,String expectedData){
        Assert.assertEquals(actualData,expectedData);
    }

}
