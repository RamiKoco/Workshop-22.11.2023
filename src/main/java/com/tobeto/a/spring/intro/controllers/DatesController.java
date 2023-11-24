package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.services.abstracts.DateService;
import com.tobeto.a.spring.intro.services.dtos.date.requests.AddDateRequest;
import com.tobeto.a.spring.intro.services.dtos.date.requests.UpdateDateRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/dates")
public class DatesController {

    private final DateService dateService;

    public DatesController(DateService dateService) {
        this.dateService = dateService;
    }

    @PostMapping
    public void add(@RequestBody AddDateRequest addDateRequest) {
        dateService.add(addDateRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        dateService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateDateRequest updateDateRequest) {
        dateService.update(updateDateRequest);
    }
}
