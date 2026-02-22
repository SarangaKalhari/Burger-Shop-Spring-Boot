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

    public EmployeeDTO search(String nic) {
        Employee employee = employeeRepository.findAllByNic(nic);
        return modelMapper.map(employee, EmployeeDTO.class);
    }

    public void delete(long phoneNumber) {
        employeeRepository.deleteByPhoneNumber(phoneNumber);
    }

    public void updateEmployee(EmployeeDTO employeeDTO, String nic) {
        Employee employee = employeeRepository.findAllByNic(nic);

        employee.setPhoneNumber(employeeDTO.getPhoneNumber());
        employee.setName(employeeDTO.getName());
        employee.setAddress(employeeDTO.getAddress());
        employee.setCity(employeeDTO.getCity());
        employee.setProvince(employeeDTO.getProvince());
        employee.setPostalCode(employeeDTO.getPostalCode());
        employee.setSalary(employeeDTO.getSalary());

        employeeRepository.save(employee);
    }
}
