package com.iexceed.uiframework.UpstreamObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"requestId","apiName","apiMethod","apiUri","ConsolidationStatus"})

public class Product {
    @JsonProperty("allowedBranches")
    private List<String> allowedBranches = null ;
    @JsonProperty("defaultBranch")
    private String defaultBranch ;
    @JsonProperty("defaultBankEntity")
    private String defaultBankEntity ;
    @JsonProperty("productName")
    private String productName ;
    @JsonProperty("productCode")
    private String productCode ;
    @JsonProperty("homeCountry")
    private String homeCountry ;
    @JsonProperty("remarks")
    private String remarks ;
    @JsonProperty("status")
    private String status ;
    public Product(){

    }
    public Product(List<String>allowedBranches, String defaultBranch, String defaultBankEntity, String productName, String productCode, String homeCountry, String remarks, String status){
        setAllowedBranches(allowedBranches);
        setDefaultBranch(defaultBranch);
        setDefaultBankEntity(defaultBankEntity);
        setProductName(productName);
        setProductCode(productCode);
        setHomeCountry(homeCountry);
        setRemarks(remarks);
        setStatus(status);
    }

    @JsonProperty("allowedBranches")
    public List<String> getAllowedBranches() {

        return allowedBranches;
    }
    @JsonProperty("allowedBranches")
    public void setAllowedBranches(List<String> allowedBranches) {

        this.allowedBranches = allowedBranches;
    }
    @JsonProperty("defaultBranch")
    public String getDefaultBranch() {
        return defaultBranch;
    }
    @JsonProperty("defaultBranch")
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }
    @JsonProperty("defaultBankEntity")
    public String getDefaultBankEntity() {
        return defaultBankEntity;
    }
    @JsonProperty("defaultBankEntity")
    public void setDefaultBankEntity(String defaultBankEntity) {
        this.defaultBankEntity = defaultBankEntity;
    }
    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }
    @JsonProperty("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }
    @JsonProperty("productCode")
    public String getProductCode() {
        return productCode;
    }
    @JsonProperty("productCode")
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    @JsonProperty("homeCountry")
    public String getHomeCountry() {
        return homeCountry;
    }
    @JsonProperty("homeCountry")
    public void setHomeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
    }
    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }
    @JsonProperty("remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }
}
