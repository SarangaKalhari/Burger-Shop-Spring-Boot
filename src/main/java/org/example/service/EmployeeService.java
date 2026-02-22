package org.example.service;

import org.example.model.DTO.EmployeeDTO;
import org.example.model.Entity.Employee;
import org.example.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(EmployeeDTO employeeDTO){
        Employee employee = modelMapper.map(employeeDTO, Employee.class);
        employeeRepository.save(employee);
    }
}
