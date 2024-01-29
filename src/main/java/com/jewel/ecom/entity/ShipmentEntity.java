package com.jewel.ecom.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;
@Entity
@Table(name = "shipment")
public class ShipmentEntity {
    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "EST_DELIVERY_DATE")
    private Timestamp estDeliveryDate;

    @Column(name = "CARRIER", length = 24)
    private String carrier;

    // getter setter
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Timestamp getEstDeliveryDate() {
        return estDeliveryDate;
    }

    public void setEstDeliveryDate(Timestamp estDeliveryDate) {
        this.estDeliveryDate = estDeliveryDate;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @Override
    public String toString() {
        return "ShipmentEntity{" +
                "id=" + id +
                ", estDeliveryDate=" + estDeliveryDate +
                ", carrier='" + carrier + '\'' +
                '}';
    }
}
