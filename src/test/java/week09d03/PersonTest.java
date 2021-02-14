package week09d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PersonTest {

    @Test
    public void testOverFourteen() {
        Person person = new Person("John Doe", 16);
        person.setPresent();
        assertNotEquals(null, person.getPresent());
        assertNotEquals(Present.TOY, person.getPresent());
    }

    @Test
    public void testUnderFourteen() {
        Person person = new Person("Jane Doe", 12);
        person.setPresent();
        assertNotEquals(null, person.getPresent());
    }
}