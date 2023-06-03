package com.example.BasicRestCrud.controller;

import com.example.BasicRestCrud.model.Employee;
import com.example.BasicRestCrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/employees")
@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return  employeeRepository.findAll();
    }

    @PostMapping
    public void saveEmployees(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }
}
