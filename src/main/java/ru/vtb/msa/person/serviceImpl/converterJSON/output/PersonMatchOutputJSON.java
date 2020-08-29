package ru.vtb.msa.person.serviceImpl.converterJSON.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonMatchOutputJSON {

    @JsonProperty("FaultMessage")
    FaultMessage faultMessage;

    @JsonProperty("Person")
    ArrayList<PersonOutput> person;

    public FaultMessage getFaultMessage() {
        return faultMessage;
    }

    public void setFaultMessage(FaultMessage faultMessage) {
        this.faultMessage = faultMessage;
    }

    public ArrayList<PersonOutput> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<PersonOutput> person) {
        this.person = person;
    }
}
