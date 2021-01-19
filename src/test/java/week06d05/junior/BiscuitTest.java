package week06d05.junior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BiscuitTest {

    @Test
    void of() {
        assertEquals(BiscuitType.OREO, Biscuit.of(BiscuitType.OREO, 100).getBiscuitType());
        assertEquals(100, Biscuit.of(BiscuitType.OREO, 100).getGramAmount());
    }
}