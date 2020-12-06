package week06d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SeriesTest {

    @Test
    void testInc() {
        assertEquals(SeriesType.INC, new Series().calculateSeriesType(List.of(1, 2, 3, 4)));
    }

    @Test
    void testDec() {
        assertEquals(SeriesType.DEC, new Series().calculateSeriesType(List.of(4, 3, 2, 1)));
    }

    @Test
    void testRandom() {
        assertEquals(SeriesType.RAND, new Series().calculateSeriesType(List.of(4, 3, 4, 1)));
    }

    @Test
    void testException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Series().calculateSeriesType(List.of(2));
        });
    }
}
