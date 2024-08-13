package com.fauroro.filtrospringboot.persistence.entities;

import jakarta.persistence.*;

@Embeddable
public class FarmacyMedicineEmbedded {

    @Column(name = "idfarmacy")
    private int idfarmacy;

    @Column(name = "idmedicinefatrm")
    private int id;

    public FarmacyMedicineEmbedded() {
    }

    public FarmacyMedicineEmbedded(int idfarmacy, int id, Double price) {
        this.idfarmacy = idfarmacy;
        this.id = id;
    }

    public int getIdfarmacy() {
        return idfarmacy;
    }

    public void setIdfarmacy(int idfarmacy) {
        this.idfarmacy = idfarmacy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
