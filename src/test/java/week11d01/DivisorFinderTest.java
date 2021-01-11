package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisorFinderTest {

    @Test
    void findDivisors() {
        DivisorFinder df = new DivisorFinder();
        assertEquals(1, df.findDivisors(425));
        assertEquals(2, df.findDivisors(15));
        assertEquals(1, df.findDivisors(30));
    }
}