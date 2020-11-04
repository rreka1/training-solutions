package week02;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product p) {

        if(this.name.equals(p.name) && (  Math.abs(this.code.length()-p.code.length()) <= 1 )) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Product p1 = new Product("valami", "367245");
        Product p2 = new Product("valami2", "28378394798");
        Product p3 = new Product("valami2", "8748371");
        Product p4 = new Product("valami2", "874837");

        System.out.println("p1 és p2 egyenlő? " + p1.areTheyEqual(p2));
        System.out.println("p1 és p3 egyenlő? " + p1.areTheyEqual(p3));
        System.out.println("p2 és p3 egyenlő? " + p2.areTheyEqual(p3));
        System.out.println("p3 és p4 egyenlő? " + p3.areTheyEqual(p4));

    }

}
