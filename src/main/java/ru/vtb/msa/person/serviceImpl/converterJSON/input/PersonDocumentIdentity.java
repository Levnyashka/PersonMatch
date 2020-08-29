package ru.vtb.msa.person.serviceImpl.converterJSON.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonDocumentIdentity {
    @JsonProperty("Series")
    String series;
    @JsonProperty("Number")
    String number;
    @JsonProperty("IssueDate")
    String issueDate;
    @JsonProperty("TypeCode")
    String typeCode;

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

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
}
