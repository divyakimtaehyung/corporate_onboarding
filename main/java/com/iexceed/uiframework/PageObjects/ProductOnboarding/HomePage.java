package com.iexceed.uiframework.PageObjects.ProductOnboarding;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends TestBase {
    //Page Factory - OR-Declaration:

    @FindBy(id = "ptonbd__PostLogin__userName_txtcnt")
    WebElement landingName;
    @FindBy(id = "ptonbd__PostLogin__newApplnbtn_txtcnt")
    WebElement NewAppBtn;
    @FindBy(xpath="//p[@class='msg']")
    WebElement alertBox;
    @FindBy(id ="ptonbd__PostLogin__el_custOnbdApproval_txtcnt")
    WebElement customerOnboardingApproval;
    @FindBy(id="ptonbd__PostLogin__el_logoutID_txtcnt")
    WebElement logOut;
    @FindBy(className="ok")
    WebElement oK;

    private CommonElements commonElements;
    private DropdownControls dropdownControls;
    private MouseControls mouseControls;
    private TextBoxControls textBoxControls;
    private CommonDriver commonDriver;
    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;
    //Homepage Details

    public HomePage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver= new CommonDriver(driver);
        waitUtility = new WaitUtility();
        dropdownControls = new DropdownControls();
        mouseControls=new MouseControls(driver);
        textBoxControls= new TextBoxControls();
        javaScriptControls = new JavaScriptControls(driver);

    }
    //Actions on page
    public String getTitle() throws Exception {
        commonDriver.getDriver();
        return commonDriver.getTitle();
    }
    public BasicDetailPage clickNewAppBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",NewAppBtn);
        return new BasicDetailPage();
    }

    public void setCustomerOnboardingApproval() throws Exception {
        waitUtility.waitTillElementVisible(driver,customerOnboardingApproval,30);
        javaScriptControls.executeJavaScript("arguments[0].click();", customerOnboardingApproval);

    }

    public String getCorrectUserName(String name)throws Exception {
     return commonElements.getText(landingName);
    }

    public void clickOnLogout() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", logOut);
    }

    public void clickOnOk() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", oK);
    }

    public void setWaitUtilityLanding(){
        waitUtility.waitTillElementVisible(driver,landingName,60);
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
