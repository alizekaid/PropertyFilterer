package com.propertyfilterer.propertyfilterer.repository;

import com.propertyfilterer.propertyfilterer.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    List<Address> findByCity(String city);

    List<Address> findByCityAndNeighbourhood(String city, String neighbourhood);

    List<Address> findByZipcode(String zipcode);
}
