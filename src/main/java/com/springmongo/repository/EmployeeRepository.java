package com.springmongo.repository;

import com.springmongo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
       public Employee findByEmployeeId(String employeeId);
}
