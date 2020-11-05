package finalmodifier;

public class PiMain {

    public static void main(String[] args) {

        System.out.println("Pi " + CircleCalculator.PI);

        CircleCalculator circle = new CircleCalculator();
        System.out.println("Circle perimeter: " + circle.calculatePerimeter(4.5));
        System.out.println("Circle area: " + circle.calculateArea(8.9));


        CylinderCalculator cylinder = new CylinderCalculator();
        System.out.println("Cylinder volume: " + cylinder.calculateVolume(5.8, 7.6));
        System.out.println("Cylinder surface area: " + cylinder.calculateSurfaceArea(4.7, 9.5));
    }
}
