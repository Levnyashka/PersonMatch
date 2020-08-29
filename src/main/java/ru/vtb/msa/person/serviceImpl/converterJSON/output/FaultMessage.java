package ru.vtb.msa.person.serviceImpl.converterJSON.output;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FaultMessage {
    @JsonProperty("Code")
    String code;
    @JsonProperty("Text")
    String text;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
