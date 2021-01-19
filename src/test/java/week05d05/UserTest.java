package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest {

    @Test
    void testCreate() {
        User user = new User("John", "Doe", "johndoe@gmail.com");
        assertEquals("John", user.getFirstName());
        assertEquals("Doe", user.getLastName());
        assertEquals("johndoe@gmail.com", user.getEmail());
    }

    @Test
    void testCreateWithInvalidEmail() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()
                -> new User("John", "Doe", "johndoe@gmailcom"));
        assertEquals("Invalid email!", iae.getMessage());
    }

    @Test
    void testCreateWithInvalidEmail2() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()
                -> new User("John", "Doe", "johndoegmail.com"));
        assertEquals("Invalid email!", iae.getMessage());
    }

    @Test
    void testGetFullName() {
        User user = new User("John", "Doe", "johndoe@gmail.com");
        assertEquals("John Doe", user.getFullName());
    }
}