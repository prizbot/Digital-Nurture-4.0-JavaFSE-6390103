package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "Alice";
        int orderCount = 5;

        logger.info("User {} has placed {} orders.", username, orderCount);
        logger.debug("Debugging details for user: {}", username);
    }
}
