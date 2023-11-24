package com.tobeto.a.spring.intro.services.concretes;

import com.tobeto.a.spring.intro.entities.Location;
import com.tobeto.a.spring.intro.repositories.LocationRepository;
import com.tobeto.a.spring.intro.services.abstracts.LocationService;
import com.tobeto.a.spring.intro.services.dtos.location.requests.AddLocationRequest;
import com.tobeto.a.spring.intro.services.dtos.location.requests.UpdateLocationRequest;
import org.springframework.stereotype.Service;

@Service
public class LocationManager implements LocationService {

    private final LocationRepository locationRepository;

    public LocationManager(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public void add(AddLocationRequest addLocationRequest) {
        Location location = new Location();
        location.setPickUpLocation(addLocationRequest.getPickUpLocation());
        location.setDropOffLocation(addLocationRequest.getDropOffLocation());
        locationRepository.save(location);
    }

    @Override
    public void delete(int id) {
        Location locationToDelete = locationRepository.findById(id).orElseThrow();
        locationRepository.delete(locationToDelete);
    }

    @Override
    public void update(UpdateLocationRequest updateLocationRequest) {
        Location locationToUpdate = locationRepository.findById(updateLocationRequest.getId()).orElseThrow();
        locationToUpdate.setPickUpLocation(updateLocationRequest.getPickUpLocation());
        locationToUpdate.setDropOffLocation(updateLocationRequest.getDropOffLocation());
        locationRepository.save(locationToUpdate);
    }
}