package com.jay.demo.Service;

import com.jay.demo.DAO.EmployeeRepository;
import com.jay.demo.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyServiceImpl {

    @Autowired
    EmployeeRepository dao;

    public List<Employee> getEmployees() {
        return dao.findAll();
    }

    public Optional<Employee> getEmployeeById(int empid) {
        return dao.findById(empid);
    }

    public Employee addNewEmployee(Employee emp) {
        return dao.save(emp);
    }

    public Employee updateEmployee(Employee emp) {
        return dao.save(emp);
    }

    public void deleteEmployeeById(int empid) {
        dao.deleteById(empid);
    }

    public void deleteAllEmployees() {
        dao.deleteAll();
    }
}
