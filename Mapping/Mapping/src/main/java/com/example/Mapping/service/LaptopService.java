package com.example.Mapping.service;

import com.example.Mapping.Repository.LaptopRepository;
import com.example.Mapping.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LaptopService {
    @Autowired
    private LaptopRepository  laptopRepository;
    public void addLaptop(Laptop laptop) {
        laptopRepository.save(laptop);
    }

    public Laptop getLaptopById(Integer laptopId) {
        return laptopRepository.findById(laptopId).get();
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }

    public Laptop updateLaptop(Integer laptopId, Laptop laptop) {
        Laptop laptop1=laptopRepository.findById(laptopId).get();
        laptop1.setBrand(laptop.getBrand());
        laptop1.setName(laptop.getName());
        laptop1.setPrice(laptop.getPrice());
        return laptopRepository.save(laptop1);
    }

    public void deleteLaptop(Integer laptopId) {
        laptopRepository.deleteById(laptopId);
    }
}

