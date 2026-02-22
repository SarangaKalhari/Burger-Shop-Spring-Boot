package org.example.model.DTO;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDTO {

    private long phoneNumber;
    private String name;
    private String nic;
    private String address;
    private String city;
    private String province;
    private String postalCode;
    private BigDecimal salary;

}
