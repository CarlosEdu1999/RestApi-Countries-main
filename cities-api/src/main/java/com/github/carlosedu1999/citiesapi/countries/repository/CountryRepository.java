package com.github.carlosedu1999.citiesapi.countries.repository;

import com.github.carlosedu1999.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
