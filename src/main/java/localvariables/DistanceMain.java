package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(45.6, true);

        boolean isexact = distance.isExact();
        System.out.println(distance.getDistanceInKm() + " " + isexact);

        int distance2 = (int) distance.getDistanceInKm();
        System.out.println(distance2);

    }
}
