package methodoverloading;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(Time time) {
        this.hours = time.getHours();
        this.minutes = time.getMinutes();
        this.seconds = time.getSeconds();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isEqual(Time time) {
        if (this.hours == time.hours) {
            if (this.minutes == time.minutes) {
                if (this.seconds == time.seconds) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        if (this.hours == hours) {
            if (this.minutes == minutes) {
                if (this.seconds == seconds) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isEarlier(Time time) {
        if (this.hours < time.hours) {
            return true;
        }
        if (this.hours == time.hours && this.minutes < time.minutes) {
            return true;
        }
        if (this.hours == time.hours && this.minutes == time.minutes && this.seconds < this.seconds) {
            return true;
        }
        return false;
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        if (this.hours < hours) {
            return true;
        }
        if (this.hours == hours && this.minutes < minutes) {
            return true;
        }
        if (this.hours == hours && this.minutes == minutes && this.seconds < this.seconds) {
            return true;
        }
        return false;
    }
}
