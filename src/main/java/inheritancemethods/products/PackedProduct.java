package inheritancemethods.products;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackedProduct extends Product {

    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        BigDecimal piecesBD = new BigDecimal(pieces);
        BigDecimal packingUnitBD = new BigDecimal(packingUnit);
        BigDecimal totalWeightOfProducts = super.totalWeight(pieces);
        BigDecimal numberOfBoxes = piecesBD.divide(packingUnitBD, RoundingMode.UP);
        BigDecimal weightOfBoxes = weightOfBox.multiply(numberOfBoxes);
        return totalWeightOfProducts.add(weightOfBoxes);
    }
}
