package com.example.explorecali_jpa.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity 
@Table (name = "tour_rating")
@Data 
public class TourRating {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne 
    @JoinColumn (name = "tour_id")
    private Tour tour;

    @Column (name = "customer_id")
    private Integer customerId;

    @Column (nullable = false)
    private Integer score;

    @Column 
    private String comment;

    protected TourRating() {}

    public TourRating (Tour tour, Integer customerId, Integer score, String comment) {
        this.tour = tour;
        this.customerId = customerId;
        this.score = score;
        this.comment = comment;
    }

    public TourRating(Tour tour, Integer customerId, Integer score) {
        this.tour = tour;
        this.customerId = customerId;
        this.score = score;
    }

    public Integer getId() {
        return this.id;
    }

    public Tour getTour() {
        return this.tour;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public Integer getScore() {
        return this.score;
    }

    public String getComment() {
        return this.comment;
    }

    @Override 
    public String toString() {
        return "TourRating{" +
                "id=" + id +
                ", tour=" + tour +
                ", customerId=" + customerId +
                ", score=" + score +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TourRating that = (TourRating) o;

        return Objects.equals(id, that.id) &&
                Objects.equals(tour, that.tour) &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(score, that.score) &&
                Objects.equals(comment, that.comment);
    }

    @Override 
    public int hashCode() {
        return Objects.hash(id, tour, customerId, score, comment);
    }
}
