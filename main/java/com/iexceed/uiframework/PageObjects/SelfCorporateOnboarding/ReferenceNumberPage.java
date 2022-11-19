package com.iexceed.uiframework.PageObjects.SelfCorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ReferenceNumberPage extends TestBase {

    @FindBy(id="onboar__corporate__refnoTxt_txtcnt")
    WebElement referenceNumber;
    public static String refNumber;

    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;

    public ReferenceNumberPage(){
        PageFactory.initElements(driver,this);
        waitUtility= new WaitUtility();
        javaScriptControls = new JavaScriptControls(driver);
    }

    public String checkReferenceNumbrGenerated(){
        String actualStatus;
        if(referenceNumber.isDisplayed()){
            actualStatus =  "Present";
        }
        else {
            actualStatus = "Not Present";
        }
        Assert.assertEquals(actualStatus,"Present");
        refNumber = referenceNumber.getText();
        return refNumber;
    }
}
