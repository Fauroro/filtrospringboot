package com.fauroro.filtrospringboot.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    private String codecity;

    private String namecity;

    @ManyToOne
    @JoinColumn(name = "codereg")
    private Region region;

    public City() {
    }

    public String getCodecity() {
        return codecity;
    }

    public void setCodecity(String codecity) {
        this.codecity = codecity;
    }

    public String getNamecity() {
        return namecity;
    }

    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
