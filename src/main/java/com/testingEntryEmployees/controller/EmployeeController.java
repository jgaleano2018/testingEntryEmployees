package com.testingEntryEmployees.controller;

import com.testingEntryEmployees.dto.EmployeeData;
import com.testingEntryEmployees.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Resource(name = "employeeService")
    private EmployeeService employeeService;

    /**
     * <p>Get all employee data in the system.For production system you many want to use
     * pagination.</p>
     * @return List<EmployeeData>
     */
    @GetMapping
    public List<EmployeeData> getEmployees(){
        return employeeService.getAllEmployees();
    }

    /**
     * Method to get the employee data based on the ID.
     * @param id
     * @return EmployeeData
     */
    @GetMapping("/employee/{id}")
    public EmployeeData getEmployee(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    /**
     * Post request to create employee information int the system.
     * @param employeeData
     * @return
     */
    @PostMapping("/employee")
    public EmployeeData saveEmployee(final @RequestBody CustomerData customerData){
        return employeeService.saveEmployee(employeeData);
    }

    /**
     * Delete employee from the system based on the ID. The method mapping is similar to the getCustomer with difference of
     * @DeleteMapping and @GetMapping
     * @param id
     * @return
     */
    @DeleteMapping("/employee/{id}")
    public Boolean deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }

}