package ru.vtb.msa.person.serviceImpl.converterJSON.output;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneCommunication {
    @JsonProperty("TrustFlag")
    String trustFlag;
    @JsonProperty("PhoneType")
    String phoneType;
    @JsonProperty("OperatorName")
    String operatorName;
    @JsonProperty("PhoneRegion")
    String phoneRegion;
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
    @JsonProperty("PhoneValue")
    String phoneValue;
    @JsonProperty("FullPhone")
    String fullPhone;
    @JsonProperty("NotFormFullPhone")
    String notFormFullPhone;

    public String getTrustFlag() {
        return trustFlag;
    }

    public void setTrustFlag(String trustFlag) {
        this.trustFlag = trustFlag;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getPhoneRegion() {
        return phoneRegion;
    }

    public void setPhoneRegion(String phoneRegion) {
        this.phoneRegion = phoneRegion;
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

    public String getPhoneValue() {
        return phoneValue;
    }

    public void setPhoneValue(String phoneValue) {
        this.phoneValue = phoneValue;
    }

    public String getFullPhone() {
        return fullPhone;
    }

    public void setFullPhone(String fullPhone) {
        this.fullPhone = fullPhone;
    }

    public String getNotFormFullPhone() {
        return notFormFullPhone;
    }

    public void setNotFormFullPhone(String notFormFullPhone) {
        this.notFormFullPhone = notFormFullPhone;
    }
}
