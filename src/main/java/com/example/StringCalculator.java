package com.example;

public class StringCalculator {
    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        String[] parts = input.split(",");
        if (parts.length == 1) return Integer.parseInt(parts[0]);
        return Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
    }
}
