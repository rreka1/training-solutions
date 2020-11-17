package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersons) {
        Salesperson furthestBelowTarget = null;
        for(Salesperson salesperson : salespersons) {
            if(furthestBelowTarget == null || salesperson.getDifferenceFromTarget() < furthestBelowTarget.getDifferenceFromTarget()) {
                furthestBelowTarget = salesperson;
            }
        }
        return furthestBelowTarget;
    }
}
