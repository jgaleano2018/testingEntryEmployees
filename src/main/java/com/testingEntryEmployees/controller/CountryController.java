package com.testingEntryEmployees.controller;

import com.testingEntryEmployees.dto.CountryData;
import com.testingEntryEmployees.service.CountryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Resource(name = "countryService")
    private CountryService countryService;

    /**
     * <p>Get all employee data in the system.For production system you many want to use
     * pagination.</p>
     * @return List<EmployeeData>
     */
    @GetMapping
    public List<CountryData> getCountries(){
        return countryService.getAllCountries();
    }
}