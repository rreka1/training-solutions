package week08d01;

import java.util.ArrayList;
import java.util.List;

public class Sultan {

    private static final int NUM_OF_DOORS = 100;
    private static final int NUM_OF_DAYS = 100;
    private List<Door> doors = new ArrayList<>();

    {
        for (int i = 1; i <= NUM_OF_DOORS; i++) {
            doors.add(new Door(i));
        }
    }

    public List<Door> openDoorsRecursive(int day) {
        for (Door door : doors) {
            if (door.getNumberOfDoor() % day == 0) {
                door.turnTheKey();
            }
        }
        if ((day + 1) <= NUM_OF_DAYS) {
            openDoorsRecursive(day + 1);
        }
        return openedDoors();
    }

    public List<Door> openDoors() {
        for (int day = 1; day <= NUM_OF_DAYS; day++) {
            turn(day);
        }
        return openedDoors();
    }

    private void turn(int actualDay) {
        for (Door door : doors) {
            if (door.getNumberOfDoor() % actualDay == 0) {
                door.turnTheKey();
            }
        }
        //System.out.println("DAY_" + actualDay + " " + doors);
    }

    private List<Door> openedDoors() {
        List<Door> opened = new ArrayList<>();
        for (Door door : doors) {
            if (door.isOpen()) {
                opened.add(door);
            }
        }
        return opened;
    }

    public static void main(String[] args) {
        Sultan sultan = new Sultan();

        List<Door> opened_doors = sultan.openDoors();
        System.out.println(opened_doors);
        System.out.println(opened_doors.size());

        //List<Door> opened_doors = sultan.openDoorsRecursive(1);
        //System.out.println(opened_doors);
        //System.out.println(opened_doors.size());
    }
}
