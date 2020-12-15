package interfaces.animal;

public class Lion implements Animal {

    @Override
    public String getName() {
        return "Lion";
    }

    @Override
    public int getNumberOfLegs() {
        return 4;
    }
}
