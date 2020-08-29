package ru.vtb.msa.person.serviceImpl.converterJSON.output;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonalAddress {
    @JsonProperty("TrustFlag")
    String trustFlag;
    @JsonProperty("PersonalAddressType")
    String personalAddressType;
    @JsonProperty("AddressName")
    String addressName;
    @JsonProperty("NotFormAddrName")
    String notFormAddrName;
    @JsonProperty("Country")
    String country;
    @JsonProperty("ZipCode")
    String zipCode;
    @JsonProperty("StateNumber")
    String stateNumber;
    @JsonProperty("StateType")
    String stateType;
    @JsonProperty("PersonalPrefState")
    String personalPrefState;
    @JsonProperty("DistrictType")
    String districtType;
    @JsonProperty("PersonalPrefDistrict")
    String personalPrefDistrict;
    @JsonProperty("CityType")
    String cityType;
    @JsonProperty("PersonalPrefCity")
    String personalPrefCity;
    @JsonProperty("StreetType")
    String streetType;
    @JsonProperty("SettlementType")
    String settlementType;
    @JsonProperty("PersonalPrefSettlement")
    String personalPrefSettlement;
    @JsonProperty("PersonalPrefStreet")
    String personalPrefStreet;
    @JsonProperty("House")
    String house;
    @JsonProperty("Housing")
    String housing;
    @JsonProperty("Building")
    String building;
    @JsonProperty("ApartamentNumber")
    String apartamentNumber;
    @JsonProperty("KLADRCode")
    String kladrCode;
    @JsonProperty("OKATOCode")
    String okatoCode;
    @JsonProperty("StartDate")
    String startDate;
    @JsonProperty("EndDate")
    String endDate;
    @JsonProperty("LoginExternalSystem")
    String loginExternalSystem;
    @JsonProperty("NameExternalSystem")
    String nameExternalSystem;
    @JsonProperty("UpdateDate")
    String updateDate;
    @JsonProperty("INSPersonalAddressValue")
    String insPersonalAddressValue; // Не используется в Мапинге
    @JsonProperty("CountryCode")
    String countryCode; // Не используется в Мапинге

    public String getTrustFlag() {
        return trustFlag;
    }

    public void setTrustFlag(String trustFlag) {
        this.trustFlag = trustFlag;
    }

    public String getPersonalAddressType() {
        return personalAddressType;
    }

    public void setPersonalAddressType(String personalAddressType) {
        this.personalAddressType = personalAddressType;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getNotFormAddrName() {
        return notFormAddrName;
    }

    public void setNotFormAddrName(String notFormAddrName) {
        this.notFormAddrName = notFormAddrName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public String getStateType() {
        return stateType;
    }

    public void setStateType(String stateType) {
        this.stateType = stateType;
    }

    public String getPersonalPrefState() {
        return personalPrefState;
    }

    public void setPersonalPrefState(String personalPrefState) {
        this.personalPrefState = personalPrefState;
    }

    public String getDistrictType() {
        return districtType;
    }

    public void setDistrictType(String districtType) {
        this.districtType = districtType;
    }

    public String getPersonalPrefDistrict() {
        return personalPrefDistrict;
    }

    public void setPersonalPrefDistrict(String personalPrefdistrict) {
        this.personalPrefDistrict = personalPrefdistrict;
    }

    public String getCityType() {
        return cityType;
    }

    public void setCityType(String cityType) {
        this.cityType = cityType;
    }

    public String getPersonalPrefCity() {
        return personalPrefCity;
    }

    public void setPersonalPrefCity(String personalPrefCity) {
        this.personalPrefCity = personalPrefCity;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    public String getPersonalPrefSettlement() {
        return personalPrefSettlement;
    }

    public void setPersonalPrefSettlement(String personalPrefSettlement) {
        this.personalPrefSettlement = personalPrefSettlement;
    }

    public String getPersonalPrefStreet() {
        return personalPrefStreet;
    }

    public void setPersonalPrefStreet(String personalPrefStreet) {
        this.personalPrefStreet = personalPrefStreet;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartamentNumber() {
        return apartamentNumber;
    }

    public void setApartamentNumber(String apartamentNumber) {
        this.apartamentNumber = apartamentNumber;
    }

    public String getKladrCode() {
        return kladrCode;
    }

    public void setKladrCode(String kladrCode) {
        this.kladrCode = kladrCode;
    }

    public String getOkatoCode() {
        return okatoCode;
    }

    public void setOkatoCode(String okatoCode) {
        this.okatoCode = okatoCode;
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

    public String getLoginExternalSystem() {
        return loginExternalSystem;
    }

    public void setLoginExternalSystem(String loginExternalSystem) {
        this.loginExternalSystem = loginExternalSystem;
    }

    public String getNameExternalSystem() {
        return nameExternalSystem;
    }

    public void setNameExternalSystem(String nameExternalSystem) {
        this.nameExternalSystem = nameExternalSystem;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getInsPersonalAddressValue() {
        return insPersonalAddressValue;
    }

    public void setInsPersonalAddressValue(String insPersonalAddressValue) {
        this.insPersonalAddressValue = insPersonalAddressValue;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
