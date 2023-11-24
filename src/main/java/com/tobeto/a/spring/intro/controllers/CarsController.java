package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.services.abstracts.CarService;
import com.tobeto.a.spring.intro.services.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.intro.services.dtos.car.requests.UpdateCarRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cars")
public class CarsController {
    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public void add(@RequestBody AddCarRequest addCarRequest) {
        carService.add(addCarRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        carService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateCarRequest updateCarRequest) {
        carService.update(updateCarRequest);
    }
}