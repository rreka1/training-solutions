package week14d04.junior;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    private Contract template;

    public ContractCreator(String client, List<Integer> monthlyPrices) {
        this.template = new Contract(client, monthlyPrices);
    }

    public Contract create(String name) {
        return new Contract(name, new ArrayList<>(template.getMonthlyPrices()));
    }

    public Contract getTemplate() {
        return template;
    }

    public static void main(String[] args) {
        ContractCreator cc = new ContractCreator("John Doe", List.of(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10));

        Contract contract = cc.create("John Smith");
        contract.getMonthlyPrices().set(11, 20);

        System.out.println(contract.getMonthlyPrices());
        System.out.println(cc.getTemplate().getMonthlyPrices());
    }
}
