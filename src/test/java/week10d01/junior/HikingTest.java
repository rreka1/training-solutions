package week10d01.junior;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HikingTest {

    @Test
    void testGetPlusElevations() {
        Hiking hiking = new Hiking();
        double result = hiking.getPlusElevations(List.of(10.0, 20.0, 15.0, 18.0));
        assertEquals(13.0, result);
    }
}