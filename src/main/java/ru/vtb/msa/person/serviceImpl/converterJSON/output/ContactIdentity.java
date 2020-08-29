package ru.vtb.msa.person.serviceImpl.converterJSON.output;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactIdentity {
    @JsonProperty("TrustFlag")
    String trustFlag;
    @JsonProperty("Type")
    String type;
    @JsonProperty("TypeValue")
    String Typevalue;
    @JsonProperty("Series")
    String series;
    @JsonProperty("Number")
    String number;
    @JsonProperty("CountryIssue")
    String countryIssue;
    @JsonProperty("Issued")
    String issued;
    @JsonProperty("IssuedDate")
    String issuedDate;
    @JsonProperty("ExpirationDate")
    String expirationDate;
    @JsonProperty("DivisionCode")
    String divisionCode;
    @JsonProperty("Comment")
    String comment;
    @JsonProperty("StartDate")
    String startDate;
    @JsonProperty("EndDate")
    String endDate;
    @JsonProperty("LoginExternalSystem")
    String loginExternalSystem;
    @JsonProperty("NameExternalSystem")
    String nameExternalSystem;
    @JsonProperty("UpdateDate")
    String updateDate;

    public String getTrustFlag() {
        return trustFlag;
    }

    public void setTrustFlag(String trustFlag) {
        this.trustFlag = trustFlag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypevalue() {
        return Typevalue;
    }

    public void setTypevalue(String typevalue) {
        Typevalue = typevalue;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountryIssue() {
        return countryIssue;
    }

    public void setCountryIssue(String countryIssue) {
        this.countryIssue = countryIssue;
    }

    public String getIssued() {
        return issued;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getLoginExternalSystem() {
        return loginExternalSystem;
    }

    public void setLoginExternalSystem(String loginExternalSystem) {
        this.loginExternalSystem = loginExternalSystem;
    }

    public String getNameExternalSystem() {
        return nameExternalSystem;
    }

    public void setNameExternalSystem(String nameExternalSystem) {
        this.nameExternalSystem = nameExternalSystem;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
