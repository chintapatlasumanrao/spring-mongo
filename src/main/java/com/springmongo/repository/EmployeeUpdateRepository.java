package com.springmongo.repository;

import com.springmongo.model.Address;
import com.springmongo.model.Employee;

public interface EmployeeUpdateRepository {
    public Employee updateEmpAddress(String employeeId, Address address);
}
