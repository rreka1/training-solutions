package statements;

public class Investment {

    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.cost = 0.3;
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }

    public int getFund() {
        return fund;
    }

    //...
    public double getYield(int days) {
        return fund * interestRate * days / (100.0 * 365);
    }

    //...
    public double close(int days) {
        double total = (this.getFund() + this.getYield(days)) * (1 - cost / 100);
        double pay = active ? total : 0;
        active = false;
        return pay;
    }
}
