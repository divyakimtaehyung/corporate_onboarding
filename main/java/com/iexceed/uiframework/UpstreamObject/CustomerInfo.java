package com.iexceed.uiframework.UpstreamObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.iexceed.uiframework.DomainObjects.Responses;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"requestId","apiName","apiMethod","apiUri","ConsolidationStatus"})

public class CustomerInfo {
    @JsonProperty("companyShortName")
    private String companyShortName ;
    @JsonProperty("corporateEntityName")
    private String corporateEntityName;
    @JsonProperty("licenseNo")
    private String licenseNo ;
    @JsonProperty("primaryBankEntity")
    private String primaryBankEntity ;
    @JsonProperty("licenseType")
    private String licenseType;
    @JsonProperty("typeOfIndustry")
    private String typeOfIndustry;
    @JsonProperty("primaryOperatingCurrency")
    private String primaryOperatingCurrency;
    @JsonProperty("sicCode")
    private String sicCode;
    @JsonProperty("licenseIssuedCountry")
    private String licenseIssuedCountry;
    @JsonProperty("homeCountry")
    private String homeCountry;
    public CustomerInfo(){

    }
    public CustomerInfo(String companyShortName,String corporateEntityName,String licenseNo,String primaryBankEntity,String licenseType,String typeOfIndustry, String primaryOperatingCurrency, String sicCode, String licenseIssuedCountry, String homeCountry){
        setCompanyShortName(companyShortName);
        setCompanyEntityName(corporateEntityName);
        setLicenseNo(licenseNo);
        setPrimaryBankEntity(primaryBankEntity);
        setLicenseType(licenseType);
        setTypeOfIndustry(typeOfIndustry);
        setPrimaryOperatingCurrency(primaryOperatingCurrency);
        setSicCode(sicCode);
        setLicenseIssuedCountry(licenseIssuedCountry);
        setHomeCountry(homeCountry);

    }

    @JsonProperty ("companyShortName")
    public void setCompanyShortName(String companyShortName){
        this.companyShortName = companyShortName;
    }
    @JsonProperty("companyShortName")
    public String getCompanyShortName(){
        return companyShortName;
    }
    @JsonProperty ("corporateEntityName")
    public void setCompanyEntityName(String companyEntityName){
        this.corporateEntityName = companyEntityName;
    }
    @JsonProperty("corporateEntityName")
    public String getCompanyEntityName(){
        return corporateEntityName;
    }
    @JsonProperty ("licenseNo")
    public void setLicenseNo(String licenseNo){ this.licenseNo = licenseNo; }
    @JsonProperty("licenseNo")
    public String getLicenseNo(){
        return licenseNo;
    }
    @JsonProperty ("primaryBankEntity")
    public void setPrimaryBankEntity(String primaryBankEntity){
        this.primaryBankEntity = primaryBankEntity;
    }
    @JsonProperty("primaryBankEntity")
    public String getPrimaryBankEntity(){
        return primaryBankEntity;
    }
    @JsonProperty ("licenseType")
    public void setLicenseType(String licenseType){
        this.licenseType = licenseType;
    }
    @JsonProperty("licenseType")
    public String getLicenseType(){
        return licenseType;
    }
    @JsonProperty ("typeOfIndustry")
    public void setTypeOfIndustry(String typeOfIndustry){
        this.typeOfIndustry = typeOfIndustry;
    }
    @JsonProperty("typeOfIndustry")
    public String getTypeOfIndustry(){ return typeOfIndustry; }
    @JsonProperty ("primaryOperatingCurrency")
    public void setPrimaryOperatingCurrency(String primaryOperatingCurrency){ this.primaryOperatingCurrency = primaryOperatingCurrency; }
    @JsonProperty("primaryOperatingCurrency")
    public String getPrimaryOperatingCurrency(){
        return primaryOperatingCurrency;
    }
    @JsonProperty ("sicCode")
    public void setSicCode(String sicCode){
        this.sicCode = sicCode;
    }
    @JsonProperty("sicCode")
    public String getSicCode(){
        return sicCode;
    }
    @JsonProperty ("licenseIssuedCountry")
    public void setLicenseIssuedCountry(String licenseIssuedCountry){ this.licenseIssuedCountry = licenseIssuedCountry; }
    @JsonProperty("licenseIssuedCountry")
    public String getLicenseIssuedCountry(){
        return licenseIssuedCountry;
    }
    @JsonProperty ("homeCountry")
    public void setHomeCountry(String homeCountry){
        this.homeCountry = homeCountry;
    }
    @JsonProperty("homeCountry")
    public String getHomeCountry(){
        return homeCountry;
    }

}
