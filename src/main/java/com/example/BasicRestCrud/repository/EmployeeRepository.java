package com.example.BasicRestCrud.repository;

import com.example.BasicRestCrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
