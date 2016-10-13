package com.springtweaks.boot.poc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springtweaks.boot.poc.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
