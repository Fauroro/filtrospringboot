package com.fauroro.filtrospringboot.persistence.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    private String idcustomer;

    private String namecustomer;
    private String lastnamecustomer;

    @ManyToOne
    @JoinColumn(name = "codecitycustomer")
    private City city;

    private String emailcustomer;
    private Date birthdate;
    private Double lon;
    private Double latitud;

    public Customer() {
    }

    public String getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(String idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getNamecustomer() {
        return namecustomer;
    }

    public void setNamecustomer(String namecustomer) {
        this.namecustomer = namecustomer;
    }

    public String getLastnamecustomer() {
        return lastnamecustomer;
    }

    public void setLastnamecustomer(String lastnamecustomer) {
        this.lastnamecustomer = lastnamecustomer;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getEmailcustomer() {
        return emailcustomer;
    }

    public void setEmailcustomer(String emailcustomer) {
        this.emailcustomer = emailcustomer;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }
}
