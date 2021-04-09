package com.mor40.springbootexercise.repository;

import com.mor40.springbootexercise.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer > {
    Product findByName(String name);
}
