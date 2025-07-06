package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Product;
import com.example.springdatajpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> searchByKeyword(String keyword) {
        return productRepository.findByNameContaining(keyword);
    }

    public List<Product> filterByPrefix(String prefix) {
        return productRepository.findByNameStartingWith(prefix);
    }

    public List<Product> getAllSortedByName() {
        return productRepository.findAllByOrderByNameAsc();
    }

    public List<Product> getExpensiveProducts(double price) {
        return productRepository.findByPriceGreaterThan(price);
    }

    public List<Product> getCheaperProducts(double price) {
        return productRepository.findByPriceLessThan(price);
    }

    public List<Product> getProductsByDateRange(LocalDate from, LocalDate to) {
        return productRepository.findByCreatedDateBetween(from, to);
    }

    public List<Product> getTop3Expensive() {
        return productRepository.findTop3ByOrderByPriceDesc();
    }
}
