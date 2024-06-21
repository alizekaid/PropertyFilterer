package com.propertyfilterer.propertyfilterer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "advert_features")
public class AdvertFeatures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "instant_bookable")
    private boolean instantBookable;

    @Column(name = "cancellation_policy")
    private String cancellationPolicy;

    // Getter ve Setter metotları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isInstantBookable() {
        return instantBookable;
    }

    public void setInstantBookable(boolean instantBookable) {
        this.instantBookable = instantBookable;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }
}
