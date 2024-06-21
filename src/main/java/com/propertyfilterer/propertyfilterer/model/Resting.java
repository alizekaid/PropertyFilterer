package com.propertyfilterer.propertyfilterer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "resting")
public class Resting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bed_type")
    private String bedType;

    @Column(name = "beds")
    private int beds;

    // Constructors
    public Resting() {
    }

    public Resting(String bedType, int beds) {
        this.bedType = bedType;
        this.beds = beds;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    // toString method
    @Override
    public String toString() {
        return "Resting{" +
                "id=" + id +
                ", bedType='" + bedType + '\'' +
                ", beds=" + beds +
                '}';
    }
}
