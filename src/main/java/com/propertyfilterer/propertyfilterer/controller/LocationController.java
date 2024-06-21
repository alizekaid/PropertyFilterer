package com.propertyfilterer.propertyfilterer.controller;

import com.propertyfilterer.propertyfilterer.model.Location;
import com.propertyfilterer.propertyfilterer.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @GetMapping("/all-locations")
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @GetMapping("/location/{id}")
    public Location getLocationById(@PathVariable(value = "id") int locationId) {
        return locationRepository.findById(locationId).orElse(null);
    }
}
