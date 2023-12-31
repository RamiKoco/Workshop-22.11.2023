package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.services.abstracts.LocationService;
import com.tobeto.a.spring.intro.services.dtos.location.requests.AddLocationRequest;
import com.tobeto.a.spring.intro.services.dtos.location.requests.UpdateLocationRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api(locations")
public class LocationsController {

    private final LocationService locationService;


    public LocationsController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping
    public void add(@RequestBody AddLocationRequest addLocationRequest) {
        locationService.add(addLocationRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        locationService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateLocationRequest updateLocationRequest) {
        locationService.update(updateLocationRequest);
    }
}
