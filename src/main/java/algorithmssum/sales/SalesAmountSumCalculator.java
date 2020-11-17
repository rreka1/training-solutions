package algorithmssum.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesAmountSumCalculator {

    //List<Salesperson> salespersons = new ArrayList<>();

    public int sumSalesAmount(List<Salesperson> salespersons) {
        int sum = 0;
        for(Salesperson salesperson : salespersons) {
             sum += salesperson.getAmount();
        }
        return sum;
    }
}
