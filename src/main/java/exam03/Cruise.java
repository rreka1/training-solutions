package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger) {
        if (boat.getMaxPassengers() > passengers.size()) {
            passengers.add(passenger);
        } else {
            throw new IllegalArgumentException("Boat " + boat.getName() + "reached the maximum number of passengers! " + boat.getMaxPassengers());
        }
    }

    public double getPriceForPassenger(Passenger passenger) {
        return basicPrice * passenger.getCruiseClass().getMultiplier();
    }

    public Passenger findPassengerByName(String name) {
        if (passengers == null || passengers.isEmpty()) {
            throw new IllegalStateException("Boat " + boat.getName() + " is empty!");
        }
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                return passenger;
            }
        }
        throw new IllegalArgumentException("Passenger " + name + " not found!");
    }

    public List<String> getPassengerNamesOrdered() {
        /*Set<String> orederedNames = new TreeSet<>();
        for (Passenger passenger : passengers) {
            orederedNames.add(passenger.getName());
        }
        return new ArrayList<>(orederedNames);*/
        List<String> names = new ArrayList<>();
        for (Passenger passenger : passengers) {
            names.add(passenger.getName());
        }
        Collections.sort(names);
        return names;
    }

    public double sumAllBookingsCharged() {
        double sum = 0;
        for (Passenger passenger : passengers) {
            sum += getPriceForPassenger(passenger);
        }
        return sum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> passengersByClass = new HashMap<>();
        for (Passenger passenger : passengers) {
            CruiseClass key = passenger.getCruiseClass();
            if (passengersByClass.containsKey(key)) {
                passengersByClass.put(key, passengersByClass.get(key) + 1);
            } else {
                passengersByClass.put(key, 1);
            }
        }
        return passengersByClass;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }
}
