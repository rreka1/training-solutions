package week07d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumberListTest {

    @Test
    public void testIncreasing() {
        assertTrue(NumberList.isIncreasing(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        assertTrue(NumberList.isIncreasing(List.of(1, 1, 1, 2, 3, 6, 6, 7, 7)));
        assertTrue(NumberList.isIncreasing(List.of(1, 1, 1, 1, 1, 1, 1, 1, 1)));
    }

    @Test
    public void testNotIncreasing() {
        assertFalse(NumberList.isIncreasing(List.of(9, 8, 7, 6, 5, 4, 3, 2, 1)));
        assertFalse(NumberList.isIncreasing(List.of(1, 2, 3, 4, 2, 3, 4, 5, 6)));
        assertFalse(NumberList.isIncreasing(List.of(1, 1, 1, 1, 1, 1, 1, 1, 0)));
    }

    @Test
    void testException() {
        assertThrows(IllegalArgumentException.class, () -> {
            NumberList.isIncreasing(List.of(5));
        });
    }
}
