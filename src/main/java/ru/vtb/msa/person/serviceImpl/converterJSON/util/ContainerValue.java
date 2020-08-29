package ru.vtb.msa.person.serviceImpl.converterJSON.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContainerValue {

    @JsonProperty("Value")
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public ContainerValue(){}

    public ContainerValue(String value){
        setValue(value);
    }
}
