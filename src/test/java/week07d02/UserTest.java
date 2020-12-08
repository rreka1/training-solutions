package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testGetUsername() {
        UserImpl user = new UserImpl("johndoe", "John", "Doe");
        assertEquals("johndoe", user.getUsername());
    }

    @Test
    public void testGetFirstName() {
        UserImpl user = new UserImpl("johndoe", "John", "Doe");
        assertEquals("John", user.getFirstName());
    }

    @Test
    public void testGetLastName() {
        UserImpl user = new UserImpl("johndoe", "John", "Doe");
        assertEquals("Doe", user.getLastName());
    }

    @Test
    public void testGetFullName() {
        User user = new UserImpl("johndoe", "John", "Doe");
        assertEquals("John Doe", user.getFullName());
    }

    @Test
    public void testOf() {
        User user = User.of("johndoe", "John", "Doe");
        assertEquals("John Doe", user.getFullName());
        assertEquals("johndoe", user.getUsername());
        assertEquals("John", user.getFirstName());
        assertEquals("Doe", user.getLastName());
    }
}
