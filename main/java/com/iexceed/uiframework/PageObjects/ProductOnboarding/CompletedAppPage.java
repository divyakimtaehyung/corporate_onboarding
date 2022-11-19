package com.iexceed.uiframework.PageObjects.ProductOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompletedAppPage extends TestBase {
    @FindBy(xpath ="//*[@id='applst__ApplicationList__statusApplicationList']//a/span")
    List<WebElement> completedAppList;
    @FindBy(xpath ="//*[@id='applst__ApplicationList__ps_pls_16_li']/span/a")
    WebElement completedHeader;
    @FindBy(id="viewap__ViewCustomerDetails__hanfoffBtn")
    WebElement viewCompletedHandOffBtn;
    @FindBy(id="handof__ViewIntegrationStatus__o__statusDetails__status_0_txtcnt")
    WebElement handoffStatus;
    @FindBy(id ="handof__ViewIntegrationStatus__o__integrationStatusDetails__apiName_0")
    WebElement partyGroupApi;
    @FindBy(id="handof__ViewIntegrationStatus__o__integrationStatusDetails__status_0_txtcnt")
    WebElement partyGrpStatus;
    @FindBy(id="handof__ViewIntegrationStatus__o__statusDetails__requestId_0_txtcnt")
    WebElement requestId;
    @FindBy(id ="handof__ViewIntegrationStatus__o__integrationStatusDetails__apiName_1")
    WebElement partyProvisionApi;
    @FindBy(id="handof__ViewIntegrationStatus__o__integrationStatusDetails__status_1_txtcnt")
    WebElement partyProvisionStatus;
    @FindBy(id ="handof__ViewIntegrationStatus__o__integrationStatusDetails__apiName_2")
    WebElement partyEnrichTF;
    @FindBy(id="handof__ViewIntegrationStatus__o__integrationStatusDetails__status_2_txtcnt")
    WebElement partyEnrichTFStatus;
    @FindBy(id ="handof__ViewIntegrationStatus__o__integrationStatusDetails__apiName_3")
    WebElement partyGroupApiCM;
    @FindBy(id="handof__ViewIntegrationStatus__o__integrationStatusDetails__status_3_txtcnt")
    WebElement partyGroupApiCMStatus;
    @FindBy(id ="handof__ViewIntegrationStatus__o__integrationStatusDetails__apiName_4")
    WebElement partyGroupApiCC;
    @FindBy(id="handof__ViewIntegrationStatus__o__integrationStatusDetails__status_4_txtcnt")
    WebElement partyGroupApiCCStatus;
    @FindBy(id ="handof__ViewIntegrationStatus__o__integrationStatusDetails__apiName_5")
    WebElement partyGroupEnrichCC;
    @FindBy(id="handof__ViewIntegrationStatus__o__integrationStatusDetails__status_5_txtcnt")
    WebElement partyGroupEnrichCCStatus;
    @FindBy(id="handof__HandOffDetails__closeBtn")
    WebElement handoffCancelBtn;


    private CommonElements commonElements;
    private TextBoxControls textBoxControls;
    private JavaScriptControls javaScriptControls;
    private DropdownControls dropdownControls;
    private CommonDriver commonDriver;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;

    public CompletedAppPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        textBoxControls= new TextBoxControls();
        javaScriptControls= new JavaScriptControls(driver);
        dropdownControls = new DropdownControls();
        commonDriver = new CommonDriver(driver);
        waitUtility = new WaitUtility();
        windowHandling = new WindowHandling(driver);

    }
    public DashboardPage setViewCompletedHandOffBtn() throws Exception {
        waitUtility.waitTillElementVisible(driver,viewCompletedHandOffBtn,150);
        javaScriptControls.executeJavaScript("arguments[0].click();", viewCompletedHandOffBtn);
        return new DashboardPage();
    }


    public void getCompletedCompanyName(String compNameHeader) throws Exception {
        waitUtility.waitTillElementVisible(driver,completedHeader,20);
        selectionOfDropdown(compNameHeader,completedAppList);
    }



    public void selectionOfDropdown (String itemType, List < WebElement > type) throws Exception {
        //System.out.println("sizetype=" + type.size());
        for (WebElement name : type) {
            if (name.getText().equals(itemType)) {
                // System.out.println(name.getText());
                name.click();
                break;
            }
        }
    }
}
