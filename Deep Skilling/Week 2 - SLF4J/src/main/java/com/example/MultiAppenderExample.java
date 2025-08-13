package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiAppenderExample {
    private static final Logger logger = LoggerFactory.getLogger(MultiAppenderExample.class);

    public static void main(String[] args) {
        logger.info("Application started");
        logger.warn("This is a warning");
        logger.error("An error occurred");
    }
}
