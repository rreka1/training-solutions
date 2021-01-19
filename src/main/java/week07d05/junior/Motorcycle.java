package week07d05.junior;

public class Motorcycle extends Vehicle {

    @Override
    public TransmissionType getTransmissionType() {
        return TransmissionType.SEQUENTIAL;
    }
}
