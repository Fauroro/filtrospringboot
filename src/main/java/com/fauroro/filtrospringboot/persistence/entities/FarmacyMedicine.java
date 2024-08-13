package com.fauroro.filtrospringboot.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "farmacymedicine")
public class FarmacyMedicine {

    @EmbeddedId
    private FarmacyMedicineEmbedded id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idfarmacy")
    @JsonIgnore
    @JoinColumn(name = "idfarmacy")
    private Farmacy farmacy;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("id")
    @JsonIgnore
    @JoinColumn(name = "idmedicinefatrm")
    private Medicine medicine;

    private Double price;

    public FarmacyMedicine() {
    }

    public FarmacyMedicineEmbedded getId() {
        return id;
    }

    public void setId(FarmacyMedicineEmbedded id) {
        this.id = id;
    }

    public Farmacy getFarmacy() {
        return farmacy;
    }

    public void setFarmacy(Farmacy farmacy) {
        this.farmacy = farmacy;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
