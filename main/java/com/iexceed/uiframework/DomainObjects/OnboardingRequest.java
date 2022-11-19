package com.iexceed.uiframework.DomainObjects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"requestId","apiName","apiMethod","apiUri","ConsolidationStatus"})

public class OnboardingRequest {
    @JsonProperty("requestId")
    private String requestId ;
    @JsonProperty("apiName")
    private String apiName;
    @JsonProperty("apiMethod")
    private String apiMethod ;
    @JsonProperty("apiUri")
    private String apiUri ;
    @JsonProperty("consolidationStatus")
    private String consolidationStatus;
    @JsonProperty("responses")
    private List<Responses> responses;
   /* @JsonProperty("responseKey")
    private ResponseKey responseKey;
   @JsonProperty("responseDetails")
    private List<ResponseDetails> responseDetails;*/



    @JsonProperty ("requestId")
    public void setRequestId(String requestId){
        this.requestId = requestId;
    }
    @JsonProperty("requestId")
    public String getRequestId(){
        return requestId;
    }
    @JsonProperty ("apiName")
    public void setApiName(String apiName){
        this.apiName = apiName;
    }
    @JsonProperty("apiName")
    public String getApiName(){
        return apiName;
    }
    @JsonProperty ("apiMethod")
    public void setApiMethod(String apiMethod){
        this.apiMethod = apiMethod;
    }
    @JsonProperty("apiMethod")
    public String getApiMethod(){
        return apiMethod;
    }
    @JsonProperty ("apiUri")
    public void setApiUri(String apiUri){
        this.apiUri = apiUri;
    }
    @JsonProperty("apiUri")
    public String getApiUri(){
        return apiUri;
    }
    @JsonProperty ("consolidationStatus")
    public void setConsolidationStatus(String consolidationStatus){
        this.consolidationStatus = consolidationStatus;
    }
    @JsonProperty("consolidationStatus")
    public String getConsolidationStatus(){
        return consolidationStatus;
    }
    @JsonProperty("responses")
    public void setResponses(List<Responses> responses) {
        this.responses = responses;
    }
    @JsonProperty("responses")
    public List<Responses> getResponses(){
        return responses;
    }



}