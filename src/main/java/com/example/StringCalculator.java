package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringCalculator {
    public static int add(String input) {
        if (input.isEmpty()) return 0;

        String delimiters = ",|\n";
        String numbers = input;

        // Custom delimiter format: //;\n1;2
        if (input.startsWith("//")) {
            int newlineIndex = input.indexOf('\n');
            String customDelimiter = input.substring(2, newlineIndex);
            delimiters = Pattern.quote(customDelimiter);
            numbers = input.substring(newlineIndex + 1);
        }

        // Custom delimiter format with multiple characters: //[**]\n1**2
        if (input.startsWith("//[")) {
            int idx = input.indexOf("]\n");
            delimiters = Pattern.quote(input.substring(3, idx));
            numbers = input.substring(idx + 2);
        }


        String[] parts = numbers.split(delimiters);
        int sum = 0;
        List<Integer> negatives = new ArrayList<>();

        for (String part : parts) {
            if (!part.isEmpty()) {
                int num = Integer.parseInt(part);
                if (num < 0) {
                    negatives.add(num);
                }
                if( num > 1000) {
                    continue; // Ignore numbers greater than 1000
                }
                sum += num;
            }
        }

        // Throw exception if there are any negative numbers
        if (!negatives.isEmpty()) {
            String message = "negative numbers not allowed " +
                    String.join(",", negatives.stream().map(String::valueOf).toList());
            throw new IllegalArgumentException(message);
        }

        return sum;
    }
}
