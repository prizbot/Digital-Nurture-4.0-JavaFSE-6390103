package com.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Logging some debug info...");

        if (logger1 == logger2) {
            System.out.println("Same Logger instance is being used across the application.");
        } else {
            System.out.println("Different instances - Singleton not working.");
        }
    }
}