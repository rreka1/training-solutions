package week06d05.senior;

/* Senior
 * Készíts egy Bottle nevű osztályt, amelynek van 2 attribútuma: BottleType type és int filledUntil.
 * A BottleType legyen felsorolásos típus az alábbi értékekkel: GLASS_BOTTLE és PET_BOTTLE!
 * A Bottle nevű osztálynak legyen egy static metódusa of néven,
 * mely paraméterként egy BottleType-ot vár
 * és visszaad egy új Bottle objektumot amelyet a megadott paraméter alapján hoz létre.
 * A Bottle osztálynak legyen egy fill metódusa, mely egy int fillAmount paramétert vár.
 * A fill meghívása esetén végezzen ellenőrzést, hogy megtelt-e már a Bottle objektum.
 * Az ehhez szükséges int maximumAmount mezőt a BottleType tartalmazza!
 * Ha túlcsordulna a Bottle objektum, akkor dobj kivételt!
 * */

public class Bottle {

    private BottleType bottleType;
    private int filledUntil;

    private Bottle(BottleType bottleType, int filledUntil) {
        this.bottleType = bottleType;
        this.filledUntil = filledUntil;
    }

    public static Bottle of(BottleType bottleType) {
        return new Bottle(bottleType, 0);
    }

    public void fill(int fillAmount) {
        if (filledUntil + fillAmount > bottleType.getMaximumAmount()) {
            throw new IllegalStateException("Overflow!");
        }
        filledUntil += fillAmount;
    }

    public BottleType getBottleType() {
        return bottleType;
    }

    public int getFilledUntil() {
        return filledUntil;
    }
}
