package com.jewel.ecom.entity;

import org.hibernate.annotations.Type;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "payment")
public class PaymentEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "AUTHORIZED", nullable = false)
    private boolean authorized;

    @Column(name = "MESSAGE", length = 64)
    private String message;

    // Constructors, getters, and setters

    public PaymentEntity() {
        // Default constructor
    }

    public PaymentEntity(boolean authorized, String message) {
        this.authorized = authorized;
        this.message = message;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PaymentEntity{" +
                "id=" + id +
                ", authorized=" + authorized +
                ", message='" + message + '\'' +
                '}';
    }
}
