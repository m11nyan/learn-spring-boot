package com.example.learn.learn_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learn.learn_spring_boot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query methods can be defined here if needed
    

}
