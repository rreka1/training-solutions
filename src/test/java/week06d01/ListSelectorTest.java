package week06d01;

import org.junit.jupiter.api.Test;
import week05d05.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ListSelectorTest {

    @Test
    void concatStrings() {
        List<String> strings = List.of("0", "1", "2", "3", "4", "5");
        assertEquals("[024]", new ListSelector().concatStrings(strings));
    }

    @Test
    void concatStrings2() {
        List<String> strings = List.of("0", "1", "2", "3", "4", "5", "6");
        assertEquals("[0246]", new ListSelector().concatStrings(strings));
    }

    @Test
    void concatStrings3() {
        List<String> strings = List.of("alma", "banán", "körte");
        assertEquals("[almakörte]", new ListSelector().concatStrings(strings));
    }

    @Test
    void concatStrings4() {
        List<String> strings = List.of("alma", "körte");
        assertEquals("[alma]", new ListSelector().concatStrings(strings));
    }

    @Test
    void concatStringsWithEmptyString() {
        List<String> strings = new ArrayList<>();
        assertEquals("", new ListSelector().concatStrings(strings));
    }

    @Test
    void concatStringsWithNullParameter() {
        List<String> strings = null;
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()
                -> new ListSelector().concatStrings(strings));
        assertEquals("List must not be null!", iae.getMessage());
    }
}