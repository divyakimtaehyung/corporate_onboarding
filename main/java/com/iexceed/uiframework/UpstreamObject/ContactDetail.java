package com.iexceed.uiframework.UpstreamObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"requestId","apiName","apiMethod","apiUri","ConsolidationStatus"})

public class ContactDetail {
    @JsonProperty("mobileCode")
    private String mobileCode ;
    @JsonProperty("mobileNumber")
    private String mobileNumber ;
    @JsonProperty("officeCode")
    private String officeCode;
    @JsonProperty("fullName")
    private String fullName ;
    @JsonProperty("title")
    private String title ;
    @JsonProperty("officePhoneNo")
    private String officePhoneNo ;
    @JsonProperty("faxNumber")
    private String faxNumber ;
    @JsonProperty("email")
    private String email ;
    public ContactDetail(){

    }
    public ContactDetail(String mobileCode, String mobileNumber,String officeCode,String fullName,String title,String officePhoneNo,String faxNumber,String email){
        setMobileCode(mobileCode);
        setMobileNumber(mobileNumber);
        setOfficeCode(officeCode);
        setFullName(fullName);
        setTitle(title);
        setOfficePhoneNo(officePhoneNo);
        setFaxNumber(faxNumber);
        setEmail(email);
    }

    @JsonProperty("mobileCode")
    public String getMobileCode() {
        return mobileCode;
    }
    @JsonProperty("mobileCode")
    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }
    @JsonProperty("mobileNumber")
    public String getMobileNumber() {
        return mobileNumber;
    }
    @JsonProperty("mobileNumber")
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    @JsonProperty("officeCode")
    public String getOfficeCode() {
        return officeCode;
    }
    @JsonProperty("officeCode")
    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }
    @JsonProperty("officePhoneNo")
    public String getOfficePhoneNo() {
        return officePhoneNo;
    }
    @JsonProperty("officePhoneNo")
    public void setOfficePhoneNo(String officePhoneNo) {
        this.officePhoneNo = officePhoneNo;
    }
    @JsonProperty("faxNumber")
    public String getFaxNumber() {
        return faxNumber;
    }
    @JsonProperty("faxNumber")
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }


}
