package com.fauroro.filtrospringboot.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private int id;

    private String proceedings;
    private String namemedicine;
    private  String healthregister;
    private  String description;
    private  String descriptionshort;

    @ManyToOne
    @JoinColumn(name = "codemodeadmin")
    private Administration administration;

    @ManyToOne
    @JoinColumn(name = "codeap")
    private ActivePrinciple activePrinciple;

    @ManyToOne
    @JoinColumn(name = "codeum")
    private UnitMeasurement unitMeasurement;

    private String namerol;

    @OneToOne
    @JoinColumn(name = "codelab")
    private Laboratory laboratory;


}
