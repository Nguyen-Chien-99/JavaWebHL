package com.dev.lab09_10.service;

import com.dev.lab09_10.entity.Employee;
import com.dev.lab09_10.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> updateEmployee(Long id, Employee employee) {
        return employeeRepository.findById(id).map(Employee -> {
            employee.setFullname(employee.getFullname());
            employee.setEmail(employee.getEmail());
            employee.setPhone(employee.getPhone());
            employee.setAddress(employee.getAddress());
            employee.setBirthday(employee.getBirthday());
            employee.setStatus(employee.getStatus());
            return employeeRepository.save(employee);
        });
    }

    public boolean deleteEmployee(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}