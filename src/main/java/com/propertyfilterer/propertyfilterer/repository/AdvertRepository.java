package com.propertyfilterer.propertyfilterer.repository;

import com.propertyfilterer.propertyfilterer.model.Advert;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertRepository extends JpaRepository<Advert, Integer> {

    @Query("SELECT DISTINCT a " +
            "FROM Advert a " +
            "JOIN FETCH a.address ad " +
            "JOIN FETCH a.advertFeatures af " +
            "LEFT JOIN FETCH a.location l " +
            "JOIN FETCH a.host h " +
            "LEFT JOIN FETCH a.pricings p " +
            "JOIN FETCH a.reviews r " +
            "JOIN FETCH a.propInfo pi " +
            "JOIN FETCH a.resting rt " +
            "LEFT JOIN FETCH a.rooms rm " + // Joining rooms
            "WHERE (:city IS NULL OR ad.city = :city) " +
            "AND (:neighbourhood IS NULL OR ad.neighbourhood = :neighbourhood) " +
            "AND (:instantBookable IS NULL OR af.instantBookable = :instantBookable) " +
            "AND (:cancellationPolicy IS NULL OR af.cancellationPolicy = :cancellationPolicy) " +
            "AND ((:minPrice IS NULL AND :maxPrice IS NULL) OR p.logPrice BETWEEN :minPrice AND :maxPrice) " +
            "AND (:bedType IS NULL OR rt.bedType = :bedType) " +
            "AND ((:minBeds IS NULL AND :maxBeds IS NULL) OR (rt.beds BETWEEN :minBeds AND :maxBeds)) " +
            "AND (:propertyType IS NULL OR :propertyType = pi.propertyType) " +
            "AND (:cleaningFee IS NULL OR pi.cleaningFee = :cleaningFee)" +
            "AND ((:minAccommodates IS NULL AND :maxAccommodates IS NULL) OR (pi.accommodates BETWEEN :minAccommodates AND :maxAccommodates))" +
            "AND (:roomType IS NULL OR rm.roomType = :roomType) " + // Filtering by room type
            "AND ((:minBathrooms IS NULL AND :maxBathrooms IS NULL) OR (rm.bathrooms BETWEEN :minBathrooms AND :maxBathrooms)) " + // Filtering by bathrooms
            "AND ((:minBedrooms IS NULL AND :maxBedrooms IS NULL) OR (rm.bedrooms BETWEEN :minBedrooms AND :maxBedrooms)) " + // Filtering by bedrooms
            "")

    Page<Advert> findByCityAndNeighbourhoodAndFeatures(
            @Param("city") String city,
            @Param("neighbourhood") String neighbourhood,
            @Param("instantBookable") Boolean instantBookable,
            @Param("cancellationPolicy") String cancellationPolicy,
            @Param("minPrice") Double minPrice,
            @Param("maxPrice") Double maxPrice,
            @Param("bedType") String bedType,
            @Param("minBeds") Integer minBeds,
            @Param("maxBeds") Integer maxBeds,
            @Param("propertyType") String propertyType,
            @Param("cleaningFee") Integer cleaningFee,
            @Param("minAccommodates") Integer minAccommodates,
            @Param("maxAccommodates") Integer maxAccommodates,
            @Param("roomType") String roomType,
            @Param("minBathrooms") Integer minBathrooms,
            @Param("maxBathrooms") Integer maxBathrooms,
            @Param("minBedrooms") Integer minBedrooms,
            @Param("maxBedrooms") Integer maxBedrooms,
            Pageable pageable);
}
