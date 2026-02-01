package org.example.repository;

import org.example.model.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
//
//    @Query("SELECT c FROM Customer c WHERE c.cust_id = number")
//    Optional<Customer> findByName(@Param("number") String name);
}
