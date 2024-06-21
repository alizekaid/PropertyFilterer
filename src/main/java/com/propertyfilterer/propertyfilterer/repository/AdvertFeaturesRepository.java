// AdvertFeaturesRepository.java
package com.propertyfilterer.propertyfilterer.repository;

import com.propertyfilterer.propertyfilterer.model.AdvertFeatures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertFeaturesRepository extends JpaRepository<AdvertFeatures, Integer> {
    List<AdvertFeatures> findByInstantBookableAndCancellationPolicy(boolean instantBookable, String cancellationPolicy);
}
