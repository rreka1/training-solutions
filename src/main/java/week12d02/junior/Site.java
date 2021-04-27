package week12d02.junior;

public class Site {

    private final int side;
    private final int length;
    private final Fence fence;

    public Site(int side, int length, Fence fence) {
        this.side = side;
        this.length = length;
        this.fence = fence;
    }

    @Override
    public String toString() {
        return side + " " + length + " " + fence;
    }

    public int getSide() {
        return side;
    }

    public int getLength() {
        return length;
    }

    public Fence getFence() {
        return fence;
    }
}
