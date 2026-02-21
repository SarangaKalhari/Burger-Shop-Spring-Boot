package org.example.model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "burger")
public class Burger {

    private long id;
    private String code;
    private String name;
    private String type;
    private double price;

}
