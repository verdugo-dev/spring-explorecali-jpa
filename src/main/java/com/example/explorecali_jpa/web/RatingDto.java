package com.example.explorecali_jpa.web;

import com.example.explorecali_jpa.model.TourRating;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RatingDto {

    @Min (0)
    @Max (5)
    private Integer score;

    @Size (max = 255)
    private String description;

    @NotNull 
    private Integer customerId;

    public RatingDto (Integer score, String description, Integer customerId) {
        this.score = score;
        this.description = description;
        this.customerId = customerId;
    }

    public RatingDto (TourRating tourRating) {
        this(tourRating.getScore(), tourRating.getComment(), tourRating.getCustomerId());
    }

    public Integer getScore () {
        return score;
    }

    public String getDescription () {
        return description;
    }

    public Integer getCustomerId () {
        return customerId;
    }
}
