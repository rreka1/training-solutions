package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersons) {
        Salesperson maxSales = null;
        for(Salesperson salesperson : salespersons) {
            if(maxSales == null || salesperson.getAmount() > maxSales.getAmount()) {
                maxSales = salesperson;
            }
        }
        return maxSales;
    }
}
