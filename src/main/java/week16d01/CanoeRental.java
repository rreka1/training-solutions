package week16d01;

import java.time.Duration;
import java.time.LocalDateTime;

public class CanoeRental implements Comparable<CanoeRental> {

    //Írj egy olyan CanoeRental osztályt, amely String name, CanoeType canoeType, LocalDateTime startTime, LocalDateTime endTime
    //attribútumokban tárolja egy kenu kölcsönzés kölcsönzési adatait.
    //Publikus metódusok:
    //public CanoeRental(String name, CanoeType canoeType, String dateTimeString)
    //public void setEndTime(LocalDateTime endTime)
    //public double calculateRentalSum()

    //Minden kölcsönzés aktív, amíg vissza nem hozták a kenut, azaz ki nem töltötték az endTime értékét.

    private String name;
    private CanoeType canoeType; //A CanoeType egy enum, mely értékei: RED, GREEN és BLUE.
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public CanoeRental(String name, CanoeType canoeType, String dateTimeString) {
        this.name = name;
        this.canoeType = canoeType;
        this.startTime = LocalDateTime.parse(dateTimeString);
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double calculateRentalSum() {
        if (Duration.between(startTime, endTime).toMinutes() < 60) {
            return 1;
        } else {
            return Duration.between(startTime, endTime).toMinutes() / 60.0;
        }
    }

    @Override
    public int compareTo(CanoeRental o) {
        return this.startTime.compareTo(o.startTime);
    }

    public String getName() {
        return name;
    }

    public CanoeType getCanoeType() {
        return canoeType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "CanoeRental{" +
                "name='" + name + '\'' +
                ", canoeType=" + canoeType +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
