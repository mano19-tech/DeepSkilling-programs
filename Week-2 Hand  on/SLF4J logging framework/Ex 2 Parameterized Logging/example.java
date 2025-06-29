package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ParameterizedLoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "Mano";
        int age = 25;

        logger.info("User {} has logged in.", username);
        logger.debug("User {} is {} years old.", username, age);

        double amount = 1234.56;
        logger.warn("User {} attempted to withdraw ${} but balance is low.", username, amount);

        logger.error("An unexpected error occurred for user {} at age {}", username, age);
    }
}
