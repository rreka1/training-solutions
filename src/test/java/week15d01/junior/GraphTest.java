package week15d01.junior;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void maxEntryTest() {
        Graph graph = new Graph();
        Map<Double, Double> points = new HashMap<>();
        points.put(4.0, 5.0);
        points.put(7.0, 2.0);
        points.put(1.0, 2.0);
        points.put(9.0, 1.0);
        points.put(6.0, 9.0);
        points.put(8.0, 8.0);

        Map.Entry<Double, Double> result = graph.maxEntry(points);
        assertEquals(6.0, result.getKey());
        assertEquals(9.0, result.getValue());
    }
}