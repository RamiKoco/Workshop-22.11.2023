package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.services.abstracts.IndividualService;
import com.tobeto.a.spring.intro.services.dtos.individual.requests.AddIndividualRequest;
import com.tobeto.a.spring.intro.services.dtos.individual.requests.UpdateIndividualRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/individuals")
public class IndividualsController {

    private final IndividualService individualService;


    public IndividualsController(IndividualService individualService) {
        this.individualService = individualService;
    }

    @PostMapping
    public void add(@RequestBody AddIndividualRequest addIndividualRequest) {
        individualService.add(addIndividualRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        individualService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateIndividualRequest updateIndividualRequest) {
        individualService.update(updateIndividualRequest);
    }
}