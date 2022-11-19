package com.iexceed.uiframework.PageObjects.AppzillonAdmin;

import com.iexceed.uiframework.PageObjects.AppzillonAdmin.StaffMaintenanceUser.AdminHomePage;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class AdminLoginPage extends TestBase {

    @FindBy(id="Admin__Login__userId")
    WebElement adminUserId;

    @FindBy(id = "Admin__Login__pswd")
    WebElement adminPassword;

    @FindBy(id="Admin__Login__element_button_1")
    WebElement loginBtn;

    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private JavaScriptControls javaScriptControls;

    public AdminLoginPage(){
    PageFactory.initElements(driver,this);
    commonElements = new CommonElements();
    commonDriver = new CommonDriver(driver);
    textBoxControls= new TextBoxControls();
    waitUtility= new WaitUtility();
    windowHandling = new WindowHandling(driver);
        javaScriptControls = new JavaScriptControls(driver);
    }

    public void enterLoginCredentials(String userId, String pasword)throws Exception{
        setAdminUserId(userId);
        setAdminPassword(pasword);
    }

    public AdminHomePage clickOnSigninButton() throws Exception {
        setWaitUtilityLoginBtn();
        getSignInBtn();
        return new AdminHomePage();
    }

    public void setAdminUserId(String userId) throws Exception{
        textBoxControls.setText(adminUserId,userId);
    }

    public void setAdminPassword(String password) throws Exception{
        textBoxControls.setText(adminPassword,password);
    }

    public void getSignInBtn() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",loginBtn);
    }

    public void refreshPage() throws Exception {
        commonDriver.navigateRefresh();
    }

    public void navigateToUrl(String url,int childWindow) throws Exception {
        ((JavascriptExecutor)driver).executeScript("window.open('');");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        windowHandling.switchToAnyWindow(tabs.get(childWindow));
        commonDriver.navigateToUrl(url);
        waitUtility.waitForSeconds(10);
    }

    public void setWaitUtilityUserId(){waitUtility.waitTillElementVisible(driver,adminUserId,50);}
    public void setWaitUtilityPassword(){waitUtility.waitTillElementVisible(driver,adminPassword,20);}
    public void setWaitUtilityLoginBtn(){waitUtility.waitTillElementVisible(driver,adminUserId,30);}



}
