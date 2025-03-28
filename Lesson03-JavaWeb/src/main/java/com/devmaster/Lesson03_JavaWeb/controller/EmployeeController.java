package com.devmaster.Lesson03_JavaWeb.controller;

import com.devmaster.Lesson03_JavaWeb.dto.request.EmployeeRequest;
import com.devmaster.Lesson03_JavaWeb.mapper.EmployeeMapper;
import com.devmaster.Lesson03_JavaWeb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService ;

    @GetMapping("")
    public List<EmployeeRequest> getAllEmployeeRequestList(){
        return employeeService.getEmployeeList();
    }

    @PostMapping("/add")
    public void employeeAdd(@RequestBody EmployeeRequest employeeRequest){
        employeeService.employeeAdd(employeeRequest);
    }
}
