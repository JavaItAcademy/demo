package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "country_1")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String oldCountryName;

    public Country() {
    }


    public Country(Long id, String name, String oldCountryName) {
        this.id = id;
        this.name = name;
        this.oldCountryName = oldCountryName;
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

    public String getOldCountryName() {
        return oldCountryName;
    }

    public void setOldCountryName(String oldCountryName) {
        this.oldCountryName = oldCountryName;
    }
}
