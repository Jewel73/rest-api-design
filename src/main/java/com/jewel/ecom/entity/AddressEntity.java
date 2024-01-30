package com.jewel.ecom.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.*;

import java.util.List;
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

    @OneToMany(mappedBy = "addressEntity", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<OrderEntity> orders;
    // Getters and setters


    public AddressEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public AddressEntity setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getResidency() {
        return residency;
    }

    public AddressEntity setResidency(String residency) {
        this.residency = residency;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public AddressEntity setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getCity() {
        return city;
    }

    public AddressEntity setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public AddressEntity setState(String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public AddressEntity setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPincode() {
        return pincode;
    }

    public AddressEntity setPincode(String pincode) {
        this.pincode = pincode;
        return this;
    }

    public List<OrderEntity> getOrders() {
        return orders;
    }

    public AddressEntity setOrders(List<OrderEntity> orders) {
        this.orders = orders;
        return this;
    }

}

