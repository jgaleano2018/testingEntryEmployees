package com.testingEntryEmployees.repository;

import com.testingEntryEmployees.data.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}