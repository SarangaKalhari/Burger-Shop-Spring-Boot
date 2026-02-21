package org.example.model.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "burger")
public class Burger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;
    private String name;
    private String type;
    private double price;

}
