package com.example.Mapping.controller;

import com.example.Mapping.model.Laptop;
import com.example.Mapping.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class LaptopController {
    @Autowired
    private LaptopService laptopService;
    @PostMapping("/laptop")
    public void addLaptop(@RequestBody Laptop laptop){
        laptopService.addLaptop(laptop);
    }
    @GetMapping("laptop/{laptopId}")
    public Laptop getLaptopById(@PathVariable Integer laptopId){
        return laptopService.getLaptopById(laptopId);
    }
    @GetMapping("/laptop")
    public List<Laptop> getAlllaptops() {
        return laptopService.getAllLaptops();
    }
    @PutMapping("/laptop/{laptopId}")
    public Laptop updateLaptop(@PathVariable Integer laptopId,@RequestBody Laptop laptop){
        return laptopService.updateLaptop(laptopId,laptop);
    }
    @DeleteMapping("/laptop/{laptopId}")
    public void deleteLaptop(@PathVariable Integer laptopId){
        laptopService.deleteLaptop(laptopId);
    }
}

