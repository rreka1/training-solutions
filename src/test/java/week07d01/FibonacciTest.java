package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        assertEquals(1, Fibonacci.fib(1));
        assertEquals(1, Fibonacci.fib(2));
        assertEquals(2, Fibonacci.fib(3));
        assertEquals(3, Fibonacci.fib(4));
        assertEquals(5, Fibonacci.fib(5));
        assertEquals(8, Fibonacci.fib(6));
    }
}
