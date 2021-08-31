package com.github.npsilva.countries.repositories;

import com.github.npsilva.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
