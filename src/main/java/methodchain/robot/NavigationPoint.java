package methodchain.robot;

public class NavigationPoint {

    private int actualDistance;
    private int actualAzimut;

    public NavigationPoint(int actualDistance, int actualAzimut) {
        this.actualDistance = actualDistance;
        this.actualAzimut = actualAzimut;
    }

    @Override
    public String toString() {
        return "distance: " + actualDistance + " azimut: " + actualAzimut;
    }
}
