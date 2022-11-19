package com.iexceed.uiframework.PageObjects.SelfCorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.CommonDriver;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuestionairePage extends TestBase {

    @FindBy(id="onboar__corporatequeries__i__corporatequeries__answer_0_option_Y_span_0")
    WebElement yes1;
    String beforeId = "onboar__corporatequeries__i__corporatequeries__answer_";
    String afterId = "_option_Y_span_";
    @FindBy(id="onboar__corporatequeries__i__corporatequeries__answer_1_option_Y_span_1")
    WebElement yes2;
    @FindBy(id="onboar__corporatequeries__i__corporatequeries__answer_2_option_Y_span_2")
    WebElement yes3;
    @FindBy(id="onboar__corporatequeries__i__corporatequeries__answer_3_option_Y_span_3")
    WebElement yes4;
    @FindBy(id="onboar__corporatequeries__i__corporatequeries__answer_4_option_Y_span_4")
    WebElement yes5;
    @FindBy(id="onboar__onboardingscreen__el_btn_11")
    WebElement next;

    private WaitUtility waitUtility;
    private CommonDriver commonDriver;
    private JavaScriptControls javaScriptControls;

    public QuestionairePage(){
        PageFactory.initElements(driver,this);
        commonDriver = new CommonDriver(driver);
        waitUtility= new WaitUtility();
        javaScriptControls = new JavaScriptControls(driver);
    }

    public String getPageTitle() throws Exception {
        return commonDriver.getTitle();
    }

    public void selectAllYes() throws Exception {
        waitUtility.waitTillElementVisible(driver,yes1,30);
        WebElement element = null;
        for(int i=0;i<5;i++){
            element = driver.findElement(By.id(beforeId + i + afterId + i));
            javaScriptControls.executeJavaScript("arguments[0].click();",element);
        }
    }

    public void clickOnContinue() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",next);
    }
    
}
