package week06d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeparatedSumTest {

    /*@Test
    public void testSum() {
        SeparatedSum separatedSum = new SeparatedSum();
        assertEquals(List.of(3.0, -3.0), separatedSum.sum("1,5;-1,5;-1,5;1,5"));
        assertEquals(List.of(75.47, -28.7), separatedSum.sum("65,67;6,8;3;-12;-16,7"));
    }*/

    @Test
    public void testSum() {
        SeparatedSum separatedSum = new SeparatedSum();
        SumResult result = separatedSum.sum("1,5;-1,5;-1,5;1,5");
        assertEquals(-3.0, result.getNegativeSum());
        assertEquals(3.0, result.getPositiveSum());
        SumResult result2 = separatedSum.sum("65,67;6,8;3;-12;-16,7");
        assertEquals(-28.7, result2.getNegativeSum());
        assertEquals(75.47, result2.getPositiveSum());
    }
}
