package week10d02.junior;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxTravelTest {

    @Test
    void getMaxIndex() {
        MaxTravel mt = new MaxTravel();
        List<Integer> numbers1 = List.of(12, 12, 0, 3, 4, 4, 12);
        List<Integer> numbers2 = List.of(12, 12, 0, 3, 4, 4, 12, 3, 4, 5, 3, 3);
        int max1 = mt.getMaxIndex(numbers1);
        int max2 = mt.getMaxIndex(numbers2);
        assertEquals(12, max1);
        assertEquals(3, max2);
    }
}