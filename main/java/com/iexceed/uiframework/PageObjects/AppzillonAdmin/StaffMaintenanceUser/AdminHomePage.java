package com.iexceed.uiframework.PageObjects.AppzillonAdmin.StaffMaintenanceUser;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class AdminHomePage extends TestBase {


    @FindBy(id = "Admin__StaffMaintenanceQuery__AddButton")
    WebElement addNew;
    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__userName")
    WebElement username;
    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__userId")
    WebElement userId;
    static String userIdFinal;
    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__addInfo1")
    WebElement employeeId;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__ADDINFO1")
    WebElement employeeIdEdit;

    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__dateOfBirth_button")
    WebElement dob;
    @FindBy(xpath = "//*[@id='Admin__StaffMaintenanceAdd__o__tbAsmiUser__dateOfBirth_dw_pnl_0']/div/div/div/div[1]/div/div[2]/div[1]/div")
    WebElement previousYear;
    @FindBy(xpath = "//div[text()='1']")
    WebElement date;

    @FindBy(xpath = "//*[@class='mbsc-cal-month']")
    WebElement dobMonthBtn;
    @FindBy(xpath = "//*[@class='mbsc-cal-year']")
    WebElement dobYearBtn;
    @FindBy(xpath = "//*[@class='mbsc-fr-btn-e mbsc-fr-btn-nhl mbsc-cal-sc-m-cell mbsc-cal-sc-cell mbsc-cal-month-s']/div/div")
    List<WebElement> monthList;
    @FindBy(xpath = "//*[@class='mbsc-fr-btn-e mbsc-fr-btn-nhl mbsc-cal-sc-m-cell mbsc-cal-sc-cell mbsc-cal-year-s']/div/div")
    List<WebElement> yearList;
    String beforeXpath = "//div[@class='mbsc-cal-anim-c mbsc-comp']/div/div[2]/div[1]/div[";
    String afterXpath = "]/div[";

    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__userPhno1")
    WebElement mobileNumber;
    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__userEml1")
    WebElement primaryEmail;
    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__userEml2")
    WebElement secomdaryEmail;
    @FindBy(id = "Admin__StaffMaintenanceDetail__domainAdd")
    WebElement operationalUnitDD;
    @FindBy(xpath = "//div[@id='Admin__StaffMaintenanceDetail__domainAdd_div']/ul/li")
    List<WebElement> operationalUnit;
    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__addInfo2_span")
    WebElement primaryOperationalUnitDD;
    @FindBy(xpath = "//div[@id='Admin__StaffMaintenanceAdd__o__tbAsmiUser__addInfo2_div']/ul/li")
    List<WebElement> primaryOperationalUnit;

    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__userAddr1")
    WebElement addressline1;
    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__userAddr2")
    WebElement addressline2;
    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__userAddr3")
    WebElement addressline3;
    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__userAddr4")
    WebElement addressline4;

    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__addInfo5_span")
    WebElement departmentDD;
    @FindBy(xpath = "//div[@id='Admin__StaffMaintenanceAdd__o__tbAsmiUser__addInfo5_div']/ul/li")
    List<WebElement> department;

    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__addInfo4_span")
    WebElement userStatusDD;
    @FindBy(xpath = "//div[@id='Admin__StaffMaintenanceAdd__o__tbAsmiUser__addInfo4_div']/ul/li")
    List<WebElement> userStatus;

    @FindBy(id = "Admin__StaffMaintenanceDetail__rolesAdd_span")
    WebElement rolesDD;
    @FindBy(xpath = "//div[@id='Admin__StaffMaintenanceDetail__rolesAdd_div']/ul/li")
    List<WebElement> roles;

    @FindBy(id = "Admin__StaffMaintenanceAdd__o__tbAsmiUser__addInfo3_span")
    WebElement languageDD;
    @FindBy(xpath = "//div[@id='Admin__StaffMaintenanceAdd__o__tbAsmiUser__addInfo3_div']/ul/li")
    List<WebElement> language;

    @FindBy(id = "Admin__StaffMaintenanceDetail__Save_txtcnt")
    WebElement save;
    @FindBy(xpath = "//p[@class='msg']")
    WebElement msg;
    @FindBy(xpath = "//button[text()='OK']")
    WebElement okBtn;


    @FindBy(id = "Admin__StaffMaintenanceQuery__userId")
    WebElement queryUserId;
    @FindBy(id = "Admin__StaffMaintenanceQuery__SearchButton")
    WebElement querySearchButton;
    @FindBy(xpath = "//*[@id = 'Admin__StaffMaintenanceQuery__AuthTable_row_0']/td")
    List<WebElement> queryResult;
    @FindBy(id = "td_Admin__StaffMaintenanceQuery__o__tbAsmiUser__USERID_0")
    WebElement queryUserIdSelect;
   // @FindBy(xpath = "//*[@id='Admin__StaffMaintenanceQuery__AuthTable_tbody']/tr/td")
    @FindBy(css = "[id='Admin__StaffMaintenanceQuery__AuthTable_tbody']>tr>td")
    List<WebElement> queryResults;
    @FindBy(xpath = "//*[@id='Admin__StaffMaintenanceQuery__AuthTable_tbody']/tr/td/a")
    WebElement queryResultId;
    @FindBy(xpath = "//*[@id='Admin__StaffMaintenanceDetail__Authorize_txtcnt']")
    WebElement authorizeBtn;

    @FindBy(xpath = "//*[@id='Admin__StaffMaintenanceDetail__Unlock_txtcnt']")
    WebElement unlockBtn;
    @FindBy(xpath = "//*[@id='Admin__StaffMaintenanceDetail__resetPassword_txtcnt']")
    WebElement pswdResetBtn;

    @FindBy(xpath = "//input[@type='email']")
    WebElement emailId;
    @FindBy(xpath = "//input[@type='password']")
    WebElement password;
    @FindBy(xpath = "//input[@value='Next']")    //Identifier to be changed for headless = false
    WebElement nextBtn;
    @FindBy(xpath = "//input[@type='submit']")    //Identifier to be changed for headless = false
    WebElement nextBtn1;
    @FindBy(css = "div.xT>div.y6>span>span")
    List<WebElement> email;
    @FindBy(css = "div.a3s.aiL ,div.iA.g6 >span")
    List<WebElement> emailBodys;


    @FindBy(id = "Admin__StaffMaintenanceDetail__userName")
    WebElement user_name;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__USERID_txtcnt")
    WebElement user_id;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__ADDINFO1")
    WebElement employee_id;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__DATEOFBIRTH")
    WebElement dob_date;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__USERPHNO1")
    WebElement mobile_number;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__USEREML1")
    WebElement primary_email;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__USEREML2")
    WebElement secondary_email;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__USERADDR1")
    WebElement address_line1;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__USERADDR2")
    WebElement address_line2;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__USERADDR3")
    WebElement address_line3;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__USERADDR4")
    WebElement address_line4;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__ADDINFO5")
    WebElement department_data;
    @FindBy(id = "Admin__StaffMaintenanceDetail__rolesEdit")
    WebElement roles_data;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__ADDINFO3")
    WebElement language_data;
    @FindBy(id = "Admin__StaffMaintenanceDetail__domainEdit")
    WebElement operational_unit;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__ADDINFO2")
    WebElement primaryop_unit;
    @FindBy(id = "Admin__StaffMaintenanceEdit__o__tbAsmiUser__ADDINFO4")
    WebElement user_status;


    private CommonDriver commonDriver;
    private MouseControls mouseControls;
    private CommonElements commonElements;
    private WaitUtility waitUtility;
    private TextBoxControls textBoxControls;
    private DropdownControls dropdownControls;
    private JavaScriptControls javaScriptControls;

    public AdminHomePage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        mouseControls= new MouseControls(driver);
        waitUtility= new WaitUtility();
        textBoxControls = new TextBoxControls();
        dropdownControls = new DropdownControls();
        javaScriptControls = new JavaScriptControls(driver);
    }

    public void getRandomUserID(String userId) throws Exception {
        userIdFinal = userId + new Random().nextInt(1000);
        setUserId(userIdFinal);
    }

    public void selectAddNew() throws Exception{
        javaScriptControls.executeJavaScript("arguments[0].click();",addNew);
    }
    public void setUsername(String userName) throws Exception{
        textBoxControls.setText(username,userName);
    }
    public void setUserId(String userId) throws Exception{
        textBoxControls.setText(this.userId,userId);
        userIdFinal = userId;
    }
    public void setEmployeeId(String employeeID) throws Exception{
        textBoxControls.setText(employeeId,employeeID);
    }

    //setDoB method value is hardcoded and has to be checked
    public void setDOB(String dob) throws Exception {
//        DateFormat inputFormat = new SimpleDateFormat("dd/MMM/yyyy");
//        DateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy");
//        Date date = inputFormat.parse(dob);
//        String finalDob = outputFormat.format(date);
//        System.out.println("dob is "+finalDob);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('Admin__StaffMaintenanceAdd__o__tbAsmiUser__dateOfBirth').value = '10-Mar-2000'");
    }
    //Method to check validations for DOB
    public void setInvalidDOB(String dateOfBirth) throws Exception {
        if(dateOfBirth.isEmpty()){

        }
        else {
            javaScriptControls.executeJavaScript("arguments[0].click();", dob);
            javaScriptControls.executeJavaScript("arguments[0].click();", date);
        }
    }

    public void setMobileNumber(String mNumber) throws Exception{
        waitUtility.waitTillElementVisible(driver,mobileNumber,50);
        textBoxControls.setText(mobileNumber,mNumber);
    }
    public void setPrimaryEmail(String pEmail) throws Exception{
        waitUtility.waitTillElementVisible(driver,primaryEmail,50);
        textBoxControls.setText(primaryEmail,pEmail);
    }
    public void setSecondaryEmail(String sEmail) throws Exception{
        textBoxControls.setText(secomdaryEmail,sEmail);
    }
    public void setOperationalUnit(String operationalUnitData) throws Exception{
        waitUtility.waitTillElementVisible(driver,operationalUnitDD,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",operationalUnitDD);
        String operationalUnt[] = operationalUnitData.split(",");
        for(int i=0;i<operationalUnt.length;i++){
            selectionOfDropdown(operationalUnt[i],operationalUnit);
        }
    }

    public Boolean checkPrimaryOperationalUnit(){
        Boolean flag = true;
        String operationalUnitData = operationalUnitDD.getText();
        String operationalUnit[] = operationalUnitData.trim().split(",");
        if(operationalUnit.length==(primaryOperationalUnit.size()-1)){
            for(int i=1;i<primaryOperationalUnit.size();i++){
                for(int j=0;j<operationalUnit.length;j++){
                    if(primaryOperationalUnit.get(i).equals(operationalUnit[j])){
                        flag = true;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
        }
      return flag;
    }

    public void setPrimaryOperationalUnit(String primaryOperationalUnitData) throws Exception{
        waitUtility.waitTillElementVisible(driver,primaryOperationalUnitDD,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",primaryOperationalUnitDD);
        selectionOfDropdown(primaryOperationalUnitData,primaryOperationalUnit);
        waitUtility.waitForSeconds(10);
    }

    public void setAddressline1(String addressline1Data) throws Exception{
        textBoxControls.setText(addressline1,addressline1Data);
    }
    public void setAddressline2(String addressline2Data) throws Exception{
        textBoxControls.setText(addressline2,addressline2Data);
    }
    public void setAddressline3(String addressline3Data) throws Exception{
        textBoxControls.setText(addressline3,addressline3Data);
    }
    public void setAddressline4(String addressline4Data) throws Exception{
        textBoxControls.setText(addressline4,addressline4Data);
    }
    public void setDepartment(String departmentData) throws Exception{
        waitUtility.waitTillElementVisible(driver,departmentDD,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",departmentDD);
        selectionOfDropdown(departmentData,department);
    }
    public void setUserStatus(String userStatusData) throws Exception{
        waitUtility.waitTillElementVisible(driver,userStatusDD,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",userStatusDD);
        selectionOfDropdown(userStatusData,userStatus);
    }
    public void setRoles(String rolesData) throws Exception{
        waitUtility.waitTillElementVisible(driver,rolesDD,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",rolesDD);
        selectionOfDropdown(rolesData,roles);
    }
    public void setLanguage(String languageData) throws Exception{
        waitUtility.waitTillElementVisible(driver,languageDD,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",languageDD);
        selectionOfDropdown(languageData,language);
    }

    public void saveApplication() throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",save);
    }

    public void fetchQueryResult(String ...user_Id) throws Exception {
        waitUtility.waitTillElementVisible(driver,queryUserId,50);
        waitUtility.waitForSeconds(5);

        if((user_Id.length != 0) && (user_Id[0] != null)){
            textBoxControls.setText(queryUserId, queryResults.get(0).getText());
            userIdFinal = queryResults.get(0).getText();
        }
        else if(userIdFinal == null){
            textBoxControls.setText(queryUserId,queryResults.get(0).getText().toUpperCase());
        }
        else{
            textBoxControls.setText(queryUserId,userIdFinal);
        }
        javaScriptControls.executeJavaScript("arguments[0].click();",querySearchButton);
        waitUtility.waitForSeconds(5);
    }

    public String checkUserIdCaseSensitive() throws Exception {
        if(queryUserId.getAttribute("value").equalsIgnoreCase(queryResult.get(0).getText())){
            return "Case Insensitive";
        }
        return "Case Sensitive";
    }

    public String checkAuthorizationStatus(){
        String authorizationStatus = queryResult.get(5).getText();
        return authorizationStatus;
    }
    public String checkQueryResultId(){
        if(queryResult.get(0).isDisplayed()){
            return "Present";
        }
        return "Not Present";
    }
    public void clickUserIdLink() throws Exception {
        waitUtility.waitTillElementVisible(driver,queryResultId,30);
        javaScriptControls.executeJavaScript("arguments[0].click();",queryResultId);
    }
    public void modifyDetails(String employee_id) throws Exception {
        waitUtility.waitForSeconds(10);
        waitUtility.waitTillElementVisible(driver,employeeIdEdit,30);
        employeeIdEdit.clear();
        employeeIdEdit.sendKeys(employee_id);
    }
    public void checkQueryResultIdDetails(String UserName,String UserId,String EmployeeID,String DateOfBirth,String MobileNumber,String PrimaryEmail,String SecondaryEmail,String OperationalUnit,String PrimaryOperationalUnit,String AddressLine1,String AddressLine2,String AddressLine3,String AddressLine4,String Department,String UserStatus,String Roles,String Language) throws Exception {
        waitUtility.waitTillElementVisible(driver,employee_id,30);
        waitUtility.waitForSeconds(5);
        checkFieldsData(user_name.getText(),UserName);
        checkFieldsData(user_id.getText(),userIdFinal);
        checkFieldsData(mobile_number.getAttribute("value"),MobileNumber);
        checkFieldsData(primary_email.getAttribute("value"),PrimaryEmail);
        checkFieldsData(operational_unit.getAttribute("value"),OperationalUnit);
        checkFieldsData(primaryop_unit.getAttribute("value"),PrimaryOperationalUnit);
        checkFieldsData(address_line1.getAttribute("value"),AddressLine1);
        checkFieldsData(address_line2.getAttribute("value"),AddressLine2);
        checkFieldsData(address_line3.getAttribute("value"),AddressLine3);
        checkFieldsData(address_line4.getAttribute("value"),AddressLine4);
        checkFieldsData(department_data.getAttribute("value"),Department);
        checkFieldsData(user_status.getAttribute("value"),UserStatus);
        checkFieldsData(roles_data.getAttribute("value"),Roles);
        checkFieldsData(language_data.getAttribute("value"),Language);
        checkFieldsData(employee_id.getAttribute("value"),EmployeeID);
        checkFieldsData(dob_date.getAttribute("value"),modifyDOB(DateOfBirth));
        checkFieldsData(secondary_email.getAttribute("value"),SecondaryEmail);
    }
    public void checkFieldsData(String actualData, String expectedData){
        Assert.assertEquals(actualData,expectedData);
    }
    public String modifyDOB(String dobValue){
        dobValue = dobValue.replaceAll("/","-");
        return dobValue;
    }
    public void queryResultCheck(String userName,String primaryOperationalUnt,String dept,String mobile ){
        String user_id = queryResult.get(0).getText();
        Assert.assertEquals(user_id,userIdFinal);
        String user_name = queryResult.get(1).getText();
        System.out.println("username "+user_name);
        Assert.assertEquals(user_name,userName);
        String primary_operationalUnit = queryResult.get(2).getText();
        Assert.assertEquals(primary_operationalUnit,primaryOperationalUnt);
        String department_check = queryResult.get(3).getText();
        Assert.assertEquals(department_check,dept);
        String mobile_number = queryResult.get(4).getText();
        Assert.assertEquals(mobile_number,mobile);
    }

    public void checkAuthorizationPending(String status) throws Exception {
        waitUtility.waitForSeconds(10);
        javaScriptControls.executeJavaScript("arguments[0].click();", queryResultId);
    }

    public void clickAuthorizeBtn() throws Exception {
        waitUtility.waitTillElementVisible(driver,authorizeBtn,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",authorizeBtn);
    }



    public void clickUnlockBtn() throws Exception {
        waitUtility.waitForSeconds(10);
        waitUtility.waitTillElementVisible(driver,unlockBtn,50);
        javaScriptControls.executeJavaScript("arguments[0].click();", unlockBtn);
    }
    public String checkUserNameNonEditable(){
        if(username.isDisplayed()){
            return "Editable";
        }
        return "Non Editable";
    }
    public String checkUserIdNonEditable(){
        if(userId.isDisplayed()){
            return "Editable";
        }
        return "Non Editable";
    }

     public void setWaitUtilityAddNew(){waitUtility.waitTillElementBecomeClickable(driver,addNew,20);}
    public void setWaitUtilityUserName(){waitUtility.waitTillElementVisible(driver,username,50);}

    public void selectionOfDropdown(String itemType, List<WebElement> type) throws Exception {
        for(WebElement name : type){
            if(name.getText().equals(itemType)){
                name.click();
                //javaScriptControls.executeJavaScript("arguments[0].click();",name);

                break;
            }
        }
     }

     public String getAlertMessage() throws Exception {
       waitUtility.waitTillElementVisible(driver,msg,100);
        String alertMessage = msg.getText();
         javaScriptControls.executeJavaScript("arguments[0].click();",okBtn);
         return alertMessage;
     }

     public String[] getPasswordFromMail(String email_value,String pswd) throws Exception {
         emailLogingetpswd(email_value,pswd);
         String[] loginCredentials= getEmailBody();
         return loginCredentials;
     }

     public void emailLogingetpswd(String email_value,String pswd) throws Exception {
        waitUtility.waitTillElementVisible(driver,emailId,30);
        emailId.clear();
        emailId.sendKeys(email_value);
         javaScriptControls.executeJavaScript("arguments[0].click();",nextBtn);

         waitUtility.waitTillElementVisible(driver,password,30);
         password.clear();
         password.sendKeys(pswd);
         javaScriptControls.executeJavaScript("arguments[0].click();",nextBtn1);

         waitUtility.waitForSeconds(20);
         for(WebElement emailsub : email){
             if((emailsub.getText().equals("User Created Successfully") == true)||(emailsub.getText().equals("Password Changed Successfully") == true)){
                 System.out.println("found ");
                 emailsub.click();
                 break;
             }
         }
    }

    public String[] getEmailBody() throws Exception {
        String loginCredential[] = new String[2];
        System.out.println("size "+emailBodys.size());
        int i = (emailBodys.size()-2);
        waitUtility.waitForSeconds(10);
        String emailBody = emailBodys.get(i).getText();
        String data[] = emailBody.trim().split("userid is|and password is|Created by|and");
        loginCredential[0] = data[1].trim();
        loginCredential[1] = data[2].trim();
        System.out.println("userid "+loginCredential[0]);
        System.out.println("pswd "+loginCredential[1] );
        return loginCredential;

    }

    public void setPswdResetBtn() throws Exception {
        waitUtility.waitTillElementVisible(driver,save,30);
        javaScriptControls.executeJavaScript("arguments[0].click();",pswdResetBtn);
        waitUtility.waitTillElementVisible(driver,okBtn,20);
    }


    public void selectDateFromCal(String ddmmyyyy) throws Exception {
        String date = ddmmyyyy;
        String dateArr[] = date.split("/");
        String day = dateArr[0];
        String month = dateArr[1];
        String year = dateArr[2];
        javaScriptControls.executeJavaScript("arguments[0].click();",dob);
        while(true) {
           String text = dobYearBtn.getText();
           if (text.equals(year)) {
               break;
           }
           else {
               previousYear.click();
           }
       }
        javaScriptControls.executeJavaScript("arguments[0].click();", dobMonthBtn);
        selectionOfDropdown(month, monthList);
       // waitUtility.waitTillElementVisible(driver,dobYearBtn,50);

        final int totalWeekDays = 7;
        boolean flag = false;
        for (int rowNum = 1; rowNum <= 6; rowNum++) {
            for (int colNum = 1; colNum <= totalWeekDays; colNum++) {
                String dayVal = driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]")).getText();
                if (dayVal.equals(day)) {
                    driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]")).click();
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }

        }
    }



}
