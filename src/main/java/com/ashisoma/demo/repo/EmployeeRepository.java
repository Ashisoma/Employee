package com.ashisoma.demo.repo;

import com.ashisoma.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}