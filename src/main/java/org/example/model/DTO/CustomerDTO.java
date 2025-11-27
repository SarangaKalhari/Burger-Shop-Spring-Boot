package org.example.model.DTO;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDTO {

    private long phoneNumber;
    private String custTitle;
    private String custName;
    private LocalDate dob;
    private BigDecimal salary;
    private String custAddress;
    private String city;
    private String province;
    private String postalCode;
}
