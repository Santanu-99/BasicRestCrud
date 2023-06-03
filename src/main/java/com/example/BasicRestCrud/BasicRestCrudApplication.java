package com.example.BasicRestCrud;

import com.example.BasicRestCrud.model.Employee;
import com.example.BasicRestCrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicRestCrudApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(BasicRestCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Santa");
//		employee.setLastName("Pur");
//		employee.setEmailId("santa@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee.setFirstName("Banta");
//		employee.setLastName("Pur");
//		employee.setEmailId("banta@gmail.com");
//		employeeRepository.save(employee1);
	}
}
