package com.devmaster.Lesson03_JavaWeb.service;

import com.devmaster.Lesson03_JavaWeb.dto.request.EmployeeRequest;
import com.devmaster.Lesson03_JavaWeb.entity.Employee;
import com.devmaster.Lesson03_JavaWeb.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeMapper employeeMapper;
    private List<Employee> employeeList;

    public EmployeeService(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
        employeeList =new ArrayList<Employee>();
        employeeList.add(new Employee(1,"Nguyễn Viết ","Chiến",12.222f,"chien08032003@gmail.com"));
        employeeList.add(new Employee(2,"Trần ","Bình",20.2312f,"binhtran@gmail.com"));
    }
    public List<EmployeeRequest> getEmployeeList() {
        return employeeList.stream()
                .map(emp-> employeeMapper.toEmployeeRequest(emp)).collect(Collectors.toList());
    }
    public void employeeAdd(EmployeeRequest employeeRequest) {
//        employeeMapper = new EmployeeMapper();
        Employee employee = employeeMapper.toEmployee(employeeRequest);
        employeeList.add(employee);
    }
}