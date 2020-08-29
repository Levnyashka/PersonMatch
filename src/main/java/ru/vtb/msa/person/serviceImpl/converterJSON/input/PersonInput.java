package ru.vtb.msa.person.serviceImpl.converterJSON.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonInput {

    @JsonProperty("Surname")
    String surname;
    @JsonProperty("FirstName")
    String firstName;
    @JsonProperty("MiddleName")
    String middleName;
    @JsonProperty("BirthDateTime")
    String birthDateTime;
    @JsonProperty("TIN")
    String tin;
    @JsonProperty("AddressRegistration")
    AddressRegistration addressRegistration;

    @JsonProperty("PhoneNumber")
    String phoneNumber;
    @JsonProperty("Email")
    String email;

    @JsonProperty("PersonDocumentIdentity")
    PersonDocumentIdentity personDocumentIdentity;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthDateTime() {
        return birthDateTime;
    }

    public void setBirthDateTime(String birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    public String getTIN() {
        return tin;
    }

    public void setTIN(String tIN) {
        this.tin = tIN;
    }

    public AddressRegistration getAddressRegistration() {
        return addressRegistration;
    }

    public void setAddressRegistration(AddressRegistration addressRegistration) {
        this.addressRegistration = addressRegistration;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PersonDocumentIdentity getPersonDocumentIdentity() {
        return personDocumentIdentity;
    }

    public void setPersonDocumentIdentity(PersonDocumentIdentity personDocumentIdentity) {
        this.personDocumentIdentity = personDocumentIdentity;
    }
}
