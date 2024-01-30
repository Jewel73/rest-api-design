package com.jewel.ecom.entity;

import jakarta.persistence.*;

import java.util.List;
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

    @OneToMany(mappedBy = "cardEntity", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<OrderEntity> orders;
    //getter setter

    public UUID getId() {
        return id;
    }

    public CardEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public CardEntity setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getExpires() {
        return expires;
    }

    public CardEntity setExpires(String expires) {
        this.expires = expires;
        return this;
    }

    public String getCvv() {
        return cvv;
    }

    public CardEntity setCvv(String cvv) {
        this.cvv = cvv;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public CardEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public List<OrderEntity> getOrderEntity() {
        return orders;
    }

    public CardEntity setOrderEntity(List<OrderEntity> orders) {
        this.orders = orders;
        return this;
    }
}