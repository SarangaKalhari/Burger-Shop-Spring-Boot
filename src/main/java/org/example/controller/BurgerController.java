package org.example.controller;

import org.example.model.DTO.BurgerDTO;
import org.example.service.BurgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("burger")
public class BurgerController {

    @Autowired
    private BurgerService burgerService;

    @GetMapping
    public String burgers(){
        return "Burger Page..";
    }

    @PutMapping("/add")
    public String addBurger(@RequestBody BurgerDTO burgerDTO){
        burgerService.addBurger(burgerDTO);
        return "Added Successfully..!! ";
    }

    @PostMapping("/update")
    public String updateBurger(@RequestBody BurgerDTO burgerDTO){
        burgerService.updateBurger(burgerDTO);
        return "Updated Success..";
    }
}
