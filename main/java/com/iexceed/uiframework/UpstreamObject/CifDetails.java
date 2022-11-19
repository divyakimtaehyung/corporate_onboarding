package com.iexceed.uiframework.UpstreamObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CifDetails {
    @JsonProperty("globalCIFNumber")
    private String globalCIFNumber ;

    @JsonProperty("globalCIFNumber")
    public String getGlobalCIFNumber() {
        return globalCIFNumber;
    }
    @JsonProperty("globalCIFNumber")
    public void setGlobalCIFNumber(String globalCIFNumber) {
        this.globalCIFNumber = globalCIFNumber;
    }
}
