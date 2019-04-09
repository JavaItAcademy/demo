package com.example.demo.service;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{
    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAllCountries() {
        return this.countryRepository.findAll();
    }

    @Override
    public Country findCountryById(Long id) {
        return this.countryRepository.findById(id).get();
    }

    @Override
    public Country saveCountry(Country c) {
        return this.countryRepository.save(c);
    }
}
