package com.iexceed.uiframework.UpstreamObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"requestId","apiName","apiMethod","apiUri","ConsolidationStatus"})
public class SwiftInfo {
    @JsonProperty("swiftAddress1")
    private String swiftAddress1 ;
    @JsonProperty("swiftCode")
    private String swiftCode ;
    @JsonProperty("swiftAddress2")
    private String swiftAddress2;
    @JsonProperty("swiftAddressState")
    private String swiftAddressState ;
    @JsonProperty("swiftAddressCountry")
    private String swiftAddressCountry ;

    public SwiftInfo(){

    }
    public  SwiftInfo(String swiftAddress1,String swiftCode, String swiftAddress2,String swiftAddressState, String swiftAddressCountry){
        setSwiftAddress1(swiftAddress1);
        setSwiftCode(swiftCode);
        setSwiftAddress2(swiftAddress2);
        setSwiftAddressState(swiftAddressState);
        setSwiftAddressCountry(swiftAddressCountry);

    }

    @JsonProperty("swiftAddress1")
    public String getSwiftAddress1() {
        return swiftAddress1;
    }
    @JsonProperty("swiftAddress1")
    public void setSwiftAddress1(String swiftAddress1) {
        this.swiftAddress1 = swiftAddress1;
    }
    @JsonProperty("swiftCode")
    public String getSwiftCode() {
        return swiftCode;
    }
    @JsonProperty("swiftCode")
    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }
    @JsonProperty("swiftAddress2")
    public String getSwiftAddress2() {
        return swiftAddress2;
    }
    @JsonProperty("swiftAddress2")
    public void setSwiftAddress2(String swiftAddress2) {
        this.swiftAddress2 = swiftAddress2;
    }
    @JsonProperty("swiftAddressState")
    public String getSwiftAddressState() {
        return swiftAddressState;
    }
    @JsonProperty("swiftAddressState")
    public void setSwiftAddressState(String swiftAddressState) {
        this.swiftAddressState = swiftAddressState;
    }
    @JsonProperty("swiftAddressCountry")
    public String getSwiftAddressCountry() {
        return swiftAddressCountry;
    }
    @JsonProperty("swiftAddressCountry")
    public void setSwiftAddressCountry(String swiftAddressCountry) {
        this.swiftAddressCountry = swiftAddressCountry;
    }
}
