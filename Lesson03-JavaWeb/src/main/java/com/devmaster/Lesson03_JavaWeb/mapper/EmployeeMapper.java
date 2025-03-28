package com.devmaster.Lesson03_JavaWeb.mapper;

import com.devmaster.Lesson03_JavaWeb.dto.request.EmployeeRequest;
import com.devmaster.Lesson03_JavaWeb.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

//@Component
@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mapping(target = "salary", constant = "0")
    Employee toEmployee(EmployeeRequest employeeRequest);

//
//    public Employee toEmployee(EmployeeRequest employeeRequest) {
//        Employee employee = new Employee();
//        employee.setId(employeeRequest.getId());
//        employee.setFirstName(employeeRequest.getFirstName());
//        employee.setLastName(employeeRequest.getLastName());
//        employee.setEmail(employeeRequest.getEmail());
//        employee.setSalary(0);
//        return employee;
//    }


    EmployeeRequest toEmployeeRequest(Employee employee);
//    public EmployeeRequest toEmployeeRequest(Employee employee) {
//        EmployeeRequest employeeRequest = new EmployeeRequest();
//        employeeRequest.setId(employee.getId());
//        employeeRequest.setFirstName(employee.getFirstName());
//        employeeRequest.setLastName(employee.getLastName());
//        employeeRequest.setEmail(employee.getEmail());
//        return employeeRequest;
//    }
}