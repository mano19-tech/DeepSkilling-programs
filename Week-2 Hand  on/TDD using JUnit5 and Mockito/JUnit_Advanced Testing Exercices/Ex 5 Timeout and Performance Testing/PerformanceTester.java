package com.example;

public class PerformanceTester {
    public void performTask() {
        // Simulate some work (e.g., a long computation or I/O task)
        try {
            Thread.sleep(400);  // Simulates a delay of 400 milliseconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
