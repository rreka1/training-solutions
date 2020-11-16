package week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameChangerTest {

    @Test
    void testNameChange() {
        NameChanger nameChanger = new NameChanger("Nagy Zoltán");
        nameChanger.changeFirstName("Kis");
        assertEquals("Kis Zoltán", nameChanger.getFullName());

    }
}
