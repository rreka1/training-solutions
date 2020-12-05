package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        List<SimpleTime> timeTable = new ArrayList<>();
        int numberOfBuses = lastHour - firstHour;
        for (int i = 0; i <= numberOfBuses; i++) {
            timeTable.add(new SimpleTime(firstHour + i, everyMinute));
        }
        this.timeTable = timeTable;
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime nextBus(SimpleTime actual) {
        for (SimpleTime simpleTime : timeTable) {
            if (simpleTime.difference(actual) >= 0) {
                return simpleTime;
            }
        }
        throw new IllegalStateException("No more buses today!");
    }

    public SimpleTime firstBus() {
        SimpleTime first = null;
        for (SimpleTime simpleTime : timeTable) {
            if (first == null || simpleTime.difference(first) <= 0) {
                first = simpleTime;
            }
        }
        return first;
    }
}
