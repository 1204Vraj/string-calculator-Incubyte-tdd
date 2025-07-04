package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void testEmptyStringReturnsZero() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""));
    }
    @Test
    void testSingleNumberReturnsItself() {
        StringCalculator calc = new StringCalculator();
        assertEquals(1, calc.add("1"));
    }
    @Test
    void testTwoNumbersCommaDelimited() {
        StringCalculator calc = new StringCalculator();
        assertEquals(5, calc.add("2,3"));
    }

}

