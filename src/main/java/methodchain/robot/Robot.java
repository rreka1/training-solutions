package methodchain.robot;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance;
    private int azimut;
    private List<NavigationPoint> navigationList = new ArrayList<>();

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }

    public List<NavigationPoint> getNavigationList() {
        return navigationList;
    }

    public Robot go(int meter) {
        distance += meter;
        return this;
    }

    public Robot rotate(int angle) {
        azimut += angle;
        return this;
    }

    public Robot registerNavigationPoint() {
        navigationList.add(new NavigationPoint(getDistance(), getAzimut()));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (NavigationPoint navigationPoint : navigationList) {
            sb.append(navigationPoint.toString()).append(", ");
        }
        return sb.delete(sb.length() - 2, sb.length()).toString();
    }
}
