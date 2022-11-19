package com.iexceed.uiframework.DomainObjects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Responses {

    @JsonProperty("responseKey")
    private ResponseKey responseKey;
    @JsonProperty("responseDetails")
    private List<ResponseDetails> responseDetails;

    @JsonProperty("responseKey")
    public void setResponseKey(ResponseKey responseKey){
        this.responseKey = responseKey;
    }
    @JsonProperty("responseKey")
    public ResponseKey getResponseKey(){
        return responseKey;
    }
    @JsonProperty("responseDetails")
    public void setResponseDetails(List<ResponseDetails> responseDetails) {
        this.responseDetails = responseDetails;
    }
    @JsonProperty("responseDetails")
    public List<ResponseDetails> getResponseDetails(){
        return responseDetails;
    }
}
