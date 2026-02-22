package org.example.controller;

import org.example.model.DTO.BurgerDTO;
import org.example.model.DTO.CustomerDTO;
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

    @GetMapping("/search/{nic}")
    public EmployeeDTO searchEmployee(@PathVariable String nic){
        return employeeService.search(nic);
    }

    @DeleteMapping("/delete/{phoneNumber}")
    public String deleteEmployee(@PathVariable long phoneNumber){
        employeeService.delete(phoneNumber);
        return "Deleted Employee..";
    }

    @PostMapping("/update/{nic}")
    public String updateEmployee(@PathVariable String nic,@RequestBody EmployeeDTO employeeDTO){
        employeeService.updateEmployee(employeeDTO, nic);
        return "Updated Success..";
    }
}
