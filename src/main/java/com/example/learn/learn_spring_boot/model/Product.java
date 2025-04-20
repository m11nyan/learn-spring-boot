package com.example.learn.learn_spring_boot.model;

import java.time.Year;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotNull(message ="Product Type can not be null")
    private ProductType productType;

    @NotBlank(message ="Brand can not be null")
    private String brand;

    @NotBlank(message ="Model can not be null")
    private String model;

    @NotNull(message ="Product Price can not be null")
    @Positive
    private Double price;

    @NotNull(message ="Product Year can not be null")
    private Year year;
}
