package ru.vtb.msa.person.serviceImpl.converterJSON.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressRegistration {

    @JsonProperty("NotFormAddrName")
    String notFormAddrName;
    @JsonProperty("Country")
    String country;
    @JsonProperty("ZipCode")
    String zipCode;
    @JsonProperty("StateNumber")
    String stateNumber;
    @JsonProperty("Region")
    String region;
    @JsonProperty("District")
    String district;
    @JsonProperty("City")
    String city;
    @JsonProperty("Location")
    String location;
    @JsonProperty("Street")
    String street;
    @JsonProperty("House")
    String house;
    @JsonProperty("Housing")
    String housing;
    @JsonProperty("Building")
    String building;
    @JsonProperty("ApartmentNumber")
    String apartmentNumber;

    public String getNotFormAddrName() {
        return notFormAddrName;
    }

    public void setNotFormAddrName(String notFormAddrName) {
        this.notFormAddrName = notFormAddrName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String surname) {
        this.country = surname;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
