package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaneTest {

    @Test
    public void testFlyOverMapWithMaxOcean() {
        Plane plane = new Plane();
        assertEquals(16, plane.flyOverMapWithMaxOcean("map.txt"));
    }
}
