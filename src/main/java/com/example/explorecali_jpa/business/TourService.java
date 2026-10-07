package com.example.explorecali_jpa.business;

import org.springframework.stereotype.Service;

import com.example.explorecali_jpa.model.Difficulty;
import com.example.explorecali_jpa.model.Region;
import com.example.explorecali_jpa.model.Tour;
import com.example.explorecali_jpa.model.TourPackage;
import com.example.explorecali_jpa.repo.TourPackageRepository;
import com.example.explorecali_jpa.repo.TourRepository;

@Service
public class TourService {

    private TourRepository tourRepository;
    private TourPackageRepository tourPackageRepository;

    public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
    }

    // Create a new tour
    public Tour createTour(String tourPackageName, String title, String description, String blurb, Integer price,
            String duration, String bullets, String keywords, Difficulty difficulty, Region region) {
        
        TourPackage tourPackage = tourPackageRepository.findById(tourPackageName).orElseThrow(() -> new RuntimeException("Tour package does not exist: " + tourPackageName));
        return tourRepository.save(new Tour(title, description, blurb, price, duration, bullets, keywords, tourPackage, difficulty, region));
    }

    // Get total number of tours
    public long total() {
        return tourRepository.count();
    }
}
