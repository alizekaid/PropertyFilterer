package com.propertyfilterer.propertyfilterer.controller;

import com.propertyfilterer.propertyfilterer.model.Advert;
import com.propertyfilterer.propertyfilterer.repository.AdvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdvertController {

    @Autowired
    private AdvertRepository advertRepository;

    @GetMapping("/all-adverts")
    public List<Advert> getAllAdverts() {
        return advertRepository.findAll();
    }

    @GetMapping("/search-adverts")
    public Page<Advert> searchAdverts(
            @RequestParam(value = "city", required = false) String city,
            @RequestParam(value = "neighbourhood", required = false) String neighbourhood,
            @RequestParam(value = "instantBookable", required = false) Boolean instantBookable,
            @RequestParam(value = "cancellationPolicy", required = false) String cancellationPolicy,
            @RequestParam(value = "minPrice", required = false) Double minPrice,
            @RequestParam(value = "maxPrice", required = false) Double maxPrice,
            @RequestParam(value = "bedType", required = false) String bedType,
            @RequestParam(value = "minBeds", required = false) Integer minBeds,
            @RequestParam(value = "maxBeds", required = false) Integer maxBeds,
            @RequestParam(value = "propertyType", required = false) String propertyType,
            @RequestParam(value = "cleaningFee", required = false) Integer cleaningFee, // Add cleaningFee parameter
            @RequestParam(value = "minAccommodates", required = false) Integer minAccommodates,
            @RequestParam(value = "maxAccommodates", required = false) Integer maxAccommodates,
            @RequestParam(value = "roomType", required = false) String roomType,
            @RequestParam(value = "minBathrooms", required = false) Integer minBathrooms,
            @RequestParam(value = "maxBathrooms", required = false) Integer maxBathrooms,
            @RequestParam(value = "minBedrooms", required = false) Integer minBedrooms,
            @RequestParam(value = "maxBedrooms", required = false) Integer maxBedrooms,
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {

        Pageable pageable = PageRequest.of(page, pageSize);

        return advertRepository.findByCityAndNeighbourhoodAndFeatures(city, neighbourhood, instantBookable, cancellationPolicy, minPrice, maxPrice, bedType, minBeds, maxBeds, propertyType, cleaningFee, minAccommodates,maxAccommodates, roomType, minBathrooms, maxBathrooms, minBedrooms, maxBedrooms, pageable);
    }
}
