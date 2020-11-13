package operators;

public class Operators {

    //Páros szám
    public boolean isEven(int n) {
        if(n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    //Léptető operátorok
    public int multiplyByPowerOfTwo(int number1, int number2) {
        return number1 << number2;
    }
}
