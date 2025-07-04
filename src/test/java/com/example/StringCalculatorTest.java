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
    @Test
    void testMultipleNumbersCommaDelimited() {
        StringCalculator calc = new StringCalculator();
        assertEquals(14, calc.add("2,3,4,5"));
    }
    @Test
    void testNewlineAndCommaDelimiters() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1\n2,3"));
    }
}

