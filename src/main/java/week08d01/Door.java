package week08d01;

public class Door {

    private int numberOfDoor;
    private boolean isOpen;

    public Door(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
        this.isOpen = false;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void turnTheKey() {
        isOpen = !isOpen;
    }

    @Override
    public String toString() {
        return numberOfDoor + (isOpen ? " opened" : " closed");
    }
}
