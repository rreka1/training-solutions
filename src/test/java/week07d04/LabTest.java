package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LabTest {

    @Test
    public void testCreateWithTitle() {
        Lab lab = new Lab("Java SE haladó");
        assertEquals("Java SE haladó", lab.getTitle());
        assertFalse(lab.isCompleted());
        assertEquals(null, lab.getCompletedAt());
        assertEquals("Java SE haladó: not completed yet!", lab.toString());
    }

    @Test
    public void testCreateWithTitleAndDate() {
        Lab lab = new Lab("Java SE alapok", LocalDate.of(2020, 01, 01));
        assertEquals("Java SE alapok", lab.getTitle());
        assertTrue(lab.isCompleted());
        assertEquals("2020-01-01", lab.getCompletedAt().toString());
        assertTrue(LocalDate.of(2020, 01, 01).equals(lab.getCompletedAt()));
        assertEquals("Java SE alapok: completed at 2020-01-01", lab.toString());
    }

    @Test
    public void testCompleteWithDate() {
        Lab lab = new Lab("Java SE haladó");
        lab.complete(LocalDate.of(2020, 01, 02));
        assertEquals("Java SE haladó: completed at 2020-01-02", lab.toString());
    }

    @Test
    public void testCompleteNow() {
        Lab lab = new Lab("Java SE haladó");
        lab.complete();
        assertEquals("Java SE haladó: completed at " + LocalDate.now(), lab.toString());
    }

    @Test
    public void testEmptyTitle() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Lab("");
        });
        assertEquals("Title must not be empty!", ex.getMessage());
    }

    @Test
    public void testNullTitle() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Lab(null);
        });
        assertEquals("Title must not be empty!", ex.getMessage());
    }

    @Test
    public void testInvalidDate() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Lab("Java SE alapok", LocalDate.of(2009, 10, 10));
        });
        assertEquals("Invalid date! 2009-10-10", ex.getMessage());
    }

    @Test
    public void testInvalidDate_2() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Lab("Java SE alapok", LocalDate.of(2030, 12, 11));
        });
        assertEquals("Invalid date! 2030-12-11", ex.getMessage());
    }
}
