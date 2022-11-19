package com.iexceed.uiframework.PageObjects.SelfCorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(id="LOGN01__Login__el_btn_4")
    WebElement connectBtn;

    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;

    public HomePage(){
        PageFactory.initElements(driver,this);
        waitUtility= new WaitUtility();
        javaScriptControls = new JavaScriptControls(driver);
    }

    public void clickConnectWithUs() throws Exception {
        driver.navigate().refresh();
        waitUtility.waitTillElementVisible(driver,connectBtn,30);
        javaScriptControls.executeJavaScript("arguments[0].click();",connectBtn);
    }
}
