package com.springmongo.repository.impl;

import com.springmongo.model.Address;
import com.springmongo.model.Employee;
import com.springmongo.repository.EmployeeUpdateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeUpdateRepositoryImpl implements EmployeeUpdateRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Employee updateEmpAddress(String employeeId, Address address) {
        try {
            Query query = new Query();
            query.addCriteria(Criteria.where("employeeId").is(employeeId));

            Employee emp = mongoTemplate.findOne(query, Employee.class);
            emp.setAddress(address);
            mongoTemplate.save(emp);

            return emp;

        } catch(Exception exception) {
            // catch exception
        }
        return null;
    }

}
