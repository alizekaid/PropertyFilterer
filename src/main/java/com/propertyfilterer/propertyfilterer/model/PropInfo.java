package com.propertyfilterer.propertyfilterer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "prop_info")
public class PropInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "property_type")
    private String propertyType;

    @Column(name = "accommodates")
    private int accommodates;

    @Column(name = "amenities")
    private String amenities;

    @Column(name = "cleaning_fee")
    private int cleaningFee;

    // Constructors
    public PropInfo() {
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getAccommodates() {
        return accommodates;
    }

    public void setAccommodates(int accommodates) {
        this.accommodates = accommodates;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public int getCleaningFee() {
        return cleaningFee;
    }

    public void setCleaningFee(int cleaningFee) {
        this.cleaningFee = cleaningFee;
    }
}
