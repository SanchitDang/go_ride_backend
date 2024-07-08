package com.sanapplications.goridebackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "routes")
public class RoutesModel {
    @Id
    @SequenceGenerator(
            name= "routes_sequence",
            sequenceName = "routes_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "routes_sequence"
    )
    private Long id;
    private String name;

    public RoutesModel() {
    }

    public RoutesModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public RoutesModel(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RoutesModel [id=" + id + ", name=" + name + "]";
    }

}
