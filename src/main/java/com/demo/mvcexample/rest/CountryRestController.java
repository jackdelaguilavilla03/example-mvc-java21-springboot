package com.demo.mvcexample.rest;

import com.demo.mvcexample.model.Country;
import com.demo.mvcexample.repository.CountryRepository;
import com.demo.mvcexample.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryRestController {
    @Autowired
    private  CountryRepository countryRepository;
    @Autowired
    private  CountryService countryService;

    @GetMapping
    private ResponseEntity<List<Country>> getAllCountries() {
        return ResponseEntity.ok(countryRepository.findAll());
    }
}
