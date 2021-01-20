package week12d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberStatTest {

    @Test
    void findNumber() {
        NumberStat ns = new NumberStat();
        List<Integer> numbers1 = List.of(1, 1, 5, 3, 4, 5, 6, 5, 6, 4, 1, 6, 5, 4);
        List<Integer> numbers2 = List.of(1, 1, 5, 3, 3, 5, 6, 5, 6, 1, 6, 5, 4);
        assertEquals(3, ns.findNumber(numbers1));
        assertEquals(4, ns.findNumber(numbers2));
    }
}