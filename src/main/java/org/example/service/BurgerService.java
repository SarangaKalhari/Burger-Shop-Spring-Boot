package org.example.service;

import org.example.model.DTO.BurgerDTO;
import org.example.model.Entity.Burger;
import org.example.repository.BurgerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BurgerService {

    ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private BurgerRepository burgerRepository;

    public void addBurger(BurgerDTO burgerDTO){
        Burger burger = modelMapper.map(burgerDTO, Burger.class);
        burgerRepository.save(burger);
    }

    public void updateBurger(BurgerDTO burgerDTO){
        Burger burger = burgerRepository.findByCode(burgerDTO.getCode());

        burger.setCode(burgerDTO.getCode());
        burger.setName(burgerDTO.getName());
        burger.setType(burgerDTO.getType());
        burger.setPrice(burgerDTO.getPrice());

        burgerRepository.save(burger);
    }

}
