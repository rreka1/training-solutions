package week03;

/*
 * Írj egy Position osztályt, melynek van egy name és egy bonus attribútuma!
 * Egy alkalmazotti pozíciót jelöl, melynek a bonus attribútuma tárolja,
 * hogy ebben a pozícióban évente mennyi bónuszt kap egy alkalmazott.
 * A main metódusban hozz létre egy Position objektumokat tartalmazo listát!
 * Menj végig a lista elemein, és írd ki azokat, ahol a bónusz magasabb, mint 150_000.
 * Azonban a kiírás formátumát a Position osztály toString() metódusában implementáld!
 * */

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return name + " bonus: " + bonus;
    }

    public static void main(String[] args) {

        List<Position> positions = new ArrayList<>();

        Position p1 = new Position("position1", 30000);
        Position p2 = new Position("position2", 150000);
        Position p3 = new Position("position3", 150001);
        Position p4 = new Position("position4", 120000);
        Position p5 = new Position("position5", 160000);
        Position p6 = new Position("position6", 149999);
        Position p7 = new Position("position7", 500000);

        positions.addAll(List.of(p1, p2, p3, p4, p5, p6, p7));

        for (Position position : positions) {
            if (position.getBonus() > 150000) {
                System.out.println(position);
            }
        }
    }
}
