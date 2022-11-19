package com.iexceed.uiframework.UpstreamObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"requestId","apiName","apiMethod","apiUri","ConsolidationStatus"})

public class AdditionalInfo {
    @JsonProperty("riskCountry")
    private String riskCountry ;
    @JsonProperty("correspondenceLanguage")
    private String correspondenceLanguage ;
    @JsonProperty("rmName")
    private String rmName;
    @JsonProperty("taxId")
    private String taxId ;
    @JsonProperty("taxCountry")
    private String taxCountry ;
    @JsonProperty("companyWebsite")
    private String companyWebsite ;
    @JsonProperty("activationDate")
    private String activationDate ;
    @JsonProperty("agreementReference")
    private String agreementReference ;

    public AdditionalInfo(){

    }
    public AdditionalInfo(String riskCountry,String correspondenceLanguage, String rmName,String taxId,String taxCountry,String companyWebsite,String activationDate,String agreementReference){
        setRiskCountry(riskCountry);
        setCorrespondingLanguage(correspondenceLanguage);
        setRmName(rmName);
        setTaxId(taxId);
        setTaxCountry(taxCountry);
        setCompanyWebsite(companyWebsite);
        setActivationDate(activationDate);
        setAgreementReference(agreementReference);

    }


    @JsonProperty("riskCountry")
    public String getRiskCountry() {
        return riskCountry;
    }
    @JsonProperty("riskCountry")
    public void setRiskCountry(String riskCountry) {
        this.riskCountry = riskCountry;
    }
    @JsonProperty("correspondenceLanguage")
    public String getCorrespondingLanguage() {
        return correspondenceLanguage;
    }
    @JsonProperty("correspondenceLanguage")
    public void setCorrespondingLanguage(String correspondingLanguage) {
        this.correspondenceLanguage = correspondingLanguage;
    }
    @JsonProperty("rmName")
    public String getRmName() {
        return rmName;
    }
    @JsonProperty("rmName")
    public void setRmName(String rmName) {
        this.rmName = rmName;
    }
    @JsonProperty("taxId")
    public String getTaxId() {
        return taxId;
    }
    @JsonProperty("taxId")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
    @JsonProperty("taxCountry")
    public String getTaxCountry() {
        return taxCountry;
    }
    @JsonProperty("taxCountry")
    public void setTaxCountry(String taxCountry) {
        this.taxCountry = taxCountry;
    }
    @JsonProperty("companyWebsite")
    public String getCompanyWebsite() {
        return companyWebsite;
    }
    @JsonProperty("companyWebsite")
    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }
    @JsonProperty("activationDate")
    public String getActivationDate() {
        return activationDate;
    }
    @JsonProperty("activationDate")
    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }
    @JsonProperty("agreementReference")
    public String getAgreementReference() {
        return agreementReference;
    }
    @JsonProperty("agreementReference")
    public void setAgreementReference(String agreementReference) {
        this.agreementReference = agreementReference;
    }
}
