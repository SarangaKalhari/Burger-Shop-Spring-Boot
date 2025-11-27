package org.example.controller;

import org.example.model.DTO.CustomerDTO;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public String getStart(){
        return "Welcome Our Burger Shop";
    }

    @PostMapping("/add")
    public void addCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.save(customerDTO);
    }

    @GetMapping("/all")
    public List<CustomerDTO> getAllCustomer(){
         return customerService.getALLCustomer();
    }

}
