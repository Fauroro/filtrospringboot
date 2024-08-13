package com.fauroro.filtrospringboot.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "activeprinciple")
public class ActivePrinciple {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idap;

    private String nameap;

    public ActivePrinciple() {
    }

    public int getIdap() {
        return idap;
    }

    public void setIdap(int idap) {
        this.idap = idap;
    }

    public String getNameap() {
        return nameap;
    }

    public void setNameap(String nameap) {
        this.nameap = nameap;
    }
}
