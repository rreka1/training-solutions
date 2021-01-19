package week06d01;

/* Junior
 * Írj egy olyan metódust az ListSelector osztályban,
 * mely egy kapott listából minden második elemet kiválogat,
 * és egy szövegként összerak, szögletes zárójelek között.
 * A páros megállapítása index szerint működik.
 * Azaz az első, nulla indexű elem páros, a második, azaz egyes indexű elem páratlan, stb.
 * Ha üres a lista, akkor üres stringet adjunk vissza.
 * Ha a paraméterül kapott lista null, akkor dobj IllegalArgumentExceptiont a metódusban!
 * */

import java.util.List;

public class ListSelector {

    public String concatStrings(List<String> strings) {
        if (strings == null) {
            throw new IllegalArgumentException("List must not be null!");
        }
        if (strings.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < strings.size(); i = i + 2) {
            sb.append(strings.get(i));
        }
        sb.append("]");
        return sb.toString();
    }
}
