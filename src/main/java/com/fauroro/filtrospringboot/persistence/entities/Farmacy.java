package com.fauroro.filtrospringboot.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "farmacy")
public class Farmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "idfarmacy")
    private int idfarmacy;

    private String namefarmacy;
    private String addressfarmacy;
    private double longfarmacy;

    @ManyToOne
    @JoinColumn(name = "codecityfarm")
    private City city;

    private double latfarmacy;
    private String logofarmacy;

    public Farmacy() {
    }

    public int getIdfarmacy() {
        return idfarmacy;
    }

    public void setIdfarmacy(int idfarmacy) {
        this.idfarmacy = idfarmacy;
    }

    public String getNamefarmacy() {
        return namefarmacy;
    }

    public void setNamefarmacy(String namefarmacy) {
        this.namefarmacy = namefarmacy;
    }

    public String getAddressfarmacy() {
        return addressfarmacy;
    }

    public void setAddressfarmacy(String addressfarmacy) {
        this.addressfarmacy = addressfarmacy;
    }

    public double getLongfarmacy() {
        return longfarmacy;
    }

    public void setLongfarmacy(double longfarmacy) {
        this.longfarmacy = longfarmacy;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public double getLatfarmacy() {
        return latfarmacy;
    }

    public void setLatfarmacy(double latfarmacy) {
        this.latfarmacy = latfarmacy;
    }

    public String getLogofarmacy() {
        return logofarmacy;
    }

    public void setLogofarmacy(String logofarmacy) {
        this.logofarmacy = logofarmacy;
    }
}
