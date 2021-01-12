package week11d02;

public class Ride {

    private int numOfDay;
    private int numOfRide;
    private int distanceOfRide;

    public Ride(int numOfDay, int numOfRide, int distanceOfRide) {
        this.numOfDay = numOfDay;
        this.numOfRide = numOfRide;
        this.distanceOfRide = distanceOfRide;
    }

    public int getNumOfDay() {
        return numOfDay;
    }

    public int getNumOfRide() {
        return numOfRide;
    }

    public int getDistanceOfRide() {
        return distanceOfRide;
    }
}
