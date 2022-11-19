package com.iexceed.uiframework.PageObjects.ProductOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerOnboardingApplicationPage extends TestBase {

    @FindBy(id ="cponbd__CorporateOnboardDtls__approveBtn")
    WebElement approveBtn;
    @FindBy(id ="cponbd__CorporateOnboardDtls__apprReason")
    WebElement approveText;
    @FindBy(id ="cponbd__CorporateOnboardDtls__el_btn_14_txtcnt")
    WebElement finalapprove;

    private JavaScriptControls javaScriptControls;
    private WaitUtility waitUtility;

    public CustomerOnboardingApplicationPage() {
        PageFactory.initElements(driver, this);
        waitUtility = new WaitUtility();
        javaScriptControls = new JavaScriptControls(driver);
    }

    public void selectApproveBtn() throws Exception {
        waitUtility.waitTillElementVisible(driver,approveBtn,30);
        javaScriptControls.executeJavaScript("arguments[0].click();", approveBtn);
    }

    public void selectFinalApproveBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", finalapprove);
    }

    public void enterRemarks() throws Exception {
        waitUtility.waitTillElementVisible(driver,approveText,30);
       approveText.sendKeys("Approved");
    }


}
