
package introexception.patient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PatientTest {


    @Test
    public void invalidSsn() {
        assertThrows(IllegalArgumentException.class, () -> new Patient("John Doe", "abc", 2000));
        assertThrows(IllegalArgumentException.class, () -> new Patient("John Doe", "12345678a", 2000));
        assertThrows(IllegalArgumentException.class, () -> new Patient("", "123456789", 2000));
        assertThrows(IllegalArgumentException.class, () -> new Patient( "John Doe", "123456789", 1899));
    }

    @Test
    public void validSsn() {
        Patient patient = new Patient("John Doe", "123456788", 2000);
        assertEquals("John Doe", patient.getName());
        assertEquals("123456788", patient.getSocialSecurityNumber());
        assertEquals(2000, patient.getYearOfBirth());
    }
}