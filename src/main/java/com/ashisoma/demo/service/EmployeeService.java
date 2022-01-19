package com.ashisoma.demo.service;

import com.ashisoma.demo.models.Employee;
import com.ashisoma.demo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {

    @Autowired
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee saveEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return repository.save(employee);
    }

    public List<Employee> allEmployees(){
        return repository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return repository.save(employee);
    }

    public Employee findEmployeeId(Long id){
        return (repository.findEmployeeById(id).orElseThrow(() ->
                new UserNotFoundExeption("User with id " + id + " not found")));
    }

    public void deleteEmployeeId(Long id){
        repository.deleteById(id);
    }
}
