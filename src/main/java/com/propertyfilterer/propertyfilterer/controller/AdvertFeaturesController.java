// AdvertFeaturesController.java
package com.propertyfilterer.propertyfilterer.controller;

import com.propertyfilterer.propertyfilterer.model.AdvertFeatures;
import com.propertyfilterer.propertyfilterer.repository.AdvertFeaturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdvertFeaturesController {

    @Autowired
    private AdvertFeaturesRepository advertFeaturesRepository;

    // Tüm özellikleri getiren endpoint
    @GetMapping("/all-advert-features")
    public List<AdvertFeatures> getAllAdvertFeatures(
                                                     @RequestParam(required = false) boolean instantBookable,
                                                     @RequestParam(required = false) String cancellationPolicy) {
        // İstenilen kriterlere göre filtreleme yaparak verileri döndürün
        if (cancellationPolicy != null) {
            return advertFeaturesRepository.findByInstantBookableAndCancellationPolicy(instantBookable, cancellationPolicy);
        } else {
            return advertFeaturesRepository.findAll();
        }
    }

    // Yeni bir özellik eklemek için endpoint
    @PostMapping("/advert-features")
    public AdvertFeatures addAdvertFeatures(@RequestBody AdvertFeatures advertFeatures) {
        return advertFeaturesRepository.save(advertFeatures);
    }

    // Diğer endpoint'leri buraya ekleyin
}
