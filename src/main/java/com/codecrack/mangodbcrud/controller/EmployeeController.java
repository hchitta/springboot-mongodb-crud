package com.codecrack.mangodbcrud.controller;

import com.codecrack.mangodbcrud.entity.Employee;
import com.codecrack.mangodbcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> saveOrUpdate(@RequestBody Employee employee) {
        Employee dbEmp = employeeService.saveOrUpdate(employee);
        return new ResponseEntity<Employee>(dbEmp, HttpStatus.ACCEPTED);
    }

    @GetMapping
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") int empId){
        return employeeService.getEmployeeById(empId).get();
    }

    @PutMapping
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee dbEmp = employeeService.saveOrUpdate(employee);
        return new ResponseEntity<Employee>(dbEmp, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public String deleteEmpById(@PathVariable("id") int empId) {
        employeeService.deleteEmpById(empId);
        return "emp deleted";
    }

}
