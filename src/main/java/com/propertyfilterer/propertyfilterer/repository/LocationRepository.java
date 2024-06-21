package com.propertyfilterer.propertyfilterer.repository;

import com.propertyfilterer.propertyfilterer.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
    Optional<Location> findById(int id);
}
