package com.propertyfilterer.propertyfilterer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "host")
public class Host {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "host_response_rate")
    private float response_rate;

    @Column(name = "host_since")
    private int since;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getResponse_rate() {
        return response_rate;
    }
    public void setResponse_rate(float response_rate) {
        this.response_rate = response_rate;
    }

    public long getSince() {
        return since;
    }
    public void setSince(int since) {
        this.since = since;
    }

}
