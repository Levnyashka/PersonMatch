package ru.vtb.msa.person.serviceImpl.converterJSON.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContainerCrossReference {

    @JsonProperty("SystemNumber")
    String systemNumber;

    @JsonProperty("ExternalId")
    String externalId;

    public String getSystemNumber() {
        return systemNumber;
    }

    public void setSystemNumber(String systemNumber) {
        this.systemNumber = systemNumber;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }


    public ContainerCrossReference(){}

    public ContainerCrossReference(String value, String externalId){
        setSystemNumber(systemNumber);
        setExternalId(externalId);
    }

}
