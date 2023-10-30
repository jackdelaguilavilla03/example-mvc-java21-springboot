package com.demo.mvcexample.repository;

import com.demo.mvcexample.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
