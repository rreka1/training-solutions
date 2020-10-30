package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Termék neve: ");
        String name = scanner.nextLine();

        System.out.print("Termék ára: ");
        int price = scanner.nextInt();

        Product product = new Product(name, price);

        product.decreasePrice(300);
        System.out.println(product.getName() + " csökkentett ára: " + product.getPrice());

        product.increasePrice(300);
        System.out.println(product.getName() + " megnövelt ára: " + product.getPrice());
    }
}
