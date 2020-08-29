package ru.vtb.msa.person.serviceImpl.converterJSON.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.vtb.msa.person.serviceImpl.converterJSON.util.ContainerCrossReference;
import ru.vtb.msa.person.serviceImpl.converterJSON.util.ContainerValue;
import ru.vtb.msa.person.serviceImpl.converterJSON.util.ContainerValueLanguageID;

import java.util.ArrayList;
import java.util.List;

public class PersonOutput {
    @JsonProperty("PartyUId")
    String partyUId;
    @JsonProperty("MatchScore")
    String matchScore;

    @JsonProperty("SurName")
    ContainerValueLanguageID surName;
    @JsonProperty("FirstName")
    ContainerValueLanguageID firstName;
    @JsonProperty("MiddleName")
    ContainerValueLanguageID middleName;

    @JsonProperty("BirthDate")
    String birthDate;
    @JsonProperty("TypePerson")
    String typePerson;
    @JsonProperty("UpdateDate")
    String updateDate;
    @JsonProperty("BirthPlace")
    String birthPlace;
    @JsonProperty("Citizenship")
    String citizenship;
    @JsonProperty("MF")
    String mf;
    @JsonProperty("TIN")
    String tin;

    @JsonProperty("LMFGenitive")
    ContainerValueLanguageID lmfGenitive;
    @JsonProperty("LMFDative")
    ContainerValueLanguageID lmfDative;
    @JsonProperty("LMFAblative")
    ContainerValueLanguageID lmfAblative;

    @JsonProperty("CreatedExternalSystem")
    String createdExternalSystem;
    @JsonProperty("MaritalStatus")
    String maritalStatus;
    @JsonProperty("EmployerFlag")
    String employerFlag;

    @JsonProperty("PersonalAddress")
    List<PersonalAddress> personalAddress;

    @JsonProperty("ContactReference")
    List<ContainerCrossReference> contactReference;

    @JsonProperty("ContactIdentity")
    List<ContactIdentity> contactIdentity;

    @JsonProperty("PhoneCommunication")
    List<PhoneCommunication> phoneCommunication;

    @JsonProperty("FormerCustomer")
    List<ContainerValue> formerCustomer;
    @JsonProperty("IncomeSegment")
    List<ContainerValue> incomeSegment;

    @JsonProperty("ServiceSegment")
    List<ServiceSegment> serviceSegment;

    @JsonProperty("WealthyIndicator")
    List<ContainerValue> wealthyIndicator;

    @JsonProperty("BlackList")
    List<BlackList> blackList;

    @JsonProperty("RetirementType")
    List<ContainerValue> retirementType;
    @JsonProperty("ClosedSegment")
    List<ContainerValue> closedSegment;

    public String getPartyUId() {
        return partyUId;
    }

    public void setPartyUId(String partyUId) {
        this.partyUId = partyUId;
    }

    public String getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(String matchScore) {
        this.matchScore = matchScore;
    }

    public ContainerValueLanguageID getSurName() {
        return surName;
    }

    public void setSurName(ContainerValueLanguageID surName) {
        this.surName = surName;
    }

    public ContainerValueLanguageID getFirstName() {
        return firstName;
    }

    public void setFirstName(ContainerValueLanguageID firstName) {
        this.firstName = firstName;
    }

    public ContainerValueLanguageID getMiddleName() {
        return middleName;
    }

    public void setMiddleName(ContainerValueLanguageID middleName) {
        this.middleName = middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getTypePerson() {
        return typePerson;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getMf() {
        return mf;
    }

    public void setMf(String mf) {
        this.mf = mf;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public ContainerValueLanguageID getLmfGenitive() {
        return lmfGenitive;
    }

    public void setLmfGenitive(ContainerValueLanguageID lmfGenitive) {
        this.lmfGenitive = lmfGenitive;
    }

    public ContainerValueLanguageID getLmfDative() {
        return lmfDative;
    }

    public void setLmfDative(ContainerValueLanguageID lmfDative) {
        this.lmfDative = lmfDative;
    }

    public ContainerValueLanguageID getLmfAblative() {
        return lmfAblative;
    }

    public void setLmfAblative(ContainerValueLanguageID lmfAblative) {
        this.lmfAblative = lmfAblative;
    }

    public String getCreatedExternalSystem() {
        return createdExternalSystem;
    }

    public void setCreatedExternalSystem(String createdExternalSystem) {
        this.createdExternalSystem = createdExternalSystem;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEmployerFlag() {
        return employerFlag;
    }

    public void setEmployerFlag(String employerFlag) {
        this.employerFlag = employerFlag;
    }

    public List<PersonalAddress> getPersonalAddress() {
        return personalAddress;
    }

    public void setPersonalAddress(List<PersonalAddress> personalAddress) {
        this.personalAddress = personalAddress;
    }

    public List<ContainerCrossReference> getContactReference() {
        return contactReference;
    }

    public void setContactReference(List<ContainerCrossReference> contactReference) {
        this.contactReference = contactReference;
    }

    public List<ContactIdentity> getContactIdentity() {
        return contactIdentity;
    }

    public void setContactIdentity(List<ContactIdentity> contactIdentity) {
        this.contactIdentity = contactIdentity;
    }

    public List<PhoneCommunication> getPhoneCommunication() {
        return phoneCommunication;
    }

    public void setPhoneCommunication(List<PhoneCommunication> phoneCommunication) {
        this.phoneCommunication = phoneCommunication;
    }

    public List<ContainerValue> getFormerCustomer() {
        return formerCustomer;
    }

    public void setFormerCustomer(List<ContainerValue> formerCustomer) {
        this.formerCustomer = formerCustomer;
    }

    public List<ContainerValue> getIncomeSegment() {
        return incomeSegment;
    }

    public void setIncomeSegment(List<ContainerValue> incomeSegment) {
        this.incomeSegment = incomeSegment;
    }

    public List<ServiceSegment> getServiceSegment() {
        return serviceSegment;
    }

    public void setServiceSegment(List<ServiceSegment> serviceSegment) {
        this.serviceSegment = serviceSegment;
    }

    public List<ContainerValue> getWealthyIndicator() {
        return wealthyIndicator;
    }

    public void setWealthyIndicator(List<ContainerValue> wealthyIndicator) {
        this.wealthyIndicator = wealthyIndicator;
    }

    public List<BlackList> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<BlackList> blackList) {
        this.blackList = blackList;
    }

    public List<ContainerValue> getRetirementType() {
        return retirementType;
    }

    public void setRetirementType(List<ContainerValue> retirementType) {
        this.retirementType = retirementType;
    }

    public List<ContainerValue> getClosedSegment() {
        return closedSegment;
    }

    public void setClosedSegment(List<ContainerValue> closedSegment) {
        this.closedSegment = closedSegment;
    }
}
