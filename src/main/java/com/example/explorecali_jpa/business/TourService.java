package com.example.explorecali_jpa.business;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.explorecali_jpa.model.Difficulty;
import com.example.explorecali_jpa.model.Region;
import com.example.explorecali_jpa.model.Tour;
import com.example.explorecali_jpa.model.TourPackage;
import com.example.explorecali_jpa.repo.TourRepository;

@Service
public class TourService {

    private TourRepository tourRepository;
    private TourPackageService tourPackageService;

    public TourService(TourRepository tourRepository, TourPackageService tourPackageService) {
        this.tourRepository = tourRepository;
        this.tourPackageService = tourPackageService;
    }

    // Create a new tour
    public Tour createTour(String tourPackageName, String title, String description, String blurb, Integer price,
            String duration, String bullets, String keywords, Difficulty difficulty, Region region) {
        
        TourPackage tourPackage = null;

        return new Tour(null, title, description, blurb, price, duration, bullets, keywords, tourPackage, difficulty, region);
    }

    // Get all tours
    public Page<Tour> findAll(Pageable pageable) {
        return tourRepository.findAll(pageable);
    }

    // Get tours by package code
    public Page<Tour> findByTourPackageCode(Integer tourPackageCode, Pageable pageable) {
        return tourRepository.findByTourPackageCode(tourPackageCode, pageable);
    }

    // Get total number of tours
    public long count() {
        return tourRepository.count();
    }
}
