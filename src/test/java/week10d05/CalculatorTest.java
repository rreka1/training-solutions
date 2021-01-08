package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void findMinSum() {
        Calculator calculator = new Calculator();
        assertEquals(16, calculator.findMinSum(new int[]{1, 3, 5, 7, 9}));
        assertEquals(16, calculator.findMinSum(new int[]{9, 7, 1, 5, 3}));
        assertEquals(9, calculator.findMinSum(new int[]{4, 6, 2, 3, 10, 1, 3, 7}));
        assertEquals(17, calculator.findMinSum(new int[]{9, 7, 1}));
        assertEquals(0, calculator.findMinSum(new int[]{}));
    }
}