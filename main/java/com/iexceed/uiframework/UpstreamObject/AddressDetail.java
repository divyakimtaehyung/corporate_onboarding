package com.iexceed.uiframework.UpstreamObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"requestId","apiName","apiMethod","apiUri","ConsolidationStatus"})
public class AddressDetail {

    @JsonProperty("country")
    private String country ;
    @JsonProperty("postalCode")
    private String postalCode ;
    @JsonProperty("residentialStatus")
    private String residentialStatus;
    @JsonProperty("addressLine1")
    private String addressLine1 ;
    @JsonProperty("addressLine2")
    private String addressLine2 ;
    @JsonProperty("addressLine3")
    private String addressLine3 ;
    @JsonProperty("state")
    private String state ;
    @JsonProperty("addressLine4")
    private String addressLine4 ;

    public AddressDetail(){

    }
    public AddressDetail(String country,String postalCode,String residentialStatus,String addressLine1,String addressLine2,String addressLine3,String state,String addressLine4){
        setCountry(country);
        setPostalCode(postalCode);
        setResidentialStatus(residentialStatus);
        setAddressLine1(addressLine1);
        setAddressLine2(addressLine2);
        setAddressLine3(addressLine3);
        setState(state);
        setAddressLine4(addressLine4);

    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    @JsonProperty("residentialStatus")
    public String getResidentialStatus() {
        return residentialStatus;
    }
    @JsonProperty("residentialStatus")
    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }
    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }
    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }
    @JsonProperty("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    @JsonProperty("addressLine3")
    public String getAddressLine3() {
        return addressLine3;
    }
    @JsonProperty("addressLine3")
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }
    @JsonProperty("state")
    public String getState() {
        return state;
    }
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }
    @JsonProperty("addressLine4")
    public String getAddressLine4() {
        return addressLine4;
    }
    @JsonProperty("addressLine4")
    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

}
