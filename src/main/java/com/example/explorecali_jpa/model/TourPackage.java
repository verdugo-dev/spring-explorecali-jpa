package com.example.explorecali_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table (name="tour_package")
@Entity 
public class TourPackage {

    @Id 
    private String code;

    @Column 
    private String name;

    protected TourPackage() {

    }

    public TourPackage(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
