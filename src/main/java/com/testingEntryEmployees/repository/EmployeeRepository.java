package com.testingEntryEmployees.repository;

import com.testingEntryEmployees.data.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}