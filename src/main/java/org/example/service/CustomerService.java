package org.example.service;

import org.example.model.DTO.CustomerDTO;
import org.example.model.Entity.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void save(CustomerDTO customerDTO) {

        Customer customer = new Customer(
                1L,
                customerDTO.getPhoneNumber(),
                customerDTO.getCustTitle(),
                customerDTO.getCustName(),
                customerDTO.getDob(),
                customerDTO.getSalary(),
                customerDTO.getCustAddress(),
                customerDTO.getCity(),
                customerDTO.getProvince(),
                customerDTO.getPostalCode()
        );

        customerRepository.save(customer);
    }
}
