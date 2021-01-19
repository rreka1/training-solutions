package week07d05.junior;

public class Car extends Vehicle {

    @Override
    public TransmissionType getTransmissionType() {
        return TransmissionType.AUTOMATIC;
    }
}
