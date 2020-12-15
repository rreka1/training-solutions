package abstractclass.gamecharacter;

public class Point {

    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point point) {
        long diffX = this.x - point.x;
        long diffY = this.y - point.y;
        double powX = Math.pow(diffX, 2);
        double powY = Math.pow(diffY, 2);
        double sum = powX + powY;
        return (long) Math.sqrt(sum);
    }
}
