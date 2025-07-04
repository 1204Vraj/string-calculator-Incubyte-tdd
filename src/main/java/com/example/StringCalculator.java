package com.example;

import java.util.regex.Pattern;

public class StringCalculator {
    public static int add(String input) {
        if (input.isEmpty()) return 0;

        String delimiters = ",|\n";
        String numbers = input;

        if (input.startsWith("//")) {
            int newlineIndex = input.indexOf('\n');
            String customDelimiter = input.substring(2, newlineIndex);
            delimiters = Pattern.quote(customDelimiter);
            numbers = input.substring(newlineIndex + 1);
        }

        String[] parts = numbers.split(delimiters);
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        return sum;
    }
}
