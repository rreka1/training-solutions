package week06d05.junior;

/* Junior
 * Készíts egy Biscuit nevű osztályt, amelynek van két attribútuma: BiscuitType type és int gramAmount.
 * A BiscuitType legyen felsorolásos típus a három kedvenc kekszfajtáddal!
 * A Biscuit nevű osztálynak legyen egy static metódusa of néven,
 * mely paraméterként egy BiscuitType-ot, és egy int gramAmount-ot vár
 * és visszaad egy új Biscuit objektumot amelyet a megadott paraméterek alapján hoz létre.
 * Bónusz feladat: konzolra írás esetén a Biscuit jelenítse meg a type és a gramAmount mezőket!
 * */

public class Biscuit {

    private final BiscuitType biscuitType;
    private final int gramAmount;

    private Biscuit(BiscuitType biscuitType, int gramAmount) {
        this.biscuitType = biscuitType;
        this.gramAmount = gramAmount;
    }

    public static Biscuit of(BiscuitType biscuitType, int gramAmount) {
        return new Biscuit(biscuitType, gramAmount);
    }

    public BiscuitType getBiscuitType() {
        return biscuitType;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    @Override
    public String toString() {
        return "Biscuit{" +
                "biscuitType=" + biscuitType +
                ", gramAmount=" + gramAmount +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Biscuit.of(BiscuitType.OREO, 100));
        System.out.println(Biscuit.of(BiscuitType.OREO, 500));
        System.out.println(Biscuit.of(BiscuitType.PILOTA, 500));
    }
}
