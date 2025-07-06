package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.Product;
import com.example.springdatajpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public List<Product> search(@RequestParam String keyword) {
        return productService.searchByKeyword(keyword);
    }

    @GetMapping("/filter/prefix")
    public List<Product> filterByPrefix(@RequestParam String prefix) {
        return productService.filterByPrefix(prefix);
    }

    @GetMapping("/sorted")
    public List<Product> sortedByName() {
        return productService.getAllSortedByName();
    }

    @GetMapping("/expensive")
    public List<Product> expensiveProducts(@RequestParam double minPrice) {
        return productService.getExpensiveProducts(minPrice);
    }

    @GetMapping("/cheap")
    public List<Product> cheapProducts(@RequestParam double maxPrice) {
        return productService.getCheaperProducts(maxPrice);
    }

    @GetMapping("/date-range")
    public List<Product> productsByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {
        return productService.getProductsByDateRange(from, to);
    }

    @GetMapping("/top3")
    public List<Product> top3Expensive() {
        return productService.getTop3Expensive();
    }
}
