package com.propertyfilterer.propertyfilterer.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "advert")
public class Advert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "thumbnail_url")
    private String thumbnailUrl;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id", nullable = true)
    @JsonManagedReference
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "advert_feature_id", nullable = false)
    @JsonManagedReference
    private AdvertFeatures advertFeatures;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = true)
    private Location location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "host_id", nullable = true)
    private Host host;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "pricing_id", nullable = false)
    private Pricing pricings;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "review_id", nullable = false)
    private Review reviews;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "prop_info_id", nullable = false)
    private PropInfo propInfo;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resting_id", nullable = false)
    private Resting resting;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id", referencedColumnName = "id")
    private Rooms rooms;

    // Getters and setters...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AdvertFeatures getAdvertFeatures() {
        return advertFeatures;
    }

    public void setAdvertFeatures(AdvertFeatures advertFeatures) {
        this.advertFeatures = advertFeatures;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public Pricing getPricings() {
        return pricings;
    }

    public void setPricings(Pricing pricings) {
        this.pricings = pricings;
    }

    public Review getReviews() {
        return reviews;
    }

    public void setReviews(Review reviews) {
        this.reviews = reviews;
    }

    public PropInfo getPropInfo() {
        return propInfo;
    }

    public void setPropInfo(PropInfo propInfo) {
        this.propInfo = propInfo;
    }

    public Resting getResting() {
        return resting;
    }

    public void setResting(Resting resting) {
        this.resting = resting;
    }

    public Rooms getRooms() {
        return rooms;
    }
    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }
}
