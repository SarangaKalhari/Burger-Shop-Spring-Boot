package org.example.controller;

import org.example.model.DTO.EmployeeDTO;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String getStart(){
        return "Welcome Employee..";
    }

    @PutMapping("/add")
    public String addEmployee(@RequestBody EmployeeDTO employeeDTO ){
        employeeService.addEmployee(employeeDTO);
        return "Added Successful..";
    }
}
