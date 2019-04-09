package com.example.demo.bootstrap;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CountryBootstrap implements CommandLineRunner {

    private final CountryRepository countryRepository;

    public CountryBootstrap(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Country c = new Country();
        c.setName("Россия");
        c.setOldCountryName("СССР");
        countryRepository.save(c);

        Country c1 = new Country();
        c1.setName("Казахстан");
        c1.setOldCountryName("Казахская ССР");
        countryRepository.save(c1);

        Country c2 = new Country();
        c2.setName("Чили");
        c2.setOldCountryName("Чили");
        countryRepository.save(c2);
    }
}
