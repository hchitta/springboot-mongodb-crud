package com.codecrack.mangodbcrud.repository;

import com.codecrack.mangodbcrud.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
}
