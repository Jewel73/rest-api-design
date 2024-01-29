package com.jewel.ecom.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "card")
public class CardEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "NUMBER", length = 16)
    private String number;

    @Column(name = "LAST_NAME", length = 16)
    private String lastName;

    @Column(name = "EXPIRES", length = 5)
    private String expires;

    @Column(name = "CVV", length = 4)
    private String cvv;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private UserEntity user;

    //getter setter

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "CardEntity{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", lastName='" + lastName + '\'' +
                ", expires='" + expires + '\'' +
                ", cvv='" + cvv + '\'' +
                ", user=" + user +
                '}';
    }
}