package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    //...
    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        List<DayType> dayTypes = new ArrayList<>();
        Day day = firstDay;
        for(int i = 0; i < numberOfDays; i++) {
            dayTypes.add(day.getType());
            day = nextDay(day);
        }
        return dayTypes;
    }

    //...
    private Day nextDay(Day day) {
        Day nextDay = null;
        if(day.ordinal() == Day.values().length - 1) {
            nextDay = Day.values()[0];
        }
        else {
            nextDay = Day.values()[day.ordinal() + 1];
        }
        return nextDay;
    }
}
