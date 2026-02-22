package org.example.model.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cust_id;

    @Column(unique = true)
    private long phone_number;

    private String cust_title;
    private String cust_name;
    private LocalDate dob;
    private String cust_address;
    private String city;
    private String province;
    private String postal_code;
}
