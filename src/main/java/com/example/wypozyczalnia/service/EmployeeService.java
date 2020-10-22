package com.example.wypozyczalnia.service;

import com.example.wypozyczalnia.model.Employee;
import com.example.wypozyczalnia.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;

    public List<Employee> listAll() {
        return employeeRepository.findAll();
    }

    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee get(Long id) {

        return employeeRepository.findById(id).get();
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

    public EmployeeService(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }

}
