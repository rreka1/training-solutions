package week06d04.junior;

public class Item {

    private String name;
    private int price;
    private int month;

    public Item(String name, int price, int month) {
        this.name = name;
        this.price = price;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }
}
