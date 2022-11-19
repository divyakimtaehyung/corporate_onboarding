package com.iexceed.uiframework.PageObjects.ProductOnboarding;

import com.iexceed.uiframework.PageObjects.SelfCorporateOnboarding.ReferenceNumberPage;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.CommonElements;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.implementations.TextBoxControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerOnboardingApprovalPage extends TestBase {

    @FindBy(id ="cponbd__CorporateOnboard__date")
    WebElement corpOnboardingDate;
    @FindBy(className ="mbsc-cal-day.mbsc-cal-day-sel.mbsc-cal-today.mbsc-cal-day-v.mbsc-fr-btn-e.mbsc-fr-btn-nhl")
    WebElement currentDate;
    @FindBy(xpath ="//*[text()='Set']")
    WebElement dateSetBtn;
    @FindBy(id ="cponbd__CorporateOnboard__el_btn_34")
    WebElement searchBtn;
    @FindBy(id ="cponbd__CorpOnBRespData__i__OpenApplication__urn_0_txtcnt")
    WebElement refNumber;
    String refNumber_1 = "cponbd__CorpOnBRespData__i__OpenApplication__urn_";
    String refNumber_2 = "_txtcnt";

    private JavaScriptControls javaScriptControls;
    private WaitUtility waitUtility;

    public CustomerOnboardingApprovalPage() {
        PageFactory.initElements(driver, this);
        waitUtility = new WaitUtility();
        javaScriptControls = new JavaScriptControls(driver);
    }

    public void selectDateField() throws Exception {
        waitUtility.waitTillElementVisible(driver,corpOnboardingDate,30);
        javaScriptControls.executeJavaScript("arguments[0].click();", corpOnboardingDate);
    }

    public void setDate() throws Exception {
        //javaScriptControls.executeJavaScript("arguments[0].click();", currentDate);
        waitUtility.waitTillElementVisible(driver,dateSetBtn,30);
        javaScriptControls.executeJavaScript("arguments[0].click();", dateSetBtn);
    }

    public void searchDate() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", searchBtn);
    }

    public void selectRefNumber() throws Exception {
    waitUtility.waitTillElementVisible(driver,refNumber,30);
//        javaScriptControls.executeJavaScript("arguments[0].click();", refNumber);

        String actualRefNumber = ReferenceNumberPage.refNumber;
        int i = 0;
        while(true){
            WebElement finalRefNumber = driver.findElement(By.id(refNumber_1+i+refNumber_2));
            String refNumberValue = finalRefNumber.getText();
            if(refNumberValue.equals(actualRefNumber)){
                javaScriptControls.executeJavaScript("arguments[0].click();", finalRefNumber);
                break;
            }
            i++;
        }


    }





}
