package com.example.demo.service;

import com.example.demo.model.Country;

import java.util.List;

public interface CountryService {
    List<Country> findAllCountries();
    Country findCountryById(Long id);
    Country saveCountry(Country c);
}
