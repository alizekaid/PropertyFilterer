package com.propertyfilterer.propertyfilterer.controller;

import com.propertyfilterer.propertyfilterer.model.Address;
import com.propertyfilterer.propertyfilterer.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/all-addresses")
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @GetMapping("/addresses/{id}")
    public Address getAddressById(@PathVariable(value = "id") int addressId) {
        return addressRepository.findById(addressId).orElse(null);
    }

    @GetMapping("/addresses/byCity")
    public List<Address> getAddressByCity(@RequestParam(value = "city", required = false) String city) {
        if (city != null) {
            return addressRepository.findByCity(city);
        } else {
            return addressRepository.findAll();
        }
    }

    @GetMapping("/addresses")
    public List<Address> getAddressByCityAndNeighbourhood(
            @RequestParam(value = "city", required = false) String city,
            @RequestParam(value = "neighbourhood", required = false) String neighbourhood) {
        if (city != null && neighbourhood != null) {
            return addressRepository.findByCityAndNeighbourhood(city, neighbourhood);
        } else if (city != null) {
            return addressRepository.findByCity(city);
        } else {
            return addressRepository.findAll();
        }
    }

    /*
    @PostMapping("/addresses")
    public Address addAddress(@RequestBody Address address) {
        return addressRepository.save(address);
    }

    @PutMapping("/addresses/{id}")
    public Address updateAddress(@PathVariable(value = "id") int addressId, @RequestBody Address addressDetails) {
        Address address = addressRepository.findById(addressId).orElse(null);
        if (address != null) {
            address.setCity(addressDetails.getCity());
            address.setNeighbourhood(addressDetails.getNeighbourhood());
            address.setZipcode(addressDetails.getZipcode());  // Zipcode güncellemesi
            return addressRepository.save(address);
        } else {
            return null;
        }
    }

    @DeleteMapping("/addresses/{id}")
    public void deleteAddress(@PathVariable(value = "id") int addressId) {
        addressRepository.deleteById(addressId);
    }
*/
}

