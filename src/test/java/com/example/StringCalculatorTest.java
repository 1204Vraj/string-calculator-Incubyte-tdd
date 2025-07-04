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
        assertEquals(1002, calc.add("2,1000"));
        assertEquals(2000, calc.add("1000,1000"));
    }
    @Test
    void testMultipleNumbersCommaDelimited() {
        StringCalculator calc = new StringCalculator();
        assertEquals(14, calc.add("2,3,4,5"));
        assertEquals(0, calc.add(""));
        assertEquals(10, calc.add("10"));
    }
    @Test
    void testNewlineAndCommaDelimiters() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1\n2,3"));
        assertEquals(7, calc.add("2,2,3"));
    }
    @Test
    void testCustomDelimiter() {
        StringCalculator calc = new StringCalculator();
        assertEquals(3, calc.add("//;\n1;2"));
        assertEquals(10, calc.add("//!\n3!2!5"));
    }
    @Test
    void throwsExceptionOnNegativeNumbers() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.add("1,-2");
        });
        assertEquals("negative numbers not allowed -2", ex.getMessage());
        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.add("1,-2,-3,-5,6");
        });
        assertEquals("negative numbers not allowed -2,-3,-5", ex1.getMessage());
        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.add("//;\n1;2;-4");
        });
        assertEquals("negative numbers not allowed -4", ex2.getMessage());
        Exception ex3 = assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.add("//:\n1:-5:-3");
        });
        assertEquals("negative numbers not allowed -5,-3", ex3.getMessage());
    }
    @Test
    void testIgnoreNumbersGreaterThan1000() {
        StringCalculator calc = new StringCalculator();
        assertEquals(2, calc.add("2,1001"));
        assertEquals(5, calc.add("2,1001,3"));
        assertEquals(0, calc.add("1002,1001"));
        assertEquals(1005, calc.add("//;\n1000;1001;5"));
    }

}

