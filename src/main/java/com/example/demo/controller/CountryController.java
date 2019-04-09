package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.service.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CountryController.URL_COUNTRY)
public class CountryController {
    public static final String URL_COUNTRY = "/api/v1/country";

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<Country> getCountries() {
        return this.countryService.findAllCountries();
    }

    @GetMapping("/{id}")
    public Country getCountryById(@PathVariable Long id){
        return this.countryService.findCountryById(id);
    }

    @PostMapping
    public Country saveCountry(@RequestBody Country c) {
        return this.countryService.saveCountry(c);
    }



}
