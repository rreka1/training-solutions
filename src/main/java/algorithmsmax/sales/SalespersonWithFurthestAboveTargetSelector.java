package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons) {
        Salesperson furthestAboveTarget = null;
        for(Salesperson salesperson : salespersons) {
            if(furthestAboveTarget == null || salesperson.getDifferenceFromTarget() > furthestAboveTarget.getDifferenceFromTarget()) {
                furthestAboveTarget = salesperson;
            }
        }
        return furthestAboveTarget;
    }
}
