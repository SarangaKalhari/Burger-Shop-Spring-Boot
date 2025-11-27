package org.example.model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {

    @Id
    private long cust_id;

    private long phone_number;
    private String cust_title;
    private String cust_name;
    private LocalDate dob;
    private BigDecimal salary;
    private String cust_address;
    private String city;
    private String province;
    private String postal_code;
}
