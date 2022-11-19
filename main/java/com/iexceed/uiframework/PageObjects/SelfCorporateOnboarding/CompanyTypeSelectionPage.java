package com.iexceed.uiframework.PageObjects.SelfCorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.CommonDriver;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyTypeSelectionPage extends TestBase {

    @FindBy(id="onboar__corporate__cmpnylist_row_0")
    WebElement limited;
    @FindBy(id="onboar__corporate__cmpnylist_row_1")
    WebElement limitedLiabilityPartnership;
    @FindBy(id="onboar__corporate__cmpnylist_row_2")
    WebElement partnership;
    @FindBy(id="onboar__corporate__cmpnylist_row_3")
    WebElement soleProprietership;
    static String companyType;


    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;
    private CommonDriver commonDriver;

    public CompanyTypeSelectionPage(){
        PageFactory.initElements(driver,this);
        waitUtility= new WaitUtility();
        commonDriver = new CommonDriver(driver);
        javaScriptControls = new JavaScriptControls(driver);
    }

    public void clickOnLimited() throws Exception {
        companyType = driver.findElement(By.id("onboar__companyType__i__companyType__TXT_DESC_0_txtcnt")).getText();
        javaScriptControls.executeJavaScript("arguments[0].click();",limited);
    }

    public void clickOnLLP() throws Exception {
        companyType = driver.findElement(By.id("onboar__companyType__i__companyType__TXT_DESC_1_txtcnt")).getText();
        javaScriptControls.executeJavaScript("arguments[0].click();",limitedLiabilityPartnership);
    }

    public void clickOnPartnership() throws Exception {
        companyType = driver.findElement(By.id("onboar__companyType__i__companyType__TXT_DESC_2_txtcnt")).getText();
        javaScriptControls.executeJavaScript("arguments[0].click();",partnership);
    }

    public void clickOnSoleProprietership() throws Exception {
        companyType = driver.findElement(By.id("onboar__companyType__i__companyType__TXT_DESC_3_txtcnt")).getText();
        javaScriptControls.executeJavaScript("arguments[0].click();",soleProprietership);
    }

    public String verifyAllFourProducts(){
        if(limited.isDisplayed() && limitedLiabilityPartnership.isDisplayed() && partnership.isDisplayed() && soleProprietership.isDisplayed()){
            return "Present";
        }
        return "Not Present";
    }

    public String getPageTitle() throws Exception {
        return commonDriver.getTitle();
    }



}
