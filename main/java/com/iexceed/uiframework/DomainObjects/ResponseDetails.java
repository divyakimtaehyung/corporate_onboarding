package com.iexceed.uiframework.DomainObjects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDetails {
    @JsonProperty("messageId")
    private String messageId;
    @JsonProperty("lob")
    private String lob;
    @JsonProperty("responseDescription")
    private String responseDescription;
    @JsonProperty("responseStatus")
    private String responseStatus;
    @JsonProperty("dateTime")
    private String  dateTime;
    @JsonProperty("apiResponseDetails")
    private ApiResponseDetails apiResponseDetails;

    @JsonProperty ("messageId")
    public void setMessageId(String messageId){
        this.messageId = messageId;
    }
    @JsonProperty("messageId")
    public String getMessageId(){
        return messageId;
    }
    @JsonProperty ("lob")
    public void setLobId(String lob){
        this.lob = lob;
    }
    @JsonProperty("lob")
    public String getLobId(){
        return lob;
    }
    @JsonProperty ("responseDescription")
    public void setResponseDescription(String responseDescription){
        this.responseDescription = responseDescription;
    }
    @JsonProperty("responseDescription")
    public String getResponseDescription(){
        return responseDescription;
    }
    @JsonProperty ("responseStatus")
    public void setResponseStatus(String responseStatus){
        this.responseStatus = responseStatus;
    }
    @JsonProperty("responseStatus")
    public String getResponseStatus(){
        return responseStatus;
    }
    @JsonProperty ("dateTime")
    public void setDateTime(String dateTime){
        this.dateTime = dateTime;
    }
    @JsonProperty("dateTime")
    public String getDateTime(){
        return dateTime;
    }

    @JsonProperty ("apiResponseDetails")
    public void setApiResponseDetails(ApiResponseDetails apiResponseDetails){
        this.apiResponseDetails = apiResponseDetails;
    }
    @JsonProperty("apiResponseDetails")
    public ApiResponseDetails getApiResponseDetails(){
        return apiResponseDetails;
    }

}
