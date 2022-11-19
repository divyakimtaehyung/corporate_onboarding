package com.iexceed.uiframework.PageObjects.AppzillonAdmin.LegalEntity;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.CommonElements;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.implementations.TextBoxControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LegalEntityHome extends TestBase {
    private static Logger log = LogManager.getLogger(LegalEntityHome.class);

    @FindBy(id="Admin__LegalEntityMaintenanceQuery__AddButton")
    WebElement ADDButton;

    @FindBy(id ="Admin__LegalEntityMaintenanceQuery__SearchButton")
    WebElement SearchButton;

    @FindBy(id = "Admin__LegalEntityMaintenanceQuery__legalEntityName")
    WebElement LegalEntityName;

    @FindBy(xpath = "//*[@id='Admin__LegalEntityMaintenanceDetail__Authorize_txtcnt']")
    WebElement legalEntityAuthorizeBtn;

    @FindBy(xpath = "//table/tbody")
    WebElement ListLegalEntity;
    @FindBy(id = "Admin__LegalEntityMaintenanceQuery__operationalUnit")
    WebElement opUnit;

    private TextBoxControls textBoxControls;
    private CommonElements commonElements;
    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;

    public LegalEntityHome(){


        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        waitUtility  = new WaitUtility();
        textBoxControls = new TextBoxControls();
        javaScriptControls = new JavaScriptControls(driver);
    }
    public void clickAddNewButton() throws Exception {
        commonElements.click(ADDButton);
    }
    public void clickSearchBtn() throws Exception {
        commonElements.click(SearchButton);
    }
    public void inputLegalEntityName(String EntityName) throws Exception {
        textBoxControls.clearText(LegalEntityName);
        textBoxControls.setText(LegalEntityName,EntityName);
    }
    public void checkLegalEntityList() throws Exception {
        waitUtility.waitForSeconds(5);
        if (!(ListLegalEntity.isDisplayed())){
            log.info("No Legal Entities Found");
        }else {
            log.info("Legal Entities Available");
        }

    }

    public void inputOpUnit(String operationalUnit) throws Exception {
        textBoxControls.setText(opUnit,operationalUnit);
    }



    //Wait Methods
    public void setWaitADDNEWBtn(){
        waitUtility.waitTillElementBecomeClickable(driver,ADDButton,20);
    }
    public void setWaitSearchBtn(){
        waitUtility.waitTillElementBecomeClickable(driver,SearchButton,20);
    }
    public void setWaitLegalEntityName(){
        waitUtility.waitTillElementBecomeClickable(driver,LegalEntityName,30);
    }
    public void setWaitOperationalUnit(){
        waitUtility.waitTillElementBecomeClickable(driver,opUnit,30);
    }
    public void setWaitLegalEntityListVisible(){
        try {
            waitUtility.waitTillElementVisible(driver,ListLegalEntity,30);
        }catch (Exception e){
        }

    }

    public void clickLegalEntityAuthorizeBtn() throws Exception {
        waitUtility.waitTillElementVisible(driver,legalEntityAuthorizeBtn,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",legalEntityAuthorizeBtn);

    }
}
