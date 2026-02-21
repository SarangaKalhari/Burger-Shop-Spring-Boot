package org.example.service;

import org.example.model.DTO.BurgerDTO;
import org.example.model.Entity.Burger;
import org.example.repository.BurgerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void deleteBurger(long id){
        burgerRepository.deleteById(id);
    }

    public List<BurgerDTO> getAllBurgers() {
        List<Burger> burgers = burgerRepository.findAll();

        return burgers.stream()
                .map(burger -> modelMapper.map(burger, BurgerDTO.class))
                .toList();
    }

    public BurgerDTO searchBurger(String code) {
        Burger burger = burgerRepository.findByCode(code);
        BurgerDTO burgerDTO = modelMapper.map(burger, BurgerDTO.class);
        return burgerDTO;
    }
}
