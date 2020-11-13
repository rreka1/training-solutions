package operators;

public class OperatorsMain {

    public static void main(String[] args) {

        //Páros szám
        Operators operators = new Operators();
        System.out.println(operators.isEven(100) ? "even" : "odd");
        System.out.println(operators.isEven(13) ? "even" : "odd");
        System.out.println(operators.isEven(226) ? "even" : "odd");
        System.out.println(operators.isEven(35) ? "even" : "odd");
        System.out.println();

        //Léptető operátorok
        String number = Integer.toBinaryString(16);
        System.out.println("16 bináris alakban: " + number);
        number = Integer.toBinaryString(16 >> 1);
        System.out.println("Jobbra léptetés 1-gyel: " + number); //2-vel való osztás
        number = Integer.toBinaryString(16 << 1);
        System.out.println("Balra léptetés 1-gyel: " + number); //2-vel való szorzás

        String number2 = Integer.toBinaryString(13);
        System.out.println("13 bináris alakban: " + number2);
        number = Integer.toBinaryString(13 >> 1);
        System.out.println("Jobbra léptetés 1-gyel: " + number2);
        number = Integer.toBinaryString(13 << 1);
        System.out.println("Balra léptetés 1-gyel: " + number2);

        System.out.println(operators.multiplyByPowerOfTwo(16, 1));
        System.out.println(operators.multiplyByPowerOfTwo(16, 2));

        System.out.println();
        //Miért ad a következő kódrészlet kivételt?
        int i = -1;
        String s = Integer.toBinaryString(i);
        System.out.println(s);
        //int j = Integer.parseInt(s, 2); -> (NumberFormatException)
        //A sztringet egy 32 jegyű számnak veszi, ami már nem fér bele az int-be
        int j = Long.valueOf(s, 2).intValue();
        System.out.println(j);
        System.out.println();

        //Mit ír ki a következő kifejezés és miért?
        System.out.println(0333); //219, mert 0-val kezdődő literál, amit oktális számrendszer-beli számot jelent.

    }
}
