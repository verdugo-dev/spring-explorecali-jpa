package com.example.explorecali_jpa.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.explorecali_jpa.repo.TourRatingRepository;

@RestController 
@RequestMapping(path = "/tours/{tourId}/ratings") 
public class TourRatingController {

    private TourRatingRepository tourRatingRepository;

    public TourRatingController(TourRatingRepository tourRatingRepository) {
        this.tourRatingRepository = tourRatingRepository;
    }

    
}
