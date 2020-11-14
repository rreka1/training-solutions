package controlselection.greetings;

import java.sql.SQLOutput;

public class Greetings {

    public String greet(int hour, int minutes) {

        if(hour == 5 && minutes >= 1) { //5:01-től 5:59-ig
            return "jó reggelt";
        }
        else if(hour > 5 && minutes >= 0 && hour < 9) { //6:00-tól 8:59-ig
            return "jó reggelt";
        }
        else if(hour == 9 && minutes == 0) { //9:00
            return "jó reggelt";
        }
        else if(((hour == 9 && minutes >= 1) || (hour > 9 && hour < 18) || (hour == 18 && minutes <= 30))) {
            return "jó napot";
        }
        else if((hour == 18 && minutes > 30) && hour < 20 || (hour == 20 && minutes == 0)) {
            return "jó estét";
        }
        else {
            return "jó éjt";
        }
    }
}
