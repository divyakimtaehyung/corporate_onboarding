package com.iexceed.uiframework.UpstreamObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"requestId","apiName","apiMethod","apiUri","ConsolidationStatus"})

public class UpstreamRequest {
    @JsonProperty("operationalUnit")
    private String operationalUnit ;
    @JsonProperty("source")
    private String source ;
    @JsonProperty("action")
    private String action;
    @JsonProperty("customerInfo")
    private CustomerInfo customerInfo ;
    @JsonProperty("addressDetails")
    private List<AddressDetail> addressDetails = null;
    @JsonProperty("swiftInfo")
    private SwiftInfo swiftInfo;
    @JsonProperty("products")
    private List<Product>products = null;
    @JsonProperty("additionalInfo")
    private AdditionalInfo additionalInfo;
    @JsonProperty("cifDetails")
    private CifDetails cifDetails;
    @JsonProperty("entityInfo")
    private EntityInfo entityInfo;
    @JsonProperty("contactDetails")
    private List<ContactDetail> contactDetails = null;
    @JsonProperty("remarks")
    private String remarks;
    public UpstreamRequest(){

    }
    public UpstreamRequest(String operationalUnit, String source, String action, CustomerInfo customerInfo, List<AddressDetail> addressDetails, SwiftInfo swiftInfo, List<Product>products, AdditionalInfo additionalInfo, CifDetails cifDetails, EntityInfo entityInfo, List<ContactDetail>contactDetails, String remarks ){
        setOperationalUnit(operationalUnit);
        setSource(source);
        setAction(action);
        setCustomerInfo(customerInfo);
        setAddressDetails(addressDetails);
        setSwiftInfo(swiftInfo);
        setProducts(products);
        setAdditionalInfo(additionalInfo);
        setCifDetails(cifDetails);
        setEntityInfo(entityInfo);
        setContactDetails(contactDetails);
        setRemarks(remarks);
    }
    public UpstreamRequest(String operationalUnit, String source, String action, CustomerInfo customerInfo, List<AddressDetail> addressDetails, SwiftInfo swiftInfo,AdditionalInfo additionalInfo, CifDetails cifDetails, EntityInfo entityInfo, List<ContactDetail>contactDetails, String remarks ){
        setOperationalUnit(operationalUnit);
        setSource(source);
        setAction(action);
        setCustomerInfo(customerInfo);
        setAddressDetails(addressDetails);
        setSwiftInfo(swiftInfo);
        setAdditionalInfo(additionalInfo);
        setCifDetails(cifDetails);
        setEntityInfo(entityInfo);
        setContactDetails(contactDetails);
        setRemarks(remarks);
    }

    // Getters and setters
    @JsonProperty("operationalUnit")
    public String getOperationalUnit() {
        return operationalUnit;
    }
    @JsonProperty("operationalUnit")
    public void setOperationalUnit(String operationalUnit) {
        this.operationalUnit = operationalUnit;
    }
    @JsonProperty("source")
    public String getSource() {
        return source;
    }
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }
    @JsonProperty("action")
    public String getAction() {
        return action;
    }
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }
    @JsonProperty("customerInfo")
    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }
    @JsonProperty("customerInfo")
    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }
    @JsonProperty("addressDetails")
    public List<AddressDetail> getAddressDetails() {
        return addressDetails;
    }
    @JsonProperty("addressDetails")
    public void setAddressDetails(List<AddressDetail> addressDetails) {
        this.addressDetails = addressDetails;
    }
    @JsonProperty("swiftInfo")
    public SwiftInfo getSwiftInfo() {
        return swiftInfo;
    }
    @JsonProperty("swiftInfo")
    public void setSwiftInfo(SwiftInfo swiftInfo) {
        this.swiftInfo = swiftInfo;
    }
    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }
    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    @JsonProperty("additionalInfo")
    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }
    @JsonProperty("additionalInfo")
    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    @JsonProperty("cifDetails")
    public CifDetails getCifDetails() {
        return cifDetails;
    }
    @JsonProperty("cifDetails")
    public void setCifDetails(CifDetails cifDetails) {
        this.cifDetails = cifDetails;
    }
    @JsonProperty("entityInfo")
    public EntityInfo getEntityInfo() {
        return entityInfo;
    }
    @JsonProperty("entityInfo")
    public void setEntityInfo(EntityInfo entityInfo) {
        this.entityInfo = entityInfo;
    }
    @JsonProperty("contactDetails")
    public List<ContactDetail> getContactDetails() {
        return contactDetails;
    }
    @JsonProperty("contactDetails")
    public void setContactDetails(List<ContactDetail> contactDetails) {
        this.contactDetails = contactDetails;
    }
    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }
    @JsonProperty("remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
