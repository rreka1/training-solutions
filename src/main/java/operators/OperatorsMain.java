package operators;

public class OperatorsMain {

    public static void main(String[] args) {

        Operators operators = new Operators();
        System.out.println(operators.isEven(100) ? "even" : "odd");
        System.out.println(operators.isEven(13) ? "even" : "odd");
        System.out.println(operators.isEven(226) ? "even" : "odd");
        System.out.println(operators.isEven(35) ? "even" : "odd");
    }
}
