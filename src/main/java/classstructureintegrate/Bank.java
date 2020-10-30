package classstructureintegrate;

public class Bank {

    public static void main(String[] args) {

        BankAccount bankszamla1 = new BankAccount("10073217-12000098-67341590", "Tóth Kálmán", 103400);
        BankAccount bankszamla2 = new BankAccount("10075678-12074089-87456650", "Nagy Sándor", 450000);

        System.out.println("Bankszámlanyitás:");
        System.out.println(bankszamla1.getInfo());
        System.out.println(bankszamla2.getInfo());

        bankszamla1.deposit(500000);
        bankszamla2.deposit(500000);

        System.out.println("\nBefizetés:");
        System.out.println(bankszamla1.getInfo());
        System.out.println(bankszamla2.getInfo());

        bankszamla1.withdraw(100000);
        bankszamla2.withdraw(100000);

        System.out.println("\nPénzfelvétel:");
        System.out.println(bankszamla1.getInfo());
        System.out.println(bankszamla2.getInfo());

        bankszamla2.transfer(bankszamla1, 200000);

        System.out.println("\nÁtutalás:");
        System.out.println(bankszamla1.getInfo());
        System.out.println(bankszamla2.getInfo());
    }
}
