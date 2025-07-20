package com.example.orderservice.Controller;

import com.example.orderservice.Entity.Order;
import com.example.orderservice.Repository.OrderRepository;
import com.example.orderservice.Service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserClient userClient;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        // Optionally call userClient.getUserById(order.getUserId());
        return orderRepository.save(order);
    }

    @GetMapping("/user/{userId}")
    public List<Order> getOrdersByUser(@PathVariable Long userId) {
        return orderRepository.findByUserId(userId);
    }
}
