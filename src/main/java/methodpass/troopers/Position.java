package methodpass.troopers;

public class Position {

    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double distanceFrom(Position position) {
        double x = Math.pow(this.posX - position.posX, 2);
        double y = Math.pow(this.posY - position.posY, 2);
        double distance = Math.sqrt(x + y);
        return distance;
    }
}
