package interfaces.animal;

public class Worm implements Animal {

    @Override
    public String getName() {
        return "Worm";
    }

    @Override
    public int getNumberOfLegs() {
        return 0;
    }
}
