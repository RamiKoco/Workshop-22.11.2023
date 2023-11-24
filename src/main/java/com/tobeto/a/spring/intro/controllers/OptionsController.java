package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.services.abstracts.OptionService;
import com.tobeto.a.spring.intro.services.dtos.option.requests.AddOptionRequest;
import com.tobeto.a.spring.intro.services.dtos.option.requests.UpdateOptionRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/options")
public class OptionsController {

    private final OptionService optionService;

    public OptionsController(OptionService optionService) {
        this.optionService = optionService;
    }

    @PostMapping
    public void add(@RequestBody AddOptionRequest addOptionRequest) {
        optionService.add(addOptionRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        optionService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateOptionRequest updateOptionRequest) {
        optionService.update(updateOptionRequest);
    }
}