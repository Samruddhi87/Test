package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
