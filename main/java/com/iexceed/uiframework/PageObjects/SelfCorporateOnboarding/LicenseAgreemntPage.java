package com.iexceed.uiframework.PageObjects.SelfCorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LicenseAgreemntPage extends TestBase {

    @FindBy(id="onboar__corporatedbdata__i__companydetails__termsAndConditionCheck_lbl")
    WebElement licenseAgreement;
    @FindBy(id="onboar__corporatedbdata__i__companydetails__prefFlagEmail_lbl")
    WebElement notification;
    @FindBy(id="onboar__corporate__el_btn_33")
    WebElement agreeBtn;

    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;

    public LicenseAgreemntPage(){
        PageFactory.initElements(driver,this);
        waitUtility= new WaitUtility();
        javaScriptControls = new JavaScriptControls(driver);
    }

    public void clickOnLicenseAgreement() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",licenseAgreement);
    }

    public void clickOnNotification() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",notification);
    }

    public void clickOnAgreeBtn() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",agreeBtn);
    }


}
