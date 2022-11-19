package com.iexceed.uiframework.PageObjects.AppzillonAdmin;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.CommonElements;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.implementations.MouseControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends TestBase {


    @FindBy(xpath = "//*[@id='Admin__Landing__ct_mnu_2_Bank Parameters_li']")
    WebElement BankParametertab;
    @FindBy(xpath = "//*[text()='Staff Maintenance']")
    WebElement staffMaintenance;
    @FindBy(xpath = "//*[text()='Legal Entity Maintenance']")
    WebElement LegalEntityBtn;

    private MouseControls mouseControls;
    private CommonElements commonElements;
    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;


    public DashboardPage(){
        PageFactory.initElements(driver,this);
        mouseControls = new MouseControls(driver);
        commonElements = new CommonElements();
        waitUtility = new WaitUtility();
        javaScriptControls = new JavaScriptControls(driver);

    }

    public void clickDropdownLegalEntity() throws Exception {
        commonElements.click(LegalEntityBtn);
    }
    public void selectBankParameters() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].scrollIntoView(true);", BankParametertab);
        mouseControls.moveToElement(BankParametertab);
    }

    public void selectStaffMaintenance() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",staffMaintenance);
    }
    public void waitTillBankParamterVisible(){
        waitUtility.waitTillElementBecomeClickable(driver,BankParametertab,30);
    }
    public void waitTillLegalEntityVisible(){
        waitUtility.waitTillElementVisible(driver, LegalEntityBtn,500 );
    }
    public void setWaitUtilityStaffMaintenance(){waitUtility.waitTillElementBecomeClickable(driver,staffMaintenance,50);}


}
