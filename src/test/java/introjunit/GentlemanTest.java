package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void testByNormalName() {
        //Given
        Gentleman gentleman = new Gentleman();
        String name = "John Doe";

        //When
        String greeting = gentleman.sayHello(name);

        //Then
        assertEquals("Hello John Doe", greeting);
    }

    @Test
    void testByNull() {
        //Given
        Gentleman gentleman = new Gentleman();
        String name = null;

        //When
        String greeting = gentleman.sayHello(name);

        //Then
        assertEquals("Hello Anonymous", greeting);
    }
}
