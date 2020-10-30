package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {

        Store store1 = new Store("alma");
        Store store2 = new Store("körte");

        System.out.println("Raktár1: " + store1.getStock() + " db " + store1.getProduct());
        System.out.println("Raktár2: " + store2.getStock() + " db " + store2.getProduct() + "\n");

        store1.store(200);
        store2.store(100);

        System.out.println("Raktár1: " + store1.getStock() + " db " + store1.getProduct());
        System.out.println("Raktár2: " + store2.getStock() + " db " + store2.getProduct() + "\n");

        store1.dispatch(50);
        store2.dispatch(10);

        System.out.println("Raktár1: " + store1.getStock() + " db " + store1.getProduct());
        System.out.println("Raktár2: " + store2.getStock() + " db " + store2.getProduct());

    }
}
