package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.services.abstracts.RentalService;
import com.tobeto.a.spring.intro.services.dtos.rental.requests.AddRentalRequest;
import com.tobeto.a.spring.intro.services.dtos.rental.requests.UpdateRentalRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/rentals")
public class RentalsController {
    private final RentalService rentalService;

    public RentalsController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @PostMapping
    public void add(@RequestBody AddRentalRequest addRentalRequest) {
        rentalService.add(addRentalRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        rentalService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateRentalRequest updateRentalRequest) {
        rentalService.update(updateRentalRequest);
    }
}