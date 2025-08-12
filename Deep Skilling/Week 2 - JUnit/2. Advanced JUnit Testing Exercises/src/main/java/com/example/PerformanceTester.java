package com.example;

public class PerformanceTester {
    public void performTask() {
        try {
            // Simulate some work
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}