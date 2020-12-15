package interfaces.animal;

public class Duck implements Animal {

    @Override
    public String getName() {
        return "Duck";
    }

    @Override
    public int getNumberOfLegs() {
        return 2;
    }
}
