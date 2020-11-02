package statements;

public class Time {

    private int ora;
    private int perc;
    private int masodperc;

    public Time(int ora, int perc, int masodperc) {
        this.ora = ora;
        this.perc = perc;
        this.masodperc = masodperc;
    }

    public int getInMinutes() {
        return (ora*60 + perc);
    }

    public int getInSeconds() {
        return (ora*3600 + perc*60 + masodperc);
    }

    public boolean earlierThan(Time time) {
        return this.getInSeconds() < time.getInSeconds();
    }

    public String toString() {
        return ora + ":" + perc + ":" + masodperc;
    }

}
