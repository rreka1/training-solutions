package week03.d05;

public class Operation {

    private int leftValue;
    private int rightValue;

    public Operation(String string) {

        String left = string.substring(0, string.indexOf("+"));
        String right = string.substring(string.indexOf("+") + 1);

        this.leftValue = Integer.parseInt(left);
        this.rightValue = Integer.parseInt(right);
    }

    public int getResult() {
        return leftValue + rightValue;
    }

    public static void main(String[] args) {

        Operation operation = new Operation("161+18");
        System.out.println(operation.getResult());
    }
}
