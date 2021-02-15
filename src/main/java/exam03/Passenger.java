package exam03;

public class Passenger implements Comparable<Passenger> {

    private String name;
    private CruiseClass cruiseClass;

    public Passenger(String name, CruiseClass cruiseClass) {
        this.name = name;
        this.cruiseClass = cruiseClass;
    }

    @Override
    public int compareTo(Passenger o) {
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public CruiseClass getCruiseClass() {
        return cruiseClass;
    }
}
