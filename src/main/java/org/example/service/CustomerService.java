package org.example.service;

import org.example.model.DTO.CustomerDTO;
import org.example.model.Entity.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<CustomerDTO> getALLCustomer() {
        List<Customer> customerList = customerRepository.findAll();

        List<CustomerDTO> customerDTOS = new ArrayList<>();

        for (Customer c1 : customerList){

            customerDTOS.add(new CustomerDTO(
                    c1.getPhone_number(),
                    c1.getCust_title(),
                    c1.getCust_name(),
                    c1.getDob(),
                    c1.getSalary(),
                    c1.getCust_address(),
                    c1.getCity(),
                    c1.getProvince(),
                    c1.getPostal_code()
            ));
        }
        return customerDTOS;
    }

    public CustomerDTO search(long number) {
        for (Customer customer : customerRepository.findAll()){
            if (customer.getPhone_number()== number){
                CustomerDTO customerDTO = new CustomerDTO(
                        customer.getPhone_number(),
                        customer.getCust_title(),
                        customer.getCust_name(),
                        customer.getDob(),
                        customer.getSalary(),
                        customer.getCust_address(),
                        customer.getCity(),
                        customer.getProvince(),
                        customer.getPostal_code()
                );
                return customerDTO;
            }
        }
        return null;
    }

    public void delete(long number) {
        customerRepository.deleteById(number);

    }
}

