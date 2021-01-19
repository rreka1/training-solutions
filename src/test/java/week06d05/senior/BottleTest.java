package week06d05.senior;

import org.junit.jupiter.api.Test;
import week06d01.ListSelector;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BottleTest {

    @Test
    void of() {
        Bottle bottle1 = Bottle.of(BottleType.GLASS_BOTTLE);
        Bottle bottle2 = Bottle.of(BottleType.PET_BOTTLE);

        assertEquals(BottleType.GLASS_BOTTLE, bottle1.getBottleType());
        assertEquals(0, bottle1.getFilledUntil());
        assertEquals(BottleType.PET_BOTTLE, bottle2.getBottleType());
        assertEquals(0, bottle2.getFilledUntil());
    }

    @Test
    void fill() {
        Bottle bottle1 = Bottle.of(BottleType.GLASS_BOTTLE);
        Bottle bottle2 = Bottle.of(BottleType.PET_BOTTLE);

        bottle1.fill(50);
        bottle2.fill(300);
        assertEquals(50, bottle1.getFilledUntil());
        assertEquals(300, bottle2.getFilledUntil());

        bottle1.fill(50);
        bottle2.fill(200);
        assertEquals(100, bottle1.getFilledUntil());
        assertEquals(500, bottle2.getFilledUntil());
    }

    @Test
    void fillOverflowException() {
        Bottle bottle1 = Bottle.of(BottleType.GLASS_BOTTLE);
        Bottle bottle2 = Bottle.of(BottleType.PET_BOTTLE);
        bottle2.fill(400);

        IllegalStateException ise = assertThrows(IllegalStateException.class, ()
                -> bottle1.fill(101));
        assertEquals("Overflow!", ise.getMessage());

        IllegalStateException ise2 = assertThrows(IllegalStateException.class, ()
                -> bottle2.fill(101));
        assertEquals("Overflow!", ise2.getMessage());
    }
}