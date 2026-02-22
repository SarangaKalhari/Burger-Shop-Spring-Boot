package org.example.repository;

import org.example.model.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
//
//    @Query("SELECT c FROM Customer c WHERE c.cust_id = number")
//    Optional<Customer> findByName(@Param("number") String name);
}
