package week11d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CourierTest {

    @Test
    void addRideValid() {
        Courier courier = new Courier();
        courier.addRide(new Ride(1, 1, 10));
        courier.addRide(new Ride(1, 2, 10));
        courier.addRide(new Ride(1, 3, 10));
        courier.addRide(new Ride(2, 1, 10));
        courier.addRide(new Ride(2, 2, 10));
        courier.addRide(new Ride(2, 3, 10));
        courier.addRide(new Ride(3, 1, 10));
        courier.addRide(new Ride(4, 1, 10));
        courier.addRide(new Ride(6, 1, 10));

        assertEquals(9, courier.getRides().size());
    }

    @Test
    void addRideException_Ride() throws IllegalArgumentException {
        Courier courier = new Courier();
        courier.addRide(new Ride(1, 1, 10));

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> courier.addRide(new Ride(2, 2, 10)));
        assertEquals("Invalid day or ride!", ex.getMessage());
    }

    @Test
    void addRideException_Day() throws IllegalArgumentException {
        Courier courier = new Courier();
        courier.addRide(new Ride(3, 1, 10));

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> courier.addRide(new Ride(2, 1, 10)));
        assertEquals("Invalid day or ride!", ex.getMessage());
    }

    @Test
    void firstFreeDay() {
        Courier courier = new Courier();
        courier.addRide(new Ride(1, 1, 10));
        courier.addRide(new Ride(2, 1, 10));
        courier.addRide(new Ride(2, 2, 10));
        courier.addRide(new Ride(3, 1, 10));
        courier.addRide(new Ride(8, 1, 10));

        assertEquals(4, courier.firstFreeDay());
    }

    @Test
    void firstFreeDay_1() {
        Courier courier = new Courier();
        courier.addRide(new Ride(4, 1, 10));
        courier.addRide(new Ride(6, 1, 10));
        courier.addRide(new Ride(8, 1, 10));

        assertEquals(1, courier.firstFreeDay());
    }


}