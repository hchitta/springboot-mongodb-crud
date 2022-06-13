package com.codecrack.mangodbcrud.service;

import com.codecrack.mangodbcrud.entity.Employee;
import com.codecrack.mangodbcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee saveOrUpdate(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(int empid) {
        return employeeRepository.findById(empid);
    }

    public void deleteEmpById(int empId) {
        employeeRepository.deleteById(empId);
    }
}
