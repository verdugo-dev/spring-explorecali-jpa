package com.example.explorecali_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity 
public class Tour {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column 
    private String title;
    
    @Column (length=2000)
    private String description;
    
    @Column (length=2000)
    private String blurb;
    
    @Column 
    private Integer price;
    
    @Column 
    private String duration;
    
    @Column (length=1000)
    private String bullets;
    
    @Column 
    private String keywords;

    @ManyToOne 
    @JoinColumn (name = "tour_package_code")
    private TourPackage tourPackage;

    @Column
    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    @Column 
    private Region region;

    public Tour (String title, String description, String blurb, Integer price, String duration, String bullets, String keywords, TourPackage tourPackage, Difficulty difficulty, Region region){
        this.title = title;
        this.description = description;
        this.blurb = blurb;
        this.price = price;
        this.duration = duration;
        this.bullets = bullets;
        this.keywords = keywords;
        this.tourPackage = tourPackage;
        this.difficulty = difficulty;
        this.region = region;
    }

    public Tour (){}
}
