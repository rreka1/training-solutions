package week05.d04;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

    private long price;
    //private String currency;
    private CurrencyType currency;

    /*public Product(long price, String currency) {
        this.price = price;
        if ("HUF".equals(currency) || "USD".equals(currency)) {
            this.currency = currency;
        } else {
            throw new IllegalArgumentException("Currency must be HUF or USD!" + currency);
        }
    }*/

    public Product(long price, CurrencyType currency) {
        this.price = price;
        this.currency = currency;
    }

    public long getPrice() {
        return price;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    /*public String getCurrency() {
        return currency;
    }*/

    /*public double convertPrice(String currency) {
        double convertedPrice = 0.0;
        if ("USD".equals(currency)) {
            convertedPrice = this.price / 300.0;
        } else if ("HUF".equals(currency)) {
            convertedPrice = this.price * 300.0;
        }
        BigDecimal bd = new BigDecimal(convertedPrice).setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }*/

    public double convertPrice(CurrencyType currency) {
        double convertedPrice = 0.0;
        if (currency.equals(CurrencyType.USD)) {
            convertedPrice = this.price / 300.0;
        } else if (currency.equals(CurrencyType.HUF)) {
            convertedPrice = this.price * 300.0;
        }
        BigDecimal bd = new BigDecimal(convertedPrice).setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
