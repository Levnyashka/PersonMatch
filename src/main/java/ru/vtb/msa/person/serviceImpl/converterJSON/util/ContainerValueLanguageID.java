package ru.vtb.msa.person.serviceImpl.converterJSON.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContainerValueLanguageID {

    @JsonProperty("Value")
    String value;

    @JsonProperty("launguageID")
    String id;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ContainerValueLanguageID(){}

    public ContainerValueLanguageID(String value, String id){
        setValue(value);
        setId(id);
    }



}
