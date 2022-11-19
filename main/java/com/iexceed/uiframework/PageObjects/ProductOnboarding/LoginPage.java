package com.iexceed.uiframework.PageObjects.ProductOnboarding;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class LoginPage extends TestBase {

    @FindBy(id="ologin__Login__username")
    WebElement userName;
    @FindBy(id="ologin__Login__password")
    WebElement password;
    @FindBy(id="ologin__Login__el_btn_1")
    WebElement loginBtn;
    @FindBy(xpath="//p[@class='msg']")
    WebElement alertMsg;
    @FindBy(xpath="//button[@class='ok']")
    WebElement okBtn;
    @FindBy(id = "ologin__Login__NewPass")
    WebElement newPassword;
    @FindBy(id = "ologin__Login__ConfirmPass")
    WebElement confirmPassword;
    @FindBy(id="ologin__Login__el_btn_2_txtcnt")
    WebElement submitBtn;
    @FindBy(id="ologin__Login__el_txt_5_txtcnt")
    WebElement verifyMessage;
    @FindBy(id="ologin__Login__el_btn_4_txtcnt")
    WebElement okButton;


    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public LoginPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        windowHandling = new WindowHandling(driver);
        screenshotControl = new ScreenshotControl(driver);
        javaScriptControls = new JavaScriptControls(driver);


    }

    public void enterLoginCredentials(String username, String pasword)throws Exception{

        setUserName(username);
        waitUtility.waitForSeconds(10);
        setPassword(pasword);

    }

    public HomePage clickOnSigninButton() throws Exception {
        setWaitUtilityLoginBtn();
        getSignInBtn();
        return new HomePage();
    }

    public void navigateToUrl() throws Exception {
        ((JavascriptExecutor)driver).executeScript("window.open('');");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        windowHandling.switchToAnyWindow(tabs.get(1));
        commonDriver.navigateToUrl(props.getProperty("url"));
        waitUtility.waitForSeconds(10);
    }


    public DashboardPage clickSignInButton() throws Exception {
        waitUtility.waitTillElementBecomeClickable(driver,loginBtn,10);
        getSignInBtn();
        return new DashboardPage();
    }
    public void setUserName(String username) throws Exception {
        textBoxControls.setText(userName,username);
    }
    public void setPassword(String pasword) throws Exception {
        textBoxControls.setText(password,pasword);
    }
    public void getSignInBtn() throws Exception {
        waitUtility.waitForSeconds(6);
        javaScriptControls.executeJavaScript("arguments[0].click();",loginBtn);

    }
    public void refreshPage() throws Exception {
        commonDriver.navigateRefresh();
    }
    public void setWaitUtilityUsername(){
        waitUtility.waitTillElementVisible(driver,userName,20);
    }
    public void setWaitUtilityPassword(){
        waitUtility.waitTillElementVisible(driver,password,20);
    }
    public void setWaitUtilityLoginBtn(){
        waitUtility.waitTillElementVisible(driver,loginBtn,30);
    }

    public void navigateToUrl(String url,int childWindow) throws Exception {
        ((JavascriptExecutor)driver).executeScript("window.open('');");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        windowHandling.switchToAnyWindow(tabs.get(childWindow));
        commonDriver.navigateToUrl(url);
        waitUtility.waitForSeconds(10);
    }
    public void setNewPassword(String password) throws Exception {
        waitUtility.waitTillElementVisible(driver,newPassword,30);
        textBoxControls.setText(newPassword,password);
    }
    public void setConfirmPassword(String password) throws Exception {
        textBoxControls.setText(confirmPassword,password);
    }
    public void clickSubmitBtn() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",submitBtn);
    }

    public String getAlertMessage() throws Exception {
        waitUtility.waitTillElementVisible(driver,alertMsg,100);
        String alertMessage = alertMsg.getText();
        javaScriptControls.executeJavaScript("arguments[0].click();",okBtn);
        return alertMessage;
    }
    public void getVerifyMessage() throws Exception {
//        waitUtility.waitTillElementVisible(driver,verifyMessage,100);
//        String alertMessage = verifyMessage.getText();
        javaScriptControls.executeJavaScript("arguments[0].click();",okButton);
//        return alertMessage;
    }
  /*  public static byte[] getByteScreenshot() throws IOException {
        File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = FileUtils.readFileToByteArray(src);
        return fileContent;

    }*/

  /*  @AfterStep()
    public void stepScreenshot(Scenario scenario) throws IOException {
        System.out.println("after step executing");
       scenario.attach(getByteScreenshot(),"image/png","screenshot");
      File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = FileUtils.readFileToByteArray(src);
        scenario.attach(fileContent,"image/png","screenshot");*/


   /*@After("not @api")
    public void teardown(Scenario scenario) throws IOException {
        System.out.println("teardown brwoser");
        File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = FileUtils.readFileToByteArray(src);
        scenario.attach(fileContent,"image/png","screenshot");
        driver.quit();
    }*/


}
