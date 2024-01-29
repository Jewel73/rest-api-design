package com.jewel.ecom.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "address")
public class AddressEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "NUMBER", length = 24)
    private String number;

    @Column(name = "RESIDENCY", length = 32)
    private String residency;

    @Column(name = "STREET", length = 32)
    private String street;

    @Column(name = "CITY", length = 24)
    private String city;

    @Column(name = "STATE", length = 24)
    private String state;

    @Column(name = "COUNTRY", length = 24)
    private String country;

    @Column(name = "PINCODE", length = 10)
    private String pincode;

    // Getters and setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getResidency() {
        return residency;
    }

    public void setResidency(String residency) {
        this.residency = residency;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }


}

