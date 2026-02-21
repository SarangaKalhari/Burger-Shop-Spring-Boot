package org.example.model.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BurgerDTO {

    private String code;
    private String name;
    private String type;
    private double price;

}
