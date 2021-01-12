package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        if (validRide(ride)) {
            rides.add(ride);
        }
    }

    public int firstFreeDay() {
        if (rides.get(0).getNumOfDay() != 1) {
            return 1;
        }
        for (int i = 0; i < rides.size() - 1; i++) {
            int actual = rides.get(i).getNumOfDay();
            int next = rides.get(i + 1).getNumOfDay();
            if (actual != next && actual + 1 != next) {
                return actual + 1;
            }
        }
        return -1;
    }

    private boolean validRide(Ride ride) {
        if (rides.isEmpty() && ride.getNumOfRide() == 1) {
            return true;
        }
        if (ride.getNumOfDay() == rides.get(rides.size() - 1).getNumOfDay()
                && ride.getNumOfRide() == rides.get(rides.size() - 1).getNumOfRide() + 1) {
            return true;
        }
        if (ride.getNumOfDay() > rides.get(rides.size() - 1).getNumOfDay()
                && ride.getNumOfRide() == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid day or ride!");
    }

    public List<Ride> getRides() {
        return rides;
    }
}
