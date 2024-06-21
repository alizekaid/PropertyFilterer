package com.propertyfilterer.propertyfilterer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pricings")
public class Pricing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "log_price")
    private double logPrice;

    // Constructors
    public Pricing() {
    }

    public Pricing(double logPrice) {
        this.logPrice = logPrice;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLogPrice() {
        return logPrice;
    }

    public void setLogPrice(double logPrice) {
        this.logPrice = logPrice;
    }

    // toString method
    @Override
    public String toString() {
        return "Pricing{" +
                "id=" + id +
                ", logPrice=" + logPrice +
                '}';
    }
}
