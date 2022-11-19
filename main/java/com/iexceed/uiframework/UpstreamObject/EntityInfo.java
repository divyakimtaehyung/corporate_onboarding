package com.iexceed.uiframework.UpstreamObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityInfo {
    @JsonProperty("legalEntityType")
    private String legalEntityType ;

    @JsonProperty("legalEntityType")
    public String getLegalEntityType() {
        return legalEntityType;
    }
    @JsonProperty("legalEntityType")
    public void setLegalEntityType(String legalEntityType) {
        this.legalEntityType = legalEntityType;
    }
}
