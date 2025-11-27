package org.example.controller;

import org.example.model.DTO.CustomerDTO;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
