package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class SportGadgetStore {

    private final List<Product> products;

    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }

    public long getNumberOfProducts() {
        return products.stream()
                .mapToInt(Product::getNumber)
                .sum();
    }

    public double getAveragePrice() {
        OptionalDouble average = products.stream()
                .mapToDouble(Product::getPrice)
                .average();
        if (average.isPresent()) {
            return average.getAsDouble();
        }
        return 0;
    }

    public String getExpensiveProductStatistics(double minPrice) {
        IntSummaryStatistics stat = products.stream()
                .filter(product -> product.getPrice() > minPrice)
                .mapToInt(Product::getNumber)
                .summaryStatistics();
        if (stat.getCount() > 0) {
            StringBuilder sb = new StringBuilder("Összesen ")
                    .append(stat.getCount())
                    .append(" féle termék, amelyekből minimum ")
                    .append(stat.getMin())
                    .append(" db, maximum ")
                    .append(stat.getMax())
                    .append(" db, összesen ")
                    .append(stat.getSum())
                    .append(" db van.");
            return sb.toString();
        }
        return "Nincs ilyen termék.";
    }
}
