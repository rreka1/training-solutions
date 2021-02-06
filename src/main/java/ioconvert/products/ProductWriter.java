package ioconvert.products;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

public class ProductWriter {

    public void saveProduct(OutputStream outputStream, List<Product> products) {
        try (PrintStream ps = new PrintStream(new BufferedOutputStream(outputStream))) {
            for (Product product : products) {
                ps.println(product.getName() + ";" + product.getPrice());
            }
        }
    }
}
