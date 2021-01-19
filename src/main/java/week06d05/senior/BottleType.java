package week06d05.senior;


public enum BottleType {

    GLASS_BOTTLE(100), PET_BOTTLE(500);

    private int maximumAmount;

    BottleType(int maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public int getMaximumAmount() {
        return maximumAmount;
    }
}
