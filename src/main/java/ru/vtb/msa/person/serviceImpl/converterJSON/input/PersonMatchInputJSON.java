package ru.vtb.msa.person.serviceImpl.converterJSON.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonMatchInputJSON {
    @JsonProperty("SearchType")
    String searchType;

    @JsonProperty("Person")
    PersonInput person;

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public PersonInput getPerson() {
        return person;
    }

    public void setPerson(PersonInput person) {
        this.person = person;
    }

}
