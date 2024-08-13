package com.fauroro.filtrospringboot.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="modeadministration")
public class Administration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descriptionmode;

    public Administration() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriptionmode() {
        return descriptionmode;
    }

    public void setDescriptionmode(String descriptionmode) {
        this.descriptionmode = descriptionmode;
    }
}
