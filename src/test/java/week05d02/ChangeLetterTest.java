package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
    void testChangeVowels() {
        ChangeLetter changeLetter = new ChangeLetter();
        assertEquals("*lm*f*", changeLetter.changeVowels("almafa"));
        assertEquals("*rv*zt*r*t*k*rf*r*g*p", changeLetter.changeVowels("arvizturotukorfurogep"));
        assertEquals("*lm*f*", changeLetter.changeVowels("ALMAFA"));
    }
}
