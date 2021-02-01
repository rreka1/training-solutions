package ioreadwritebytes.temperatures;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double sumOfTemperatures = 0.0;
        for (int i = 0; i < data.length; i++) {
            sumOfTemperatures += data[i];
        }
        return sumOfTemperatures / data.length;
    }

    public double getMonthAverage() {
        double sumOfTemperatures = 0.0;
        for (int i = data.length - 1; i > data.length - 31; i--) {
            sumOfTemperatures += data[i];
        }
        return sumOfTemperatures / 30;
    }
}
