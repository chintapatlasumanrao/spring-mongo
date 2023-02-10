package com.springmongo.controller;

import com.springmongo.model.Employee;
import com.springmongo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/spring-mongo")
public class SpringMongoController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // get all employees records
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    // get specific employee record
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable String employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }

    // create new employee record
    @PostMapping("employees")
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
    }

    // delete new employee record
    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable String employeeId) {
        employeeRepository.deleteByEmployeeId(employeeId);
    }
}
