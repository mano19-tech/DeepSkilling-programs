package com.example;

public class MyLoggerService {
    private final Logger logger;

    public MyLoggerService(Logger logger) {
        this.logger = logger;
    }

    public void doSomething() {
        // Call the logger with a specific message and level
        logger.log("INFO", "Task completed successfully");
    }
}
