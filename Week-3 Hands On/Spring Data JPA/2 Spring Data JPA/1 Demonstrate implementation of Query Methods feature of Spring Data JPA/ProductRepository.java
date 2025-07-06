package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContaining(String keyword);
    List<Product> findByNameStartingWith(String prefix);
    List<Product> findAllByOrderByNameAsc();
    List<Product> findByPriceGreaterThan(double price);
    List<Product> findByPriceLessThan(double price);
    List<Product> findByCreatedDateBetween(LocalDate startDate, LocalDate endDate);
    List<Product> findTop3ByOrderByPriceDesc();
}
