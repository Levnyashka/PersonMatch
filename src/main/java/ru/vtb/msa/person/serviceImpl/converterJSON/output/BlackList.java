package ru.vtb.msa.person.serviceImpl.converterJSON.output;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BlackList {
    @JsonProperty("Type")
    String type;
    @JsonProperty("Value")
    String value;
    @JsonProperty("NameExternalSystem")
    String nameExternalSystem;
    @JsonProperty("StartDate")
    String startDate;
    @JsonProperty("EndDate")
    String endDate;
    @JsonProperty("UpdateDate")
    String updateDate;
    @JsonProperty("LoginExternalSystem")
    String loginExternalSystem;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNameExternalSystem() {
        return nameExternalSystem;
    }

    public void setNameExternalSystem(String nameExternalSystem) {
        this.nameExternalSystem = nameExternalSystem;
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

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getLoginExternalSystem() {
        return loginExternalSystem;
    }

    public void setLoginExternalSystem(String loginExternalSystem) {
        this.loginExternalSystem = loginExternalSystem;
    }
}
