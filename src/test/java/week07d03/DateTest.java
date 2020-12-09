package week07d03;

import org.junit.jupiter.api.Test;
import week06d03.Series;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateTest {

    @Test
    public void testCreate() {
        Date date = new Date(1964, 10, 12);
        assertEquals(1964, date.getYear());
        assertEquals(10, date.getMonth());
        assertEquals(12, date.getDay());
    }

    @Test
    public void testCreateWithStaticOf() {
        Date date = Date.of(1980, 11, 30);
        assertEquals(1980, date.getYear());
        assertEquals(11, date.getMonth());
        assertEquals(30, date.getDay());
    }

    @Test
    public void testWithYear() {
        Date date = Date.of(1980, 11, 30);
        assertEquals(1990, date.withYear(1990).getYear());
        assertEquals(11, date.getMonth());
        assertEquals(30, date.getDay());
    }

    @Test
    public void testWithMonth() {
        Date date = Date.of(1980, 11, 30);
        assertEquals(4, date.withMonth(4).getMonth());
        assertEquals(1980, date.getYear());
        assertEquals(30, date.getDay());
    }

    @Test
    public void testWithDay() {
        Date date = Date.of(1980, 11, 30);
        assertEquals(5, date.withDay(5).getDay());
        assertEquals(1980, date.getYear());
        assertEquals(11, date.getMonth());
    }

    @Test
    void testException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Date(1990, 13, 1);
        });
    }
}
