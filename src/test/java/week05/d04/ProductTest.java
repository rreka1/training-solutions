package week05.d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    /*@Test
    public void testConvertPrice() {
        Product product1 = new Product(150, "HUF");
        Product product2 = new Product(1, "USD");
        Product product3 = new Product(1000, "HUF");
        Product product4 = new Product(235, "USD");
        Product product5 = new Product(15678, "HUF");

        assertEquals(0.5, product1.convertPrice("USD"));
        assertEquals(300, product2.convertPrice("HUF"));
        assertEquals(3.3, product3.convertPrice("USD"));
        assertEquals(70500, product4.convertPrice("HUF"));
        assertEquals(52.3, product5.convertPrice("USD"));
    }*/

    @Test
    public void testConvertPrice() {
        Product product1 = new Product(150, CurrencyType.HUF);
        Product product2 = new Product(1, CurrencyType.USD);
        Product product3 = new Product(1000, CurrencyType.HUF);
        Product product4 = new Product(235, CurrencyType.USD);
        Product product5 = new Product(15678, CurrencyType.HUF);

        assertEquals(0.5, product1.convertPrice(CurrencyType.USD));
        assertEquals(300, product2.convertPrice(CurrencyType.HUF));
        assertEquals(3.3, product3.convertPrice(CurrencyType.USD));
        assertEquals(70500, product4.convertPrice(CurrencyType.HUF));
        assertEquals(52.3, product5.convertPrice(CurrencyType.USD));
    }
}
