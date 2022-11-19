package com.iexceed.uiframework.PageObjects.SelfCorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.JavaScriptControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StakeholdersPage extends TestBase {
    @FindBy(className="ok")
    WebElement oKBtn;
    @FindBy(id="onboar__corporate__breadcrumbtext_txtcnt")
    WebElement stakeholderTitle;
    @FindBy(id="onboar__corporate__el_btn_25")
    WebElement addUser;
    @FindBy(id="onboar__corporatedbdata__i__stakeholderdetails__thisisme_0_option_Y_span_0")
    WebElement selectStakeholder;
    @FindBy(id="onboar__corporatedbdata__i__stakeholderdetails__thisisme_2_option_Y_span_2")
    WebElement selectStakeholder1;
    @FindBy(id="onboar__corporatedbdata__i__stakeholderdetails__Role_0_txtcnt")
    WebElement role;
    @FindBy(id="onboar__corporatedbdata__i__stakeholderdetails__name_0_txtcnt")
    WebElement name;
    @FindBy(id="onboar__corporatedbdata__i__stakeholderdetails__status_0_txtcnt")
    WebElement status;
    @FindBy(id="onboar__corporatedbdata__i__stakeholderdetails__Role_2_txtcnt")
    WebElement role_1;
    @FindBy(id="onboar__corporatedbdata__i__stakeholderdetails__name_2_txtcnt")
    WebElement name_1;
    @FindBy(id="onboar__corporatedbdata__i__stakeholderdetails__percentageOfShare_2_txtcnt")
    WebElement sharePercenatge_1;
    @FindBy(id="onboar__corporatedbdata__i__stakeholderdetails__status_2_txtcnt")
    WebElement status_1;
    @FindBy(id="onboar__corporate__updateUser_0_txtcnt")
    WebElement update;
    @FindBy(id="onboar__corporate__updateUser_1_txtcnt")
    WebElement update1;
    @FindBy(id="onboar__corporate__removeUser_0_txtcnt")
    WebElement remove;
    @FindBy(id="onboar__corporate__el_btn_27")
    WebElement continueBtn;

    private WaitUtility waitUtility;
    private JavaScriptControls javaScriptControls;

    public StakeholdersPage(){
        PageFactory.initElements(driver,this);
        waitUtility= new WaitUtility();
        javaScriptControls = new JavaScriptControls(driver);
    }

    public void clickOkButton() throws Exception{
        //waitUtility.waitTillElementVisible(driver,oKBtn,30);
        waitUtility.waitForSeconds(5);
        javaScriptControls.executeJavaScript("arguments[0].click();",oKBtn);
        oKBtn.click();
        waitUtility.waitForSeconds(5);
       // driver.switchTo().alert().accept();
    }

    public String getPageTitle() throws Exception {
        waitUtility.waitTillElementVisible(driver,addUser,30);
        return stakeholderTitle.getText();
    }

    public void clickAddNewUser() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",addUser);
    }

    public void clickOnUpdateFirstUser() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",update);
    }

    public void clickOnUpdateSecondUser() throws Exception {
        waitUtility.waitForSeconds(5);
        javaScriptControls.executeJavaScript("arguments[0].click();",update1);
       // update1.click();
    }

    public void setSelectStakeholder() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",selectStakeholder);
    }

    public void setSelectStakeholderLimited() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",selectStakeholder1);
    }

    public void clickContinue() throws Exception{
        waitUtility.waitForSeconds(5);
        javaScriptControls.executeJavaScript("arguments[0].click();",continueBtn);
    }

    public void checkDataInStakeholdersPage(String role1,String firstName1,String middleName1,String lastName1,String status1){
        checkFieldsData(role.getText(),role1);
        checkFieldsData(name.getText(),getRequiredNameFormat(firstName1,middleName1,lastName1));
        checkFieldsData(status.getText(),status1);
    }

    public void checkDataInStakeholdersPageLLP(String role1, String firstName1, String middleName1, String lastName1, String status1) {
        checkFieldsData(role_1.getText(),role1);
        checkFieldsData(name_1.getText(),getRequiredNameFormat(firstName1,middleName1,lastName1));
        checkFieldsData(status_1.getText(),status1);
    }

    public void checkDataInStakeholdersPageLimited(String role1, String firstName1, String middleName1, String lastName1, String sharePercenatge, String status1) {
        checkFieldsData(role_1.getText(),role1);
        checkFieldsData(name_1.getText(),getRequiredNameFormat(firstName1,middleName1,lastName1));
        checkFieldsData(sharePercenatge_1.getText(),sharePercenatge+"%");
        checkFieldsData(status_1.getText(),status1);
    }

    public void checkUserDeleted(String role1){
        Assert.assertNotEquals(role.getText(),role1);

    }

    public void checkFieldsData(String actualData, String expectedData){
        Assert.assertEquals(actualData,expectedData);
    }

    public void removeUser() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",remove);
        javaScriptControls.executeJavaScript("arguments[0].click();",oKBtn);
    }

    public void updateUser() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",update);
    }

    public void checkUserUpdated(String role1) {
        Assert.assertEquals(role.getText(),"Partners");
    }

    public String getRequiredNameFormat(String firstName,String middleName,String lastName){
        String name = firstName+" "+middleName+" "+lastName;
        return name;
    }



}
