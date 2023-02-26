package com.example.Mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

//@Table(name="tbl_Address")
public class Address {
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;
}
